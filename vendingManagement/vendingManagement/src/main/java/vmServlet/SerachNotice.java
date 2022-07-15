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
 * Servlet implementation class SerachNotice
 */
@WebServlet("/SerachNotice.do")
public class SerachNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String search_notice = request.getParameter("search-notice");
		String input = request.getParameter("input");
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
			if(search_notice.equals("search-title")) {
				int listcount = dao.searchTitleCount(input);
				noticeList = dao.searchTitle(input, startrow, endrow);

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
				//response.sendRedirect("userNotice.jsp");
				request.getRequestDispatcher("userNotice.jsp").forward(request, response);
				
			} else if (search_notice.equals("search-writer")) {
				int listcount = dao.searchWriterCount(input);
				noticeList = dao.searchWriter(input, startrow, endrow);

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
				
				//response.sendRedirect("userNotice.jsp");
				request.getRequestDispatcher("userNotice.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
