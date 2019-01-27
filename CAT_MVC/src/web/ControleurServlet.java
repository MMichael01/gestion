package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CatalogueMetierImpl;
import metier.IcatalogueMetier;
import metier.Produit;

/**
 * Servlet implementation class ControleurServlet
 */

public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IcatalogueMetier metier;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		metier =new CatalogueMetierImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("VueProduit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProduitModel model= new ProduitModel();
		model.setMotCle(request.getParameter("motCle"));
		List<Produit> produits=metier.produitParMC(model.getMotCle());
		model.setProduits(produits);
		request.setAttribute("model", model);
		request.getRequestDispatcher("VueProduit.jsp").forward(request, response);
		
		
	}

}
