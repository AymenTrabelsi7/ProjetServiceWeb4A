package controllers;

import java.io.IOException;
import java.util.ArrayList;
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

import EJBs.LigneCommande;
import EJBs.Product;
import EJBs.Shipping;
import basket.BasketProduct;
import soapinterface.Commande;
import soapinterface.CommandesService;
import soapinterface.CommandesServiceService;
import soapinterface.ProductService;
import soapinterface.ProductServiceService;
import soapinterface.ShippingService;
import soapinterface.ShippingServiceService;

/**
 * Servlet implementation class Order
 */
@WebServlet("/shipping")
public class Shipping extends HttpServlet implements Filter  {
	private static final long serialVersionUID = 1L;
    HttpSession sess;
    List<soapinterface.Shipping> shippings;
	CommandesService commande_stub = new CommandesServiceService().getCommandesServicePort();
	ShippingService shipping_stub = new ShippingServiceService().getShippingServicePort();
	ProductService product_access = new ProductServiceService().getProductServicePort();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Shipping() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sess = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<BasketProduct> userBasket = (ArrayList<BasketProduct>) sess.getAttribute("userBasket");
		if(userBasket != null && userBasket.size() > 0) {	
			shippings = shipping_stub.getShippings();
			sess.setAttribute("shippings", shippings);
			if(request.getParameter("choice") != null) {
				int choice = Integer.parseInt(request.getParameter("choice"));
				soapinterface.Commande commande = new Commande();
				
				
				boolean containChoice = false;
				for (soapinterface.Shipping s : shippings) {
					if(s.getIdShipping() == choice) containChoice = true;
				}
				
				if(containChoice) {
					List<soapinterface.LigneCommande> lignes;
					for (BasketProduct pb : userBasket) {					
						soapinterface.LigneCommande l = new soapinterface.LigneCommande();
						l.setIdCommande(commande.getId());
						l.setIdProduit(pb.getId());
						l.setQte(pb.getQuantite());
						soapinterface.Product p = product_access.getProduit(pb.getId());
						l.setNom(p.getNom());
						l.setPrixUnitaire(p.getPrix());
						l.setSousTot(l.getPrixUnitaire()*l.getQte());
						lignes = commande.getProduits() != null ? commande.getProduits() : new ArrayList<soapinterface.LigneCommande>(0);
						lignes.add(l);
					}
					
					commande.setProduits((ArrayList<soapinterface.LigneCommande>)lignes);
					commande.setTotalHt(commande.getTotalHt()+l.getSousTot());
					commande.setStatut("En cours");
					
					
					//commande = commande_stub.applyShipping(commande,choice);
					
					soapinterface.Shipping s = shipping_stub.getShipping(choice);
					commande.setChoixLivraison(s.getNomComplet());
					commande.setFraisLivraison(s.getPrix());
					commande.setTotalTtc(commande.getTotalHt()+s.getPrix());
					
					sess.setAttribute("commande", commande);
					response.sendRedirect("payment");
				}
				else {
					this.getServletContext().getRequestDispatcher("/WEB-INF/shipping_alt.jsp").forward(request, response);
				}
			}
			else {
				this.getServletContext().getRequestDispatcher("/WEB-INF/shipping_alt.jsp").forward(request, response);
			}
		}
		else response.sendRedirect("index");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest r = (HttpServletRequest) request;
		util.attributes.verifyBasket(r.getSession());		
	}


}
