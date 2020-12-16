package test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.test.fr")
public class ClassTest {
	public int a = 1;
	
	@WebMethod(operationName = "hello")
	public String hello() {
		return "hello";
	}
	
	@WebMethod(operationName = "bonjour")
	public String bonjour() {
		return "bonjour";
	}
	
}
