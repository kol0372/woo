<%@page import="java.util.Properties"%>
<%@page import="ex2.PropertiesType"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
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
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex2/prop.xml");

		PropertiesType st = ctx.getBean("myprop", PropertiesType.class);

		Properties p = st.getProp();
	%>
	<%=p.getProperty("admin_email")%><br />
	

	<p>
		<a href=<%=p.getProperty("jobsite")%>>코스타바로가기</a>
	</p>



</body>
</html>