package DBManagers;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import EJBs.Categories;

@Stateless
@LocalBean
public class CategoriesManager {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ServeurSOAP" );
	EntityManager em = emfactory.createEntityManager();
	
	public CategoriesManager() {}

	public List<Categories> getCategories() {
		em.clear();
		TypedQuery<Categories> query = em.createQuery("SELECT c FROM Categories c", Categories.class);
		List<Categories> result = query.getResultList();
		return result;
	}

	public boolean isCategorie(String cat) {
		List<Categories> cats = this.getCategories();
		for (int i = 0; i < cats.size(); i++) {
			if(cat.equals(cats.get(i).getNom())) return true;
		}
		return false;
	}

}
