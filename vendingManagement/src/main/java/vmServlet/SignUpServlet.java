package vmServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberManagementDAO;
import vo.VendingMemberVO;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		MemberManagementDAO managementDAO = new MemberManagementDAO();
		VendingMemberVO memberVO = new VendingMemberVO();
		
		memberVO.setId(request.getParameter("userId"));
		memberVO.setPw(request.getParameter("userPw"));
		memberVO.setName(request.getParameter("userName"));
		memberVO.setAdress(request.getParameter("adress"));
		memberVO.setTel(request.getParameter("tel"));
		try {
			int result = managementDAO.registMember(memberVO);
			if(result == 1) {
				out.print("<script>");
				out.print("alert('회원가입 성공');");
				out.print("location.href = 'userVendingMain.jsp'");
				out.print("</script>");
			} else {
				out.print("<script>");
				out.print("alert('회원가입 실패');");
				out.print("location.href = 'signUpForm.jsp'");
				out.print("</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
