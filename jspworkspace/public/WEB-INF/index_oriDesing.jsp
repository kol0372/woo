<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp</title>
<link href="css/base.css" rel="stylesheet" type="text/css">
<style type="text/css">
	#wrap #topcont #logo {
		margin-top:10px;
		margin-left:20px;
		width: 120px; 
		float: left;/*왼쪽 정렬*/
	}
	#topcont {
		width: 100%; 
		height: 55px;
	}
	#wrap #topcont #t_menu{ margin-right: 50px;}
	#wrap #topcont #t_menu ul {
	 margin-top:8px;
	 margin-left:10px;
	}
	#wrap #topcont #t_menu ul li{
		float: left; margin-left:10px;
	}
	#wrap #topcont #t_menu{
		width: 300px; 
		float: right;/*오른쪽 정렬*/
	}
	#wrap #top #nav{
	width:1000px; height:30px;
	background-color:#007bbe;
	padding-left: 120px;
	
	clear: both;
	}
	#wrap #top #nav ul li {
		float: left;
	}
</style>
<script type="text/javascript">
	function chmenu(img,num){
		//alert(img.src.replace(".png","_on.png")+":"+num);
		// menu01.png 에서 .png를 찾아서 _on.png로 변경하기 위해서 replace()를 사용.
		if(num == 1){
			img.src = img.src.replace(".png","_on.png");
		}else if(num == 2){
			img.src = img.src.replace("_on.png",".png");
		}
	}
</script>
</head>
<body>
	<div id="wrap">
	<!--  탑 영역  -->
		<div id="top">
			<!--  탑로고및 탑메뉴영역  -->
			<div id="topcont">
				<div id="logo">
					<a href=""><img src="img/logo.png"></a>
				</div>
				<div id="t_menu">
					<ul>
						<li><a href="">Home</a>|</li>
						<li><a href="">Login</a>|</li>
						<li><a href="">Join</a>|</li>
						<li><a href="">고객지원</a>|</li>
						<li><a href="">사이트맵</a></li>
					</ul>
				</div>
			</div>
			<!-- 메뉴영역 -->
			<div id="nav">
				<ul>
				<!-- onmouseover : 마우스를 올렸을 때, onmouseout :마우스를 내렸을 때  -->
					<li><a href=""><img src="img/menu1.png" alt="KOSTA50기소개" 
					onmouseover="chmenu(this,'1')" onmouseout="chmenu(this,'2')"></a></li>
					<li><a href=""><img src="img/menu2.png" alt="스터디게시판" onmouseover="chmenu(this,'1')" onmouseout="chmenu(this,'2')"></a></li>
					<li><a href=""><img src="img/menu3.png" alt="포토폴리오" onmouseover="chmenu(this,'1')" onmouseout="chmenu(this,'2')"></a></li>
					<li><a href=""><img src="img/menu4.png" alt="질문과답변" onmouseover="chmenu(this,'1')" onmouseout="chmenu(this,'2')"></a></li>
					<li><a href=""><img src="img/menu5.png" alt="겔러리" onmouseover="chmenu(this,'1')" onmouseout="chmenu(this,'2')"></a></li>
					<li><a href=""><img src="img/menu6.png" alt="면접후기" onmouseover="chmenu(this,'1')" onmouseout="chmenu(this,'2')"></a></li>
					<li><a href=""><img src="img/menu7.png" alt="뉴스&공지" onmouseover="chmenu(this,'1')" onmouseout="chmenu(this,'2')"></a></li>
				</ul>
			</div>
		</div>
		<div id="banner1">
			<img src="img/kostabanner.PNG">
		</div>
		<div id="content"></div>
		<div id="footer"></div>
	</div>
</body>
</html>