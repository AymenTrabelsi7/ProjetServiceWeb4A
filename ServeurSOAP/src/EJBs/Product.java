package EJBs;

import java.io.Serializable;
import java.util.Base64;

import javax.ejb.Stateless;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import util.util;

@Entity
@Table(name="produits")
@XmlRootElement
public class Product implements Serializable {

	private static final long serialVersionUID = 6432662000163956462L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "id")
	private int id;
	
    @Basic(optional = false)
    @Column(name = "prix")
	private float prix;
	
    @Basic(optional = false)
    @Column(name = "stock")
	private int stock;

    @Basic(optional = false)
    @Column(name = "score")
	private float score;

    @Basic(optional = false)
    @Column(name = "nom")
	private String nom;
	
    @Basic(optional = false)
    @Column(name = "description")
	private String description;
	
    @Basic(optional = false)
    @Column(name = "categorie")
	private String categorie;
    
    @Column(name = "img")
   	private String img;
    
	
//	@Transient
//	private String prixString;
//	
//	@Transient
//	private String scoreString;
	

	
	public Product() {}
	
	
	public Product(int id, int prix, int stock, int score, String nom, String desc, String categorie) {		
		this.id = id;
		this.prix = prix;
		this.stock = stock;
		this.score = score;
		this.nom = nom;
		this.description = desc;
		this.categorie = categorie;
	}
	
	
	
	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public float getScore() {
		return score;
	}


//	public String getScoreString() {
//		return  util.toPrice(score);
//	}
	

	public void setScore(float score) {
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


	public float getPrix() {
		return prix;
	}
	
//	public String getPrixString() {
//		return  util.toPrice(prix);
//	}
	
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
	
	@Override
	public String toString() {
		return "Produit : " + "[id = " + id + "]";
	}
	
	public String getImg() {
		return img;
	}
	
	public void setImg(String path) {
		this.img = path;
	}


//	public void setPrixString(String prixString) {
//		this.prixString = prixString;
//	}
//
//
//	public void setScoreString(String scoreString) {
//		this.scoreString = scoreString;
//	}
	
	


	
	
}