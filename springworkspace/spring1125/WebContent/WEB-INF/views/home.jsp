<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="body">
			<h1>My Tiles Homepage!</h1>
			<p>My Home Tiles Page 작성입니다.</p>
			<p>${msg}</p>
			<p><img src="http://spring.io/img/springone-logo.JPG"></p>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>