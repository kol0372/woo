<%@page import="db.Service"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="db.PlayMeVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>


<%
	request.setCharacterEncoding("euc-kr");
PlayMeVO v = new PlayMeVO();
v.setPname(request.getParameter("pname"));
v.setPrice(Integer.parseInt(request.getParameter("price")));
v.setUsers(request.getParameter("users"));
ApplicationContext ctx = new GenericXmlApplicationContext("db/db.xml");

Service se = ctx.getBean("jdbcDao", Service.class);
se.add(v);

response.sendRedirect("PlayList.jsp");
%>
