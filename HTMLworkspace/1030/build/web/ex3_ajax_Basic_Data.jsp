<%-- 
    Document   : ex3_ajax_Basic_Data
    Created on : 2014. 10. 25, ���� 2:05:40
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    request.setCharacterEncoding("euc-kr");
    String name = request.getParameter("name");
    String orderNum = request.getParameter("orderNum");
    String status = "";
    
    if (name.equals("��浿") && orderNum.equals("A001")) {
        status = "�ֹ��Ͻ� ��ǰ �߼���";
    } else if (name.equals("��츮") && orderNum.equals("A002")) {
        status = "�ֹ��Ͻ� ��ǰ ����ǰ �߼�";
    } else {
        status = "�̹� �߼۵� ��ǰ�Դϴ�.";
    }
%>
<%=status%>