package EJBs;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import util.util;


@Entity
@Table(name="commandes")
@XmlRootElement
public class Commande implements Serializable {

	private static final long serialVersionUID = 234286529373070492L;
	
	@Id
	private int id;
	
	private String id_client;
	private float total_ht;
	
	@Column(name = "adresse")
	private String adresse;
	
	private String id_produits;
	private String moyen_paiement;
	private String statut;
	private LocalDate date_commande;
	private LocalDate date_livraison;
	private String choix_livraison;
	private float frais_livraison;
	private float total_ttc;
	
	@Transient
	private ArrayList<LigneCommande> produits;
	
//	@Transient
//	private String total_htString;
//	
//	@Transient
//	private String frais_livraisonString;
//	
//	@Transient
//	private String total_ttcString;
	
	
	public Commande() {}
	
	
	
	public ArrayList<LigneCommande> getProduits() {
		return produits;
	}
	
	
	

	public void setProduits(ArrayList<LigneCommande> produits) {
		this.produits = produits;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getId_client() {
		return id_client;
	}

	public void setId_client(String id_client) {
		this.id_client = id_client;
	}

	public float getTotal_ht() {
		return total_ht;
	}
	
//	public String getTotal_htString() {
//		return  util.toPrice(total_ht);
//	}

	public void setTotal_ht(float total_ht) {
		this.total_ht = total_ht;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getId_produits() {
		return id_produits;
	}

	public void setId_produits(String id_produits) {
		this.id_produits = id_produits;
	}

	public String getMoyen_paiement() {
		return moyen_paiement;
	}

	public void setMoyen_paiement(String moyen_paiement) {
		this.moyen_paiement = moyen_paiement;
	}

	public LocalDate getDate_commande() {
		return date_commande;
	}

	public void setDate_commande(LocalDate date_commande) {
		this.date_commande = date_commande;
	}

	public LocalDate getDate_livraison() {
		return date_livraison;
	}

	public void setDate_livraison(LocalDate date_livraison) {
		this.date_livraison = date_livraison;
	}

	public String getChoix_livraison() {
		return choix_livraison;
	}

	public void setChoix_livraison(String choix_livraison) {
		this.choix_livraison = choix_livraison;
	}

	public float getFrais_livraison() {
		return frais_livraison;
	}
	
//	public String getFrais_livraisonString() {
//		return  util.toPrice(frais_livraison);
//	}

	public void setFrais_livraison(float frais_livraison) {
		this.frais_livraison = frais_livraison;
	}

	public float getTotal_ttc() {
		return total_ttc;
	}
	
//	public String getTotal_ttcString() {
//		return util.toPrice(total_ttc);
//	}

	public void setTotal_ttc(float total_ttc) {
		this.total_ttc = total_ttc;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}



//	public void setTotal_htString(String total_htString) {
//		this.total_htString = total_htString;
//	}
//
//
//
//	public void setFrais_livraisonString(String frais_livraisonString) {
//		this.frais_livraisonString = frais_livraisonString;
//	}
//
//
//
//	public void setTotal_ttcString(String total_ttcString) {
//		this.total_ttcString = total_ttcString;
//	}
	
	
	
}
