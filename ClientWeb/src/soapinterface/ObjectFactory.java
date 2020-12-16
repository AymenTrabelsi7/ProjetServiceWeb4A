
package soapinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapinterface package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Bonjour_QNAME = new QName("http://www.test.fr", "bonjour");
    private final static QName _BonjourResponse_QNAME = new QName("http://www.test.fr", "bonjourResponse");
    private final static QName _Hello_QNAME = new QName("http://www.test.fr", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://www.test.fr", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Bonjour }
     * 
     */
    public Bonjour createBonjour() {
        return new Bonjour();
    }

    /**
     * Create an instance of {@link BonjourResponse }
     * 
     */
    public BonjourResponse createBonjourResponse() {
        return new BonjourResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bonjour }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bonjour }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "bonjour")
    public JAXBElement<Bonjour> createBonjour(Bonjour value) {
        return new JAXBElement<Bonjour>(_Bonjour_QNAME, Bonjour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BonjourResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BonjourResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "bonjourResponse")
    public JAXBElement<BonjourResponse> createBonjourResponse(BonjourResponse value) {
        return new JAXBElement<BonjourResponse>(_BonjourResponse_QNAME, BonjourResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.test.fr", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
