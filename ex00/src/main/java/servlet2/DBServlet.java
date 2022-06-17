package servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.LoginMember;

/**
 * Servlet implementation class DBServlet
 */
@WebServlet("/DBServlet")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private final String uid = "green01";
	private final String upw = "1234";

	public Connection getDBConn() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(url, uid, upw);
		return conn;
	}
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		
		
		String sql = "select * from login_member";
		ArrayList<LoginMember> memberList = new ArrayList<>();
		
		try {
			Connection conn = getDBConn();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				LoginMember member = new LoginMember();
				
			member.setId(rs.getString(1));
			member.setPw(rs.getString(2));
			
			memberList.add(member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < memberList.size(); i++) {
			if(id.equals(memberList.get(i).getId()) && pw.equals(memberList.get(i).getPw())){
				out.print("로그인 성공");
			} else {
				out.print("실패");
			}
		} 
		
		
	}

}
