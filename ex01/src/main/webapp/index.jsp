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
		$("#run1").click(function() {
			$.ajax({
				url: "AjaxReceiver",
				type: "get",
				dataType: "text",
				success: function(data) {
					//$("#result").html(data);	
					var obj = JSON.parse(data);
					$("#result").html(obj.name);
				},
				error: function() {
					alert("실패~");
				}
			});
		});
		
		$("#run2").click(function() {
			$.ajax({
				url: "AjaxReceiver",
				type: "post",
				dataType: "json",
				success: function(data) {
					$("#result").html(data.age + data.name);
				},
				error: function() {
					alert("실패~");
				}
			});
		});
		
		$("#run3").click(function() {
			$.ajax({
				url: "AjaxReceiver2", //servlet주소
				type: "get", //보내는 방식
				data: {id: "admin"}, //보내는 데이터
				dataType: "text", 
				success: function(data) { //성공했을때
					$("#result").html(data);
				},
				error: function() { //실패했을때
					alert("실패~");
				}
			});
		});
		
	});
</script>
</head>
<body>
<button id="run1">실행(get)</button><br>
<button id="run2">실행(post)</button><br>
<button id="run3">실행(get)</button>
<hr>
<div id="result">here...</div>
</body>
</html>