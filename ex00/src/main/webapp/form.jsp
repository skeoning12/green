<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Form Data 전송 연습</h1>
<hr>
<form action="result.do" method="post">
	id : <input type="text" name="user_id">
	pw : <input type="password" name="user_pw">
	name: <input type="text" name="user_name">
	sex : <input type="radio" name="user_sex" value="남자">남자
		  <input type="radio" name="user_sex" value="여자">여자
	<input type="submit" value="전송">
</form>
</body>
</html>