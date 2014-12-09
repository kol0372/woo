<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="schedule">



			<link rel="stylesheet" href="css/calendar.css">

			<style type="text/css">
.btn-twitter {
	padding-left: 30px;
	background: rgba(0, 0, 0, 0)
		url(https://platform.twitter.com/widgets/images/btn.27237bab4db188ca749164efd38861b0.png)
		-20px 6px no-repeat;
	background-position: -20px 11px !important;
}

.btn-twitter:hover {
	background-position: -20px -18px !important;
}
</style>
			</head>
			<script type="text/javascript">
				$(document).ready(function() {

					$('#today').click(function() {

					});
					//저절로투데이 누르게...
					$('#today').trigger("click");
				});
			</script>
			<body>
				<section id="sidebar" class="col-md-2"
					style="min-height: 949px; background-color: #cccc99;">
					<div>
						<ul class="nav nav-list">
							<li class="active"><a class="active" href="schedule.kosta">스케줄
									관리</a></li>
							<li class="nav-header"><a href="gogo.kosta">출동</a></li>
							<li class="divider"></li>
							<li class="nav-header">보안부</li>
							<li><a href="request.kosta"> 점검요청조회 </a></li>
							<li><a href="chooldong.kosta"> 출동기록입력 </a></li>
							<li><a href="chooldonglist.kosta"> 출동기록조회 </a></li>
							<li class="divider"></li>
							<li class="nav-header">영업부</li>
							<li><a href="client.kosta"> 고객관리 </a></li>
							<li><a href="sangdam.kosta"> 상담페이지 </a></li>
							<li><a href="seil.kosta"> 영업실적관리 </a></li>
							<li><a href="y_chooldonglist.kosta"> 출동기록조회 </a></li>
							<li><a href="contract.kosta"> 계약관리 </a></li>
						</ul>
					</div>
				</section>
				<section Id="main" class="col-md-9">
					<div>
						<aside class="right-side">
							<section class="content col-xs-12">
								<div class="col-xs-12">
									<div class="box">
										<div class="box-header">
											<h3 class="box-title">
												<b>[스 케 줄 관 리]</b>
											</h3>
										</div>
										<div class="container col-xs-12">


											<div class="page-header">



												<div class="pull-right form-inline">
													<div class="btn-group">
														<button class="btn btn-primary" data-calendar-nav="prev"><<
															Prev</button>
														<button class="btn" data-calendar-nav="today" id="today">Today</button>
														<button class="btn btn-primary" data-calendar-nav="next">Next
															>></button>
													</div>
													<div class="btn-group">
														<button class="btn btn-warning" data-calendar-view="year">Year</button>
														<button class="btn btn-warning active"
															data-calendar-view="month">Month</button>
														<button class="btn btn-warning" data-calendar-view="week">Week</button>
														<button class="btn btn-warning" data-calendar-view="day">Day</button>
													</div>
												</div>


											</div>

											<div class="row">
												<div class="span7">
													<div id="calendar"></div>
												</div>
												<div class="span3"></div>
											</div>

											<div class="clearfix"></div>
											<br> <br> <br> <br>

											<div id="disqus_thread"></div>
											<noscript>
												Please enable JavaScript to view the <a
													href="http://disqus.com/?ref_noscript">comments powered
													by Disqus.</a>
											</noscript>

											<div class="modal hide fade" id="events-modal">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal"
														aria-hidden="true">&times;</button>
													<h3>Event</h3>
												</div>
												<div class="modal-body" style="height: 400px"></div>
												<div class="modal-footer">
													<a href="#" data-dismiss="modal" class="btn">Close</a>
												</div>
											</div>

											<script type="text/javascript"
												src="components/jquery/jquery.min.js"></script>
											<script type="text/javascript"
												src="components/underscore/underscore-min.js"></script>
											<script type="text/javascript"
												src="components/bootstrap2/js/bootstrap.min.js"></script>
											<script type="text/javascript"
												src="components/jstimezonedetect/jstz.min.js"></script>
											<script type="text/javascript" src="js/calendar.js"></script>
											<script type="text/javascript" src="js/app.js"></script>
										</div>
									</div>
								</div>
							</section>
						</aside>
					</div>
				</section>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
