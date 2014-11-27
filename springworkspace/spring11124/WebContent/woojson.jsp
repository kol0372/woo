<%-- 
    Document   : jsonp
    Created on : 2014. 4. 24, 오후 5:47:27
    Author     : kosta
--%>
<%@page contentType="text/javascript" pageEncoding="EUC-KR"%>
<%
    String fN = request.getParameter("serverkey");
    System.out.println(fN);
    String urlImg ="http://192.168.7.144/spring11124/";
%>
<% if(fN != null) { %>
    <%=fN%>([{"pno":"p1","pname":"아이유팬클럽","pimage":"<%=urlImg%>img/ad.png"},
    {"pno":"p2","pname":"아이유 삼촌 팬클럽","pimage":"<%=urlImg%>img/ae.png"},
    {"pno":"p3","pname":"아이유 사랑 모임","pimage":"<%=urlImg%>img/af.png"},
    {"pno":"p5","pname":"아이유 커뮤니티","pimage":"<%=urlImg%>img/ag.png"},
    {"pno":"p6","pname":"아이유 스토리","pimage":"<%=urlImg%>img/am.png"},
    {"pno":"p7","pname":"아이유 유이아","pimage":"<%=urlImg%>img/ao.png"}
    ]);
<%} %>

