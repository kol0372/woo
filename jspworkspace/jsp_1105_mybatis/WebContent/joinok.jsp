<%@page import="dao.BbsDao"%>
<%@page import="vo.BbsVO"%>
<%@page import="dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<%
	request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="vo" class="vo.MjoinVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />

<%-- <jsp:setProperty property="id" name="vo" param="id" /> --%>
<%-- <jsp:setProperty property="pwd" name="vo" param="pwd" /> --%>
<%-- <jsp:setProperty property="name" name="vo" param="name" /> --%>
<%-- <jsp:setProperty property="info" name="vo" param="info" /> --%>
<script>
	$(document)
			.ready(
					function() {
<%//dao에 addJoin메서드를 호출할 때 저장된 Vo의 주소를 인자로 전달
			boolean res = BbsDao.getDao().bbsAdd(vo);
if (res){
%>
	//jquery 여기에
	$('#welcomeID').val('<%=vo.getId()%>');
	$('#status').val('ok');
<%
}else{
%>
	//jquery 여기에
						$('#welcomeID').val('none');
						$('#status').val('no');
<%}%>
	$('form').submit();
					});
</script>
<form method="post" action="welcome.jsp">
	<input type="hidden" name="welcomeID" id="welcomeID"> <input
		type="hidden" name="status" id="status">
</form>

