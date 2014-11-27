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
								<h3 class="box-title">점검요청조회</h3>

							</div>
							<!-- /.box-header -->
							<!-- e : Box Header 영역 -->

							<!-- s : Box Body 영역 -->
							<div class="box-body">


								<div class="demo-row">
									<div class="demo-content-wide">
										<div class="table-responsive">
											<table class="table table-bordered">
												<thead>
													<tr>
														<th></th>
														<th>접수번호</th>
														<th>회원ID</th>
														<th>접수내용</th>
														<th>방문날짜</th>
														<th>방문직원명</th>
														<th>현재진행상태</th>
													</tr>
												</thead>
												<tbody>
													<tr>
														<td><label class="checkbox" for="checkbox1">
																<input type="checkbox" value="" id="checkbox1"
																data-toggle="checkbox">
														</label></td>
														<td>1</td>
														<td>Youngsub.lee</td>
														<td>침입 및 도난</td>
														<td>2014.11.25</td>
														<td>권순길(대리)</td>
														<td>O</td>
													</tr>
													<tr>
														<td><label class="checkbox" for="checkbox1">
																<input type="checkbox" value="" id="checkbox2"
																data-toggle="checkbox">
														</label></td>
														<td>2</td>
														<td>Youngsub</td>
														<td>도난 및 고장</td>
														<td>2014.11.25</td>
														<td>김종규(대리)</td>
														<td>X</td>
													</tr>
													<tr>
														<td><label class="checkbox" for="checkbox1">
																<input type="checkbox" value="" id="checkbox3"
																data-toggle="checkbox">
														</label></td>
														<td>3</td>
														<td>The Godfather: Part II</td>
														<td>Crime, Drama</td>
														<td>427,132</td>
														<td>1974</td>
														<td class="text-center">9.0</td>
													</tr>
													<tr>
														<td><label class="checkbox no-label"
															for="checkbox-table-5"><input type="checkbox"
																value="" id="checkbox-table-5" data-toggle="checkbox"></label></td>
														<td>4</td>
														<td>Pulp Fiction</td>
														<td>Crime, Drama</td>
														<td>719,280</td>
														<td>1994</td>
														<td class="text-center">8.9</td>
													</tr>
													<tr>
														<td><label class="checkbox no-label"
															for="checkbox-table-6"><input type="checkbox"
																value="" id="checkbox-table-6" data-toggle="checkbox"></label></td>
														<td>5</td>
														<td>The Good, the Bad and the Ugly</td>
														<td>Adventure, Western</td>
														<td>218,887</td>
														<td>1966</td>
														<td class="text-center">8.9</td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
									<div class="box-footer clearfix">
										<div class="pagination">
											<ul>
												<li class="previous"><a href="#fakelink"
													class="fui-arrow-left"></a></li>
												<li class="active"><a href="#fakelink">1</a></li>
												<li><a href="#fakelink">2</a></li>
												<li><a href="#fakelink">3</a></li>
												<li><a href="#fakelink">4</a></li>
												<li><a href="#fakelink">5</a></li>
												<li><a href="#fakelink">6</a></li>
												<li><a href="#fakelink">7</a></li>
												<li><a href="#fakelink">8</a></li>
												<li><a href="#fakelink">9</a></li>
												<li><a href="#fakelink">10</a></li>

												<li class="next"><a href="#fakelink"
													class="fui-arrow-right"></a></li>
											</ul>
										</div>


									</div>
								</div>





							</div>
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