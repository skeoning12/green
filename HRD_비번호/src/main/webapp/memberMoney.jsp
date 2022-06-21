<%@page import="java.util.ArrayList"%>
<%@page import="vo.MoneyVO"%>
<%@page import="vo.MemberVO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.DBcon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String sql ="select m1.custno, m1.custname, m1.grade, sum(m2.price) price "+
			"from member_tbl_02 m1, money_tbl_02 m2 "+
			"where m1.custno = m2.custno "+
			"group by m1.custno, m1.custname, m1.grade "+
			"order by sum(m2.price) desc";



ArrayList<MoneyVO> list = new ArrayList<>();
ArrayList<MemberVO> list2 = new ArrayList<>();
Connection conn = DBcon.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header {
	text-align: center;
	font-size: 1.5rem;
	height: 70px;
	width: 100%;
	line-height: 70px;
	color: white;
	background-color: #2157FA;
	top: 0;
	left: 0;
}

nav {
	height: 30px;
	width: 100%;
	margin-top: 0px;
	background-color: #367CFA;
}

#menu ul li {
	list-style: none;
	color: white;
	float: left;
	line-height: 30px;
	vertical-align: middle;
	text-align: center;
}

#menu .link {
	text-decoration: none;
	color: white;
	display: block;
	width: 200px;
	font-size: 15px;
}

#h2 {
	text-align: center;
}

body {
	background: #8CD4FA;
}

footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	background-color: #2157FA;
}

footer p {
	vertical-align: middle;
	text-align: center;
}

table {
	border: 1px solid black;
	margin-left: auto;
	margin-right: auto;
}

th, td {
	border: 1px solid black;
}
</style>
<script>
	
</script>
</head>
<header>
	<p>쇼핑몰 화면 관리 ver 1.0</p>
	<br>
</header>
<nav id="menu">
	<ul>
		<li><a href="memberSign.jsp" class="link">회원등록</a></li>
		<li><a href="memberList.jsp" class="link">회원목록조회/수정</a></li>
		<li><a href="memberMoney.jsp" class="link">회원매출조회</a></li>
		<li><a href="index.jsp" class="link">홈으로</a></li>
	</ul>
</nav>
<body>
	<div id="h2">
		<h2>회원매출조회</h2>
		<form action="#" method="post">
			<table class="table">
				<tr>
					<th width="20%">회원번호</th>
					<th width="20%">회원성명</th>
					<th width="20%">고객등급</th>
					<th width="20%">매출</th>
				</tr>
				<%
					while(rs.next()){
						String grade = null;
						if(rs.getString(3).equals("A")){
							grade = "VIP";
						} else if (rs.getString(3).equals("B")){
							grade = "일반";
						} else if (rs.getString(3).equals("C")){
							grade = "직원";
						}
				%>
				<tr>
					<td><%=rs.getInt(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=grade %></td>
					<td><%=rs.getInt(4) %></td>
				</tr>
				<%
					}
				%>
			</table>
		</form>
	</div>
</body>
<footer>
	<p>HRDKOREA Copyright©2016 All rights reserved. Human Resources
		Delvelopment Service of Korea
	<p>
</footer>
</html>