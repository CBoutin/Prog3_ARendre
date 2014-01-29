package lpsil.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Utilisateur;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
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
//		// TODO Auto-generated method stub
//		Utilisateur user = Utilisateur.get(request.getParameter("name"));
//
//		if (user.getMot_de_passe().compareTo(request.getParameter("pwd"))) {
//			HttpSession session = request.getSession();
//			session.setAttribute("name") = request.getParameter("name");
//			request.setAttribute("connexion_status", 0);
//		} else {
//			request.setAttribute("connexion_status", 1);
//		}
//
//		getServletContext().getNamedDispatcher(
//				getServletContext().getContextPath() + "/Action").forward(
//				request, response);
//		;
	}

}
