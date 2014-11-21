<%@page import="vo.PlaymeVO"%>
<%@page import="ex2.Service"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	PlaymeVO v = new PlaymeVO();
	v.setPname(request.getParameter("pname"));
	v.setPrice(Integer.parseInt(request.getParameter("price")));
	v.setUsers(request.getParameter("users"));
	ApplicationContext ctx = new GenericXmlApplicationContext("ex2/jdbc.xml");
	Service se = ctx.getBean("jdbcDao",Service.class);
	se.add(v);
	response.sendRedirect("playList.jsp");
	
%>