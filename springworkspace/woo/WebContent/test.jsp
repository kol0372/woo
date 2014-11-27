<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport'>
<title>haduwoori</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Loading Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/prettify.css" rel="stylesheet">

<!-- Loading Flat UI -->
<link href="css/flat-ui.css" rel="stylesheet">
<link href="css/demo.css" rel="stylesheet">


<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />

<!-- Theme style -->
<link href="css/AdminLTE_edit.css" rel="stylesheet" type="text/css" />

<!-- FontAwesome CSS -->
<link
	href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />

<!-- Ionicons -->
<link
	href="//code.ionicframework.com/ionicons/1.5.2/css/ionicons.min.css"
	rel="stylesheet" type="text/css" />

<!-- Bootstrap Datepicker Library CSS -->
<link href="css/datepicker/datepicker3.css" rel="stylesheet"
	type="text/css" />

<!-- 추가 라이브러리 관련 CSS 모두 이 곳에 Import -->

<!-- Bootstrap time Picker -->
<link href="css/timepicker/bootstrap-timepicker.min.css"
	rel="stylesheet" />

</head>

<body class="skin-blue">

	<!-- s : Header 영역 -->
	<header class="header">

		<!-- s : Logo 영역 -->
		<a href="index.html" class="logo"> <!-- Add the class icon to your logo image or logo icon to add the margining -->
			Haduuri AdminMode
		</a>
		<!-- e : Logo 영역 -->

		<nav class="navbar navbar-static-top" role="navigation">
			<div class="hc-container-fluid">

				<a href="#" class="navbar-btn sidebar-toggle hc_sidebar-toggle"
					data-toggle="offcanvas" role="button"> <span class="sr-only">Toggle
						navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>

				<div class="collapse in" aria-expanded="true">
					<ul class="nav navbar-nav">

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" aria-haspopup="true" role="button"
							aria-expanded=""> <i class="fa fa-group"></i> <span
								class="hidden-sm">보안부</span> <b class="caret"></b>
						</a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
								<li role="presentation" class="active"><a tabindex="-1"
									href="#">점검 요청 확인</a></li>
								<li role="presentation"><a tabindex="-1" href="#">출동 기록
										확인</a></li>
							</ul></li>

						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" aria-haspopup="true" role="button"
							aria-expanded="false"> <i class="fa fa-won"></i> <span
								class="hidden-sm">영업부</span> <b class="caret"></b>
						</a>
							<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
								<li role="presentation"><a tabindex="-1" href="#">고객관리</a></li>
								<li role="presentation"><a tabindex="-1" href="#">영업실적관리</a></li>
								<li role="presentation"><a tabindex="-1" href="#">기록조회</a></li>
							</ul></li>

					</ul>
				</div>
			</div>
		</nav>
	</header>


	<footer></footer>
</body>
</html>