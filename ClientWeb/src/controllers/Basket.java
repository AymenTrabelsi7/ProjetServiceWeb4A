package controllers;

import java.io.IOException;
import java.util.ArrayList;

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
 * Servlet implementation class Basket
 */
@WebServlet("/basket")
public class Basket extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService stub = new ProductServiceService().getProductServicePort();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Basket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		if(sess.getAttribute("connected") != null && (boolean)sess.getAttribute("connected")) this.getServletContext().getRequestDispatcher("/WEB-INF/basket.jsp").forward(request, response);
		else {
			sess.setAttribute("redirectSource", "basket");
			response.sendRedirect("signin");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		int id = Integer.parseInt(request.getParameter("productId"));
		basket.Basket basket = new basket.Basket();
		basket.setProducts((ArrayList<BasketProduct>) sess.getAttribute("userBasket"));
		basket.setTotal((int) sess.getAttribute("basketTotal"));
		basket.supprimerProduit(id);
		sess.setAttribute("userBasket", basket.getProducts());
		sess.setAttribute("basketTotal", basket.getTotal());
		response.sendRedirect("basket");
	}

}
