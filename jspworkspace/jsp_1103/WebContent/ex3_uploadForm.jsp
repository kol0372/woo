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
		<!-- enctype = "multipart/form-data" 업로드 관련 속성이며, 반드시 post로
	전송 일반적인 request으로는 더이상 jsp측에서 파라미터로 처리할 수 없기때문에
	apache io or cos.jar 제공받아서 처리 -->
		<h1>파일업로드 예제</h1>
		<form method="post" action="ex3_upload.jsp" id="f"
			enctype="multipart/form-data">\
		<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
			<p>
			작성자 : <input type="text" name="writer">
			</p>
			<p>
			파일 : <input type="file" name="s_file">
			</p>
			<p>
			<input type="submit" name="send">
			</p>
		</form>
	</div>

</body>
</html></body>
</html>

