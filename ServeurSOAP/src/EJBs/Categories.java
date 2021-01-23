package EJBs;

import java.io.Serializable;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="categories")
@XmlRootElement
public class Categories implements Serializable {

	private static final long serialVersionUID = -3015056552312149164L;
	
	
	private String nom;
	
	private String img;
	
	

	
	public Categories() {}
	


	public String getImg() {
		return img;
	}
	
	public void setImg(String path) {
		this.img = path;
	}

	@Id
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
