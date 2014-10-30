<%-- 
    Document   : exam_star
    Created on : 2014. 10. 30, ���� 2:13:13
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
                //select������ֱ�
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
                  //encodeURlComponent - �ѱ۷� get������� ���۵Ǿ��� ��..
                  var param1 = "gname="+encodeURIComponent($(this).val()); // gname=�ֵ��̸�
                  $.ajax({
                      url:url1,
                      data:param1,
                      success:function(args){
                          //callback�� �̹����� ��ΰ��� �̹����±׿� src�Ӽ������� ����
                          $("#target").attr("src",args); //src�� args�� ����...
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
                    <option>����</option>
                    <option value="1">�ɽ�����</option>
                    <option value="2">Ƽ�ƶ�</option>       
                </select>

            </div>
            <div id="result">
                 <select id="ggChoice2"><option>=����=</option></select>
            </div>
            <div id="imgTarget">
                 <img src ="img/ya.PNG" id="target" style="width:120px">
            </div>
        </div>
        
    </body>
</html>
