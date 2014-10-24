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
  request.setCharacterEncoding("euc-kr");
    //폼에서 넘어온 파라미터 처리
    String id = request.getParameter("id");
    String password = request.getParameter("pwd");
    String address = request.getParameter("adress");
  
%>   
<%
      //1. JDBC를 사용하기 위해서 Connection을 획득
    Connection con = null;
    PreparedStatement psmt = null;
    try {
        //1-1 커넥션 생성
        con = ConnUtil.getConn();
        //2.sql문 완성
        StringBuffer sql = new StringBuffer();
        sql.append("insert into users values(jspboard_seq.nextVal,?,?,?)");
        //3.전송객체 설정 및 데이터 바인딩
        psmt = con.prepareStatement(sql.toString());
        
        psmt.setString(1, id);
        psmt.setString(2, password);
        psmt.setString(3, address);
        psmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }finally{
        //작업종류후 예외나던 안나던 자원을 반환 ******
        try{
            if(psmt != null)psmt.close();
            if(con != null)con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    %>
