<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<body>
	<div id="page">
		<tiles:insertAttribute name="header" />
		<div id="content">
			
			<tiles:insertAttribute name="body" />

		</div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>