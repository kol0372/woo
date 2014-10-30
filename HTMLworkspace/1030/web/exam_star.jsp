<%-- 
    Document   : exam_star
    Created on : 2014. 10. 30, 오후 2:13:13
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
        <style>
            #wrap div{float:left}
        </style>
        <script>
            $(document).ready (function()
            {
                //select만들어주기
              $('#ggChoice').change(function(){
                  var url="ex3_ajax_Data.jsp";
                  var params = "groupName=" + $(this).val(); //groupName=1
                  $.ajax({
                      url:url,
                      data:params,
                      success:function(args){
                          $("#result>#ggChoice2").html(args);
                      },
                      error:function(e){
                          alert(e.responseText);
                      }
                  });
              });
              
              $('#ggChoice2').change(function(){
                  var url1="ex3_ajaxImgData.jsp";
                  //encodeURlComponent - 한글로 get방식으로 전송되었을 때..
                  var param1 = "gname="+encodeURIComponent($(this).val()); // gname=애들이름
                  $.ajax({
                      url:url1,
                      data:param1,
                      success:function(args){
                          //callback된 이미지의 경로값을 이미지태그에 src속성값으로 지정
                          $("#target").attr("src",args); //src를 args로 변경...
                      },
                       error:function(e){
                          alert(e.responseText);
                      }
                  });
              });
            });
        </script>
    </head>
    <body>
        <div id="wrap">
            <div>
                <select id="ggChoice">
                    <option>선택</option>
                    <option value="1">걸스데이</option>
                    <option value="2">티아라</option>       
                </select>

            </div>
            <div id="result">
                 <select id="ggChoice2"><option>=선택=</option></select>
            </div>
            <div id="imgTarget">
                 <img src ="img/ya.PNG" id="target" style="width:120px">
            </div>
        </div>
        
    </body>
</html>
