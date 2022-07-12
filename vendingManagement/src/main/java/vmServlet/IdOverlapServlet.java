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
 * Servlet implementation class IdOverlapServlet
 */
@WebServlet("/IdOverlapServlet")
public class IdOverlapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		VendingMemberVO memberVO = new VendingMemberVO();
		MemberManagementDAO managementDAO = new MemberManagementDAO();
		memberVO.setId(id);
		
		try {
			int result = managementDAO.idOverlap(memberVO);
			if(result == 1) {
				out.println(result);
			} else {
				out.println(result);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
