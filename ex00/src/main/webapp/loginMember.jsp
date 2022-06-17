<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.login{
		width: 300px;
		height: 200px;
		background: #09CAE6;
		border : 1px solid black;
		text-align: center;
		line-height: 20px;
		margin: 0px;
		color: white;
	}
	div > p {
		font-size: 2rem;
	}
</style>
</head>
<body>
<div class="login">
<p>로그인</p>
<form action="DBServlet" method="get">
	id : <input type="text" name="id" placeholder="id 입력..." size="15"><br>
	pw : <input type="password" name="pw" placeholder="pw 입력..." size="15"><br><br>
	<input type="submit" value="로그인">
	<a href="login_site.jsp"><input type="button" value="회원가입"></a>
</form>
</div>
</body>
</html>