<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.signup{
		width: 400px;
		height: 600px;
		background: #09CAE6;
		border : 1px solid black;
		text-align: center;
		line-height: 30px;
		padding-top: 10px;
		color: white;
	}

	div > p {
		font-size: 2rem;
	}
	textarea{
		resize:none;
	}
</style>

</head>
<body>
<div class="signup">
<p>회원가입</p>
<form action="" method="post">
	id : <input type="text" name="id" id="id">&nbsp;<br>
	pw : <input type="password" name="pw"> <br>
	pwCheck : <input type="password" name="pwCheck"><br>
	name : <input type="text" name="name"><br>
	tel : <input type="text" name="tel"><br>
	job : <input type="radio" value="백수">백수&nbsp;<input type="radio" value="백수x">백수x <br>
	hobby : <select multiple="multiple" name="hobby">
				<option selected>선택하세요</option>
				<option>JAVA</option>
				<option>CSS</option>
				<option>JSP</option>
				<option>DATABASE</option>
				<option>SCRIPT</option>
			</select><br>
	가입인사 <br><textarea rows="10" cols="30"></textarea><br>
	<input type="submit" value="가입하기">
	<a href="loginMember.jsp"><input type="button" value="돌아가기"></a>
</form>
</div>
</body>
</html>