<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
</head>
<body>
	<table>
		<tr><td>��ȣ</td><td>${vo.getNum()}</td></tr>
		<tr><td>�̸�</td><td>${vo.getPname()}</td></tr>
		<tr><td>����</td><td>${vo.getPrice()}</td></tr>
		<tr><td>����</td><td>${vo.getUsers()}</td></tr>
		<tr><td>��¥</td><td>${vo.getRdate()}</td></tr>
		<tr><td><a href="play.kosta?query=list">List</a></td></tr>
	</table>
</body>
</html>