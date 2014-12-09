<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="requestupdate">

	<section id="sidebar" class="col-md-2"
		style="min-height: 949px; background-color: #cccc99;">
		<div>
			<ul class="nav nav-list">
				<li class="nav-header"><a href="schedule.kosta">스케줄 관리</a></li>
				<li class="nav-header"><a href="gogo.kosta">출동</a></li>
				<li class="divider"></li>
				<li class="nav-header">보안부</li>
				<li class="active"><a href="request.kosta"> 점검요청조회 </a></li>
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
				<!-- s : Content 영역 -->
				<section class="content col-xs-12">
					<div class="col-xs-12">
						<!-- .box는 Bootstrap의 .panel에 해당된다. -->
						<div class="box">
							<!-- s : Box Header 영역 -->
							<div class="box-header">
								<h3 class="box-title">점검요청 기록 수정</h3>
							</div>
							<!-- /.box-header -->
							<!-- e : Box Header 영역 -->
							<!-- s : Box Body 영역 -->
							<div class="box-body">
								<div class="row">
									<div class="col-xs-12">
										<div class="row">
											<div class="col-sm-4">
												<div class="form-group">
													<label>접수번호</label> <input type="text" value="접수번호"
														disabled="disabled" class="form-control">
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>회원ID</label> <input type="text" value="회원ID"
														disabled="disabled" class="form-control">
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>접수내용</label> <input type="text" value="접수내용"
														disabled="disabled" class="form-control">
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
																	value="14 March, 2014" id="datepicker-01" />
															</div>
														</div>
													</div>
													<!-- /.form group -->
												</div>
											</div>
											<div class="col-sm-4">
												<!-- select -->
												<div class="form-group">
													<label>방문직원명</label> <select class="form-control" name=""
														id="exam_type">
														<option value="a">권순길(대리)</option>
														<option value="b">김종규(대리)</option>
													</select>
												</div>
											</div>
											<div class="col-sm-4">
												<!-- select -->
												<div class="form-group">
													<label>점검진행상태</label> <select class="form-control" name=""
														id="exam_type">
														<option value="a">진행중</option>
														<option value="b">완료</option>
														<option value="b">취소</option>
													</select>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!-- /.row -->
							</div>
							<div class="pull-right">
								<a href="request.kosta">
									<button type="button" class="btn btn-primary btn-sm btn-sm-offset-4">
										<span class="fa fa-plus"></span> 취소
									</button>
								</a>
							</div>							
							<div class="pull-right-md-offset-4">
								<a href="request.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> 수정
									</button>
								</a>
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
	
</div>
	</tiles:putAttribute>
</tiles:insertDefinition>