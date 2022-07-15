package vmServlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		notice.setNotice_title(title);
		notice.setNotice_contents(contents);
		notice.setNotice_writer(writer);
		
		NoticeDAO ndao = new NoticeDAO();
		PrintWriter out = response.getWriter();
		try {
			int result = ndao.registNotice(notice);
			if(result == 1) {
				String str="";
				str = "<script>";
				str += "opener.window.location.reload();";
				str += "self.close()";
				str += "</script>";
				out.print(str);
			}
		} catch (Exception e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
