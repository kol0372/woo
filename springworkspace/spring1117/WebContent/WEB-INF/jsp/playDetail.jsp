<%@page import="db.Service"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="db.PlayMeDao"%>
<%@page import="db.PlayMeVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		int num = Integer.parseInt(request.getParameter("num"));

		ApplicationContext ctx = new GenericXmlApplicationContext(
				"db/db.xml");

		Service se = ctx.getBean("jdbcDao", Service.class);
		PlayMeVO e = se.getView(num);
	%>
	<table style="background-color:teal; border: 1px;">
		<tr>
			<td><%=e.getNum()%></td>
			<td><%=e.getUsers()%></td>
			<td><a href="PlayList.jsp">list</a></td>
		</tr>
	</table>

</body>
</html>