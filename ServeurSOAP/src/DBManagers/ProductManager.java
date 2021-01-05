package DBManagers;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import EJBs.Product;

@Stateless
@LocalBean
public class ProductManager {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ServeurSOAP" );
	EntityManager em = emfactory.createEntityManager();
	
	
	public ProductManager(){}
	
	

	
	
	public Product getProduit(int id) {
		em.clear();
		Product p = em.find(Product.class,id);
		return p;
	}
	
	public List<Product> getProduitsIndex() {
		em.clear();
		TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p"/*WHERE (id<=SELECT DISTINCT max(p.id) FROM produit p)) AND (id>=(SELECT DISTINCT max(p.id) FROM produit p)-50)*/, Product.class);
		List<Product> result = query.getResultList();
		return result;
		/*List<Product> result = new ArrayList<Product>(0);
		Product p = new Product();
		p.setNom("PS5");
		p.setDescription("dsqdqdsq");
		p.setCategorie("jaja");
		p.setId(15648);
		p.setPrix(4899);
		p.setScore(4);
		p.setStock(18);
		result.add(p);
		return result;*/
	}

	public List<Product> getProduitSearch(List<String> tokens) {
		em.clear();
		String query = "SELECT p FROM Product p WHERE ";
		TypedQuery<Product> queryExec;
		List<Product> result;
		
		for (int i = 0; i < tokens.size(); i++) {
			query += "p.nom LIKE :token" + i + " OR p.description LIKE :token" + i;
			if(i != tokens.size()-1) query += " OR ";
		}
		System.out.println("Query : " + query);
		queryExec = em.createQuery(query, Product.class);
		
		for (int i = 0; i < tokens.size(); i++) {
			queryExec.setParameter("token"+i,"%" + tokens.get(i) + "%");
		}
		
		result = queryExec.getResultList();
		for (Product product : result) {
			System.out.println(product);
		}
		return result;
	}
	 
	
}
