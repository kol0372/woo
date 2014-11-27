<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="menu">
	Menu
	<ul>

		<li><spring:url value="/home.kosta" var="homeUrl"
				htmlEscape="true"></spring:url><a href="${homeUrl}">HOME</a></li>

		<li><spring:url value="/list.kosta" var="listUrl"
				htmlEscape="true"></spring:url><a href="${listUrl}">LIST</a></li>
		<li><a href="">MENU1</a></li>
		<li><a href="">MENU2</a></li>
		<li><a href="">MENU3</a></li>
	</ul>
</div>