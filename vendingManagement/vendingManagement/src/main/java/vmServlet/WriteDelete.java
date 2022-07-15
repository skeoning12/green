package vmServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticeDAO;
import vo.MemberNotcieVO;

/**
 * Servlet implementation class WriteDelete
 */
@WebServlet("/WriteDelete")
public class WriteDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int num = Integer.parseInt(request.getParameter("num"));
		MemberNotcieVO nvo = new MemberNotcieVO();
		NoticeDAO dao = new NoticeDAO();
		nvo.setNotice_num(num);
		try {
			int result = dao.deleteNotice(nvo);
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
