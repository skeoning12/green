package serlvets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page01Servlet
 */
@WebServlet("/Page01Servlet")
public class Page01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Page01Servlet() {
    	System.out.println("생성자 호출...");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기화 메소드 호출");
	}

	public void destroy() {
		System.out.println("소멸자메소드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get 요청 메소드");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>hello</h1>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post 요청 메소드");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>hello_post</h1>");
	}

}
