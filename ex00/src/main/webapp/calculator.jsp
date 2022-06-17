<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script type="text/javascript">
		var f_num = document.getElementByName("fist_num");
		var s_num = document.getElementByName("second_num");
	function cal() {
		
		if(f_num.equals("")){
			alert("공백입니다 숫자를 넣어주세요.");
			return false;
		} else {
			alert(f_num + s_num);
			return true;
		}
	}
</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>계산기</h1>
<form action="calc" method="post">
	<input type="text" name="first_num" placeholder="첫번쨰 수 입력">&nbsp; + 
	<input type="text" name="second_num" placeholder="두번째 수 입력">&nbsp;
	<!--  <input type="submit" value="계산">-->
	<input type="submit" onclick="return cal()" value="계산22">
</form>
</body>
</html>