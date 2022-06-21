package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import vo.MemberVO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/LoginMember")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		MemberVO member = new MemberVO();
		int num = Integer.parseInt(request.getParameter("number"));
		String day = request.getParameter("d_day");
		member.setCustno(num);
		member.setCustname(request.getParameter("name"));
		member.setPhone(request.getParameter("tel"));
		member.setAdress(request.getParameter("adress"));		
		member.setJoindate(dao.changeDay(day));
		member.setGrade(request.getParameter("grade"));
		member.setCity(request.getParameter("code"));
		PrintWriter out = response.getWriter();
		try {
			int result = dao.insertMember(member);
			if (result == 0) {
				out.print("실패");
			} else {
				response.sendRedirect("memberSign.jsp");
				out.print("성공");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}


}
