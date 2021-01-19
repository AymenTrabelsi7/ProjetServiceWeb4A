package controllers;

import java.io.IOException;
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

import soapinterface.CategoriesService;
import soapinterface.CategoriesServiceService;
import soapinterface.ProductService;
import soapinterface.ProductServiceService;

/**
 * Servlet implementation class Categories
 */
@WebServlet("/categories")
public class Categories extends HttpServlet implements Filter  {
	private static final long serialVersionUID = 1L;
	List<soapinterface.Product> cat_products;
	CategoriesService categories_stub = new CategoriesServiceService().getCategoriesServicePort();
	ProductService product_stub = new ProductServiceService().getProductServicePort();
    
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Categories() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cat = request.getParameter("cat");
		if(cat != null && categories_stub.isCategorie(cat)) {
			cat_products = product_stub.getProduitsCategorie(cat);
			request.setAttribute("catProducts", cat_products);
			request.setAttribute("selectedCat", cat);
		}
		else {
			request.removeAttribute("catProducts");
			request.removeAttribute("selectedCat");
			request.setAttribute("categories", categories_stub.getCategories());
		}
		request.setCharacterEncoding("UTF-8");
		this.getServletContext().getRequestDispatcher("/WEB-INF/categories.jsp").forward(request, response);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) request;
		util.attributes.verifyBasket(r.getSession());		
	}

}
