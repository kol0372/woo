<%-- 
    Document   : myform
    Created on : 2014. 10. 15, 오후 2:00:20
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    //myform.html에서 폼의 전송버튼을 누르면 action으로 지정된 현재 페이지로 
    //name="id" 형식의 마라미터이름으로 값을 담아서 전송이 되어온다.
    //여기서는 파라미터를 받는 작업
    //그것을 가공하는 작업(디비에 저장, 연산 등의 비지니스 로직처리)
    //1.파라미터 받기
    String idv = request.getParameter("id");
    String namev=request.getParameter("name");
    String passv=request.getParameter("pwd");
    String ectv=request.getParameter("etc");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
  
    </head>
    <body>
        <h1><%=idv%></h1>
        <h1><%=namev%></h1>
        <h1><%=passv%></h1>
        <h1><%=ectv%></h1>
    </body>
</html>
