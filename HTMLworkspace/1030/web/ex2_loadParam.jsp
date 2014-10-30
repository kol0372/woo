<%-- 
    Document   : ex2_loadParam
    Created on : 2014. 10. 25, 오후 12:30:56
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
        
        <script>
            $(document).ready (function()
            {
                var $menu = $('.menu>input');
                $menu.click(function(){
                    //alert("menu 안의 button 클릭!!");
                    //서버로 보내기 위한 버튼의 value
                    var $val = $(this).val();
                    console.log('클릭한 값 : ' + $val);
                               
                    //로드된 서버로 데이터를 get 방식으로 전송 후 callback 받기
                    //load(url data(param),complete)
                    
                    $('#new-projects').load('Ex2_Sevlet?num='+$val + " li" ,function(resp,status,xhr){
                            console.log('resp:'+resp);
                            console.log('status:'+status); //success
                            console.log('xhr:'+xhr.statusText); //OK
                            if(status == "error"){
                                var msg = "페이지 오류";
                                $('#error').html(msg+","+xhr.status+","+xhr.statusText);
                            }
                    });
                });
            });
        </script>
    </head>
    <body>
        <div class="menu">
            <input type ="button" value="Click1">
            <input type="button" value="Click2">
        </div>
       <!-- <input type="button" value="noClick">-->
        <b>Projects:</b>
        <ol id="new-projects"></ol>
        <div id="error"></div>
    </body>
</html>
