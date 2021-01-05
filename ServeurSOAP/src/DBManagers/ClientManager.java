package DBManagers;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import EJBs.Client;

@Stateless
@LocalBean
public class ClientManager {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ServeurSOAP" );
	EntityManager em = emfactory.createEntityManager();
	
	public ClientManager() {}
	
	public boolean addClient(Client cli) {
		em.clear();
		boolean res;
		
		em.getTransaction().begin();
		Client client = new Client();
		client.setCb_coord(cli.getCb_coord());
		client.setEmail(cli.getEmail());
		client.setHashed_mdp(cli.getHashed_mdp());
		client.setNom(cli.getNom());
		client.setPaypal_account(cli.getPaypal_account());
		client.setPrenom(cli.getPrenom());
		client.setUsername(cli.getUsername());
		try {
			em.persist(client);
			em.getTransaction().commit();
			res = true;
		} catch (Exception e) {
			res = false;
		}
		return res;
		
	}
	
	public boolean verifyLogin(String username, String hashed_mdp) {		
		em.clear();
		List<Client> query = em.createQuery("SELECT c FROM Client c WHERE c.username = :usr AND c.hashed_mdp = :mdp", Client.class)
				.setParameter("usr", username)
				.setParameter("mdp", hashed_mdp)
				.getResultList();
		if(query.size() == 1) return true;
		else return false;
	}

	public boolean updateClient(Client newCli) {
		em.clear();
		boolean res;
		try {			
			Client oldCli = em.find(Client.class, newCli.getUsername());
			em.remove(oldCli);
			em.persist(newCli);
			res = true;
		} catch (Exception e) {
			res = false;
		}
		return res;
	}
	
}
