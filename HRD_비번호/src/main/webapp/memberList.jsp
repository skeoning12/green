<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.DBcon"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList" %>
<%@page import="vo.MemberVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String sql = "select * from member_tbl_02 order by custno desc";
	Connection conn = DBcon.getConnection();
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	ArrayList<MemberVO> list = new ArrayList<>();
	while(rs.next()){
		MemberVO m = new MemberVO();
		
		m.setCustno(rs.getInt(1));
		m.setCustname(rs.getString(2));
		m.setPhone(rs.getString(3));
		m.setAdress(rs.getString(4));
		m.setJoindate(rs.getDate(5));
		String grade = rs.getString(6);
		if(grade.equals("A")){
			grade = "VIP";
		} else if (grade.equals("B")){
			grade = "일반";
		} else if(grade.equals("C")){
			grade = "직원";
		}
		m.setGrade(grade);
		m.setCity(rs.getString(7));
		list.add(m);
	}
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
table{
	border: 1px solid black;
	margin-left: auto;
	margin-right: auto;
}
th, td{
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
		<h2>회원목록조회/수정</h2>
		<form action="#" method="post">
			<table class="table">
				<tr>
				<th width="10%">회원번호</th>
				<th width="10%">회원성명</th>
				<th width="15%">전화번호</th>
				<th width="35%">주소</th>
				<th width="10%">가입일자</th>
				<th width="10%">고객등급</th>
				<th width="10%">거주지역</th>
				</tr>
				<%
					for(MemberVO member : list){
				%>
				<tr>
				<td><a href="memberUpdate.jsp?num=<%=member.getCustno() %>"><%=member.getCustno() %></a></td>
				<td><%=member.getCustname() %></td>
				<td><%=member.getPhone() %></td>
				<td><%=member.getAdress() %></td>
				<td><%=member.getJoindate() %></td>
				<td><%=member.getGrade() %></td>
				<td><%=member.getCity() %></td>
				</tr>
				<%} %>
			</table>
		</form>
	</div>
</body>
<footer>
	<p>HRDKOREA Copyright©2016 All rights reserved. Human Resources Delvelopment Service of Korea
	<p>
</footer>
</html>