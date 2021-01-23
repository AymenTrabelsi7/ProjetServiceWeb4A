
package soapinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour shipping complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="shipping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duree_livraison" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_shipping" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nom_complet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nom_var" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="prixString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipping", propOrder = {
    "date",
    "dureeLivraison",
    "icon",
    "idShipping",
    "nomComplet",
    "nomVar",
    "prix",
    "prixString"
})
public class Shipping {

    protected String date;
    @XmlElement(name = "duree_livraison")
    protected int dureeLivraison;
    protected String icon;
    @XmlElement(name = "id_shipping")
    protected int idShipping;
    @XmlElement(name = "nom_complet")
    protected String nomComplet;
    @XmlElement(name = "nom_var")
    protected String nomVar;
    protected float prix;
    protected String prixString;

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propriété dureeLivraison.
     * 
     */
    public int getDureeLivraison() {
        return dureeLivraison;
    }

    /**
     * Définit la valeur de la propriété dureeLivraison.
     * 
     */
    public void setDureeLivraison(int value) {
        this.dureeLivraison = value;
    }

    /**
     * Obtient la valeur de la propriété icon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Définit la valeur de la propriété icon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Obtient la valeur de la propriété idShipping.
     * 
     */
    public int getIdShipping() {
        return idShipping;
    }

    /**
     * Définit la valeur de la propriété idShipping.
     * 
     */
    public void setIdShipping(int value) {
        this.idShipping = value;
    }

    /**
     * Obtient la valeur de la propriété nomComplet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomComplet() {
        return nomComplet;
    }

    /**
     * Définit la valeur de la propriété nomComplet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomComplet(String value) {
        this.nomComplet = value;
    }

    /**
     * Obtient la valeur de la propriété nomVar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomVar() {
        return nomVar;
    }

    /**
     * Définit la valeur de la propriété nomVar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomVar(String value) {
        this.nomVar = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(float value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété prixString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrixString() {
        return prixString;
    }

    /**
     * Définit la valeur de la propriété prixString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrixString(String value) {
        this.prixString = value;
    }

}
