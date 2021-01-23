package EJBs;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="clients")
@XmlRootElement
public class Client implements Serializable{
	
	private static final long serialVersionUID = 6432662000163956462L;
	
	
	private String username;
	
	private String nom,prenom,email,hashed_mdp,paypal_account,cb_coord;
	
	public Client() {}

	@Id
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashed_mdp() {
		return hashed_mdp;
	}

	public void setHashed_mdp(String hashed_mdp) {
		this.hashed_mdp = hashed_mdp;
	}

	public String getPaypal_account() {
		return paypal_account;
	}

	public void setPaypal_account(String paypal_account) {
		this.paypal_account = paypal_account;
	}

	public String getCb_coord() {
		return cb_coord;
	}

	public void setCb_coord(String cb_coord) {
		this.cb_coord = cb_coord;
	}
	
	
}
