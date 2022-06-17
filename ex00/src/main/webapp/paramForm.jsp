<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Get 방식 전송 연습</h1>
<hr>
<form action="paramex" method="get">
	<input type="text" name="id" placeholder="id를 입력하세요"><br>
	<input type="text" name="name" placeholder="이름을 입력하세요"><br>
 	<input type="checkbox" name="subjects" value="JAVA">자바
 	<input type="checkbox" name="subjects" value="JSP">JSP
 	<input type="checkbox" name="subjects" value="SQL">SQL
 	<input type="submit" value="send">
</form>
<hr>
<h1>Post 방식 전송 연습</h1>
<hr>
<form action="paramex" method="post">
	<input type="text" name="id" placeholder="id를 입력하세요"><br>
	<input type="text" name="name" placeholder="이름을 입력하세요"><br>
 	<input type="submit" value="send">
</form>
</body>
</html>