package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PramServlet
 */
@WebServlet("/paramex")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String[] subject = request.getParameterValues("subjects");
		PrintWriter out = response.getWriter();
		out.print(id);

		out.print("님의 이름은");
		out.print("<br>");
		out.print(name);
		out.print("이고, <br>");
		out.print("좋아하는 과목은");
		for (int i = 0; i < subject.length; i++) {
			if (subject.length - 1 == i) {
				out.print(subject[i] + "이다.");
			} else {
				out.print(subject[i] + ", ");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		String f = request.getParameter("first_num");
		PrintWriter out = response.getWriter();
		if (f.equals("")) {
			out.print("계산불가!");
		} else {
			
			int f_num = Integer.parseInt(request.getParameter("first_num"));
			int s_num = Integer.parseInt(request.getParameter("second_num"));
			out.print("정답은 <br>");
			out.print(f_num + s_num);
		}
	}

}
