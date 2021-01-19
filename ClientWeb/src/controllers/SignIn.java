package controllers;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
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
import soapinterface.ClientService;
import soapinterface.ClientServiceService;
import util.password;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/signin")
public class SignIn extends HttpServlet implements Filter  {
	private static final long serialVersionUID = 1L;
	ClientService stub = new ClientServiceService().getClientServicePort();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		this.getServletContext().getRequestDispatcher("/WEB-INF/sign_in.jsp").forward(request, response);
		sess.setAttribute("logError", false);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		String usr = request.getParameter("username");
		try {
			String mdp = password.toHexString(password.getSHA(request.getParameter("mdp")));
			if(stub.login(usr, mdp)) {
				sess.setAttribute("connected", true);
				sess.setAttribute("username", usr);
				basket.Basket basket = new basket.Basket();
				sess.setAttribute("userBasket", basket.getProducts());
				sess.setAttribute("basketTotal", 0.0f);
				if(sess.getAttribute("redirectSource") != null) {
					response.sendRedirect((String) sess.getAttribute("redirectSource"));
					sess.removeAttribute("redirectSource");
				}
				else response.sendRedirect("index");
			}
			else {
				sess.setAttribute("logError", true);
				response.sendRedirect("signin");
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) request;
		util.attributes.verifyBasket(r.getSession());		
	}

}
