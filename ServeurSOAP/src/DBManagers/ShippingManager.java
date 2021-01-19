package DBManagers;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import EJBs.Shipping;

@Stateless
@LocalBean
public class ShippingManager {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ServeurSOAP" );
	EntityManager em = emfactory.createEntityManager();
	
	public ShippingManager(){}

	public Shipping getShipping(int id) {
		return em.find(Shipping.class, id);
	}

	public Shipping getShippingByName(String varName) {
		em.clear();
		TypedQuery<Shipping> query = em.createQuery("SELECT s FROM Shipping s WHERE s.nom_var = :var", Shipping.class);
		query.setParameter("var", varName);
		List<Shipping> result = query.getResultList();
		return result.get(0);
	}
	
	public List<Shipping> getShippings() {
		em.clear();
		TypedQuery<Shipping> query = em.createQuery("SELECT s FROM Shipping s", Shipping.class);
		List<Shipping> result = query.getResultList();
		return result;
	}
	
	

}
