package Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import DBManagers.CommandesManager;
import DBManagers.LigneCommandeManager;
import DBManagers.ProductManager;
import DBManagers.ShippingManager;
import EJBs.Commande;
import EJBs.LigneCommande;
import EJBs.Product;
import EJBs.Shipping;

@WebService(targetNamespace = "http://www.polytech.fr")
public class CommandesService {
	
	CommandesManager access = new CommandesManager();
	LigneCommandeManager ligne_access = new LigneCommandeManager();
	ProductManager product_access = new ProductManager();
	ShippingManager shipping_access = new ShippingManager();

	@WebMethod(operationName = "validerCommande")
	public boolean validerCommande(Commande c) {
		try {			
			access.ajouterCommande(c);
			ArrayList<LigneCommande> lignes = c.getProduits();
			for (LigneCommande l : lignes) {
				ligne_access.ajouterLigne(l);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@WebMethod(operationName = "getCommande")
	public Commande getCommande(int id) {
		Commande c = access.getCommande(id);
		c = this.configureCommande(c);
		return c;
	}
	
	@WebMethod(operationName = "getUserCommandes")
	public List<Commande> getUserCommandes(String user_id) {
		List<Commande> commandes = access.getUserCommandes(user_id);
		for (Commande c : commandes) {
			c = this.configureCommande(c);
		}
		return commandes;
	}
	
	@WebMethod(operationName = "ajouterProduit")
	public Commande ajouterProduit(Commande c,int id_produit,int qte) {
		LigneCommande l = new LigneCommande();
		l.setId_commande(c.getId());
		l.setId_produit(id_produit);
		l.setQte(qte);
		Product p = product_access.getProduit(id_produit);
		l.setNom(p.getNom());
		l.setPrix_unitaire(p.getPrix());
		l.setSous_tot(l.getPrix_unitaire()*l.getQte());
		ArrayList<LigneCommande> lignes;
		lignes = c.getProduits() != null ? c.getProduits() : new ArrayList<LigneCommande>(0);
		lignes.add(l);
		c.setProduits(lignes);
		c.setTotal_ht(c.getTotal_ht()+l.getSous_tot());
		return c;
	}
	
	@WebMethod(operationName = "applyShipping")
	public Commande applyShipping(Commande c,int shipping_id) {
		Shipping s = shipping_access.getShipping(shipping_id);
		c.setChoix_livraison(s.getNom_complet());
		c.setFrais_livraison(s.getPrix());
		c.setTotal_ttc(c.getTotal_ht()+s.getPrix());
		return c;
	}
	

	private ArrayList<LigneCommande> getLignes(String id_lignes) {
		ArrayList<LigneCommande> lignes = new ArrayList<LigneCommande>(0);
		String[] ids = id_lignes.split(",");
		for (String id : ids) {
			lignes.add(ligne_access.getLigne(Integer.parseInt(id)));
		}
		return lignes;
	}
	
	private Commande configureCommande(Commande c) {
		c.setProduits(this.getLignes(c.getId_produits()));
		
		LocalDate now = LocalDate.now();
		LocalDate date_livraison = c.getDate_livraison();
		if(!now.isBefore(date_livraison) && !c.getStatut().equals("Livré")) c.setStatut("Livré");
		
		return c;
	}
	
	
	
}
