<%@page import="java.sql.Connection"%>
<%@page import="conn.ConnUtil"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	Connection con = ConnUtil.getDs();
	System.out.println(con);
	out.write(String.valueOf(con));
%>