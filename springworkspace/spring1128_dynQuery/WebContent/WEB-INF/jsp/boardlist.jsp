<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="550">
		<thead>
			<tr>
				<td colspan="6" class="cls">����Ʈ</td>
			</tr>
			<tr>
				<th>��ȣ</th>
				<th>����</th>
				<th>�ۼ���</th>
				<th>�׷�ѹ�</th>
				<th>�ۼ���</th>
				<th>����</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${list}">
				<tr>
					<td>${e.no}</td>

					<td><a href="voteDetail.kosta?num=${e.no}">${e.title}</a></td>
					<td>${e.writer}</td>
					<td>${e.groupno}</td>
					<td>${e.regdate}</td>
					<td><a href="javascript:del(${e.no})">����</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="6">

					<form method="post" action="search.kosta">
						<select name="sel" id="sel">
							<option value="">����</option>
							<option>title</option>
							<option>writer</option>
						</select> <input type="text" name="title" id="title" class="inp"> <input
							type="text" name="writer" id="writer" class="inp"> <input
							type="number" name="groupno" value="1"> <input
							type="submit" value="send">
					</form>
				</td>

			</tr>
		</tbody>
	</table>
</body>
</html>