<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="contractregister">
			<script>
				function chkForm() {
					alert("저장되었습니다.");
					return false;
				}
			</script>


			</head>

			<body>

				<section id="sidebar" class="col-md-2"
					style="min-height: 949px; background-color: #cccc99;">
					<div>
						<ul class="nav nav-list">
							<li class="nav-header"><a href="schedule.kosta">스케줄 관리</a></li>
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
							<li><a href="y_chooldong.kosta"> 출동기록조회 </a></li>
							<li class="active"><a href="contract.kosta"> 계약관리 </a></li>
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
											<h3 class="box-title">계약관리등록</h3>
											<div class="box-tools pull-right">
												<a href="contract.kosta">
													<button onClick="chkForm();" type="button"
														class="btn btn-success btn-sm">
														<span class="glyphicon glyphicon-floppy-saved"></span>승인
													</button>
												</a> <a href="contract.kosta">
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
										<div class="box-body">
											<div class="row">

												<div class="col-xs-12">
													<div class="row">
														<div class="col-sm-4">
															<div class="form-group">
																<label>제품번호</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>신청자</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>회원주소</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>

														<div class="col-sm-4">
															<div class="bootstrap-datepicker">
																<div class="form-group">
																	<label>계약날짜</label>
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
																<label>납입방법</label> <select class="form-control" name=""
																	id="exam_type">
																	<option value="a">신용카드</option>
																	<option value="b">계좌이체</option>
																	<option value="c">무통장입금</option>
																</select>
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>납입은행(카드회사)</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>납입계좌(카드번호)</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>이체날짜</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>납부금액</label> <input type="text"
																	class="form-control" name="" />
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
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>