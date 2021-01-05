
package soapinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour update complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="update"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newCli" type="{http://www.polytech.fr}client" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update", propOrder = {
    "newCli"
})
public class Update {

    protected Client newCli;

    /**
     * Obtient la valeur de la propriété newCli.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getNewCli() {
        return newCli;
    }

    /**
     * Définit la valeur de la propriété newCli.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setNewCli(Client value) {
        this.newCli = value;
    }

}
