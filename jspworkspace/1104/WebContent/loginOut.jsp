<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
session.removeAttribute("MEMBERID");
session.removeAttribute("USERNAME");
//session.invalidate(); ->한번에지우기
response.sendRedirect("ex1_body.jsp");
%>