<%-- 
    Document   : ex3_ajax_Basic_Data
    Created on : 2014. 10. 25, 오후 2:05:40
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    request.setCharacterEncoding("euc-kr");
    String name = request.getParameter("name");
    String orderNum = request.getParameter("orderNum");
    String status = "";
    
    if (name.equals("김길동") && orderNum.equals("A001")) {
        status = "주문하신 상품 발송중";
    } else if (name.equals("김우리") && orderNum.equals("A002")) {
        status = "주문하신 상품 사은품 발송";
    } else {
        status = "이미 발송된 상품입니다.";
    }
%>
<%=status%>