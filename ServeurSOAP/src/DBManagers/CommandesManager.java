package DBManagers;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.openjpa.util.IntId;

import EJBs.Commande;

@Stateless
@LocalBean
public class CommandesManager {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ServeurSOAP");
	EntityManager em = emfactory.createEntityManager();
	
	public CommandesManager() {}
	
	public int ajouterCommande(Commande c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		IntId id = (IntId) emfactory.getPersistenceUnitUtil().getIdentifier(c);
		return id.getId();
	}
	
	public void updateStatut(int id,String stat) {
		Commande c = em.find(Commande.class, id);
		em.getTransaction().begin();
		c.setStatut(stat);
		em.getTransaction().commit();
	}

	public List<Commande> getUserCommandes(String user_id) {
		em.clear();
		TypedQuery<Commande> query = em.createQuery("SELECT com FROM Commande com WHERE com.id_client = :id", Commande.class);
		query.setParameter("id", user_id);
		List<Commande> result = query.getResultList();
		return result;
	}
	
	public Commande getCommande(int id) {
		return em.find(Commande.class, id);
	}
	
	
	
}
