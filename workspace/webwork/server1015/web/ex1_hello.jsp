<%-- 
    Document   : ex1_hello
    Created on : 2014. 10. 15, 오후 12:02:26
    Author     : kosta
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%!
//여기는 Ex1_HEllServlet.class의 멤버영역이다.

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>우리의 첫번째 JSP</title>

    </head>
    <body>
        <% //service메서드안의 local영역
            String s="";
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    s = i + "짝";
                } else {
                    s = i + "홀";
                }
        %>
        <h1><%=s%></h1>
        <% }%>
    </body>
</html>
