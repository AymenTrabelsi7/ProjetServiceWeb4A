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
 * Servlet implementation class Product
 */
@WebServlet("/product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
	soapinterface.Product produit;
	ProductService stub = new ProductServiceService().getProductServicePort();
	HttpSession sess;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sess = request.getSession();
		int id_produit = Integer.parseInt(request.getParameter("id"));
		produit = stub.getProduit(id_produit);
		//Ici utiliser le service SOAP pour avoir les infos du produit
		request.setAttribute("produit", produit);
		this.getServletContext().getRequestDispatcher("/WEB-INF/product.jsp").forward(request, response);
		sess.removeAttribute("addedToCart");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		sess = request.getSession();
		if(sess.getAttribute("connected") != null && (boolean)sess.getAttribute("connected")) {			
			int id = Integer.parseInt(request.getParameter("productId"));
			int qte = Integer.parseInt(request.getParameter("quantite"));
			if(!(boolean)sess.getAttribute("connected")) {
				sess.setAttribute("redirectSource", "product?id="+id);
				response.sendRedirect("signin");
			}
			else {
				@SuppressWarnings("unchecked")
				ArrayList<BasketProduct> userBasket = (ArrayList<BasketProduct>)sess.getAttribute("userBasket");
				int total = (int)sess.getAttribute("basketTotal");
				basket.Basket basket = new basket.Basket();
				basket.setTotal(total);
				basket.setProducts(userBasket);
				basket.ajouterProduit(stub.getProduit(id),qte);
				sess.setAttribute("userBasket", basket.getProducts());
				sess.setAttribute("basketTotal", basket.getTotal());
				sess.setAttribute("addedToCart", true);
				response.sendRedirect("product?id="+id);
			}
		} else response.sendRedirect("signin");
	}

}
