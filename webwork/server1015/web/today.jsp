<%-- 
    Document   : today
    Created on : 2014. 10. 16, ���� 9:48:26
    Author     : kosta
--%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%!
    public String todate() {

        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>


        <%
            String name = "��츮";
            String today = todate();
        %>
        <%="name : "+name%>
            <%="today :" + today%>
         
