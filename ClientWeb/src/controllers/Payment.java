package controllers;

import java.io.IOException;

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
 * Servlet implementation class Payment
 */
@WebServlet("/payment")
public class Payment extends HttpServlet implements Filter  {
	private static final long serialVersionUID = 1L;
	CommandesService commande_stub = new CommandesServiceService().getCommandesServicePort();
    HttpSession sess;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sess = request.getSession();
		soapinterface.Commande commande = (Commande) sess.getAttribute("commande");
		if(commande != null && commande.getTotalTtc() > 0) {
			request.setAttribute("commandeTotal", commande.getTotalTtc());
			this.getServletContext().getRequestDispatcher("/WEB-INF/payment.jsp").forward(request, response);
		} else response.sendRedirect("shipping");
		sess.removeAttribute("cardError");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Character.isDigit('a');
		
		sess = request.getSession();
		soapinterface.Commande commande = (Commande) sess.getAttribute("commande");
		String method = request.getParameter("paymentMethod");
		
		if(method.equals("card")) {			
			String cardnumber = request.getParameter("cardnumber");
			String expiration = request.getParameter("expiration");
			String cvc = request.getParameter("cvc");
			String address = request.getParameter("address");
			
			if(this.verifyCard(cardnumber, expiration, cvc)) {				
				commande.setMoyenPaiement(method);
				commande.setAdresse(address);
				
				commande_stub.validerCommande(commande);
				response.sendRedirect("orderconfirmation");
			} else {
				sess.setAttribute("cardError", true);
				response.sendRedirect("payment");
			}
			
			
		}
		
		else if(method.equals("paypal")) {	
			commande.setMoyenPaiement(method);
			String email = request.getParameter("paypalEmail");
			String pw = request.getParameter("paypalMdp");
		}
	}
	
	
	
	
	private boolean verifyCard(String numero,String date,String cvc) {
		return (verifyNumero(numero) && verifyDate(date) && verifyCVC(cvc));
	}

	private boolean verifyCVC(String cvc) {
		if(cvc.length()==3) {
			for (int i = 0;i<cvc.length();i++) {
				if(!Character.isDigit(cvc.charAt(i))) return false;
			}
			return true;
		}
		return false;
	}

	private boolean verifyDate(String date) {
		String[] dateParsed = date.split("/");
		if(dateParsed.length == dateParsed[0].length() && dateParsed[0].length() == 2 && dateParsed[1].length() == 2) {
			for (int i = 0;i<2;i++) {
				if(!Character.isDigit(dateParsed[0].charAt(i))) return false;
				if(!Character.isDigit(dateParsed[1].charAt(i))) return false;
			}
			return true;
		}
		return false;
	}

	private boolean verifyNumero(String numero) {
		String[] numeroParsed = numero.split(" ");
		String numeroComp;
		if(numero.length()>1) {
			numeroComp = "";
			for (String s : numeroParsed) {
				numeroComp += s;
			}
		} else numeroComp = numeroParsed[0];
		if(numeroComp.length() == 16) {			
			for (int i = 0;i<numeroComp.length();i++) {
				if(!Character.isDigit(numeroComp.charAt(i))) return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) request;
		util.attributes.verifyBasket(r.getSession());		
	}

}
