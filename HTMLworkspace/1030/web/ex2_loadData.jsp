<%-- 
    Document   : ex2_loadData
    Created on : 2014. 10. 25, 오후 12:24:03
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    //load함수를 호출해서 ajax통신으로 전달된 파라미터 값
    String n = request.getParameter("num");
    System.out.println("Num:"+n);
    //데이터 분석 response
    if(n.equals("Click1")){
        String[] sub = {"Java","Oracle","JQuery","Spring","SenchaTouch","Ajax"};
        for(String e:sub){
            out.println("<li>");
            out.println(e);
            out.println("</li>");
        }
    }else{
        String[] sub = {"자바","오라클","제이쿼리","스프링","센차","에이젝스"};
        for(String e:sub){
            out.println("<li>");
            out.println(e);
            out.println("</li>");
        }
    }
    //이거 대신 서블릿으로 만들어봤음..밑에 있음...
%>