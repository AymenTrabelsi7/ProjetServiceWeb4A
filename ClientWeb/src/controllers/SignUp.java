package controllers;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

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

import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signup")
public class SignUp extends HttpServlet implements Filter  {
	private static final long serialVersionUID = 1L;
	ClientService stub = new ClientServiceService().getClientServicePort();
	HttpSession sess;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
     
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sess = request.getSession();
		this.getServletContext().getRequestDispatcher("/WEB-INF/sign_up.jsp").forward(request, response);
		sess.removeAttribute("signUpSuccess");
		sess.removeAttribute("usernameExist");
		sess.removeAttribute("matchError");
		sess.removeAttribute("unfilledError");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sess = request.getSession();
		String usr = request.getParameter("username");
		String email = request.getParameter("email");
		String clearMdp = request.getParameter("mdp");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		if(usr.length() > 0 && email.length() > 0 && clearMdp.length() > 0 && nom.length() > 0 && prenom.length() > 0) {
			
			if(email.equals(request.getParameter("emailConf")) && clearMdp.equals(request.getParameter("mdpConf"))) {
				System.out.println(stub.verifyUsername(usr));
				if(stub.verifyUsername(usr)) {			
					
					soapinterface.Client newCli = new soapinterface.Client();
					newCli.setNom(nom);
					newCli.setPrenom(prenom);
					newCli.setUsername(usr);
					newCli.setEmail(email);
					
					try {
						String hashedMdp = password.toHexString(password.getSHA(clearMdp));
						newCli.setHashedMdp(hashedMdp);
						boolean res = stub.createAccount(newCli);
						sess.setAttribute("signUpSuccess", res);
						if (res) response.sendRedirect("signupconfirmation");
						else {
							response.sendRedirect("signup");
						}
					} catch (NoSuchAlgorithmException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						sess.setAttribute("signUpSuccess", false);
						response.sendRedirect("signup");
					}
				} else {
					sess.setAttribute("usernameExist", true);
					response.sendRedirect("signup");
				}
			} else {
				sess.setAttribute("matchError", true);
				response.sendRedirect("signup");
			}
			
		}
		
		else {
			sess.setAttribute("unfilledError", true);
			response.sendRedirect("signup");
		}
		

		

	}






	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) request;
		util.attributes.verifyBasket(r.getSession());		
	}

}
