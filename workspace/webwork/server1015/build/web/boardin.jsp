<%-- 
    Document   : boardin
    Created on : 2014. 10. 15, ���� 2:16:09
    Author     : kosta
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    //�ѱ� �ȱ����� �ϱ�
    request.setCharacterEncoding("euc-kr");
    //������ �Ѿ�� �Ķ���� ó��
    String titlev = request.getParameter("title");
    String notev = request.getParameter("note");
    String agev = request.getParameter("age");
    String whriterv = request.getParameter("whriter");
    String passv = request.getParameter("pass");
    String sexv = request.getParameter("sex");

    //1. JDBC�� ����ϱ� ���ؼ� Connection�� ȹ��
    Connection con = null;
    PreparedStatement psmt = null;
    try {
        //1-1 Ŀ�ؼ� ����
        con = ConnUtil.getConn();
        //2.sql�� �ϼ�
        StringBuffer sql = new StringBuffer();
        sql.append("insert into jspboard values(jspboard_seq.nextVal,?,?,?,?,?,?,0,?,sysdate)");
        //3.���۰�ü ���� �� ������ ���ε�
        psmt = con.prepareStatement(sql.toString());
        psmt.setString(1, titlev);
        psmt.setString(2, notev);
        psmt.setString(3, agev);
        psmt.setString(4, whriterv);
        psmt.setString(5, passv);
        psmt.setString(6, sexv);
        psmt.setString(7, request.getRemoteAddr());//Ŭ���̾�Ʈ ����������
        psmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }finally{
        //�۾������� ���ܳ��� �ȳ��� �ڿ��� ��ȯ ******
        try{
            if(psmt != null)psmt.close();
            if(con != null)con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    String styleColor = "";
    if (sexv.equals("M")) {
        styleColor = "#3300ff";
    } else {
        styleColor = "#ff33cc";
    }


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

        <title>JSP Page</title>
    </head>
    <body> 
        <div style="background: <%=styleColor%>">
            <h1><%=titlev%></h1>
            <h1><%=notev%></h1>
            <%
                int i = Integer.parseInt(agev);
                String msg = "";
                if (i < 19) {
                    msg = i + ":" + "�̼�����";
            %>
            <h1><%=msg%></h1>
            <% }%>
            <h1><%=whriterv%></h1>
            <h1><%=passv%></h1>
            <h1><%=sexv%></h1>
            <a href = "myform.html">�ٽ��ۼ�</a> 
            <a href="boardlist.jsp">��Ϻ���</a>
        </div>

    </body>
</html>
