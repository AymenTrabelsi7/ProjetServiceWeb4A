package Services;

import javax.xml.ws.Endpoint;

public class Deploiement {
	public static void main(String[] args) {
		String url = "http://localhost:9000/";
		Endpoint.publish(url, new ProductService());
		System.out.println(url + "?wsdl");
	}
}
