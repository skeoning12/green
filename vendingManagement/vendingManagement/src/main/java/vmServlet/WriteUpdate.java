package vmServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.NoticeDAO;
import netscape.javascript.JSObject;
import vo.MemberNotcieVO;

/**
 * Servlet implementation class WriteUpdate
 */
@WebServlet("/WriteUpdate")
public class WriteUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		JSONObject obj = new JSONObject();
		PrintWriter out = response.getWriter();
		
		int num = Integer.parseInt(request.getParameter("num"));
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		MemberNotcieVO nvo = new MemberNotcieVO();
		nvo.setNotice_num(num);
		nvo.setNotice_title(title);
		nvo.setNotice_contents(contents);
		
		NoticeDAO dao = new NoticeDAO();
		try {
			int result = dao.updateNotice(nvo);
			if(result == 1) {
				obj.put("name", "업데이트 성공");
				out.print(obj);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
