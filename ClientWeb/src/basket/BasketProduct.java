package basket;

public class BasketProduct {
		
		private String nom,img,description;
		
		private int id,quantite;
		private float prix,sousTotal;
		
		public BasketProduct() {}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getImg() {
			return img;
		}

		public void setImg(String img) {
			this.img = img;
		}

		public int getQuantite() {
			return quantite;
		}

		public void setQuantite(int quantite) {
			this.quantite = quantite;
		}

		public float getPrix() {
			return prix;
		}

		public void setPrix(float prix) {
			this.prix = prix;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public float getSousTotal() {
			return sousTotal;
		}

		public void setSousTotal(float sousTotal) {
			this.sousTotal = sousTotal;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		
		
}
