package Services;

import javax.xml.ws.Endpoint;

public class Deploiement {
	public static void main(String[] args) {
		String url = "http://localhost:9000/product";
		Endpoint.publish(url, new ProductService());
		System.out.println(url + "?wsdl");
		url = "http://localhost:9000/client";
		Endpoint.publish(url, new ClientService());
		System.out.println(url + "?wsdl");
	}
}
