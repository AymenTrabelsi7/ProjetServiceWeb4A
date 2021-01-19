package Services;

import java.time.LocalDate;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import DBManagers.ShippingManager;
import EJBs.Shipping;

@WebService(targetNamespace = "http://www.polytech.fr")
public class ShippingService {
	
	ShippingManager access = new ShippingManager();
	
	public ShippingService() {}
	
	@WebMethod(operationName = "getShipping")
	public Shipping getShipping(int id) {
		return access.getShipping(id);
	}
	
	
	@WebMethod(operationName = "getShippingByName")
	public Shipping getShippingByName(String varName) {
		return access.getShippingByName(varName);
	}
	
	@WebMethod(operationName = "getShippings")
	public List<Shipping> getShippings() {
		
		List<Shipping> shippings = access.getShippings();
//		LocalDate today = LocalDate.now();
//		
//		for (Shipping s : shippings) {
//			s.setDate(today.plusDays(s.getDuree_livraison()));
//		}
		
		return shippings;
	}

}
