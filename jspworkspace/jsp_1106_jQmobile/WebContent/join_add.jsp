<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!--data-->
<!DOCTYPE html>
<html>
<head>
<title>TODO supply a title</title>
<meta charset="EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
</head>


<jsp:useBean id="vo" class="vo.BbsVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />

<script>
	$(document).ready(function() {
		<%BoardDao.getDao().bbsAdd(vo);
		//response.sendRedirect("join_add.jsp");%>
		
	});
</script>
<body>


</body>
</html>
