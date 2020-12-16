
package soapinterface;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClassTest", targetNamespace = "http://www.test.fr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClassTest {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bonjour", targetNamespace = "http://www.test.fr", className = "soapinterface.Bonjour")
    @ResponseWrapper(localName = "bonjourResponse", targetNamespace = "http://www.test.fr", className = "soapinterface.BonjourResponse")
    @Action(input = "http://www.test.fr/ClassTest/bonjourRequest", output = "http://www.test.fr/ClassTest/bonjourResponse")
    public String bonjour();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://www.test.fr", className = "soapinterface.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://www.test.fr", className = "soapinterface.HelloResponse")
    @Action(input = "http://www.test.fr/ClassTest/helloRequest", output = "http://www.test.fr/ClassTest/helloResponse")
    public String hello();

}
