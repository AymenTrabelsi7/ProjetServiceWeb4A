package test;

import javax.xml.ws.Endpoint;

public class Test {
	public static void main(String[] args) {
		String url = "http://localhost:9000/";
		Endpoint.publish(url, new ClassTest());
	}
}
