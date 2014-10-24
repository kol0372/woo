<%-- 
    Document   : boardlist
    Created on : 2014. 10. 15, 오후 5:11:57
    Author     : kosta
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>

    </head>
    <body>
        <table>
            <tr>
            <td>NUM</td>
            <td>TITLE</td>
            <td>CONT</td>
            <td>AGE</td>
            <td>NAME</td>
            <td>PWD</td>
            <td>SEX</td>
            <td>HIT</td>
            <td>REIP</td>
            <td>RDATE</td>
        </tr>
        <%

            Connection con = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            String num;
            String title;
            String cont;
            int age;
            String name;
            String pwd;
            String sex;
            int hit;
            String reip;
            String rdate;

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
                String user = "mypeople";
                String pass = "new09";
                con = DriverManager.getConnection(url, user, pass);
                StringBuffer sql = new StringBuffer();
                sql.append("select num,title,cont,age,name,pwd,sex,hit,reip,rdate from jspboard ");

                //쿼리 전송
                pstmt = con.prepareStatement(sql.toString());
                //Cursor를 돌려받기위한 메서드를 호출
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    // rs.getXX("컬럼번호||컬럼명");
                    num = rs.getInt("num") + "";
                    title = rs.getString("title");
                    cont = rs.getString("cont");
                    age = rs.getInt("age");
                    name = rs.getString("name");
                    pwd = rs.getString("pwd");
                    sex = rs.getString("sex");
                    hit =rs.getInt("hit");
                    reip = rs.getString("reip");
                    rdate = rs.getString("rdate");
        %>


        <tr>
        <td><h1><%=num%></h1></td>
        <td><h1><%=title%></h1></td>
        <td><h1><%=cont%></h1></td>
        <td><h1><%=age%></h1></td>
        <td><h1><%=name%></h1></td>
        <td><h1><%=pwd%></h1></td>
        <td><h1><%=sex%></h1></td>
        <td><h1><%=hit%></h1></td>
        <td><h1><%=reip%></h1></td>
        <td><h1><%=rdate%></h1></td>

    </tr>



    <%       }
        } catch (Exception e) {
            e.printStackTrace();
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
            }
        }

    %>
</table>
</body>
</html>
