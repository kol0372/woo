<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��� list</title>
</head>
<body>
	<!-- row:3 col:5 -->
	<table border="1" align="center" width="550">
		<thead>
			<tr>
				<th>��ȣ</th>
				<th>����</th>
				<th>�ۼ���</th>
				<th>��ȸ��</th>
				<th>�ۼ���</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="listv" items="${list}">
				<tr>
					<td align="center">${listv.no}</td>
					<!-- ��� �ۼ� �Ҽ��ֵ��� �̵� -->
					<td ><c:forEach begin="1" end="${listv.lvl}">&nbsp;&nbsp;&nbsp;
                        </c:forEach> <a href="detail.kosta?no=${listv.no}"> <c:if
								test="${listv.lvl != 0}">
								<img src="images/re.PNG" border="0" />
							</c:if>${listv.subject}
					</a></td>
					<td align="center">${listv.writer}</td>
					<td align="center">${listv.hit}</td>
					<td align="center">${listv.regdate}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5"><input type="button" value="���ۼ�"
					onclick="location='writef.kosta'"></td>
			</tr>
		</tbody>
	</table>


</body>
</html>
