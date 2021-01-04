package EJBs;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Stateless
@Entity
@Table(name="produit")
@XmlRootElement
public class Product implements Serializable {

	private static final long serialVersionUID = 6432662000163956462L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private int prix,stock,score;
	private String nom,desc,categorie;
	

	
	public Product() {}
	
	
	public Product(int id, int prix, int stock, int score, String nom, String desc, String categorie) {		
		this.id = id;
		this.prix = prix;
		this.stock = stock;
		this.score = score;
		this.nom = nom;
		this.desc = desc;
		this.categorie = categorie;
	}
	
	
	
	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public String getCategorie() {
		return categorie;
	}



	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Produit : " + "[id = " + id + "]";
	}
	
	
}