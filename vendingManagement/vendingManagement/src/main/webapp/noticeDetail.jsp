<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.DBcon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = Integer.parseInt(request.getParameter("notice_num"));
 	String sql = "select * from member_notice where notice_num = ?";
 	Connection conn = DBcon.getConnection();
 	PreparedStatement pstmt = conn.prepareStatement(sql);
 	pstmt.setInt(1, num);
 	pstmt.executeUpdate();
 	ResultSet rs = pstmt.executeQuery();
 	rs.next();
%>
<!DOCTYPE html>
<html>
<head>
<style>
#btn{
	position: absolute;
	bottom: 50px;
}
textarea{
	resize:none;
}
</style>
<script src="js/jquery.js"></script>
<script type="text/javascript">
	$(function() {
			
		$("#btn-update").click(function() {
			var num = <%=num%>;
			var title = document.getElementById("title").value;
			var contents = $("textarea#contents").val();
			$.ajax({
				url: "WriteUpdate",
				type: "post",
				data:{
					num: num,
					title: title,
					contents: contents
				},
				dataType:"json",
				success: function(data) {
					alert(data.name)
				},
				error: function() {
					alert("실패");
				}
			});	
		});
		
		$("#btn-delete").click(function() {
			var num = <%=num%>;
			$.ajax({
				url:"WriteDelete",
				type:"post",
				data:{num: num},
				dataType:"text",
				success: function() {
					alert("글이 삭제 되었습니다.");
					opener.window.location.reload();
					window.close();
					
				},
				error: function() {
					alert("실패");
				}
			});
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload="window.resizeTo(600, 900)">
	<h3>제목</h3>
	<input type="text" name="title" id="title" value="<%=rs.getString(2)%>" size="75">
	<h3>내용</h3>
	<textarea name="contents" id="contents"style="width:562px; height:600px"><%=rs.getString(3) %></textarea>
	<br>
	<div id="btn">
	<button id="btn-update">글수정</button>&nbsp;<button id="btn-delete">글삭제</button>
	</div>
</body>
</html>