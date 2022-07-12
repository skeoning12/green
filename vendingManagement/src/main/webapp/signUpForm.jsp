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
	
	$(function() {
		$("#idOverlap").click(function() {
			var id = document.getElementById("userId").value;
			if(id==""){
				alert("아이디를 먼저 입력해 주세요.");
				return false;
			} else {
				$(this).val("1");
			}
			
			$.ajax({
				url:"IdOverlapServlet",
				type: "post",
				data:{id: id},
				dataType:"text",
				success: function(data) {
					if(data == 0){
						alert("사용 가능한 아이디");
						overlap = 1;
					} else {
						alert("사용 불가능한 아이디");
						document.getElementById("userId").value = "";
						document.getElementById("userId").focus();
					}
				},
				error: function() {
					alert("문제가 생김 ");
				}
			});	
		});
	});
	
	function signUpFormCheck() {
		var id = document.getElementById("userId");
		var pw = document.getElementById("userPw");
		var pwCheck = document.getElementById("userPwCheck");
		var name = document.getElementById("userName");
		var adress = document.getElementById("adress");
		var tel = document.getElementById("tel");
		var idOverlap = document.getElementById("idOverlap");
		if(id.value == ""){
			alert("아이디를 입력해주세요.");
			id.focus();
			$('form').bind('submit', submitAction);
		}
		if(pw.value == ""){
			alert("비밀번호를 입력해주세요.");
			pw.focus();
			$('form').bind('submit', submitAction);
		}
		if(pwCheck.value == ""){
			alert("비밀번호확인을 입력해주세요.");
			pwCheck.focus();
			$('form').bind('submit', submitAction);
		}
		if(pw.value != pwCheck.value){
			alert("비밀번호가 다릅니다.");
			pwCheck.focus();
			$('form').bind('submit', submitAction);
		}
		if(name.value == ""){
			alert("이름을 입력해주세요.");
			name.focus();
			$('form').bind('submit', submitAction);
		}
		if(adress.value == ""){
			alert("주소를 입력해주세요.");
			adress.focus();
			$('form').bind('submit', submitAction);
		}
		if(tel.value == ""){
			alert("전화번호를 입력해주세요.");
			tel.focus();
			$('form').bind('submit', submitAction);
		}
		if(idOverlap.value=="0"){
			alert("아이디 중복확인을 눌러주세요.");
			$('form').bind('submit', submitAction);
		}
		if(id.value != "" && pw.value != "" && pwCheck.value != "" && name.value != "" && adress.value != "" && tel.value != ""){
			$('form').unbind();
		}
	}
	
</script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<section>
	<header>
		<h2>SignUp</h2>
	</header>
	<form action="SignUpServlet" method="POST" name="frm">
		<div class="input-box">
			<input id="userId" type="text" name="userId" placeholder="아이디">
			<label for="userId">아이디</label>
			<button id="idOverlap" type="button" value="0">중복확인</button>
		</div>
		<div class="input-box">
			<input id="userPw" type="password" name="userPw" placeholder="비밀번호">
			<label for="userPw">비밀번호</label>
		</div>
			<div class="input-box">
			<input id="userPwCheck" type="text" name="userPwCheck" placeholder="비밀번호확인">
			<label for="userPwCheck">비밀번호확인</label>
		</div>
		<div class="input-box">
			<input id="userName" type="text" name="userName" placeholder="이름">
			<label for="userName">이름</label>
		</div>
		<div class="input-box">
			<input id="adress" type="text" name="adress" placeholder="주소">
			<label for="adress">주소</label>
		</div>
		<div class="input-box">
			<input id="tel" type="text" name="tel" placeholder="아이디">
			<label for="tel">전화번호</label>
		</div>
		<input type="submit" value="회원가입" onclick="signUpFormCheck()">
	</form>
</section>
</body>
</html>