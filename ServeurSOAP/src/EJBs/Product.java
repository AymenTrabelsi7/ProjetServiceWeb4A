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
@Table(name="produits")
@XmlRootElement
public class Product implements Serializable {

	private static final long serialVersionUID = 6432662000163956462L;
	
	
	private int id;
	
	
	
	private int stock;

	

	private String nom;
	
	private String description;
	

	private String categorie;
    
   	private String img;
    
   	
   	private float prix;
	
   	
	public float getPrix() {
		return prix;
	}
	
	
	
   	private String prixString;
	
	
   	@Transient
	public String getPrixString() {
		prixString = String.format("%.2f",prix);
		return prixString;
	}
	
	
	public void setPrixString(String prixString) {
		this.prixString = prixString;
	}
	
	
	
	private float score;
	
	public float getScore() {
		return score;
	}
	
	
	private String scoreString;
	
	
	@Transient
	public String getScoreString() {
		scoreString = String.format("%.1f",score);
		return  scoreString;
	}
	
	
	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}


	public Product() {}

	
	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}


	public void setScore(float score) {
		this.score = score;
	}



	public String getCategorie() {
		return categorie;
	}



	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}



	
	

	
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	
	public String toString() {
		return "Produit : " + "[id = " + id + "]";
	}
	
	public String getImg() {
		return img;
	}
	
	public void setImg(String path) {
		this.img = path;
	}

	
}