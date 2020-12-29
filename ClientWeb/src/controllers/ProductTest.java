package controllers;
public class ProductTest {
	
	private int id,prix;
	private String nom,desc;
	
	public ProductTest(int id, int prix, String nom, String desc) {
		this.id = id;
		this.prix = prix;
		this.nom = nom;
		this.desc = desc;
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
