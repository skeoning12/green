package vmServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NoticeDAO;
import vo.MemberNotcieVO;

/**
 * Servlet implementation class WriteServlet
 */
@WebServlet("/WriteServlet")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String writer = (String) session.getAttribute("id");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		MemberNotcieVO notice = new MemberNotcieVO();
		notice.setTitle(title);
		notice.setContents(contents);
		notice.setWriter(writer);
		
		NoticeDAO ndao = new NoticeDAO();
		
		try {
			int result = ndao.registNotice(notice);
			if(result == 1) {
				response.sendRedirect("userNotice.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
