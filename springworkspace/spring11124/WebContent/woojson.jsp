<%-- 
    Document   : jsonp
    Created on : 2014. 4. 24, ���� 5:47:27
    Author     : kosta
--%>
<%@page contentType="text/javascript" pageEncoding="EUC-KR"%>
<%
    String fN = request.getParameter("serverkey");
    System.out.println(fN);
    String urlImg ="http://192.168.7.144/spring11124/";
%>
<% if(fN != null) { %>
    <%=fN%>([{"pno":"p1","pname":"��������Ŭ��","pimage":"<%=urlImg%>img/ad.png"},
    {"pno":"p2","pname":"������ ���� ��Ŭ��","pimage":"<%=urlImg%>img/ae.png"},
    {"pno":"p3","pname":"������ ��� ����","pimage":"<%=urlImg%>img/af.png"},
    {"pno":"p5","pname":"������ Ŀ�´�Ƽ","pimage":"<%=urlImg%>img/ag.png"},
    {"pno":"p6","pname":"������ ���丮","pimage":"<%=urlImg%>img/am.png"},
    {"pno":"p7","pname":"������ ���̾�","pimage":"<%=urlImg%>img/ao.png"}
    ]);
<%} %>

