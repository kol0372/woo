<%@page import="dao.JoinDao"%>
<%@page import="vo.ImgDriVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!-- 2014. 11. 3. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//Dao�� ���� �����͸� �޾ƿ��� ���� �޼��带 ȣ��
			ArrayList<ImgDriVO> list = JoinDao.getDao().getList();
			for(ImgDriVO e : list){
	%>
	<p>
		<img src=
		"<%=application.getContextPath()%>/upload/<%=e.getImgpath()%>">
	</p>
	<% } %>
	<a href="ex3_uploadForm.jsp"> ���ε��� </a>
</body>
</html>






