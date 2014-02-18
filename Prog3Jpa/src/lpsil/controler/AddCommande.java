package lpsil.controler;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JPA.JPAUtil;
import JPA.ServiceCommande;
import JPA.bean.Commande;

/**
 * Servlet implementation class AddCommande
 */
@WebServlet("/AddCommande")
public class AddCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCommande() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	/**
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

		try {
			HttpSession session = request.getSession();
			String idUser = (String) session.getAttribute("name");
			Date date = new java.sql.Date(System.currentTimeMillis());

			JPAUtil jpa = new JPAUtil();

			ArrayList<String> ar = (ArrayList<String>) (session
					.getAttribute("commande"));
			if (ar != null) {
				ServiceCommande service = new ServiceCommande();
				for (String code : ar) {
					Commande c = new Commande();
					c.setCodeArticle(code);
					c.setIdUser(idUser);
					c.setDate(date);
					service.EnregistrerCommande(c);
					jpa.executeSQLCommand("UPDATE bddprog3.article SET Stock=Stock-1 WHERE `code`='"+code+"'" );
				}
			}

			getServletContext().getRequestDispatcher("/AnnulerCommande")
					.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
