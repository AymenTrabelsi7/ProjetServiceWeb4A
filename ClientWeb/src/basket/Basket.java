package basket;

import java.util.ArrayList;

public class Basket {
	
	private ArrayList<BasketProduct> products;
	private int total;
	
	public Basket() {
		this.products = new ArrayList<BasketProduct>(0);
		this.total = 0;
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
			int ancienSousTotal = p.getSousTotal();
			p.setSousTotal(qte*p.getPrix());
			this.setTotal(this.getTotal()+(p.getSousTotal()-ancienSousTotal));
		}
	}

	public ArrayList<BasketProduct> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<BasketProduct> products) {
		this.products = products;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
}
