<%-- 
    Document   : ex3_ajaxImgData
    Created on : 2014. 10. 25, ���� 2:50:42
    Author     : kosta
--%>


<%@page contentType="text/html" pageEncoding="EUC-KR"%>

<%
//�̰� ������... exam_star�� ����
    request.setCharacterEncoding("euc-kr");

    String gname = request.getParameter("gname");

    gname = gname.trim();

    System.out.println("GName : "+gname);

    //"����","�츮","����","�̶�"

    String imgName="";

    if(gname.equals("����")){

         imgName="img/ura.jpg";

    }else if(gname.equals("�츮")){

         imgName="img/heri.jpg";

    }else if(gname.equals("����")){

         imgName="img/sojin.jpg";

    }else if(gname.equals("�̶�")){

         imgName="img/mina.jpg";

         //"����","����","ȿ��","����"","ť��,"�ҿ�"

    }else if(gname.equals("����")){

         imgName="img/boram.jpg";

    }else if(gname.equals("����")){

         imgName="img/jiyun.jpg";

    }else if(gname.equals("ȿ��")){

         imgName="img/hymin.jpg";

    }else if(gname.equals("ť��")){

        imgName="img/jiyun.jpg";

    }else if(gname.equals("�ҿ�")){

        imgName="img/soyun.jpg";

    }

%><%=imgName%>

