<%@page import="ex3.Ex2_Map"%>
<%@page import="java.util.Map"%>

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
		//������ 3.0���� �����ϴ� ���׸����� ����ȭ �� ������ �����̳�
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex3/ex2_map.xml");

		Ex2_Map st = ctx.getBean("myMap", Ex2_Map.class);

		Map<String, Integer> m = st.getMaps();

		for (Map.Entry e : m.entrySet()) {
	%>
	<%=e.getKey()%>
	<%=e.getValue()%><br />
	<%
		}
	%>







</body>
</html>