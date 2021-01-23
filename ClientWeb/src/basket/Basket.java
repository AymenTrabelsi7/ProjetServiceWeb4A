package basket;

import java.util.ArrayList;

public class Basket {
	
	private ArrayList<BasketProduct> products;
	private float total;
	private String totalString;
	
	public Basket() {
		this.products = new ArrayList<BasketProduct>(0);
		this.total = 0.00f;
	}
	
	public int findIndexProduit(int id) {
		for (int i = 0; i < this.getProducts().size(); i++) {
			if(this.getProducts().get(i).getId() == id) return i;
		} 
		return -1;
	}
	
	public void ajouterProduit(soapinterface.Product produit, int qte) {
		BasketProduct p = new BasketProduct();
		p.setId(produit.getId());
		p.setNom(produit.getNom());;
		p.setDescription(produit.getDescription());
		p.setPrix(produit.getPrix());
		p.setQuantite(qte);
		p.setSousTotal(qte*produit.getPrix());
		p.setImg(produit.getImg());
		p.setPrixString(produit.getPrixString());
		p.setSousTotalString(String.format("%.2f", p.getSousTotal()));
		System.out.println(p);
		this.getProducts().add(p);
		this.setTotal(this.getTotal()+p.getSousTotal());
	}
	
	public void supprimerProduit(int id) {
		int indexProduit = this.findIndexProduit(id);
		if(indexProduit != -1) {
			BasketProduct p = this.getProducts().get(indexProduit);
			this.getProducts().remove(indexProduit);
			this.setTotal(this.getTotal()-p.getSousTotal());
		}
	}
	
	public void changerQuantite(int id, int qte) {
		int indexProduit = this.findIndexProduit(id);
		if(indexProduit != -1) {
			BasketProduct p = this.getProducts().get(indexProduit);
			p.setQuantite(qte);
			float ancienSousTotal = p.getSousTotal();
			p.setSousTotal(qte*p.getPrix());
			p.setSousTotalString(String.format("%.2f", p.getSousTotal()));
			this.setTotal(this.getTotal()+(p.getSousTotal()-ancienSousTotal));
		}
	}

	public ArrayList<BasketProduct> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<BasketProduct> products) {
		this.products = products;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getTotalString() {
		totalString = String.format("%.2f", this.getTotal());
		return totalString;
	}

	public void setTotalString(String totalString) {
		this.totalString = totalString;
	}
	
	
	
	
}
