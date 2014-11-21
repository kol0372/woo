<%@page import="db.Service"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.List"%>
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
	<div id="wrap">
		<%
			ApplicationContext ctx = new GenericXmlApplicationContext(
					"db/db.xml");

			Service se = ctx.getBean("jdbcDao", Service.class);

			List<PlayMeVO> list = se.getlist();
		%>
		<table>
			<%
				for (PlayMeVO e : list) {
			%>
			<tr>

				<td><a href="playDetail.jsp?num=<%=e.getNum()%>"><%=e.getPname()%></a></td>
				<td><%=e.getPrice()%></td>
				<td><%=e.getUsers()%></td>
				<td><%=e.getRdate()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<a href="playform.html">writer</a>
	</div>

</body>
</html>