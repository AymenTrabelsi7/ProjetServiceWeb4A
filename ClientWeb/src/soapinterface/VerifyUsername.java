
package soapinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour verifyUsername complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="verifyUsername"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyUsername", propOrder = {
    "usr"
})
public class VerifyUsername {

    protected String usr;

    /**
     * Obtient la valeur de la propriété usr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsr() {
        return usr;
    }

    /**
     * Définit la valeur de la propriété usr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsr(String value) {
        this.usr = value;
    }

}
