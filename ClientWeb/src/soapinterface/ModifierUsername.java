
package soapinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour modifierUsername complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="modifierUsername"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifierUsername", propOrder = {
    "currentUsr",
    "newUsr"
})
public class ModifierUsername {

    protected String currentUsr;
    protected String newUsr;

    /**
     * Obtient la valeur de la propriété currentUsr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentUsr() {
        return currentUsr;
    }

    /**
     * Définit la valeur de la propriété currentUsr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentUsr(String value) {
        this.currentUsr = value;
    }

    /**
     * Obtient la valeur de la propriété newUsr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUsr() {
        return newUsr;
    }

    /**
     * Définit la valeur de la propriété newUsr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUsr(String value) {
        this.newUsr = value;
    }

}
