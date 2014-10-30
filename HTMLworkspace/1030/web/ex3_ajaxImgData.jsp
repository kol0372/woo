<%-- 
    Document   : ex3_ajaxImgData
    Created on : 2014. 10. 25, 오후 2:50:42
    Author     : kosta
--%>


<%@page contentType="text/html" pageEncoding="EUC-KR"%>

<%
//이게 서버얌... exam_star랑 연결
    request.setCharacterEncoding("euc-kr");

    String gname = request.getParameter("gname");

    gname = gname.trim();

    System.out.println("GName : "+gname);

    //"유라","헤리","소진","미라"

    String imgName="";

    if(gname.equals("유라")){

         imgName="img/ura.jpg";

    }else if(gname.equals("헤리")){

         imgName="img/heri.jpg";

    }else if(gname.equals("소진")){

         imgName="img/sojin.jpg";

    }else if(gname.equals("미라")){

         imgName="img/mina.jpg";

         //"보람","지연","효민","은정"","큐리,"소연"

    }else if(gname.equals("보람")){

         imgName="img/boram.jpg";

    }else if(gname.equals("지연")){

         imgName="img/jiyun.jpg";

    }else if(gname.equals("효민")){

         imgName="img/hymin.jpg";

    }else if(gname.equals("큐리")){

        imgName="img/jiyun.jpg";

    }else if(gname.equals("소연")){

        imgName="img/soyun.jpg";

    }

%><%=imgName%>

