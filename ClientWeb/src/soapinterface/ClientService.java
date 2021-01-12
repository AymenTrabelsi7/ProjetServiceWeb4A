
package soapinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
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
@WebService(name = "ClientService", targetNamespace = "http://www.polytech.fr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClientService {


    /**
     * 
     * @param newCli
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://www.polytech.fr", className = "soapinterface.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.UpdateResponse")
    @Action(input = "http://www.polytech.fr/ClientService/updateRequest", output = "http://www.polytech.fr/ClientService/updateResponse")
    public boolean update(
        @WebParam(name = "newCli", targetNamespace = "")
        Client newCli);

    /**
     * 
     * @param client
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createAccount", targetNamespace = "http://www.polytech.fr", className = "soapinterface.CreateAccount")
    @ResponseWrapper(localName = "createAccountResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.CreateAccountResponse")
    @Action(input = "http://www.polytech.fr/ClientService/createAccountRequest", output = "http://www.polytech.fr/ClientService/createAccountResponse")
    public boolean createAccount(
        @WebParam(name = "client", targetNamespace = "")
        Client client);

    /**
     * 
     * @param usr
     * @param mdp
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://www.polytech.fr", className = "soapinterface.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.LoginResponse")
    @Action(input = "http://www.polytech.fr/ClientService/loginRequest", output = "http://www.polytech.fr/ClientService/loginResponse")
    public boolean login(
        @WebParam(name = "usr", targetNamespace = "")
        String usr,
        @WebParam(name = "mdp", targetNamespace = "")
        String mdp);

    /**
     * 
     * @param usr
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verifyUsername", targetNamespace = "http://www.polytech.fr", className = "soapinterface.VerifyUsername")
    @ResponseWrapper(localName = "verifyUsernameResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.VerifyUsernameResponse")
    @Action(input = "http://www.polytech.fr/ClientService/verifyUsernameRequest", output = "http://www.polytech.fr/ClientService/verifyUsernameResponse")
    public boolean verifyUsername(
        @WebParam(name = "usr", targetNamespace = "")
        String usr);

    /**
     * 
     * @param usr
     * @return
     *     returns soapinterface.Client
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://www.polytech.fr", className = "soapinterface.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.GetAccountResponse")
    @Action(input = "http://www.polytech.fr/ClientService/getAccountRequest", output = "http://www.polytech.fr/ClientService/getAccountResponse")
    public Client getAccount(
        @WebParam(name = "usr", targetNamespace = "")
        String usr);

    /**
     * 
     * @param usr
     * @param nom
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifierNom", targetNamespace = "http://www.polytech.fr", className = "soapinterface.ModifierNom")
    @ResponseWrapper(localName = "modifierNomResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.ModifierNomResponse")
    @Action(input = "http://www.polytech.fr/ClientService/modifierNomRequest", output = "http://www.polytech.fr/ClientService/modifierNomResponse")
    public boolean modifierNom(
        @WebParam(name = "usr", targetNamespace = "")
        String usr,
        @WebParam(name = "nom", targetNamespace = "")
        String nom);

    /**
     * 
     * @param usr
     * @param prenom
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifierPrenom", targetNamespace = "http://www.polytech.fr", className = "soapinterface.ModifierPrenom")
    @ResponseWrapper(localName = "modifierPrenomResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.ModifierPrenomResponse")
    @Action(input = "http://www.polytech.fr/ClientService/modifierPrenomRequest", output = "http://www.polytech.fr/ClientService/modifierPrenomResponse")
    public boolean modifierPrenom(
        @WebParam(name = "usr", targetNamespace = "")
        String usr,
        @WebParam(name = "prenom", targetNamespace = "")
        String prenom);

    /**
     * 
     * @param usr
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifierEmail", targetNamespace = "http://www.polytech.fr", className = "soapinterface.ModifierEmail")
    @ResponseWrapper(localName = "modifierEmailResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.ModifierEmailResponse")
    @Action(input = "http://www.polytech.fr/ClientService/modifierEmailRequest", output = "http://www.polytech.fr/ClientService/modifierEmailResponse")
    public boolean modifierEmail(
        @WebParam(name = "usr", targetNamespace = "")
        String usr,
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param usr
     * @param mdp
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifierMdp", targetNamespace = "http://www.polytech.fr", className = "soapinterface.ModifierMdp")
    @ResponseWrapper(localName = "modifierMdpResponse", targetNamespace = "http://www.polytech.fr", className = "soapinterface.ModifierMdpResponse")
    @Action(input = "http://www.polytech.fr/ClientService/modifierMdpRequest", output = "http://www.polytech.fr/ClientService/modifierMdpResponse")
    public boolean modifierMdp(
        @WebParam(name = "usr", targetNamespace = "")
        String usr,
        @WebParam(name = "mdp", targetNamespace = "")
        String mdp);

}
