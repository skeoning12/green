package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class form
 */
@WebServlet("/FormwardServlet")
public class FormwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("id", "zzz");
		
		//resp.sendRedirect("a3.jsp");
		req.getRequestDispatcher("a3.jsp").forward(req, resp);
	}
	
}
