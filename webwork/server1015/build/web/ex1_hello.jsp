<%-- 
    Document   : ex1_hello
    Created on : 2014. 10. 15, ���� 12:02:26
    Author     : kosta
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%!
//����� Ex1_HEllServlet.class�� ��������̴�.

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>�츮�� ù��° JSP</title>

    </head>
    <body>
        <% //service�޼������ local����
            String s="";
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    s = i + "¦";
                } else {
                    s = i + "Ȧ";
                }
        %>
        <h1><%=s%></h1>
        <% }%>
    </body>
</html>
