<%-- 
    Document   : ex2_loadData
    Created on : 2014. 10. 25, ���� 12:24:03
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    //load�Լ��� ȣ���ؼ� ajax������� ���޵� �Ķ���� ��
    String n = request.getParameter("num");
    System.out.println("Num:"+n);
    //������ �м� response
    if(n.equals("Click1")){
        String[] sub = {"Java","Oracle","JQuery","Spring","SenchaTouch","Ajax"};
        for(String e:sub){
            out.println("<li>");
            out.println(e);
            out.println("</li>");
        }
    }else{
        String[] sub = {"�ڹ�","����Ŭ","��������","������","����","��������"};
        for(String e:sub){
            out.println("<li>");
            out.println(e);
            out.println("</li>");
        }
    }
    //�̰� ��� ���������� ��������..�ؿ� ����...
%>