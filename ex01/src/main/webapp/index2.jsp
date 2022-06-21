<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int price = 1000;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><a href="page01.html">page01</a></p>
<p><a href="page01.html">page02</a></p>
<p><a href="Page01Servlet">Page01Servlet</a></p>
<p><a href="Page01Servlet.jsp?x=aaa">Page01Servlet.jsp</a></p>
<hr>
<h3>Post 요청 폼</h3>
<form action="Page01Servlet" method="post">
	<input type="submit" value="전송">
</form>
<hr>
<h2>Coffee & Coke</h2>
<div>
	<p><strong>MENU</strong></p>
	<p>금액 <%=price %></p>
	<p><a href="Coffee.jsp?x=Coffee&price=<%=price %>">1. COFFEE(500)</a></p>
	<p><a href="Coke.jsp?x=Coke&price=<%=price %>">2. COKE(700)</a></p>
	<p><a href="CoffeeServlet?x=Coffee&price=<%=price %>">1. COFFEE(500) Servlet</a></p>
	<p><a href="CokeServlet?x=Coke&price=<%=price %>">2. COKE(700) Servlet</a></p>
</div>
</body>
</html>