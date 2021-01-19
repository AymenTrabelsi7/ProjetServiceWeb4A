package Services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import DBManagers.ProductManager;
import EJBs.Product;

@WebService(targetNamespace = "http://www.polytech.fr")
public class ProductService {
	ProductManager access = new ProductManager();
	
	@WebMethod(operationName = "getProduitsIndex")
	public List<Product> getProduitsIndex() {
		List<Product> ps =  access.getProduitsIndex();
		try {
			return ps;
			
		} catch(Exception e) {
			System.out.println("DEBUGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
			e.printStackTrace();
			return ps;
		}
	}
	
	@WebMethod(operationName = "getProduit")
	public Product getProduit(@WebParam(name = "id")int id) {
		return access.getProduit(id);
	}
	
	@WebMethod(operationName = "getProduitsSearch")
	public List<Product> getProduitsSearch(@WebParam(name = "tokens")List<String> tokens) {
		return access.getProduitSearch(tokens);
	}
	
	@WebMethod(operationName = "getProduitsCategorie")
	public List<Product> getProduitsCategorie(@WebParam(name = "cat")String cat) {
		return access.getProduitsCategorie(cat);
	}
	
}
