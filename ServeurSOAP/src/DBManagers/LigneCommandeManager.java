package DBManagers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EJBs.LigneCommande;

@Stateless
@LocalBean
public class LigneCommandeManager {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ServeurSOAP");
	EntityManager em = emfactory.createEntityManager();
	
	public LigneCommandeManager() {}
	
	public LigneCommande getLigne(int id) {
		em.clear();
		LigneCommande l = em.find(LigneCommande.class, id);
		return l;
	}

	public void ajouterLigne(LigneCommande l) {
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
	}
	
}
