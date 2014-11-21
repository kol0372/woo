<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
#wrap {
	width: 500px;
	margin: auto;
}

#wrap table {
	width: 100%;
	border: 1px dotted #9900ff
}

#wrap table thead {
	background-color: #b9b9ff;
}
</style>
</head>
<body>
	<div id="wrap">
		<table>
			<thead>
				<tr>
					<th colspan="5">Bbs1 List</th>
				</tr>
				<tr>
					<td>��ȣ</td>
					<td>����</td>
					<td>�ۼ���</td>
					<td>��ȸ��</td>
					<td>�ۼ���¥</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="listv" items="${list}">
				<tr>
				<td>${listv.num}</td>
				<td><a href="bbs1detail.kosta?num=${listv.num}">${listv.sub}</a></td>
				<td>${listv.writer}</td>
				<td>${listv.hit}</td>
				<td>${listv.regdate}</td>
				</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5"><input type="button" value="write"
						onclick="location='bbs1form.kosta'"></td>
				</tr>
			</tfoot>

		</table>
	</div>
</body>
</html>