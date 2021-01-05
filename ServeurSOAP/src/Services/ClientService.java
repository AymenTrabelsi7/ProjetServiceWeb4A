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
	
}
