<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!--data-->
<!DOCTYPE html>
<html>
<head>
<title>TODO supply a title</title>
<meta charset="EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<script>
	
</script>
<body>
	<!DOCTYPE html>


<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
#wrap {
	width: 300px;
	border: 1px solid red;
	margin: auto
}
</style>
</head>
<body>
	<div id="wrap">
		<!-- enctype = "multipart/form-data" ���ε� ���� �Ӽ��̸�, �ݵ�� post��
	���� �Ϲ����� request���δ� ���̻� jsp������ �Ķ���ͷ� ó���� �� ���⶧����
	apache io or cos.jar �����޾Ƽ� ó�� -->
		<h1>���Ͼ��ε� ����</h1>
		<form method="post" action="ex3_upload.jsp" id="f"
			enctype="multipart/form-data">\
		<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
			<p>
			�ۼ��� : <input type="text" name="writer">
			</p>
			<p>
			���� : <input type="file" name="s_file">
			</p>
			<p>
			<input type="submit" name="send">
			</p>
		</form>
	</div>

</body>
</html></body>
</html>

