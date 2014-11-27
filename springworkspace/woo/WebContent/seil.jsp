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



<link rel="shortcut icon" href="images/favicon.ico">

</head>

<body>
	<!-- 	<div class="bottom-menu"> -->
	<!-- 		<div class="container"></div> -->
	<!-- 	</div> -->
	<header>

		<div class="bottom-menu bottom-menu-inverse col-xs-12">

			<div class="navbar-collapse collapse">
				<div class="col-sm-4 col-sm-offset-9">
					<ul class="nav navbar-nav navbar-left">
						<li><a href="../navbar/" data-toggle="modal">김우리</a></li>
						<li><a href="../navbar/" data-toggle="modal">영업부</a></li>
						<li><a href="../navbar/">로그아웃</a></li>
					</ul>
				</div>


				<div class="col-sm-12">
					<nav class="navbar navbar-default" role="navigation">

						<div class="collapse navbar-collapse" id="navbar-collapse-01">

							<!-- 드롭 -->
								<ul class="nav navbar-nav">

									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown" aria-haspopup="true" role="button"
										aria-expanded=""> <i class="fa fa-group"></i> <span
											class="hidden-sm">보안부</span> <b class="caret"></b>
									</a>
										<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
											<li role="presentation" class="active"><a tabindex="-1"
												href="#">점검요청조회</a></li>
											<li role="presentation"><a tabindex="-1" href="#">출동기록입력</a></li>
											<li role="presentation"><a tabindex="-1" href="#">출동기록조회</a></li>
										</ul></li>


									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown" aria-haspopup="true" role="button"
										aria-expanded=""> <i class="fa fa-group"></i> <span
											class="hidden-sm">영업부</span> <b class="caret"></b>
									</a>
										<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
											<li role="presentation" class="active"><a tabindex="-1"
												href="#">고객관리</a></li>
											<li role="presentation"><a tabindex="-1" href="#">상담페이지</a></li>
											<li role="presentation"><a tabindex="-1" href="#">영업실적관리</a></li>
											<li role="presentation"><a tabindex="-1" href="#">출동기록조회</a></li>
											<li role="presentation"><a tabindex="-1" href="#">계약관리</a></li>
										</ul></li>



								</ul>

							<!-- 드롭 -->



							<form class="navbar-form navbar-right" action="#" role="search">
								<div class="form-group">
									<div class="input-group">
										<input class="form-control" id="navbarInput-01" type="search"
											placeholder="Search"> <span class="input-group-btn">
											<button type="submit" class="btn">
												<span class="fui-search"></span>
											</button>
										</span>
									</div>
								</div>
							</form>
							<!-- 찾기 -->

						</div>

					</nav>
				</div>






			</div>

		</div>
	</header>

	<section id="sidebar" class="col-md-2"
		style="min-height: 949px; background-color: #cccc99;">


		<div>



			<ul class="nav nav-list">
				<li class="nav-header"><a href="#fakelink">스케줄 관리</a></li>
				<li class="divider"></li>
				<li class="nav-header">보안부</li>

				<li><a href="#fakelink"> 점검요청조회 </a></li>

				<li><a href="#fakelink"> 출동기록입력 </a></li>
				<li><a href="#fakelink"> 출동기록조회 </a></li>
				<li class="divider"></li>
				<li class="nav-header">영업부</li>
				<li><a href="#fakelink"> 고객관리 </a></li>
				<li><a href="#fakelink"> 상담페이지 </a></li>
				<li><a href="#fakelink"> 영업실적관리 </a></li>
				<li><a href="#fakelink"> 출동기록조회 </a></li>
				<li><a href="#fakelink"> 계약관리 </a></li>


			</ul>
		</div>


	</section>

	<section Id="main" class="col-md-9">
		<div>

			<aside class="right-side">



				<!-- s : Content 영역 -->
				<section class="content col-xs-12">


					<div class="col-xs-12">

						<!-- .box는 Bootstrap의 .panel에 해당된다. -->
						 <div class="box">
                            
                            	<!-- e : Box Body 영역 -->
							<div class="page-header">
								<h1>
									<b> HADU WOORI </b> <small> 판매기록현황</small>
								</h1>
							</div>
							<div class="box-body table-responsive">
								<div class="box box-solid">
									<div class="box-header">
										<i class="fa fa-bar-chart-o"></i>
										<h3 class="box-title">판 매 기 록 현 황</h3>
										<div class="box-tools pull-right">
											<button class="btn btn-default btn-sm" data-widget="collapse">
												<i class="fa fa-minus"></i>
											</button>
											<button class="btn btn-default btn-sm" data-widget="remove">
												<i class="fa fa-times"></i>
											</button>
										</div>

									</div>
									<!-- /.box-header -->
									<div class="box-body">
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success"
												role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 40%">
												14.8월판매기록 <span class="sr-only">40% Complete
													(success)</span>
											</div>
											40퍼센트 달성!
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-info"
												role="progressbar" aria-valuenow="20" aria-valuemin="0"
												aria-valuemax="100" style="width: 20%">
												14.9월판매기록 <span class="sr-only">20% Complete</span>
											</div>
											20퍼센트 달성!
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-warning"
												role="progressbar" aria-valuenow="60" aria-valuemin="0"
												aria-valuemax="100" style="width: 60%">
												14.10월판매기록 <span class="sr-only">60% Complete
													(warning)</span>
											</div>
											60퍼센트 달성!
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-danger"
												role="progressbar" aria-valuenow="80" aria-valuemin="0"
												aria-valuemax="100" style="width: 80%">
												14.11월판매기록 <span class="sr-only">80% Complete
													(danger)</span>
											</div>
											80퍼센트 달성!
										</div>
										<!-- /.row -->
									</div>
									<!-- /.box-body -->                           	
                            </div>
                            </div>
                            
                                
                            </div><!-- /.box -->
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</section>
				<!-- /.content -->
				<!-- e : Content 영역 -->

			</aside>
			<!-- /.right-side -->
		</div>
	</section>
	<footer></footer>
	<script src="js/jquery-1.8.3.min.js"></script>
	<script src="js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="js/jquery.ui.touch-punch.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-select.js"></script>
	<script src="js/bootstrap-switch.js"></script>
	<script src="js/flatui-checkbox.js"></script>
	<script src="js/flatui-radio.js"></script>
	<script src="js/flatui-fileinput.js"></script>
	<script src="js/holder.js"></script>
	<script src="js/jquery.tagsinput.js"></script>
	<script src="js/jquery.placeholder.js"></script>
	<script src="js/typeahead.js"></script>
	<script src="bootstrap/js/google-code-prettify/prettify.js"></script>
	<script src="js/application.js"></script>
</body>
</html>