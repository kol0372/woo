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

							<!-- s : Box Header 영역 -->
							<div class="box-header">
								<h3 class="box-title">출동기록입력</h3>
								<div class="box-tools pull-right">
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-floppy-saved"></span> 저장
									</button>
									<a href="admin_sm_rs_list.jsp">
										<button type="button" class="btn btn-default btn-sm">
											<span class="glyphicon glyphicon-remove"></span> 취소
										</button>
									</a>
								</div>
							</div>
							<!-- /.box-header -->
							<!-- /.box-header -->
							<!-- e : Box Header 영역 -->

							<!-- s : Box Body 영역 -->
							<!-- s : Box Body 영역 -->
							<div class="box-body">
								<div class="row">

									<div class="col-xs-12">
										<div class="row">
											<div class="col-sm-4">
												<div class="form-group">
													<label>제품번호</label> <input type="text" class="form-control"
														name="" />
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>신청자</label> <input type="text" class="form-control"
														name="" />
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>회원주소</label> <input type="text" class="form-control"
														name="" />
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>직원번호</label> <input type="text" class="form-control"
														name="" />
												</div>
											</div>

											<div class="col-sm-4">
												<div class="bootstrap-datepicker">
													<div class="form-group">
														<label>방문날짜</label>
														<div class="form-group">
															<div class="input-group">
																<span class="input-group-btn">
																	<button class="btn" type="button">
																		<span class="fui-calendar"></span>
																	</button>
																</span> <input type="text" class="form-control"
																	value="14 March, 2013" id="datepicker-01" />
															</div>
														</div>
													</div>
													<!-- /.form group -->
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>방문내용</label> <input type="text" class="form-control"
														name="" />
												</div>
											</div>

											<div class="col-sm-4">
												<!-- select -->
												<div class="form-group">
													<label>분류</label> <select class="form-control" name=""
														id="exam_type">
														<option value="a">출동</option>
														<option value="b">A/S</option>
													</select>
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>직원이름</label> <input type="text" class="form-control"
														name="" />
												</div>
											</div>

										</div>
									</div>
								</div>
								<!-- /.row -->
							</div>
							<!-- /.box-body -->
							<!-- /.box -->
						</div>
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