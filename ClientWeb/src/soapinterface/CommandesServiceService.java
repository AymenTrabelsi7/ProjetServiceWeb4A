
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
@WebServiceClient(name = "CommandesServiceService", targetNamespace = "http://www.polytech.fr", wsdlLocation = "http://localhost:9000/commande?wsdl")
public class CommandesServiceService
    extends Service
{

    private final static URL COMMANDESSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException COMMANDESSERVICESERVICE_EXCEPTION;
    private final static QName COMMANDESSERVICESERVICE_QNAME = new QName("http://www.polytech.fr", "CommandesServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/commande?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMMANDESSERVICESERVICE_WSDL_LOCATION = url;
        COMMANDESSERVICESERVICE_EXCEPTION = e;
    }

    public CommandesServiceService() {
        super(__getWsdlLocation(), COMMANDESSERVICESERVICE_QNAME);
    }

    public CommandesServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMMANDESSERVICESERVICE_QNAME, features);
    }

    public CommandesServiceService(URL wsdlLocation) {
        super(wsdlLocation, COMMANDESSERVICESERVICE_QNAME);
    }

    public CommandesServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMMANDESSERVICESERVICE_QNAME, features);
    }

    public CommandesServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CommandesServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CommandesService
     */
    @WebEndpoint(name = "CommandesServicePort")
    public CommandesService getCommandesServicePort() {
        return super.getPort(new QName("http://www.polytech.fr", "CommandesServicePort"), CommandesService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CommandesService
     */
    @WebEndpoint(name = "CommandesServicePort")
    public CommandesService getCommandesServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.polytech.fr", "CommandesServicePort"), CommandesService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMMANDESSERVICESERVICE_EXCEPTION!= null) {
            throw COMMANDESSERVICESERVICE_EXCEPTION;
        }
        return COMMANDESSERVICESERVICE_WSDL_LOCATION;
    }

}
