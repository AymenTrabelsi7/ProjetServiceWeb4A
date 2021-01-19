package util;

import javax.servlet.http.HttpSession;

import basket.Basket;

public class attributes {
	public static void verifyBasket(HttpSession sess) {
		if(sess.getAttribute("userBasket") == null) {
			Basket basket = new Basket();
			sess.setAttribute("userBasket", basket.getProducts());
			sess.setAttribute("basketTotal", basket.getTotal());
		}
	}
}
