<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
#chkRes {
	width: 160px;
	border: 1px dotted gray;
	height: 20px;
	display: none;
}

.content {
	width: 400px;
	margin: auto
}
</style>
</head>
<body>
	<div class="content">
		<form method="post" action="login.kosta">
			<table>
				<tr>
					<td colspan="2">login 예제</td>
				</tr>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" id="id">
				</tr>
				<tr>
					<td>비번</td>
					<td><input type="password" name="pwd" id="pwd">
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="login"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>