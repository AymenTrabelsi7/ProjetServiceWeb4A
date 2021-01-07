package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import basket.BasketProduct;
import soapinterface.ProductService;
import soapinterface.ProductServiceService;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index")
public class Index extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    List<soapinterface.Product> home_products;
    ProductService stub = new ProductServiceService().getProductServicePort();
    
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		ArrayList<BasketProduct> basket = new ArrayList<BasketProduct>(0);
		BasketProduct p = new BasketProduct();
		p.setNom("PS44");
		p.setId(18);
		p.setPrix(400);
		p.setQuantite(19);
		p.setTotal(p.getPrix()*p.getQuantite());
		basket.add(p);
		
		BasketProduct p1 = new BasketProduct();
		p1.setNom("PS44");
		p1.setId(14);
		p1.setPrix(400);
		p1.setQuantite(19);
		p1.setTotal(p1.getPrix()*p1.getQuantite());
		basket.add(p1);
		sess.setAttribute("userBasket", basket);
		sess.setAttribute("basketTotal", p.getTotal()+p1.getTotal());
		
		boolean connected;
		if(sess.getAttribute("connected") != null) 	connected = (boolean) sess.getAttribute("connected");
		else {
			sess.setAttribute("connected", false);
			connected = false;
		}
		request.setAttribute("connected",connected);
		if(connected) request.setAttribute("username",sess.getAttribute("username"));
		home_products = stub.getProduitsIndex();
		request.setAttribute("home_products", home_products);
		request.setCharacterEncoding("UTF-8");
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
