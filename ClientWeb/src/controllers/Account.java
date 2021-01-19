package controllers;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

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

import soapinterface.ClientService;
import soapinterface.ClientServiceService;
import util.password;

/**
 * Servlet implementation class Account
 */
@WebServlet("/myaccount")
public class Account extends HttpServlet implements Filter {
	private static final long serialVersionUID = 1L;
	ClientService stub = new ClientServiceService().getClientServicePort();
	soapinterface.Client c;
	HttpSession sess;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession();
		if(sess.getAttribute("connected") != null && (boolean)sess.getAttribute("connected")) {
			String usr = (String) sess.getAttribute("username");
			c = stub.getAccount(usr);
			request.setAttribute("client", c);
			this.getServletContext().getRequestDispatcher("/WEB-INF/account.jsp").forward(request, response);
			sess.setAttribute("noFill", null);
			sess.setAttribute("nomSuccess", null);
			sess.setAttribute("prenomSuccess", null);
			sess.setAttribute("mdpSuccess", null);
			sess.setAttribute("mdpMatchError", null);
			sess.setAttribute("emailSuccess", null);
			sess.setAttribute("emailMatchError", null);
		}
		else {
			sess.setAttribute("redirectSource", "account");
			response.sendRedirect("signin");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sess = request.getSession();
		String currentUsr = (String) sess.getAttribute("username");
		String email = request.getParameter("email");
		String emailConf = request.getParameter("emailConf");
		String clearMdp = request.getParameter("mdp");
		String clearMdpConf = request.getParameter("mdpConf");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		if(email.equals("") && clearMdp.equals("") && nom.equals("") && prenom.equals("")) {
			sess.setAttribute("noFill", true);
		} else {
			
			if(nom.length()>0) {
				sess.setAttribute("nomSuccess", stub.modifierNom(currentUsr,nom));
			}
			
			if(prenom.length()>0) {
				sess.setAttribute("prenomSuccess", stub.modifierPrenom(currentUsr,prenom));
			}
	
			if(clearMdp.length()>0) {
				
				if(clearMdp.equals(clearMdpConf)) {
					try {
						String hashedMdp = password.toHexString(password.getSHA(clearMdp));
						sess.setAttribute("mdpSuccess", stub.modifierMdp(currentUsr,hashedMdp));
					} catch (NoSuchAlgorithmException e) {
						e.printStackTrace();
						sess.setAttribute("mdpSuccess", false);
					}
				} else sess.setAttribute("mdpMatchError", true);
			}
			if(email.length()>0) {
				
				if(email.equals(emailConf)) {
					sess.setAttribute("emailSuccess", stub.modifierEmail(currentUsr,email));
				} else sess.setAttribute("emailMatchError", true);
			}
			
		}
		
		response.sendRedirect("myaccount");
			
			
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) request;
		util.attributes.verifyBasket(r.getSession());		
	}
		
		
}


