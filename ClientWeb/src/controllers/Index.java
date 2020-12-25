package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index")
public class Index extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    ArrayList<Product> home_products = new ArrayList<Product>(0);
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
		home_products.add(new Product(1,20,"Téléphone","Un téléphone"));
		home_products.add(new Product(2,150,"Disque Dur","Un Disque dur 2TB"));
		home_products.add(new Product(3,80,"Cyberpunk 2077 PS5","Le dernier jeu de CD-Projekt sur la dernière console de Sony"));
		home_products.add(new Product(4,3000,"Cuisine","Une Cuisine high-tech"));
		request.setAttribute("connected", false);
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
