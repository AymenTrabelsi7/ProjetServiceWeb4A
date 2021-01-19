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
		
		System.out.println("Description : " + p.getDescription());
		
		return p;
	}
	
	public List<Product> getProduitsIndex() {
		em.clear();
		TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p", Product.class);
		List<Product> result = query.getResultList();
		return result;
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
		queryExec = em.createQuery(query, Product.class);
		
		for (int i = 0; i < tokens.size(); i++) {
			queryExec.setParameter("token"+i,"%" + tokens.get(i) + "%");
		}
		
		result = queryExec.getResultList();

		return result;
	}





	public List<Product> getProduitsCategorie(String cat) {
		System.out.println("cat="+cat);
		em.clear();
		TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p WHERE p.categorie = :cat", Product.class);
		query.setParameter("cat",cat);
		List<Product> result = query.getResultList();
		System.out.println("result.size()="+result.size());
		return result;
	}
	 
	
}
