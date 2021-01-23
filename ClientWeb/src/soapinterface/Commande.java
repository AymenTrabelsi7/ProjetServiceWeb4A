
package soapinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commande complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commande"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="choix_livraison" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date_commande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date_livraison" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frais_livraison" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="frais_livraisonString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_produits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moyen_paiement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="produits" type="{http://www.polytech.fr}ligneCommande" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="statut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_ht" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="total_htString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_ttc" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="total_ttcString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commande", propOrder = {
    "adresse",
    "choixLivraison",
    "dateCommande",
    "dateLivraison",
    "fraisLivraison",
    "fraisLivraisonString",
    "id",
    "idClient",
    "idProduits",
    "moyenPaiement",
    "produits",
    "statut",
    "totalHt",
    "totalHtString",
    "totalTtc",
    "totalTtcString"
})
public class Commande {

    protected String adresse;
    @XmlElement(name = "choix_livraison")
    protected String choixLivraison;
    @XmlElement(name = "date_commande")
    protected String dateCommande;
    @XmlElement(name = "date_livraison")
    protected String dateLivraison;
    @XmlElement(name = "frais_livraison")
    protected float fraisLivraison;
    @XmlElement(name = "frais_livraisonString")
    protected String fraisLivraisonString;
    protected int id;
    @XmlElement(name = "id_client")
    protected String idClient;
    @XmlElement(name = "id_produits")
    protected String idProduits;
    @XmlElement(name = "moyen_paiement")
    protected String moyenPaiement;
    @XmlElement(nillable = true)
    protected List<LigneCommande> produits;
    protected String statut;
    @XmlElement(name = "total_ht")
    protected float totalHt;
    @XmlElement(name = "total_htString")
    protected String totalHtString;
    @XmlElement(name = "total_ttc")
    protected float totalTtc;
    @XmlElement(name = "total_ttcString")
    protected String totalTtcString;

    /**
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresse(String value) {
        this.adresse = value;
    }

    /**
     * Obtient la valeur de la propriété choixLivraison.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoixLivraison() {
        return choixLivraison;
    }

    /**
     * Définit la valeur de la propriété choixLivraison.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoixLivraison(String value) {
        this.choixLivraison = value;
    }

    /**
     * Obtient la valeur de la propriété dateCommande.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCommande() {
        return dateCommande;
    }

    /**
     * Définit la valeur de la propriété dateCommande.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCommande(String value) {
        this.dateCommande = value;
    }

    /**
     * Obtient la valeur de la propriété dateLivraison.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLivraison() {
        return dateLivraison;
    }

    /**
     * Définit la valeur de la propriété dateLivraison.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLivraison(String value) {
        this.dateLivraison = value;
    }

    /**
     * Obtient la valeur de la propriété fraisLivraison.
     * 
     */
    public float getFraisLivraison() {
        return fraisLivraison;
    }

    /**
     * Définit la valeur de la propriété fraisLivraison.
     * 
     */
    public void setFraisLivraison(float value) {
        this.fraisLivraison = value;
    }

    /**
     * Obtient la valeur de la propriété fraisLivraisonString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraisLivraisonString() {
        return fraisLivraisonString;
    }

    /**
     * Définit la valeur de la propriété fraisLivraisonString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraisLivraisonString(String value) {
        this.fraisLivraisonString = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété idClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdClient() {
        return idClient;
    }

    /**
     * Définit la valeur de la propriété idClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdClient(String value) {
        this.idClient = value;
    }

    /**
     * Obtient la valeur de la propriété idProduits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProduits() {
        return idProduits;
    }

    /**
     * Définit la valeur de la propriété idProduits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProduits(String value) {
        this.idProduits = value;
    }

    /**
     * Obtient la valeur de la propriété moyenPaiement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoyenPaiement() {
        return moyenPaiement;
    }

    /**
     * Définit la valeur de la propriété moyenPaiement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoyenPaiement(String value) {
        this.moyenPaiement = value;
    }

    /**
     * Gets the value of the produits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LigneCommande }
     * 
     * 
     */
    public List<LigneCommande> getProduits() {
        if (produits == null) {
            produits = new ArrayList<LigneCommande>();
        }
        return this.produits;
    }

    /**
     * Obtient la valeur de la propriété statut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Définit la valeur de la propriété statut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatut(String value) {
        this.statut = value;
    }

    /**
     * Obtient la valeur de la propriété totalHt.
     * 
     */
    public float getTotalHt() {
        return totalHt;
    }

    /**
     * Définit la valeur de la propriété totalHt.
     * 
     */
    public void setTotalHt(float value) {
        this.totalHt = value;
    }

    /**
     * Obtient la valeur de la propriété totalHtString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalHtString() {
        return totalHtString;
    }

    /**
     * Définit la valeur de la propriété totalHtString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalHtString(String value) {
        this.totalHtString = value;
    }

    /**
     * Obtient la valeur de la propriété totalTtc.
     * 
     */
    public float getTotalTtc() {
        return totalTtc;
    }

    /**
     * Définit la valeur de la propriété totalTtc.
     * 
     */
    public void setTotalTtc(float value) {
        this.totalTtc = value;
    }

    /**
     * Obtient la valeur de la propriété totalTtcString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTtcString() {
        return totalTtcString;
    }

    /**
     * Définit la valeur de la propriété totalTtcString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTtcString(String value) {
        this.totalTtcString = value;
    }

}
