<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.DBcon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Connection conn = DBcon.getConnection();
	String sql = "select max(custno)+1 newcustno, sysdate from member_tbl_02";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
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
	function check() {
		var num1 = document.getElementById("number").value;
		var name1 = document.getElementById("name").value;
		var tel1 = document.getElementById("tel").value;
		var adress1 = document.getElementById("adress").value;
		var grade1 = document.getElementById("grade").value;
		var code1 = document.getElementById("code").value;
		if (name1 == "") {
			alert("회원성명이 입력되지 않았습니다");
		}
		if (tel1 == "") {
			alert("회원전화가 입력되지 않았습니다");
		}
		if (adress1 == "") {
			alert("회원주소가 입력되지 않았습니다");
		}
		if (grade1 == "") {
			alert("회원등급이 입력되지 않았습니다");
		}
		if (code1 == "") {
			alert("도시코드가 입력되지 않았습니다");
		}
	}
	
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
		<h2>홈쇼핑 회원 등록</h2>
		<form action="LoginMember" method="post">
			<table class="table">
				<tr>
					<th>회원번호(자동발생)</th>
					<td><input type="text" name="number" id="number" value="<%=rs.getInt(1) %>"></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="name" id="name"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="tel" id="tel"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="adress" id="adress"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="d_day" id="d_day" value="<%=rs.getDate(2) %>"></td>
				</tr>
				<tr>
					<th>고객등급[A:VIP,B:일반,C:직원]</th>
					<td><input type="text" name="grade" id="grade"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="code" id="code"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="등록" onclick="check()"> 
						<a href="memberList.jsp"><input type="button" value="조회" ></a>
					</td>
				</tr>
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