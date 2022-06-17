<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String str1 = "jsp";
String str2 = "안녕하세요";
int n = 10;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		처음 만들어보는
		<%=n%></h1>
	<p>
		<%
		out.println(str2 + str1 + "입니다. 열공!!<br>");
		%>
		<%=str2 + str1%>
		입니다. 열공
	</p>

</body>
</html>