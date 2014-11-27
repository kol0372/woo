<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��� view</title>
<style>
#main {
	text-align: center;
	width: 100%
}

#sub1 {
	margin: auto
}

table {
	width: 450px;
	border: 1px solid gray
}

tbody tr {
	border: 1px solid gray
}
</style>
</head>
<body>
	<!-- row=5 col=2-->
	<div id="main">
		<div id="sub1">
			<table border="1">
				<thead>
					<tr>
						<th colspan="2">�Խ��� �󼼺���</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>��ȣ</td>
						<td>${vo.no}</td>
					</tr>
					<tr>
						<td>�̸�</td>
						<td><s:property value="vo.writer" /></td>
					</tr>
					<tr>
						<td>����</td>
						<td>${vo.subject}</td>
					</tr>
					<tr>
						<td>����</td>
						<td><s:property value="vo.content" /></td>
					</tr>


					<!-- �亯 ��� -->
					<tr>
						<td align="center" colspan="2">

							<form action="reboardf.kosta" method="post">
								<input type="hidden" name="ref" value="${vo.ref}" /> <input
									type="hidden" name="seq" value="${vo.seq}"> <input
									type="hidden" name="lvl" value="${vo.lvl}"> <input
									type="submit" value="�亯">

							</form>
						</td>
					</tr>

					<!-- �亯 ��� -->
					<tr>
						<td align="center" colspan="2">
<!-- 							<form action="tx_reboardf.kosta" method="post"> -->
<!-- 								�Ѿ�;� �Ǵ� ��... ��ȣ.. ��ȣ�� ���� seq�� �� -->
<%-- 								<input type="hidden" name="no" value="${vo.no}" /> <input --%>
<%-- 									type="hidden" name="seq" value="${vo.seq}"> <input --%>
<!-- 									type="submit" value="tx�亯"> -->

<!-- 							</form> -->
						</td>
					</tr>


					<tr>
						<td colspan="2">
							<form method="post" action="commIn.do">
								<input type="hidden" name="no" value="${vo.no}" />
								<table border="1">
									<tr>
										<td>���� <input type="text" name="comm" />
										</td>
										<td>�ۼ� <input type="text" name="writer" />
										</td>
										<td>��й�ȣ <input type="password" name="pwd" />
										</td>
										<td><input type="submit" value="���ۼ�" /></td>
									</tr>
								</table>
							</form>
						</td>

					</tr>
					<tr>
						<td>
							<table>
								<tr>
									<td>����</td>
									<td>�ۼ���</td>
									<td>��¥</td>
								</tr>
								<s:iterator value="list" status="stat">
									<!-- �ݺ��� ���� ���� -->
									<tr>
										<td><s:property value="comm" /></td>
										<td><s:property value="writer" /></td>
										<td><s:property value="regdate" /></td>
									</tr>
								</s:iterator>
								<!-- �ݺ��� �������� -->
							</table>

						</td>

					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
