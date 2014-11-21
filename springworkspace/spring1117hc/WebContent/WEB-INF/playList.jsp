<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="ab" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap">
		<table>
		<ab:forEach var="e" items="${list}" >
			<tr>
				<td><a href="playDetail.kosta?query=detail&num=${e.getNum()}">
				 ${e.getPname()}</a></td>
				<td>${e.getPrice()}</td>
				<td>${e.getUsers()}</td>
				<td>${e.getRdate()}</td>
			</tr>
			</ab:forEach>
		</table>
	</div>
	<a href="play.kosta?query=form">writer</a>
	<a href="play.kosta?query=list">List</a>
</body>
</html>