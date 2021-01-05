package Services;

import java.util.List;

import DBManagers.ProductManager;
import EJBs.Product;

public class Test {

	public static void main(String[] args) {
		ProductManager access = new ProductManager();
		List<Product> res = access.getProduitsIndex();
		
		System.out.println("Size : " + res.size());
		for (Product p : res) {
			System.out.println(p);
		}
	}

}
