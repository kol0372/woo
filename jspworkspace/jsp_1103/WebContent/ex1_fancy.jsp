<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <link rel="stylesheet" href="source/jquery.fancybox.css">
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script src="source/jquery.fancybox.js"></script>
        <script>
            $(document).ready(function(){
                $(".fancybox").fancybox();
            });
        </script>

    </head>
    <body>
        <h3>Simple image gallery</h3>
        <p>
            <a class="fancybox" href="img/1_b.jpg" data-fancybox-group="gallery" title="gal">
                <img src="img/2_b.jpg" alt=""/>
            </a>
        </p>
        <a class="fancybox" href="img/3_b.jpg" data-fancybox-group="gallery" title="woo"></a>
        <a class="fancybox" href="img/4_b.jpg" data-fancybox-group="gallery" title="gal"></a>
      
    </body>
</html>
