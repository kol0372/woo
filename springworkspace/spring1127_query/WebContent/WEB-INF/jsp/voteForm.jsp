<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>voteForm.jsp</title>
</head>
<body>
	<div>
		<form method="post" action="votein.kosta">
			���� : <input type="text" name="sub"><br /> code : <input
				type="number" name="code" maxlength="5" step="1" min="2" value="2"
				max="5"><br />
			<c:forEach begin="1" end="5" step="1" varStatus="i">
			��������1 : <input type="text" name="vsub${i.count}">
				<br />
			</c:forEach>
			<input type="submit" value="���">
		</form>
	</div>
</body>
</html>