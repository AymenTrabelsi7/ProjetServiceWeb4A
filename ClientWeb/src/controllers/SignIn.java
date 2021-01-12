package controllers;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.servlet.ServletException;
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
public class SignIn extends HttpServlet {
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
		System.out.println("usr : "+usr);
		System.out.println("clear mdp : " + request.getParameter("mdp"));
		try {
			String mdp = password.toHexString(password.getSHA(request.getParameter("mdp")));
			System.out.println("Hashed Mdp : " + mdp);
			if(stub.login(usr, mdp)) {
				System.out.println("Login success");
				sess.setAttribute("connected", true);
				sess.setAttribute("username", usr);
				basket.Basket basket = new basket.Basket();
				sess.setAttribute("userBasket", basket.getProducts());
				sess.setAttribute("basketTotal", 0);
				if(sess.getAttribute("redirectSource") != null) {
					response.sendRedirect((String) sess.getAttribute("redirectSource"));
					sess.setAttribute("redirectSource", null);
				}
				else response.sendRedirect("index");
			}
			else {
				System.out.println("Login failed");
				sess.setAttribute("logError", true);
				response.sendRedirect("signin");
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}		
	}

}
