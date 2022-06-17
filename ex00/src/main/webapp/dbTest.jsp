<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String sql = "select * from member";

ArrayList<Member> list = new ArrayList<Member>();
String url = "jdbc:oracle:thin:@localhost:1521/xe";
String uid = "green01";
String upw = "1234";
try {
	Class.forName("oracle.jdbc.OracleDriver");
	Connection conn = DriverManager.getConnection(url, uid, upw);
	if (conn != null) {
		out.println("db연결성공");
	} else {
		out.println("db연결실패");
	}
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();

	while (rs.next()) {
		Member m = new Member();
		m.setId(rs.getString(1));
		m.setPw(rs.getString(2));
		m.setName(rs.getString(3));
		m.setTel(rs.getString(4));

		list.add(m);
	}
} catch (Exception e) {
	e.printStackTrace();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 1px solid black;
}
th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<h1>VO test</h1>
	<table>
		<tr class="head">
			<th>id</th>
			<th>pw</th>
			<th>name</th>
			<th>tel</th>
		</tr>
		<%
		for (Member m : list) {

			out.println("<tr class='child'><td>" + m.getId() + "</td><td>" + m.getPw() + "</td><td>" + m.getName() + "</td><td>"
			+ m.getTel() + "</td></tr>");

		}
		%>
	</table>


</body>
</html>