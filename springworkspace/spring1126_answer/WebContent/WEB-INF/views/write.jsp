<%@page contentType="text/html" pageEncoding="EUC-KR"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��� write</title>
</head>
<body>
	<!-- row = 6 ���� -->
	<form action="write.kosta" method="post" id="f">
		<table border="1" align="center" width="450">
			<thead>
				<tr>
					<th colspan="2">�Խ��� �ۼ� ��</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>����</td>
					<td><input type="text" name="subject" id="subject" /></td>
				</tr>
				<tr>
					<td>�ۼ���</td>
					<td><input type="text" name="writer" id="writer" /></td>
				</tr>
				<tr>
					<td>��й�ȣ</td>
					<td><input type="password" name="pwd" id="pwd" /></td>
				</tr>
				<tr>
					<td>����</td>
					<td><textarea name="content" id="content" rows="5" cols="15">
                            </textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" onclick="sendForm()"
						value="���ۼ�"> &nbsp; <input type="button"
						onclick="goList('list.kosta','')" value="����Ʈ"></td>
				</tr>
			</tbody>
		</table>
	</form>
	<script type="text/javascript">
		// form��ȿ�� �˻� ���� ���� �����͸� �����ϴ� ��ũ��Ʈ
		function sendForm() {
			$('#f').submit();
		}
		function goList(url, param) {
			if (!param)
				url = url;
			else
				url = url + "?" + param;
			location = url;
		}
	</script>
</body>
</html>
