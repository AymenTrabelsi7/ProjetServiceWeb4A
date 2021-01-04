
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

    private final static QName _GetProduit_QNAME = new QName("localhost:8085/", "getProduit");
    private final static QName _GetProduitResponse_QNAME = new QName("localhost:8085/", "getProduitResponse");
    private final static QName _GetProduitsIndex_QNAME = new QName("localhost:8085/", "getProduitsIndex");
    private final static QName _GetProduitsIndexResponse_QNAME = new QName("localhost:8085/", "getProduitsIndexResponse");
    private final static QName _GetProduitsSearch_QNAME = new QName("localhost:8085/", "getProduitsSearch");
    private final static QName _GetProduitsSearchResponse_QNAME = new QName("localhost:8085/", "getProduitsSearchResponse");
    private final static QName _Product_QNAME = new QName("localhost:8085/", "product");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProduit }
     * 
     */
    public GetProduit createGetProduit() {
        return new GetProduit();
    }

    /**
     * Create an instance of {@link GetProduitResponse }
     * 
     */
    public GetProduitResponse createGetProduitResponse() {
        return new GetProduitResponse();
    }

    /**
     * Create an instance of {@link GetProduitsIndex }
     * 
     */
    public GetProduitsIndex createGetProduitsIndex() {
        return new GetProduitsIndex();
    }

    /**
     * Create an instance of {@link GetProduitsIndexResponse }
     * 
     */
    public GetProduitsIndexResponse createGetProduitsIndexResponse() {
        return new GetProduitsIndexResponse();
    }

    /**
     * Create an instance of {@link GetProduitsSearch }
     * 
     */
    public GetProduitsSearch createGetProduitsSearch() {
        return new GetProduitsSearch();
    }

    /**
     * Create an instance of {@link GetProduitsSearchResponse }
     * 
     */
    public GetProduitsSearchResponse createGetProduitsSearchResponse() {
        return new GetProduitsSearchResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduit }{@code >}
     */
    @XmlElementDecl(namespace = "localhost:8085/", name = "getProduit")
    public JAXBElement<GetProduit> createGetProduit(GetProduit value) {
        return new JAXBElement<GetProduit>(_GetProduit_QNAME, GetProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "localhost:8085/", name = "getProduitResponse")
    public JAXBElement<GetProduitResponse> createGetProduitResponse(GetProduitResponse value) {
        return new JAXBElement<GetProduitResponse>(_GetProduitResponse_QNAME, GetProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitsIndex }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduitsIndex }{@code >}
     */
    @XmlElementDecl(namespace = "localhost:8085/", name = "getProduitsIndex")
    public JAXBElement<GetProduitsIndex> createGetProduitsIndex(GetProduitsIndex value) {
        return new JAXBElement<GetProduitsIndex>(_GetProduitsIndex_QNAME, GetProduitsIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitsIndexResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduitsIndexResponse }{@code >}
     */
    @XmlElementDecl(namespace = "localhost:8085/", name = "getProduitsIndexResponse")
    public JAXBElement<GetProduitsIndexResponse> createGetProduitsIndexResponse(GetProduitsIndexResponse value) {
        return new JAXBElement<GetProduitsIndexResponse>(_GetProduitsIndexResponse_QNAME, GetProduitsIndexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitsSearch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduitsSearch }{@code >}
     */
    @XmlElementDecl(namespace = "localhost:8085/", name = "getProduitsSearch")
    public JAXBElement<GetProduitsSearch> createGetProduitsSearch(GetProduitsSearch value) {
        return new JAXBElement<GetProduitsSearch>(_GetProduitsSearch_QNAME, GetProduitsSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitsSearchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduitsSearchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "localhost:8085/", name = "getProduitsSearchResponse")
    public JAXBElement<GetProduitsSearchResponse> createGetProduitsSearchResponse(GetProduitsSearchResponse value) {
        return new JAXBElement<GetProduitsSearchResponse>(_GetProduitsSearchResponse_QNAME, GetProduitsSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "localhost:8085/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

}
