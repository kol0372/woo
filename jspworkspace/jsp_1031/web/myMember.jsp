<%-- 
    Document   : myMember
    Created on : 2014. 10. 31, 오후 7:39:22
    Author     : kosta
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    Connection con = ConnUtil.getconn();
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    StringBuffer sql = new StringBuffer();
    sql.append("select mymrmberno,id,psw,name,age,email,hobby,mymemberdate from mymember ");

    sql.append("order by mymrmberno asc");

    pstmt = con.prepareStatement(sql.toString());

    rs = pstmt.executeQuery();
    String mymrmberno = "";
    String id = "";
    String psw = "";
    String name = "";
    String age = "";
    String email = "";
    String hobby = "";
    String mymemberdate = "";

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script src="JS/httpRequest.js"></script>
        <script>
            $(document).ready(function()
            {


            });
        </script>
    </head>
    <body> 
        <table>
            <tr>
                <td>넘버</td>
                <td>아이디</td>
                <td>비번</td>
                <td>이름</td>
                <td>나이</td>
                <td>이메일</td>
                <td>취미</td>
                <td>날짜</td>
            </tr>
            <%   while (rs.next()) {
                    mymrmberno = rs.getString("mymrmberno");
                    id = rs.getString("id");
                    psw = rs.getString("psw");
                    name = rs.getString("name");
                    age = rs.getString("age");
                    email = rs.getString("email");
                    hobby = rs.getString("hobby");
                    mymemberdate = rs.getString("mymemberdate");
            %>
            <tr>
                <td><%=mymrmberno%></td>
                <td><%=id%></td>
                <td><%=psw%></td>
                <td><%=name%></td>
                <td><%=age%></td>
                <td><%=email%></td>
                <td><%=hobby%></td>
                <td><%=mymemberdate%></td>
            </tr>
            <% }%>
        </table>
    </body>
</html>
