
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

    private final static QName _Categories_QNAME = new QName("http://www.polytech.fr", "categories");
    private final static QName _GetCategories_QNAME = new QName("http://www.polytech.fr", "getCategories");
    private final static QName _GetCategoriesResponse_QNAME = new QName("http://www.polytech.fr", "getCategoriesResponse");
    private final static QName _IsCategorie_QNAME = new QName("http://www.polytech.fr", "isCategorie");
    private final static QName _IsCategorieResponse_QNAME = new QName("http://www.polytech.fr", "isCategorieResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Categories }
     * 
     */
    public Categories createCategories() {
        return new Categories();
    }

    /**
     * Create an instance of {@link GetCategories }
     * 
     */
    public GetCategories createGetCategories() {
        return new GetCategories();
    }

    /**
     * Create an instance of {@link GetCategoriesResponse }
     * 
     */
    public GetCategoriesResponse createGetCategoriesResponse() {
        return new GetCategoriesResponse();
    }

    /**
     * Create an instance of {@link IsCategorie }
     * 
     */
    public IsCategorie createIsCategorie() {
        return new IsCategorie();
    }

    /**
     * Create an instance of {@link IsCategorieResponse }
     * 
     */
    public IsCategorieResponse createIsCategorieResponse() {
        return new IsCategorieResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Categories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Categories }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "categories")
    public JAXBElement<Categories> createCategories(Categories value) {
        return new JAXBElement<Categories>(_Categories_QNAME, Categories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCategories }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "getCategories")
    public JAXBElement<GetCategories> createGetCategories(GetCategories value) {
        return new JAXBElement<GetCategories>(_GetCategories_QNAME, GetCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCategoriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "getCategoriesResponse")
    public JAXBElement<GetCategoriesResponse> createGetCategoriesResponse(GetCategoriesResponse value) {
        return new JAXBElement<GetCategoriesResponse>(_GetCategoriesResponse_QNAME, GetCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCategorie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsCategorie }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "isCategorie")
    public JAXBElement<IsCategorie> createIsCategorie(IsCategorie value) {
        return new JAXBElement<IsCategorie>(_IsCategorie_QNAME, IsCategorie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCategorieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsCategorieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.polytech.fr", name = "isCategorieResponse")
    public JAXBElement<IsCategorieResponse> createIsCategorieResponse(IsCategorieResponse value) {
        return new JAXBElement<IsCategorieResponse>(_IsCategorieResponse_QNAME, IsCategorieResponse.class, null, value);
    }

}
