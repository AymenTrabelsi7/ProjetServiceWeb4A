package EJBs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import util.util;

@Entity
@Table(name="ligne_commande")
@XmlRootElement
public class LigneCommande {
	
	@Id
	private int id_ligne;
	
	private int id_commande,id_produit,qte;
	private float prix_unitaire,sous_tot;
	private String nom;
	
//	@Transient
//	private String prix_unitaireString;
//	
//	
//	@Transient
//	private String sous_totString;
	
	public LigneCommande() {}
	
	
	public int getId_commande() {
		return id_commande;
	}
	public void setId_commande(int id_commande) {
		this.id_commande = id_commande;
	}
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public float getPrix_unitaire() {
		return prix_unitaire;
	}
	
//	public String getPrix_unitaireString() {
//		return  util.toPrice(prix_unitaire);
//	}
	
	public void setPrix_unitaire(float prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	
	public float getSous_tot() {
		return sous_tot;
	}
	
//	public String getSous_totString() {
//		return  util.toPrice(sous_tot);
//	}
	
	
	public void setSous_tot(float sous_tot) {
		this.sous_tot = sous_tot;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


//	public void setPrix_unitaireString(String prix_unitaireString) {
//		this.prix_unitaireString = prix_unitaireString;
//	}
	
	
	
}
