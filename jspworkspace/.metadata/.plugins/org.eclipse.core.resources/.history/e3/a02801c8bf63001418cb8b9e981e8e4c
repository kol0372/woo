<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!--2014. 11. 3.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<style>
progress {
	display: none;
}
</style>
<script>
	$(document).ready(function() {
		var proval = $('progress').val;
		$('button').click(function() {
			fileUpload();
		});
		function fileUpload() {
			//var uploadFile = $('input');
			var xhr = new XMLHttpRequest();
			
			xhr.upload.onloadstart = function() {
				proval = 0;
				$('progress').css('display', 'inline');
			};
			xhr.upload.onprogress = function(e) {
				proval = e.loaded / e.total;
			};
			xhr.upload.onload = function() {
				$('progress').css('display', 'none');
			};
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					$('div').html(xhr.responseText);
				};
			};
			xhr.open("POST","uploadService1103.jsp",true);
			xhr.setRequestHeader("X-File-Name",
					encodeURIComponent($('input').prop('files')[0].name));
			//prop제일처음에 있는 속서을 가져옴.
			xhr.send($('input').prop('files')[0]);
		};
		
	});
</script>
</head>
<body>
	<h1>XMLHttpRequest Level2를 이용한 파일 업로드</h1>
	<input type="file">
	<button>upload</button>
	<progress>0%</progress>
	<div></div>
</body>