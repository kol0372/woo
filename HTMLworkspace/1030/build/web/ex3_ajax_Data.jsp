<%-- 
    Document   : ex3_ajax_Data
    Created on : 2014. 10. 25, ���� 2:49:12
    Author     : kosta
--%>


<%@page import="ex1.Ex3_Girl"%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>

<%

      String code = request.getParameter("groupName");

      // ��ü���� 

      Ex3_Girl girl = new Ex3_Girl();

      // �޼��� ȣ���� �ش� code�� ���� �����͸� ���ڿ��� ��ȯ ����

      String[] gg = girl.getGirlGroup(code);

      System.out.println(gg.length);

%><option>����</option>

<% for(String e : gg){ %>

    <option><%=e%></option>

<%} %>
