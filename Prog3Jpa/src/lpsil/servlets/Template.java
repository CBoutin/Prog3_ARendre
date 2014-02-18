package lpsil.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Template extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		process(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		
		String thePage = (String) request.getPathInfo();

		if (thePage != null) {
			thePage = thePage.substring(1);
		}

		// Si la page demandée est nulle (url de type /.../Template/) ou qu'on
		// demande un acces a une page protegee par mot de passe 
		//(url de type/.../Template/secured/*) sans etre identifié
		// (=posseder une session avec un attribut "name"), on est redirigé vers
		// la page de login.

		if (thePage == null) {
			thePage = "unsecured/Login.jsp";
		}

		pageBuilding(thePage, request, response);
		
	}

	private void pageBuilding(String askedPage, HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

		//PrintWriter out = response.getWriter();

		getServletContext().getRequestDispatcher("/part/Header.jsp").include(
				request, response);

		getServletContext().getRequestDispatcher("/" + askedPage).include(
				request, response);

		getServletContext().getRequestDispatcher("/part/Footer.html").include(
				request, response);
	}

}
