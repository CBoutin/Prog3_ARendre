package lpsil.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AuthentificationFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest myRequest = (HttpServletRequest) request;
		HttpSession session = myRequest.getSession();

		if (myRequest.getPathInfo() != null && myRequest.getPathInfo().contains("/secured/") && session.getAttribute("name") == null) {
			myRequest.getServletContext().getRequestDispatcher("/Template")
					.forward(request, response);
		} else {

			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
	}

}
