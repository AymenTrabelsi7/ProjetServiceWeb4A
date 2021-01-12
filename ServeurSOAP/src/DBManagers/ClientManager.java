package DBManagers;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import EJBs.Client;
import EJBs.Product;

@Stateless
@LocalBean
public class ClientManager {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ServeurSOAP" );
	EntityManager em = emfactory.createEntityManager();
	
	public ClientManager() {}
	
	public boolean addClient(Client cli) {
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
	
	public boolean clientExists(String usr) {
		em.clear();
		Client c = em.find(Client.class,usr);
		if (c!=null) {
			System.out.println("Client : " + c.getUsername());
			return true;
		}
		else {
			return false;
		}
	}

	public Client getClient(String usr) {
		em.clear();
		Client c = em.find(Client.class,usr);
		return c;
	}

	public boolean updateNom(String usr, String nom) {
		em.clear();
		Client c = em.find(Client.class,usr);
		em.getTransaction().begin();
		try {
			c.setNom(nom);
			em.getTransaction( ).commit( );
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updatePrenom(String usr, String prenom) {
		em.clear();
		Client c = em.find(Client.class,usr);
		em.getTransaction().begin();
		try {
			c.setPrenom(prenom);
			em.getTransaction( ).commit( );
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateEmail(String usr, String email) {
		em.clear();
		Client c = em.find(Client.class,usr);
		em.getTransaction().begin();
		try {
			c.setEmail(email);
			em.getTransaction( ).commit( );
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateMdp(String usr, String mdp) {
		em.clear();
		Client c = em.find(Client.class,usr);
		em.getTransaction().begin();
		try {
			c.setHashed_mdp(mdp);
			em.getTransaction( ).commit( );
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
