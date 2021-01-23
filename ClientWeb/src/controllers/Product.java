package controllers;

import java.io.IOException;
import java.util.ArrayList;

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
 * Servlet implementation class Product
 */
@WebServlet("/product")
public class Product extends HttpServlet implements Filter  {
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

    public int isInBasket(ArrayList<BasketProduct> userBasket,int id) {
    	for (BasketProduct basketProduct : userBasket) {
			if(basketProduct.getId() == id) return userBasket.indexOf(basketProduct);
		}
    	return -1;
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
		sess.removeAttribute("qteError");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		sess = request.getSession();
		int id = Integer.parseInt(request.getParameter("productId"));
		if(sess.getAttribute("connected") != null && (boolean)sess.getAttribute("connected")) {			
				int qte = Integer.parseInt(request.getParameter("quantite"));
				int stock = stub.getProduit(id).getStock();
				
				if(qte>stock) {
					sess.setAttribute("qteError", true);
					response.sendRedirect("product?id="+id);
				}
				else {					
					@SuppressWarnings("unchecked")
					ArrayList<BasketProduct> userBasket = (ArrayList<BasketProduct>)sess.getAttribute("userBasket");
					float total = (float) sess.getAttribute("basketTotal");
					int index = isInBasket(userBasket, id);
					basket.Basket basket = new basket.Basket();
					basket.setTotal(total);
					basket.setProducts(userBasket);
					if(index == -1) {					
						basket.ajouterProduit(stub.getProduit(id),qte);
					}
					else {
						basket.changerQuantite(id, basket.getProducts().get(index).getQuantite() + qte);
					}
					sess.setAttribute("userBasket", basket.getProducts());
					sess.setAttribute("basketTotal", basket.getTotal());
					sess.setAttribute("basketTotalString", basket.getTotalString());
					sess.setAttribute("addedToCart", true);
					response.sendRedirect("product?id="+id);
				}
		
		} else {
			sess.setAttribute("redirectSource", "product?id="+id);			
			response.sendRedirect("signin");
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) request;
		util.attributes.verifyBasket(r.getSession());		
	}

}
