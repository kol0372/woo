<%-- 
    Document   : ex6_post
    Created on : 2014. 10. 30, 오후 5:38:04
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
            $(document).ready(function()
            {
                $('#wrap').css({backgroud: 'whitesmoke', margin :' auto',width:'300px'});
                $('#res').css({width:'300px',backgroud: 'whitesmoke', margin : 'auto' });
                
                $('#id').keyup(function (){
                   console.log("씨리얼"+$('#id').serialize());
                   $.post('ex5_postData.jsp',$('#id').serialize(),
                   function (data){
                      $('#res').html(data); 
                   });
                });
            });
        </script>
    </head>
    <body>
        <div id="wrap">
            <h1>회원가입 폼</h1>
            <form method="post" action="" id="f">
                ID:<input type="text" name="id" id="id">
                <div id="res"></div>
            </form>
        </div>
    </body>
</html>
