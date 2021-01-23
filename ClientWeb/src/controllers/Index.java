package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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
public class Index extends HttpServlet implements Filter  {
	
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



	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) request;
		util.attributes.verifyBasket(r.getSession());		
	}
	
	

}
