package Services;

import javax.xml.ws.Endpoint;

public class Deploiement {
	public static void main(String[] args) {
		
		String url;
		
		url = "http://localhost:9000/product";
		Endpoint.publish(url, new ProductService());
		System.out.println(url + "?wsdl");
		
		url = "http://localhost:9000/client";
		Endpoint.publish(url, new ClientService());
		System.out.println(url + "?wsdl");
		
		url = "http://localhost:9000/categories";
		Endpoint.publish(url, new CategoriesService());
		System.out.println(url + "?wsdl");
		
		url = "http://localhost:9000/commande";
		Endpoint.publish(url, new CommandesService());
		System.out.println(url + "?wsdl");
		
		url = "http://localhost:9000/shipping";
		Endpoint.publish(url, new ShippingService());
		System.out.println(url + "?wsdl");
		
	}
}
