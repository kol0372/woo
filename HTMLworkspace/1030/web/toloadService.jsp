<%-- 
    Document   : toloadService
    Created on : 2014. 10. 30, ���� 10:31:46
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script src="JS/httpRequest.js"></script>
        <script>
         $(document).ready(function (){
                $('div').css({width:'100px', background:'yellow'});
            });
        </script>
    </head>
    <body>
       <h1>�ȳ缼��</h1>
      <% for(int i =0; i<5; i++){ %>
      <p>����</p>
      <% } %>
      <div>����� ���� ����</div>
    </body>
</html>
