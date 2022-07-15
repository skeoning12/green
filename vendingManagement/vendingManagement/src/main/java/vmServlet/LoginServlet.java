package vmServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberManagementDAO;
import vo.VendingMemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("username");
		String pw = request.getParameter("password");
		
		VendingMemberVO memberVO = new VendingMemberVO();
		
		memberVO.setId(id);
		memberVO.setPw(pw);
		
		MemberManagementDAO managementDAO = new MemberManagementDAO();
		
		try {
			int result = managementDAO.loginCheck(memberVO);
			if (result == 0) {
				out.print("<script>");
				out.print("alert('로그인 실패');");
				out.print("location.href = 'loginForm.jsp'");
				out.print("</script>");
			} else {
				HttpSession session = request.getSession(); 
				session.setAttribute("id", memberVO.getId());
				session.setAttribute("pw", memberVO.getPw());
				if(session.getAttribute("id").equals("admin")) {
					out.print("<script>");
					out.print("alert('관리자 로그인 성공');");
					out.print("location.href = 'adminVendingMain.jsp'");
					out.print("</script>");
				} else {
				out.print("<script>");
				out.print("alert('로그인 성공');");
				out.print("location.href = 'userVendingMain.jsp'");
				out.print("</script>");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
