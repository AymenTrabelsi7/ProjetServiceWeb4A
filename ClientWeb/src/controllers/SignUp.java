package controllers;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import soapinterface.ClientService;
import soapinterface.ClientServiceService;
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signup")
public class SignUp extends HttpServlet {
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
    
    
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException 
    {  
        // Static getInstance method is called with hashing SHA  
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
  
        // digest() method called  
        // to calculate message digest of an input  
        // and return array of byte 
        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
    } 
    
    public static String toHexString(byte[] hash) 
    { 
        // Convert byte array into signum representation  
        BigInteger number = new BigInteger(1, hash);  
  
        // Convert message digest into hex value  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
  
        // Pad with leading zeros 
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
  
        return hexString.toString();  
    } 
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sess = request.getSession();
		this.getServletContext().getRequestDispatcher("/WEB-INF/sign_up.jsp").forward(request, response);
		sess.setAttribute("signUpSuccess", null);
		sess.setAttribute("usernameExist", null);
		sess.setAttribute("matchError", null);
		sess.setAttribute("unfilledError", null);
		
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
						String hashedMdp = toHexString(getSHA(clearMdp));
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

}
