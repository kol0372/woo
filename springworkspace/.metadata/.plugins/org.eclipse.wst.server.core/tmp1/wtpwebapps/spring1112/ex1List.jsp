<%@page import="ex1.MemverVO"%>
<%@page import="java.util.List"%>
<%@page import="ex1.ListString"%>
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
				"ex1/list.xml");

		ListString ls = ctx.getBean("list_v", ListString.class);
		List<String> list = ls.getName();
		List<Integer> list2 = ls.getNum();
		List<MemverVO> list3 = ls.getMlist();
		
		for(String e : list){
			out.println(e+"<br />");
		}
		
		out.println("<hr>");
		
		for(Integer e : list2){
			out.println(e+"<br />");
		}
		
		out.println("<hr>");
		
		for(MemverVO e : list3){
			out.println(e.getName()+"/" + e.getId()+"<br />");
		}
	%>

</body>
</html>