<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.DBcon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String sql = "select * from member_notice";
Connection conn = DBcon.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자판기 프로그램</title>
<link rel="stylesheet" href="css/loginInput.css">
<link rel="stylesheet" href="css/userView.css">
<style>
table {
	width: 50%;
	margin-left: 25%;
	margin-top: 100px;
}

table, th, td {
	border: 1px solid black;
}

th {
	height: 30px;
	line-height: 30px;
}

td {
	height: 20px;
	line-height: 20px;
	text-align: center;
}



</style>
<script type="text/javascript">
	
	function writePopup() {
		window.open("noticeWrite.jsp", "width=600", "height=900", "left=40%", "top=200");
	}

</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="userLogin_out.jsp"></jsp:include>
	<section>
		<table>
			<tr>
				<th width="5%">no.</th>
				<th width="70%">제목</th>
				<th width="10%">작성자</th>
				<th width="15%">작성날짜</th>
			</tr>
			<tr>
				<%
				while (rs.next()) {
				%>
				<td><%=rs.getInt(1)%></td>
				<td>
				<a href="noticeDetail.jsp?num=<%=rs.getInt(1) %>" onclick="window.open(this.href, '_blank', 'width=600, height=900, left=40%, top=200'); return false;">
					<%=rs.getString(2)%></a></td>
				<td><%=rs.getString(4)%></td>
				<td><%=rs.getString(5)%></td>
				<%
				}
				%>
			</tr>
		</table>
		<button type="button" id="modal_btn" onclick="writePopup()">글쓰기</button>
	</section>
</body>
</html>