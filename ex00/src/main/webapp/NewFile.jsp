<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!//<%! 정의 및 선언 할때 사용
	String name = "홍길동";

	String f() {
		return "h1";
	}
	%>
	<%
	String hobby="독서";
	%>
	<h1>JSP 테스트</h1>
	<%=f()%>
	<%=name%>
	<%=hobby%>
	<!-- < % = 값을 선언할때 사용 -->
</body>
</html>