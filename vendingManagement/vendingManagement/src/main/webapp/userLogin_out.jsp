<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%String id = (String)session.getAttribute("id"); %>
<html>
<head>
<meta charset="UTF-8">
<title>자판기 프로그램</title>
<link rel="stylesheet" href="css/userView.css">
<script src="js/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		$("#logout").click(function() {
			$.ajax({
				url:"LogOutServlet",
				type: "post",
				data: {id: "aaa"},
				dataType:"text",
				success: function() {
					alert("로그아웃하였습니다.");
					location.href="userVendingMain.jsp";
				},
				error: function() {
					alert("실패");
				}
			});
		});
	});
</script>

</head>
<body>
<nav id="menu">
	<ul>
		<li><a href="userVendingMain.jsp" class="link">메인</a></li>
		<li><a href="NoticePage.do?page=1" class="link">게시판</a></li>
	</ul>
	<%if(id==null){ %>
		<div id="idZone">
			<span>로그인 하여 주십시요.</span>&nbsp;<br>
			<button id="login" class="w-btn w-btn-green" onclick="location.href='loginForm.jsp'">로그인</button>
			<button id="signUp" class="w-btn w-btn-green" onclick="location.href='signUpForm.jsp'">회원가입</button>
		</div>
		<%} else {%>
		<div id="idZone">
			<span><%=id %> 님</span>&nbsp;<button id="logout" class="w-btn w-btn-green">로그아웃</button>
		</div>
		<%} %>
</nav>
</body>
</html>