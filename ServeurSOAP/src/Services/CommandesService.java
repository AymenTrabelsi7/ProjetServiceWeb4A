package Services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
			int id = access.ajouterCommande(c);
			List<LigneCommande> lignes = c.getProduits();
			for (LigneCommande l : lignes) {
				l.setId_commande(id);
				ligne_access.ajouterLigne(l);
				product_access.changeQte(l.getId_produit(),l.getQte());
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
		l.setId_produit(id_produit);
		l.setQte(qte);
		Product p = product_access.getProduit(id_produit);
		l.setNom(p.getNom());
		l.setPrix_unitaire(p.getPrix());
		l.setSous_tot(l.getPrix_unitaire()*l.getQte());
		
		c.setId_produits( c.getId_produits() == null ? ""+id_produit : c.getId_produits() + "," + id_produit );
		
		List<LigneCommande> lignes;
		lignes = c.getProduits() != null ? c.getProduits() : new ArrayList<LigneCommande>(0);
		lignes.add(l);
		c.setProduits(lignes);
		if(c.getTotal_ht() > 0) c.setTotal_ht(c.getTotal_ht()+l.getSous_tot());
		else c.setTotal_ht(l.getSous_tot());
		return c;
	}
	
	@WebMethod(operationName = "applyShipping")
	public Commande applyShipping(Commande c,int shipping_id) {
		Shipping s = shipping_access.getShipping(shipping_id);
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		c.setDate_commande(today.format(formatter));
		c.setChoix_livraison(s.getNom_complet());
		c.setFrais_livraison(s.getPrix());
		c.setTotal_ttc(c.getTotal_ht()+s.getPrix());
		LocalDate date_livraison = today.plusDays(s.getDuree_livraison());
		c.setDate_livraison(date_livraison.format(formatter));
		return c;
	}
	

	
	
	private Commande configureCommande(Commande c) {
		c.setProduits(ligne_access.getCommandeLignes(c.getId()));
		for ( LigneCommande l : c.getProduits()) {
			System.out.println(l.getId_produit());
		}
		LocalDate now = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date_livraison = LocalDate.parse(c.getDate_livraison(),dateTimeFormatter);
		if(!now.isBefore(date_livraison) && !c.getStatut().equals("Livré")) c.setStatut("Livré");
		
		return c;
	}
	
	
	
}
