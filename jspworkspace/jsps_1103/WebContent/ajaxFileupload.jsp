<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- 2014. 11. 3. -->
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="EUC-KR">
<title>2014/11/03, 10:46</title>
<style>
progress {
	display: none;
}
</style>
<script>
	var progress = null;
	// �ּ���) $(document).ready(function(){}); ���� 
	window.onload = function() {
		progress = document.querySelector("progress");
		// upload ��ư�� Ŭ���ϸ� ������ ���ε� �Ѵ�.
		// $(button) - document.querySelector
		document.querySelector("button").onclick = function() {
			fileUpload();
		};
	};

	function fileUpload() {
        var uploadFile = document.querySelector("input");
        var xhr = new XMLHttpRequest();
        // ���ε� ���� -> xhr.download.onloadstart�� �ϸ� download
        xhr.upload.onloadstart = function (e) {
            progress.value = 0;
            // progress�� ��Ÿ���� none���� ���̵��� ����!
            progress.style.display = "inline";
        };
        // ���ε� ���߿� ��� �߻� -> xhr.download.onprogress �ϸ� download
        xhr.upload.onprogress = function (e) {
            // e.total : ��ü ���ε� ũ��, e.loaded : ���� ���ε�� ũ��
            progress.value =e.loaded / e.total;
            //console.log(progress.value);
        };
        // ���ε� ���� �� �߻� -> xhr.download.onload �ϸ� download
        xhr.upload.onload = function (e) {
            progress.style.display = "none";
        };

        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
            	console.log(xhr.responseText);
                document.querySelector("div").innerHTML =xhr.responseText;
            }
        };
        xhr.open("POST", "uploadService.jsp", true);
        xhr.setRequestHeader("X-File-Name",encodeURIComponent(uploadFile.files[0].name));
        xhr.send(uploadFile.files[0]);
    }
</script>
</head>
<body>
	<h1>XMLHttpRequest Level2�� �̿��� ���� ���ε�</h1>
	<input type="file">
	<button>upload</button>
	<progress>0%</progress>
	<br>
	<div></div>
<img src="<%=application.getContextPath()%>/upload/unjung.jpg">
</body>
</html>









