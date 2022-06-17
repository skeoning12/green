<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="HelloServlet" method="get">
	성별 : <input type="radio" value="남자" name="sex"> 남자
	 <input type="radio" value="여자" name="sex"> 여자 <br><br>
	직업 : <select name="job">
				<option value="" selected>선택하세요</option>
				<option value="회사원">회사원</option>
				<option value="알바">알바</option>
				<option value="백수">백수</option>
		  </select>&nbsp;&nbsp;&nbsp;
	관심분야 : <select size="width:140px" multiple="multiple" name="hobby">
				<option value="IT">IT</option>
				<option value="여행">여행</option>
				<option value="스포츠">스포츠</option>
				<option value="공연">공연</option>
			</select><br>
	 메일정보 수신여부 : <input type="radio" value="수신" name="mail"> 수신
	 <input type="radio" value="거부" name="mail"> 거부 <br><br>
	 간단한 가입인사를 적어주세요.<br><br>
	 <textarea rows="10" cols="40" name="textarea"></textarea><br>
	 <input type="submit" value="전송"> 
</form>
</body>
</html>