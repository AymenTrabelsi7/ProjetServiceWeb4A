package Services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import DBManagers.ProductManager;
import EJBs.Product;

@WebService(targetNamespace = "localhost:8085/")
public class ProductService {
	ProductManager access = new ProductManager();
	
	@WebMethod(operationName = "getProduitsIndex")
	public List<Product> getProduitsIndex() {
		return access.getProduitsIndex();
	}
	
	@WebMethod(operationName = "getProduit")
	public Product getProduit(@WebParam(name = "id")int id) {
		return access.getProduit(id);
	}
	
	@WebMethod(operationName = "getProduitsSearch")
	public List<Product> getProduitsSearch(@WebParam(name = "tokens")List<String> tokens) {
		return access.getProduitSearch(tokens);
	}
	
}
