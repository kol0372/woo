<%@page import="dao.JoinDao"%>
<%@page import="vo.ImgDirVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!--data-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//Dao로 부터 데이터를 받아오기 위한 메서드를 호출
ArrayList<ImgDirVo> list = JoinDao.getDao().getList();
for(ImgDirVo e : list){
%>
	<p>
	<img src = "<%=application.getContextPath()%>/upload/<%=e.getImgpath()%>">
	</p>
	<%} %>
<a href="ex3_uploadForm.jsp">업로드폼</a>
</body>
</html>