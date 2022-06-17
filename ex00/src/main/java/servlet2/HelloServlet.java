package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String sex = request.getParameter("sex");
		String job = request.getParameter("job");
		String[] hobby = request.getParameterValues("hobby");
		String mail = request.getParameter("mail");
		String text = request.getParameter("textarea");
		
		out.print("성별 = " + sex + "<br>");
		out.print("직업 = " + job + "<br>");
		out.print("취미 = ");
		for (int i = 0; i < hobby.length; i++) {
			if(hobby.length-1 == i) {
				out.print(hobby[i] + "<br>");
			} else {
				out.print(hobby[i] + ", ");
			}
		}
		out.print("메일여부 =" + mail + "<br>");
		out.print("가입인사 =" + text);
		
	}
		
		


}
