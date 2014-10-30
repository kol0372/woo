<%-- 
    Document   : ex1_ajaxScript
    Created on : 2014. 10. 25, ���� 11:01:24
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <style type="text/css">
            *{margin: 0px;
            padding: 0}
            div#view{
                width: 500px;
                height: 100px;
                border-radius: 10px;
                border: 1px solid black;
            }

            .java{
                width: 100%;
                height: 100%;
                background-color: lightsteelblue;
                color: white;
                font-size: 3em;
            }
            .ms{
                width: 100%;
                height: 100%;
                background-color: snow;
                color: salmon;
                font-size: 3em;
            }
        </style>
        <script src="js/httpRequest.js"></script>
        <script>
           function ex(obj){
               var str = obj.value;
               var param = "v1="+str;
               
              // sendRequest("test1.jsp",param,res,"post",true);
               sendRequest("Ex1_Sevlet",param,res,"post",true);
           }
           function res(){
               var v = document.getElementById("view");
                    //response �� ���ڿ��� �޾Ƽ� ǥ��
               v.innerHTML = xhr.responseText;
           }
        </script>
    </head>
    <body>
        <select onchange="ex(this)">
            <option value="">����</option>
             <option value="java">�ڹ�</option>
              <option value="ms">����ũ�� ����Ʈ</option>
        </select>
        <div id="view"></div>
    </body>
</html>
