<%-- 
    Document   : Ex1_Jquery
    Created on : 2014. 9. 27, ���� 10:48:27
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    request.setCharacterEncoding("euc-kr");
    String name = request.getParameter("name");
    %>
    Hello <%=name%> World!;
    
