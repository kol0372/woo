<%-- 
    Document   : ex5_postData
    Created on : 2014. 10. 30, ���� 3:18:03
    Author     : kosta
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    String idv = request.getParameter("id");
    String msg = "";
    Connection con = null;
    PreparedStatement pstm = null;
    StringBuffer sb = new StringBuffer();
    con = ConnUtil.getConn();
    
    sb.append("select count(*) cnt from imember ");
    sb.append(" where id=?");
    pstm = con.prepareStatement(sb.toString());
    pstm.setString(1, idv);
    ResultSet rs = null;
    int cnt = 0;
    rs = pstm.executeQuery();
    if(rs.next()){
        cnt = rs.getInt("cnt");
    }
    
    if(cnt != 0){
        msg ="<p style='color:blue'>"+ idv +"�� �̹� �����ϴ� ���̵� �Դϴ�.^^";
    }else{
        msg ="<p style='color:coral'>"+ idv +"�� ����� ������ ���̵� �Դϴ�..^^";
    }
    %><%=msg%>
