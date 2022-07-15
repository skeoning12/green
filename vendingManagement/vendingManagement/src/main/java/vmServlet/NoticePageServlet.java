package vmServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoticeDAO;
import vo.MemberNotcieVO;

/**
 * Servlet implementation class NoticePageServlet
 */
@WebServlet("/NoticePage.do")
public class NoticePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		NoticeDAO dao = new NoticeDAO();
		ArrayList<MemberNotcieVO> noticeList = new ArrayList<MemberNotcieVO>();
		int page = 1;
		int limit = 10;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int startrow = (page-1) * 10 + 1;
		int endrow = startrow + limit - 1;
		
		try {
			int listcount = dao.getListCount();
			noticeList = dao.getNoticePageList(startrow, endrow);
			
			int maxpage = (int)((double)listcount/limit + 0.95);
			int startpage = (((int) ((double)page/10 +0.9)) -1) * 10 +1;
			int endpage = startpage + 10 - 1;
			
			if(endpage > maxpage) {
				endpage = maxpage;
			}
			
			request.setAttribute("page", page);
			request.setAttribute("limit", limit);
			request.setAttribute("startpage", startpage);
			request.setAttribute("endpage", endpage);
			request.setAttribute("maxpage", maxpage);
			request.setAttribute("listcount", listcount);
			request.setAttribute("noticeList", noticeList);
			
			request.getRequestDispatcher("userNotice.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
