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
				<td colspan="5" class="cls">리스트</td>
			</tr>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>설문갯수</th>
				<th>작성일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${list}">
				<tr>
					<td>${e.num}</td>

					<td><a
						href="voteDetail.kosta?num=${e.num}">${e.sub}</a></td>
					<td>${e.code}</td>
					<td>${e.vdate}</td>
					<td><a href="javascript:del(${e.num})">삭제</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>