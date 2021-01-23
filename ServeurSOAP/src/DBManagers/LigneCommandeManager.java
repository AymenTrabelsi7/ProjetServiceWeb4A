package DBManagers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import EJBs.Commande;
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

	public List<LigneCommande> getCommandeLignes(int id) {
		em.clear();
		TypedQuery<LigneCommande> query = em.createQuery("SELECT l FROM LigneCommande l WHERE l.id_commande = :id", LigneCommande.class);
		query.setParameter("id", id);
		List<LigneCommande> result = query.getResultList();
		return result;
	}
	
}
