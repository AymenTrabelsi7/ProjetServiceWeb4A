package Services;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import DBManagers.ClientManager;
import EJBs.Client;

@WebService(targetNamespace = "http://www.polytech.fr")
public class ClientService {
	ClientManager access = new ClientManager();
	
	@WebMethod(operationName = "createAccount")
	public boolean createAccount(@WebParam(name = "client")Client cli) {
		return access.addClient(cli);
	}
	
	@WebMethod(operationName = "login")
	public boolean login(@WebParam(name = "usr")String usr,@WebParam(name = "mdp")String mdp) {
		return access.verifyLogin(usr,mdp);
	}
	
	@WebMethod(operationName = "update")
	public boolean update(@WebParam(name = "newCli")Client newCli) {
		return access.updateClient(newCli);
	}
	
	@WebMethod(operationName = "verifyUsername")
	public boolean verifyUsername(@WebParam(name = "usr")String usr) {
		return !access.clientExists(usr);
	}
	
	@WebMethod(operationName = "getAccount")
	public Client getAccount(@WebParam(name = "usr")String usr) {
		return access.getClient(usr);
	}
	
	@WebMethod(operationName = "modifierNom")
	public boolean modifierNom(@WebParam(name = "usr")String usr, @WebParam(name = "nom")String nom) {
		return access.updateNom(usr,nom);
	}
	
	@WebMethod(operationName = "modifierPrenom")
	public boolean modifierPrenom(@WebParam(name = "usr")String usr, @WebParam(name = "prenom")String prenom) {
		return access.updatePrenom(usr,prenom);
	}
	
	
	@WebMethod(operationName = "modifierEmail")
	public boolean modifierEmail(@WebParam(name = "usr")String usr, @WebParam(name = "email")String email) {
		return access.updateEmail(usr,email);
	}
	
	@WebMethod(operationName = "modifierMdp")
	public boolean modifierMdp(@WebParam(name = "usr")String usr, @WebParam(name = "mdp")String mdp) {
		return access.updateMdp(usr,mdp);
	}
	
}
