<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
	header{
		text-align: center;
		font-size: 1.5rem;
		height: 70px;
		width: 100%;
		line-height: 70px;
		color:white;
		background-color: #2157FA; 
		top: 0;
		left: 0;
		padding:0;
		margin:0;
	}
	nav{
		height:30px;
		width: 100%;
		margin-top: 0px;
		background-color: #367CFA;
	}
	#menu ul li{
		list-style: none;
		color: white;
		float: left;
		line-height: 30px;
		vertical-align: middle;
		text-align: center;
	}
	#menu .link{
		text-decoration: none;
		color: white;
		display: block;
		width: 200px;
		font-size: 15px;
	}
	#h2{
		text-align: center;
	}
	body{
		background: #8CD4FA;
	}
	footer{
		position: absolute;
		bottom: 0;
		width: 100%;
		background-color: #2157FA; 
	}
	footer p{
		vertical-align: middle;	
		text-align: center;
	}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<header>
쇼핑몰 화면 관리 ver 1.0
</header>
<nav id="menu">
	<ul>
		<li><a href="memberSign.jsp" class="link">회원등록</a></li>
		<li><a href="memberList.jsp" class="link">회원목록조회/수정</a></li>
		<li><a href="memberMoney.jsp" class="link">회원매출조회</a></li>
		<li><a href="index.jsp" class="link">홈으로</a></li>
	</ul>
</nav>
<body>
<div>
<h2 id="h2">쇼핑몰회원관리 프로그램</h2>
<p>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.</p>
<p>프로그램 작성 순서</p>
<p>1.회원정보 테이블을 생성한다</p>
<p>2.매출정보 테이블을 생성한다</p>
<p>3.회원정보, 매출정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다</p>
<p>4.회원정보 입력 화면프로그램을 작성한다</p>
<p>5.회원정보, 조회 프로그램을 작성한다</p>
<p>6.회원매출정보 조회 프로그램을 작성한다</p>
</div>
</body>
<footer>
	<p>HRDKOREA Copyright©2016 All rights reserved. Human Resources Delvelopment Service of Korea<p>
</footer>
</html>