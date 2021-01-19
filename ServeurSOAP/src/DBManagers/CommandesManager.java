package DBManagers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import EJBs.Commande;
import EJBs.Product;

@Stateless
@LocalBean
public class CommandesManager {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ServeurSOAP");
	EntityManager em = emfactory.createEntityManager();
	
	public CommandesManager() {}
	
	public void ajouterCommande(Commande c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
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
