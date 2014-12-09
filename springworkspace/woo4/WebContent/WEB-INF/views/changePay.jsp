<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="changePay">

		
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
											<h3 class="box-title">남부금액변경</h3>
											<div class="box-tools pull-right">
												<a href="contract.kosta">
													<button onClick="chkForm();" type="button"
														class="btn btn-success btn-sm">
														<span class="glyphicon glyphicon-floppy-saved"></span>변경
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
												<div class="mailbox table-responsive">

													<table id="tblSort"
														class="table table-mailbox table-striped">
														<thead>
															<tr>


																<th onclick="sortTable('tblSort', 0)"
																	style="cursor: pointer" class="text-center"
																	style="width: 80px">제품번호</th>
																<th onclick="sortTable('tblSort', 1)"
																	style="cursor: pointer" class="text-center">신청처</th>
																<th onclick="sortTable('tblSort', 2)"
																	style="cursor: pointer" class="text-center">회원주소</th>
																<th onclick="sortTable('tblSort', 3)"
																	style="cursor: pointer" class="text-center">계약날짜</th>
																<th onclick="sortTable('tblSort', 4)"
																	style="cursor: pointer" class="text-center">납입방법</th>
																<th onclick="sortTable('tblSort', 5)"
																	style="cursor: pointer" class="text-center">납입은행</th>
																<th onclick="sortTable('tblSort', 6)"
																	style="cursor: pointer" class="text-center">납입계좌</th>
																<th onclick="sortTable('tblSort', 7)"
																	style="cursor: pointer" class="text-center">이체날짜</th>
																<th onclick="sortTable('tblSort', 8)"
																	style="cursor: pointer" class="text-center">납부금액</th>

															</tr>
														</thead>
														<tbody>
															<tr>

																<td class="text-center">abc1</td>
																<td class="text-center">권순길</td>
																<td class="text-center">서울시 관악구 신림동 255-3번지</td>
																<td class="text-center">2014-04-06</td>
																<td class="text-center">무통장입금</td>
																<td class="text-center">우리은행</td>
																<td class="text-center">647-987-120-445</td>
																<td class="text-center">매월 6일</td>
																<td class="text-center">100,000</td>
															</tr>

														</tbody>


													</table>

												</div>

												<div class="col-xs-12">
													<div class="row">
														<div class="col-sm-4">
															<div class="form-group">
																<label>변경될금액</label> <input type="text"
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

			</body>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>