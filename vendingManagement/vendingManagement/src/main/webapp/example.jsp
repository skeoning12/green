<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkForm() {
		var frm = document.loginForm;
		
		if (!isNaN(document.frm.name.value.substr(0, 1))) {
			alert("이름은 숫자로 시작할 수 없습니다.");
			document.frm.name.select();
		}
		
		for (var i = 0; i < frm.id.value.length; i++) {
			var ch = frm.value.charAt(i);
		
			if((ch<'a'||ch>'z') && (ch>'A'|| ch<'Z') && (ch>'0'|| ch<'9')){
				alert("아이디는 영문 소문자만 입력 가능합니다.");
				frm.id.select();
				return;
			}
		}
		if (isNan(frm.pw.value)){
			alert("비밀번호는 숫자만 입력 가능합니다.");
			frm.pw.select();
			return;
		}
		
		frm.submit();
	}		
</script>
</head>
<body>
	<form name="loginForm" method="post">
		아이디<input type="text" name="id"> <br>
		비번<input type="password" name="pw"> <br>
		이름<input type="text" name="name"> <br>
		<input type="button" value="로그인" onclick="checkForm()">
	</form>
</body>
</html>