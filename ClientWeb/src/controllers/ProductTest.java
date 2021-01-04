package controllers;
public class ProductTest {
	
	private int id,prix,stock,score;
	private String nom,desc,categorie;
	

	
	public ProductTest(int id, int prix, int stock, int score, String nom, String desc, String categorie) {
		super();
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
	
	
}
