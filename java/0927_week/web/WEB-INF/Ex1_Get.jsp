<%-- 
    Document   : Ex1_Get
    Created on : 2014. 9. 27, 오전 10:51:54
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
    $(function() {
    $("#btn").click(function() {
    //alert("ok");
    //alert($("#name").val());
    //브라우져 콘솔창에 값 출력하기
    console.log("이름: " + $('#name').val());
    $.get("Ex1_Jquery.jsp",{name:$('#name').val()},
    function(data) {
       $("#message").html(data); //html--
    });
    });
    });
    </script>
</html>
