<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>member_idchk</title>
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

<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
	$(document).ready(function() {
		$('#idChk').click(function() {
			var idv = $('#id').val();
			//alert(idv);
			var sendData = "id=" + idv;
			//ajaxSetup : ajax작업의 기본적인 내용, 공통적인 내용을 선언 할 수 있다.
			$.ajaxSetup({
				type : "post",
				url : "idcheck.kosta",
				dataType : "text",
				success : function(msg) {
					$('#chkRes').css('display', 'block').html(msg);
				}
			});
			//ajax처리
			$.ajax({
				data : sendData
			});
			return false;
		});
	});
</script>

</head>
<body>
	<div class="content">
		<form method="post" action="join.kosta">
			<table>
				<tr>
					<td colspan="2">아이디 중복 체크 예제</td>
				</tr>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" id="id"> &nbsp; <input
						type="button" value="중복체크" id="idChk"></td>
				</tr>
				<tr>
					<td colspan="2">
						<div id="chkRes"></div>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>