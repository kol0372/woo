<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="seil3">
		
		
	<section id="sidebar" class="col-md-2"
		style="min-height: 949px; background-color: #cccc99;">
		<div>
			<ul class="nav nav-list">
				<li class="nav-header">
				<a href="schedule.kosta">스케줄 관리</a></li>
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
				<li class="active"><a href="seil.kosta"> 영업실적관리 </a></li>
				<li><a href="y_chooldonglist.kosta"> 출동기록조회 </a></li>
				<li><a href="contract.kosta"> 계약관리 </a></li>
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
									<b> HADU WOORI </b> <small> 현재기록현황입니다</small>
								</h1>
							</div>
							<div class="col-xs-12">
								<ul class="nav navbar-nav">

								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" aria-haspopup="true" role="button"
									aria-expanded=""> <i class="fa fa-group"></i> <span
										class="hidden-sm">부트스트랩</span> <b class="caret"></b>
								</a>
									<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
										<li role="presentation"><a tabindex="-1"
											href="seil2.kosta">판매기록</a></li>
										<li role="presentation"><a tabindex="-1"
											href="chooldong.kosta">출동기록입력</a></li>
										<li role="presentation"><a tabindex="-1"
											href="chooldonglist.kosta">출동기록조회</a></li>
									</ul></li>


								<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" aria-haspopup="true" role="button"
											aria-expanded=""> <i class="fa fa-group"></i> <span
												class="hidden-sm">high chart</span> <b class="caret"></b>
										</a>
											<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
												<li role="presentation"><a tabindex="-1"
													href="seil5.kosta">매출통계</a></li>
												<li role="presentation"><a tabindex="-1"
													href="seil6.kosta">고객가입수</a></li>
												<li role="presentation"><a tabindex="-1"
													href="sei7l.kosta">충동 및 점검</a></li>
											</ul></li>



							</ul>
							</div>
							<div class="box-body table-responsive">
								<div class="box box-solid">
									<div class="box-header">
										<i class="fa fa-bar-chart-o"></i>
										<h3 class="box-title">매출기록현황</h3>
									</div>
									<!-- /.box-header -->
									<div class="box-body">
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success"
												role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 40%">
												14.8월매출기록
												<span class="sr-only"></span>
												<b style="color: black">40% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-info"
												role="progressbar" aria-valuenow="20" aria-valuemin="0"
												aria-valuemax="100" style="width: 20%">
												14.9월매출기록
												<span class="sr-only"></span>
												<b style="color: black">20% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-warning"
												role="progressbar" aria-valuenow="60" aria-valuemin="0"
												aria-valuemax="100" style="width: 60%">
												14.10월매출기록
												<span class="sr-only"></span>
												<b style="color: black">60% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-danger"
												role="progressbar" aria-valuenow="80" aria-valuemin="0"
												aria-valuemax="100" style="width: 80%">
												14.11월매출기록
												<span class="sr-only"></span>
												<b style="color: black">80% Complete(success)</b>
											</div>
										</div>
										<!-- /.row -->
									</div>
									<!-- /.box-body -->                           	
                            	</div>
                            	<div style="height: 50px"></div>
                            	<div class="box box-solid">
									<div class="box-header">
										<i class="fa fa-bar-chart-o"></i>
										<h3 class="box-title">고객계약가입현황</h3>
									</div>
									<!-- /.box-header -->
									<div class="box-body">
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success"
												role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 20%">
												14.08가입자수
												<span class="sr-only"></span>
												<b style="color: black">20% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-info"
												role="progressbar" aria-valuenow="20" aria-valuemin="0"
												aria-valuemax="100" style="width: 30%">
												14.09가입자수
												<span class="sr-only"></span>
												<b style="color: black">30% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-warning"
												role="progressbar" aria-valuenow="60" aria-valuemin="0"
												aria-valuemax="100" style="width: 40%">
												14.10가입자수
												<span class="sr-only"></span>
												<b style="color: black">40% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-danger"
												role="progressbar" aria-valuenow="80" aria-valuemin="0"
												aria-valuemax="100" style="width: 50%">
												14.11가입자수
												<span class="sr-only"></span>
												<b style="color: black">50% Complete(success)</b>
											</div>
										</div>
										<!-- /.row -->
									</div>
									<!-- /.box-body -->                           	
                            	</div>
                            	<div style="height: 50px"></div>
                            	<div class="box box-solid">
									<div class="box-header">
										<i class="fa fa-bar-chart-o"></i>
										<h3 class="box-title">출동횟수현황</h3>
									</div>
									<!-- /.box-header -->
									<div class="box-body">
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success"
												role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 80%">
												14.08출동횟수
												<span class="sr-only"></span>
												<b style="color: black">80% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-info"
												role="progressbar" aria-valuenow="20" aria-valuemin="0"
												aria-valuemax="100" style="width: 70%">
												14.09출동횟수
												<span class="sr-only"></span>
												<b style="color: black">70% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-warning"
												role="progressbar" aria-valuenow="60" aria-valuemin="0"
												aria-valuemax="100" style="width: 50%">
												14.10출동횟수
												<span class="sr-only"></span>
												<b style="color: black">50% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-danger"
												role="progressbar" aria-valuenow="80" aria-valuemin="0"
												aria-valuemax="100" style="width: 80%">
												14.11출동횟수
												<span class="sr-only"></span>
												<b style="color: black">80% Complete(success)</b>
											</div>
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
</div>
	</tiles:putAttribute>
</tiles:insertDefinition>