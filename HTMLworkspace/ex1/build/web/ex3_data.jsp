<%-- 
    Document   : ex2_datalist
    Created on : 2014. 10. 27, 오전 10:33:51
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

            });
        </script>
    </head>
    <body>
        <form>
            <fiedset>
                <legend>
                    Data연습
                </legend>
                <label for = "s1">Date : </label>
                <input type="date" id="s1" /><br/>
                <label for = "s2">Datetime: </label>
                <input type="datetime:" id="s2" /><br/>
                <label for = "s3">Time: </label>
                <input type="time:" id="s3" /><br/>
                <label for = "s4">Week </label>
                <input type="week" id="s4" /><br/>
                

            </fiedset>

        </form>

    </body>
</html>
