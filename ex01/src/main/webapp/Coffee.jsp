<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String param = request.getParameter("x");
int p = Integer.parseInt(request.getParameter("price"));
	out.println(param + " 나왔습니다.<br>");
	out.print("거스름돈 = " + (p - 500));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>