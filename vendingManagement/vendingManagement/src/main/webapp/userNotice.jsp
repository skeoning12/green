<%@page import="vo.MemberNotcieVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

int limit = ((Integer)request.getAttribute("limit")).intValue();
int nowpage = ((Integer)request.getAttribute("page")).intValue();
int startpage = ((Integer)request.getAttribute("startpage")).intValue();
int endpage = ((Integer)request.getAttribute("endpage")).intValue();
int maxpage = ((Integer)request.getAttribute("maxpage")).intValue();
int listcount = ((Integer)request.getAttribute("listcount")).intValue();

ArrayList<MemberNotcieVO> noticeList = (ArrayList<MemberNotcieVO>)request.getAttribute("noticeList");

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자판기 프로그램</title>
<link rel="stylesheet" href="css/userView.css">
<style>

.list{
	margin-top:50px;
	height: 500px;
}

.noticeList {
	width: 50%;
	margin-left: 25%;
	margin-top: 100px;
	border: 1px solid black;
	
}

.noticeList th{
	height: 50px;
	border: 1px solid black;
}
.noticeList td {
	border: 1px solid black;
	height: 30px;
	line-height: 30px;
	text-align: center;
}

a {
	text-decoration: none;
}

a:link, a:visited {
	color: #444;
	text-decoration: none;
}
.pageDiv{
	margin-top: 30px;
	width:50%;
	margin-left: 25%;
}
.page_a{
	display: inline;
	margin-left: 30px;
	font-size: 1rem;
}
.frm-div{
	padding-top:100px;
	margin-left: 25%;
}
#write_btn{
	margin-left: 50%;
}

</style>
<script type="text/javascript">
	
	function writePopup() {
		window.open("noticeWrite.jsp", "width=600", "height=900", "left=40%", "top=200");
	}
	
	
</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="userLogin_out.jsp"></jsp:include>
	<section>	
		<div class="frm-div">
		<form action="SerachNotice.do" method="post" name="frm">
			<select name="search-notice" id="search-notice">
				<option selected>검색</option>
				<option value="search-title">제목</option>
				<option value="search-writer">작성자</option>
			</select>
			<input type="text" name="input" size="70">
			<input type="submit" value="확인">
		</form>
		</div>
		<div class="list">
		<table class="noticeList">
			<tr>
				<th width="5%">no.</th>
				<th width="70%">제목</th>
				<th width="10%">작성자</th>
				<th width="15%">작성날짜</th>
			</tr>
			
				<%
				for(int j=0; j<noticeList.size(); j++){
				%>
			<tr>
				<td><%=noticeList.get(j).getNotice_rnum()%></td>
				<td>
				<a href="noticeDetail.jsp?notice_num=<%=noticeList.get(j).getNotice_num() %>" onclick="window.open(this.href, '_blank', 'width=600, height=900, left=40%, top=200'); return false;">
					<%=noticeList.get(j).getNotice_title()%></a></td>
				<%if(noticeList.get(j).getNotice_writer() == null) {%>
				<td>비회원</td>
				<%}else{ %>
				<td><%=noticeList.get(j).getNotice_writer() %></td>
				<%} %>
				<td><%=noticeList.get(j).getNotice_day()%></td>
			</tr>
				<%
				}
				%>
		</table>
		</div>
		<button type="button" id="write_btn" onclick="writePopup()">글쓰기</button>
		<div class="pageDiv">
		<table class=page>
			<tr align="center" height="10">
				<td>
					<%if(nowpage<=1){ %>
						<div class="page_a"><a>&#60;</a></div>
					<%} else {%>
						<div class="page_a"><a href="NoticePage.do?page=<%=nowpage - 1%>">&#60;</a></div>
					<%} %>
					<%
					for(int i=startpage; i<= endpage; i++) {
						if(i == nowpage){
					%>
					<div class="page_a"><a><%=i %></a></div>
					<%} else {%>
						<div class="page_a"><a href="NoticePage.do?page=<%=i%>"><%=i %></a></div>
					<%} %>	
					<%} %>
					<%if(nowpage <= maxpage) {%>
						<div class="page_a"><a>&#62;</a></div>
				    <%} else {%>
				    	<div class="page_a"><a href="NoticePage.do?page=<%=nowpage + 1%>">&#62;</a></div>
				    <%} %>
				</td>	
		</table>
		</div>
		
	</section>
</body>
</html>