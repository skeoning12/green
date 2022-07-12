<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%String id = (String)session.getAttribute("id"); %>
<html>
<head>
<meta charset="UTF-8">
<title>자판기 프로그램</title>
<link rel="stylesheet" href="css/loginInput.css">
<link rel="stylesheet" href="css/userView.css">
<script src="js/jquery.js"></script>
<script type="text/javascript">
</script>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="userLogin_out.jsp"></jsp:include>
<section>
<h2>메인 화면 입니다.</h2>
</section>
</body>
</html>