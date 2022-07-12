<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
	
	function writeCheck() {
		var frm = document.writeForm;
		if(frm.title.value == ""){
			alert("제목을 입력해주세요.");
			frm.title.focus();
			return false;
		}
		if(frm.contents.value == ""){
			alert("내용을 입력해주세요.");
			frm.contents.focus();
			return false;
		}
		
		frm.submit();
	}
	
</script>
<title>자판기 프로그램</title>
</head>
<body onload="window.resizeTo(600, 900)">
<form action="WriteServlet" name="writeForm" method="post">
	<h3>제목</h3>
	<input type="text" name="title" id="title" size="75"><br><br>
	<h4>글내용</h4>
	<textarea name="contents" style="width: 562px; height: 600px"></textarea><br>
	<input type="button" value="글작성" onclick="writeCheck()">
</form>
</body>
</html>