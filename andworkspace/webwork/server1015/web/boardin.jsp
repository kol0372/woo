<%-- 
    Document   : boardin
    Created on : 2014. 10. 15, 오후 2:16:09
    Author     : kosta
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    //한글 안깨지게 하기
    request.setCharacterEncoding("euc-kr");
    //폼에서 넘어온 파라미터 처리
    String titlev = request.getParameter("title");
    String notev = request.getParameter("note");
    String agev = request.getParameter("age");
    String whriterv = request.getParameter("whriter");
    String passv = request.getParameter("pass");
    String sexv = request.getParameter("sex");

    //1. JDBC를 사용하기 위해서 Connection을 획득
    Connection con = null;
    PreparedStatement psmt = null;
    try {
        //1-1 커넥션 생성
        con = ConnUtil.getConn();
        //2.sql문 완성
        StringBuffer sql = new StringBuffer();
        sql.append("insert into jspboard values(jspboard_seq.nextVal,?,?,?,?,?,?,0,?,sysdate)");
        //3.전송객체 설정 및 데이터 바인딩
        psmt = con.prepareStatement(sql.toString());
        psmt.setString(1, titlev);
        psmt.setString(2, notev);
        psmt.setString(3, agev);
        psmt.setString(4, whriterv);
        psmt.setString(5, passv);
        psmt.setString(6, sexv);
        psmt.setString(7, request.getRemoteAddr());//클라이언트 아이피정보
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
                    msg = i + ":" + "미성년자";
            %>
            <h1><%=msg%></h1>
            <% }%>
            <h1><%=whriterv%></h1>
            <h1><%=passv%></h1>
            <h1><%=sexv%></h1>
            <a href = "myform.html">다시작성</a> 
            <a href="boardlist.jsp">목록보기</a>
        </div>

    </body>
</html>
