package Services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import DBManagers.CategoriesManager;
import EJBs.Categories;

@WebService(targetNamespace = "http://www.polytech.fr")
public class CategoriesService {
	CategoriesManager access = new CategoriesManager();
	
	@WebMethod(operationName = "getCategories")
	public List<Categories> getCategories() {
		return access.getCategories();
		
	}
	
	@WebMethod(operationName = "isCategorie")
	public boolean isCategorie(@WebParam(name = "cat")String cat) {
		return access.isCategorie(cat);	
	}
	

}
