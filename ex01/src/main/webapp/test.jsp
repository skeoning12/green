<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery.js"></script>
<script>
	$(function() {
		$("#btn_idCheck").click(function() {
			var id1 = $("#txt_id").val();
			$.ajax({
				url: "idCheck",	
				type: "get",
				data: {id: id1},
				dataType: "text",
				success: function(data) {
					$("#result").html(data);
					
				},
				error: function() {
					alert("실패~");
				}
			});
		});
	});
</script>
</head>
<body>
	<input type="text" id="txt_id" name="userId">
	<input type="button" value="중복확인" id="btn_idCheck"><br>
	<hr>
	<div id="result"></div>
</body>
</html>