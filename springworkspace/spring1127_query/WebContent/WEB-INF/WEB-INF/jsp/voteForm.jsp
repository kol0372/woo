<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>voteForm.jsp</title>
</head>
<body>
	<div>
		<form method="post" action="votein.kosta">
			제목 : <input type="text" name="sub"><br />
			code : <input type="text" name="code"><br />
			<c:forEach begin="1" end="5" step="1" varStatus="i">
			설문문항1 : <input type="text" name="vsub${i}"><br/>
			</c:forEach>
			<input type="submit" value="등록">
		</form>
	</div>
</body>
</html>