package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class form
 */
@WebServlet("/result.do")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8"); // 사용전에 먼저 set
		
		
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		String userName = request.getParameter("user_name");
		String[] userSex = request.getParameterValues("user_sex");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>" + userName + "님 반갑습니다. <h1>");
		out.println("<h1>gg<h1>");
		out.println("<h1>" + userId + "<h1>");
		out.println("<h1>" + userPw + "<h1>");
		out.println("<h1>" + userSex + "<h1>");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String userId = req.getParameter("user_id");
		String userPw = req.getParameter("user_pw");
		String userName = req.getParameter("user_name");
		String[] userSex = req.getParameterValues("user_sex");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<h1>" + userName + "님 반갑습니다. <h1>");
		out.println("<h1>" + userId + "<h1>");
		out.println("<h1>" + userPw + "<h1>");
		for (int i = 0; i < userSex.length; i++) {
			out.println("<h1>" + userSex[i] + "<h1>");
		}
			
		
	}
	
}
