<%-- 
    Document   : test
    Created on : 2014. 10. 31, 오후 3:23:20
    Author     : kosta
--%>

<%@page import="java.io.Console"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    //PrepareStatement ps 작업 bind 작업 excuteUpdate
   String id = request.getParameter("id");
   String psw = request.getParameter("psw");
   String name = request.getParameter("name");
   String age = request.getParameter("age");
   String email = request.getParameter("email");
   String hobby = request.getParameter("hb");
    
    Connection con = ConnUtil.getconn();
    PreparedStatement pstm = null;
    System.out.println("Log" + con);

    StringBuffer sql = new StringBuffer();
    sql.append("insert into mymember values(");
    sql.append("mymember_seq.nextVal,?,?,?,?,?,?,sysdate)");

    pstm = con.prepareStatement(sql.toString());
    
    pstm.setString(1, id);
    pstm.setString(2, psw);
    pstm.setString(3, name);
    pstm.setString(4, age);
    pstm.setString(5, email);
    pstm.setString(6, hobby);
    pstm.executeUpdate();
    
    response.sendRedirect("myMember.jsp");
    
%>
