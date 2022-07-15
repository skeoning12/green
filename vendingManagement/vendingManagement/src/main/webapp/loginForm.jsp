<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자판기 프로그램</title>
<link rel="stylesheet" href="css/loginInput.css">
<script src="js/jquery.js"></script>
<script type="text/javascript">
	var submitAction = function(e) {
		e.preventDefault();
		e.stopPropagation();
	};
	$('form').bind('submit', submitAction);
	function insertCheck() {
		var form = document.loginForm;
		if (form.id.value == "") {
			alert("아이디 미 입력");
			form.id.focus();
			return false;
		}
		if (form.password.value == "") {
			alert("비밀번호 미 입력");
			form.password.focus();
			return false;
		}
		if(form.id.value.length < 4 || form.id.value.length > 12){
			alert("아이디는 4~12자 이내로 입력 가능");
			form.id.select();
			return;
		}
		if(form.password.value.length < 4 || form.password.value.length > 12){
			alert("아이디는 4~12자 이내로 입력 가능");
			form.password.select();
			return;
		}
		
		form.submit();
	}
	
	
</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<section>
		<header>
			<h2>Login</h2>
		</header>
		<form action="LoginServlet" method="POST" name="loginForm">
			<div class="input-box">
				<input id="username" type="text" name="username" placeholder="아이디">
				<label for="username">아이디</label>
			</div>
			<div class="input-box">
				<input id="password" type="password" name="password"
					placeholder="비밀번호"> <label for="password">비밀번호</label>
			</div>
			<input type="submit" value="로그인" onclick="insertCheck()"> 
			<input type="button" value="회원가입" onclick="location.href='signUpForm.jsp'">
		</form>
	</section>
</body>
</html>