
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

    private final static QName _GetShipping_QNAME = new QName("http://www.polytech.fr", "getShipping");
    private final static QName _GetShippingByName_QNAME = new QName("http://www.polytech.fr", "getShippingByName");
    private final static QName _GetShippingByNameResponse_QNAME = new QName("http://www.polytech.fr", "getShippingByNameResponse");
    private final static QName _GetShippingResponse_QNAME = new QName("http://www.polytech.fr", "getShippingResponse");
    private final static QName _GetShippings_QNAME = new QName("http://www.polytech.fr", "getShippings");
    private final static QName _GetShippingsResponse_QNAME = new QName("http://www.polytech.fr", "getShippingsResponse");
    private final static QName _Shipping_QNAME = new QName("http://www.polytech.fr", "shipping");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetShipping }
     * 
     */
    public GetShipping createGetShipping() {
        return new GetShipping();
    }

    /**
     * Create an instance of {@link GetShippingByName }
     * 
     */
    public GetShippingByName createGetShippingByName() {
        return new GetShippingByName();
    }

    /**
     * Create an instance of {@link GetShippingByNameResponse }
     * 
     */
    public GetShippingByNameResponse createGetShippingByNameResponse() {
        return new GetShippingByNameResponse();
    }

    /**
     * Create an instance of {@link GetShippingResponse }
     * 
     */
    public GetShippingResponse createGetShippingResponse() {
        return new GetShippingResponse();
    }

    /**
     * Create an instance of {@link GetShippings }
     * 
     */
    public GetShippings createGetShippings() {
        return new GetShippings();
    }

    /**
     * Create an instance of {@link GetShippingsResponse }
     * 
     */
    public GetShippingsResponse createGetShippingsResponse() {
        return new GetShippingsResponse();
    }

    /**
     * Create an instance of {@link Shipping }
     * 
     */
    public Shipping createShipping() {
        return new Shipping();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShipping }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShipping }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "getShipping")
    public JAXBElement<GetShipping> createGetShipping(GetShipping value) {
        return new JAXBElement<GetShipping>(_GetShipping_QNAME, GetShipping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShippingByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "getShippingByName")
    public JAXBElement<GetShippingByName> createGetShippingByName(GetShippingByName value) {
        return new JAXBElement<GetShippingByName>(_GetShippingByName_QNAME, GetShippingByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShippingByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "getShippingByNameResponse")
    public JAXBElement<GetShippingByNameResponse> createGetShippingByNameResponse(GetShippingByNameResponse value) {
        return new JAXBElement<GetShippingByNameResponse>(_GetShippingByNameResponse_QNAME, GetShippingByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShippingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "getShippingResponse")
    public JAXBElement<GetShippingResponse> createGetShippingResponse(GetShippingResponse value) {
        return new JAXBElement<GetShippingResponse>(_GetShippingResponse_QNAME, GetShippingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShippings }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "getShippings")
    public JAXBElement<GetShippings> createGetShippings(GetShippings value) {
        return new JAXBElement<GetShippings>(_GetShippings_QNAME, GetShippings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShippingsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetShippingsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "getShippingsResponse")
    public JAXBElement<GetShippingsResponse> createGetShippingsResponse(GetShippingsResponse value) {
        return new JAXBElement<GetShippingsResponse>(_GetShippingsResponse_QNAME, GetShippingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Shipping }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Shipping }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "shipping")
    public JAXBElement<Shipping> createShipping(Shipping value) {
        return new JAXBElement<Shipping>(_Shipping_QNAME, Shipping.class, null, value);
    }

}
