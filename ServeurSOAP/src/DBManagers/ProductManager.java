package DBManagers;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import EJBs.Product;

@Stateless
@LocalBean
public class ProductManager {
	//EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ServeurSOAP" );
	@PersistenceContext(unitName = "ServeurSOAP")
	EntityManager em;
	
	
	public ProductManager(){}
	
	public Product getProduit(int id) {
		Product p = em.find(Product.class,id);
		
		Product query = em.createQuery("SELECT p FROM produit p WHERE p.id LIKE :id", Product.class)
				.setParameter("id", id)
				.getSingleResult();
		System.out.println("Produit id = " + query.getId() + " - nom = " + query.getNom());
		return p;
	}
	
	public List<Product> getProduitsIndex() {
		List<Product> query = em.createQuery("SELECT p FROM produit p"/*WHERE (id<=SELECT DISTINCT max(p.id) FROM produit p)) AND (id>=(SELECT DISTINCT max(p.id) FROM produit p)-50)*/, Product.class).getResultList();
		return query;
	}

	public List<Product> getProduitSearch(List<String> tokens) {
		String query = "SELECT p FROM produit p WHERE ";
		TypedQuery<Product> queryExec;
		List<Product> result;
		
		for (int i = 0; i < tokens.size(); i++) {
			query += "p.nom LIKE :token" + i /* + " OR p.desc LIKE :token" + i*/;
			if(i != tokens.size()-1) query += " OR ";
		}
		
		queryExec = em.createQuery(query, Product.class);
		
		for (int i = 0; i < tokens.size(); i++) {
			queryExec.setParameter("token"+i,tokens.get(i));
		}
		
		result = queryExec.getResultList();
		
		return result;
	}
	 
	
}
