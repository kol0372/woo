<%@page import="org.springframework.aop.framework.ProxyFactoryBean"%>
<%@page import="vo.MJoinVO"%>
<%@page import="dao.DaoService"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>inter_tranc</title>
</head>
<body>
	<%
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"config/config.xml");

		//�Ϲ����� JDBCó��
		DaoService dsv = ctx.getBean("dao", DaoService.class);
		MJoinVO vo = new MJoinVO();
		vo.setId("woo");
		vo.setName("woot");
		vo.setPwd("aa");
		vo.setInfo("olol");
		// 		dsv.transaction(vo);
		//proxyfactorybean���� Ʈ������� ó�� �ϵ��� ó��
		ProxyFactoryBean txp = (ProxyFactoryBean) ctx.getBean("&service");
		DaoService sv = (DaoService) txp.getObject();
		sv.transaction(vo);
	%>

</body>
</html>