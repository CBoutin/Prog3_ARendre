package lpsil.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JPA.serviceAddUser;
import JPA.bean.Utilisateur;

/**
 * Servlet implementation class Login
 */
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @throws IOException
	 * @throws ServletException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	/**
	 * @throws IOException
	 * @throws ServletException
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		serviceAddUser add = new serviceAddUser();

		String id = request.getParameter("id");
		String mdp = request.getParameter("pswd");
		String mdp2 = request.getParameter("pswd2");
		String nom = request.getParameter("surname");
		String prenom = request.getParameter("name");
		String cp = request.getParameter("cp");
		String adresse = request.getParameter("city");
		String pays = request.getParameter("country");

		if (id != "" && mdp != "" && mdp2 != "" && nom != "" && prenom != ""
				&& mdp.equals(mdp2)) {
			
			int codeP=0;
			if(cp!="")
			codeP = Integer.parseInt(cp);
			
			Utilisateur use = new Utilisateur(id, mdp, nom, prenom, adresse,
					codeP, pays);
			add.EnregistrerUtilisateur(use);

			getServletContext().getRequestDispatcher(
					"/Template/unsecured/Login.jsp").forward(request, response);

		} else {

			getServletContext().getRequestDispatcher(
					"/Template/unsecured/Creation_de_compte.jsp").forward(
					request, response);
		}

	}
}