
package soapinterface;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CategoriesServiceService", targetNamespace = "http://www.polytech.fr", wsdlLocation = "http://localhost:9000/categories?wsdl")
public class CategoriesServiceService
    extends Service
{

    private final static URL CATEGORIESSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CATEGORIESSERVICESERVICE_EXCEPTION;
    private final static QName CATEGORIESSERVICESERVICE_QNAME = new QName("http://www.polytech.fr", "CategoriesServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/categories?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CATEGORIESSERVICESERVICE_WSDL_LOCATION = url;
        CATEGORIESSERVICESERVICE_EXCEPTION = e;
    }

    public CategoriesServiceService() {
        super(__getWsdlLocation(), CATEGORIESSERVICESERVICE_QNAME);
    }

    public CategoriesServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CATEGORIESSERVICESERVICE_QNAME, features);
    }

    public CategoriesServiceService(URL wsdlLocation) {
        super(wsdlLocation, CATEGORIESSERVICESERVICE_QNAME);
    }

    public CategoriesServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CATEGORIESSERVICESERVICE_QNAME, features);
    }

    public CategoriesServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CategoriesServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CategoriesService
     */
    @WebEndpoint(name = "CategoriesServicePort")
    public CategoriesService getCategoriesServicePort() {
        return super.getPort(new QName("http://www.polytech.fr", "CategoriesServicePort"), CategoriesService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CategoriesService
     */
    @WebEndpoint(name = "CategoriesServicePort")
    public CategoriesService getCategoriesServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.polytech.fr", "CategoriesServicePort"), CategoriesService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CATEGORIESSERVICESERVICE_EXCEPTION!= null) {
            throw CATEGORIESSERVICESERVICE_EXCEPTION;
        }
        return CATEGORIESSERVICESERVICE_WSDL_LOCATION;
    }

}