<%-- 
    Document   : login
    Created on : 2014. 10. 16, ���� 1:36:35
    Author     : kosta
--%>

<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
  request.setCharacterEncoding("euc-kr");
    //������ �Ѿ�� �Ķ���� ó��
    String id = request.getParameter("id");
    String password = request.getParameter("pwd");
    String address = request.getParameter("adress");
  
%>   
<%
      //1. JDBC�� ����ϱ� ���ؼ� Connection�� ȹ��
    Connection con = null;
    PreparedStatement psmt = null;
    try {
        //1-1 Ŀ�ؼ� ����
        con = ConnUtil.getConn();
        //2.sql�� �ϼ�
        StringBuffer sql = new StringBuffer();
        sql.append("insert into users values(jspboard_seq.nextVal,?,?,?)");
        //3.���۰�ü ���� �� ������ ���ε�
        psmt = con.prepareStatement(sql.toString());
        
        psmt.setString(1, id);
        psmt.setString(2, password);
        psmt.setString(3, address);
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
    %>
