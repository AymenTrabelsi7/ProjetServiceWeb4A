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
import javax.servlet.http.HttpSession;

import soapinterface.Commande;
import soapinterface.CommandesService;
import soapinterface.CommandesServiceService;

/**
 * Servlet implementation class MyOrders
 */
@WebServlet("/myorders")
public class MyOrders extends HttpServlet implements Filter  {
	private static final long serialVersionUID = 1L;
	CommandesService commande_stub = new CommandesServiceService().getCommandesServicePort();
    HttpSession sess;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyOrders() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sess = request.getSession();
		if(sess.getAttribute("connected") != null && (boolean) sess.getAttribute("connected")) {			
			List<Commande> commandes = commande_stub.getUserCommandes((String)sess.getAttribute("username"));
			request.setAttribute("commandes", commandes);
			this.getServletContext().getRequestDispatcher("/WEB-INF/myorders.jsp").forward(request, response);
		} else {
			sess.setAttribute("redirectSource", "myorders");
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
