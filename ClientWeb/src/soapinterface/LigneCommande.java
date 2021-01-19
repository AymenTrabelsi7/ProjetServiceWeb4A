
package soapinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ligneCommande complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ligneCommande"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_commande" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_produit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prix_unitaire" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="qte" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sous_tot" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ligneCommande", propOrder = {
    "idCommande",
    "idProduit",
    "nom",
    "prixUnitaire",
    "qte",
    "sousTot"
})
public class LigneCommande {

    @XmlElement(name = "id_commande")
    protected int idCommande;
    @XmlElement(name = "id_produit")
    protected int idProduit;
    protected String nom;
    @XmlElement(name = "prix_unitaire")
    protected float prixUnitaire;
    protected int qte;
    @XmlElement(name = "sous_tot")
    protected float sousTot;

    /**
     * Obtient la valeur de la propriété idCommande.
     * 
     */
    public int getIdCommande() {
        return idCommande;
    }

    /**
     * Définit la valeur de la propriété idCommande.
     * 
     */
    public void setIdCommande(int value) {
        this.idCommande = value;
    }

    /**
     * Obtient la valeur de la propriété idProduit.
     * 
     */
    public int getIdProduit() {
        return idProduit;
    }

    /**
     * Définit la valeur de la propriété idProduit.
     * 
     */
    public void setIdProduit(int value) {
        this.idProduit = value;
    }

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété prixUnitaire.
     * 
     */
    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    /**
     * Définit la valeur de la propriété prixUnitaire.
     * 
     */
    public void setPrixUnitaire(float value) {
        this.prixUnitaire = value;
    }

    /**
     * Obtient la valeur de la propriété qte.
     * 
     */
    public int getQte() {
        return qte;
    }

    /**
     * Définit la valeur de la propriété qte.
     * 
     */
    public void setQte(int value) {
        this.qte = value;
    }

    /**
     * Obtient la valeur de la propriété sousTot.
     * 
     */
    public float getSousTot() {
        return sousTot;
    }

    /**
     * Définit la valeur de la propriété sousTot.
     * 
     */
    public void setSousTot(float value) {
        this.sousTot = value;
    }

}
