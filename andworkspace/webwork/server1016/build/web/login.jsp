<%-- 
    Document   : login
    Created on : 2014. 10. 16, 오후 1:36:35
    Author     : kosta
--%>

<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%

    //파라미터 퍼리 (id, pwd)
    String idv = request.getParameter("id");
    String pwdv = request.getParameter("pwd");
%>   
<%
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    int res = 0;
    try {
        con = ConnUtil.getConn();
        StringBuffer sql = new StringBuffer();
        sql.append("select count(*) cnt from andmem where id=? and pwd=?");
        pstmt = con.prepareStatement(sql.toString());
        pstmt.setString(1, idv);
        pstmt.setString(2, pwdv);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            res = rs.getInt("cnt");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    String msg = "";
    if (res > 0) {
        msg = "welcome";
    } else {
        msg = "is not allowed";
    }

%>
<%=idv%><%=msg%>
