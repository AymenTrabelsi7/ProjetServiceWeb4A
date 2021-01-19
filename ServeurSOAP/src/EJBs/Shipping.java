package EJBs;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import util.util;

@Entity
@Table(name="shippings")
@XmlRootElement
public class Shipping {
	
	@Id
	private int id_shipping;
	
	private String nom_complet,nom_var,icon;
	private int duree_livraison;
	private float prix;
	
//	@Transient
//	private LocalDate date;
//	
//	@Transient
//	private String prixString;
	
	
	public Shipping() {}
	
	
	
//	public LocalDate getDate() {
//		return date;
//	}
//
//
//
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}



	public int getId_shipping() {
		return id_shipping;
	}
	public void setId_shipping(int id_shipping) {
		this.id_shipping = id_shipping;
	}
	public String getNom_complet() {
		return nom_complet;
	}
	public void setNom_complet(String nom_complet) {
		this.nom_complet = nom_complet;
	}
	public String getNom_var() {
		return nom_var;
	}
	public void setNom_var(String nom_var) {
		this.nom_var = nom_var;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getDuree_livraison() {
		return duree_livraison;
	}
	public void setDuree_livraison(int duree_livraison) {
		this.duree_livraison = duree_livraison;
	}
	public float getPrix() {
		return prix;
	}
	
//	public String getPrixString() {
//		return  util.toPrice(prix);
//	}
	
	public void setPrix(float prix) {
		this.prix = prix;
	}



//	public void setPrixString(String prixString) {
//		this.prixString = prixString;
//	}
	
	
}
