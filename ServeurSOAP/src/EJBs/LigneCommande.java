package EJBs;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="ligne_commande")
@XmlRootElement
public class LigneCommande implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8528748480294024810L;

	
	private int id_ligne;
	
	private int id_commande,id_produit,qte;
	private float prix_unitaire,sous_tot;
	private String nom;
	

	private String prix_unitaireString;
	
	
	
	private String sous_totString;
	
	public LigneCommande() {}
	
	
	
	public void setSous_totString(String sous_totString) {
		this.sous_totString = sous_totString;
	}



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
	
	@Transient
	public String getPrix_unitaireString() {
		prix_unitaireString = String.format("%.2f",prix_unitaire);
		return  prix_unitaireString;
	}
	
	public void setPrix_unitaire(float prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	
	public float getSous_tot() {
		return sous_tot;
	}
	
	@Transient
	public String getSous_totString() {
		sous_totString = String.format("%.2f",sous_tot);
		return  sous_totString;
	}
	
	
	public void setSous_tot(float sous_tot) {
		this.sous_tot = sous_tot;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setPrix_unitaireString(String prix_unitaireString) {
		this.prix_unitaireString = prix_unitaireString;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getId_ligne() {
		return id_ligne;
	}


	public void setId_ligne(int id_ligne) {
		this.id_ligne = id_ligne;
	}
	
	
	
}
