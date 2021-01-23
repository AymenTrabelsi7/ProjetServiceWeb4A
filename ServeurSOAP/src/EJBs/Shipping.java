package EJBs;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="shippings")
@XmlRootElement
public class Shipping implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8265609576330364169L;

	
	private int id_shipping;
	
	private String nom_complet,nom_var,icon;
	private int duree_livraison;
	private float prix;
	
	
	private String date;
	
	
	private String prixString;
	
	
	public Shipping() {}
	
	
	@Transient
	public String getDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		date = LocalDate.now().plusDays(duree_livraison).format(formatter);
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
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
	
	@Transient
	public String getPrixString() {
		prixString = String.format("%.2f",prix);
		return  prixString;
	}
	
	public void setPrix(float prix) {
		this.prix = prix;
	}



	public void setPrixString(String prixString) {
		this.prixString = prixString;
	}
	
	
}
