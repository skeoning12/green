<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.DBcon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="vo.MemberVO"%>
<%
int num = Integer.parseInt(request.getParameter("num"));
String sql = "select * from member_tbl_02 where custno = ?";
Connection conn = DBcon.getConnection();
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setInt(1, num);
ResultSet rs = pstmt.executeQuery();
rs.next();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	
</script>
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
<script src="js/jquery.js"></script>
<script>
$(function() {
	$("#del_btn").click(function() {
		var num1 = $("#number").val();
		$.ajax({
			url: "DeleteServlet",
			type: "get",
			data : {num: num1},
			dataType: "text",
			success: function(data) {
				alert(data);
				location.href="memberList.jsp";
			},
			error: function() {
				alert(data);
			}
		});
	});
});
	function check() {
		var num1 = document.getElementById("number").value;
		var name1 = document.getElementById("name").value;
		var tel1 = document.getElementById("tel").value;
		var adress1 = document.getElementById("adress").value;
		var d_day1 = document.getElementById("d_day").value;
		var grade1 = document.getElementById("grade").value;
		var code1 = document.getElementById("code").value;
		if (name1 == "") {
			alert("??????????????? ???????????? ???????????????");
		}
		if (tel1 == "") {
			alert("??????????????? ???????????? ???????????????");
		}
		if (adress1 == "") {
			alert("??????????????? ???????????? ???????????????");
		}
		if (d_day1 == "") {
			alert("??????????????? ???????????? ???????????????");
		}
		if (grade1 == "") {
			alert("??????????????? ???????????? ???????????????");
		}
		if (code1 == "") {
			alert("??????????????? ???????????? ???????????????");
		}
	}

	
</script>
</head>
<header>
	<p>????????? ?????? ?????? ver 1.0</p>
	<br>
</header>
<nav id="menu">
	<ul>
		<li><a href="memberSign.jsp" class="link">????????????</a></li>
		<li><a href="memberList.jsp" class="link">??????????????????/??????</a></li>
		<li><a href="memberMoney.jsp" class="link">??????????????????</a></li>
		<li><a href="index.jsp" class="link">?????????</a></li>
	</ul>
</nav>
<body>
	<div id="h2">
		<h2>????????? ?????? ?????? ??????</h2>
		<form action="UpdateMember" method="post">
			<table class="table">
				<tr>
					<th>????????????</th>
					<td><input type="text" name="number" id="number" value="<%=num %>"></td>
				</tr>
				<tr>
					<th>????????????</th>
					<td><input type="text" name="name" id="name" value="<%=rs.getString(2) %>"></td>
				</tr>
				<tr>
					<th>????????????</th>
					<td><input type="text" name="tel" id="tel" value="<%=rs.getString(3) %>"></td>
				</tr>
				<tr>
					<th>????????????</th>
					<td><input type="text" name="adress" id="adress" value="<%=rs.getString(4) %>"></td>
				</tr>
				<tr>
					<th>????????????</th>
					<td><input type="text" name="d_day" id="d_day" value="<%=rs.getDate(5) %>"></td>
				</tr>
				<tr>
					<th>????????????[A:VIP,B:??????,C:??????]</th>
					<td><input type="text" name="grade" id="grade" value="<%=rs.getString(6) %>"></td>
				</tr>
				<tr>
					<th>????????????</th>
					<td><input type="text" name="code" id="code" value="<%=rs.getString(7) %>"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="??????" onclick="succes()"> 
						<input type="button" value="??????" onclick="check()">
						<input type="button" value="??????" id="del_btn">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
<footer>
	<p>HRDKOREA Copyright??2016 All rights reserved. Human Resources
		Delvelopment Service of Korea
	<p>
</footer>
</html>