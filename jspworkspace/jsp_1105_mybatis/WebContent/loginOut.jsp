<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
session.removeAttribute("MEMBERID");
session.removeAttribute("USERNAME");
//session.invalidate(); ->�ѹ��������
response.sendRedirect("ex1_body.jsp");
%>