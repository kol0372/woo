<%@page import="dao.JoinDao"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	HashMap<String, String> info = new HashMap<String, String>();
	info.put("id", id);
	info.put("pwd", pwd);

	int cnt = JoinDao.getDao().login(info);

	//mjoin���̺��� �����͸� ���� �˻� ����...

	if (cnt==1) {
		//��� ȸ�����̺��� ��ȸ�� ����.
		//���ǿ��� ������� ������ �ɴ´�.
		session.setAttribute("MEMBERID", id);
		session.setAttribute("USERNAME", "�浿��");
		response.sendRedirect("ex1_body.jsp");//�α伺��
	} else {
		response.sendRedirect("error.jsp");//�α����
	}
	
%>