<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String s = "request";
	pageContext.setAttribute("test", "page");
	String param1 = request.getParameter("txt");
	
	request.setAttribute("test", s);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>${test}</div>
	<div>${request.test}</div>
	<div><%=param1 %></div>
	<div>${param.txt}</div>
	<div>${param.txt2}</div>
</body>
</html>