<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="request">





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
																<th><label class="checkbox no-label toggle-all"
																	for="checkbox-table-1"><input type="checkbox"
																		value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>


																<th class="text-center">접수번호</th>
																<th class="text-center">서비스번호</th>
																<th class="text-center">접수내용</th>
																<th class="text-center">회원주소</th>
																<th class="text-center">접수날짜</th>

																<th class="text-center">방문날짜</th>
																<th class="text-center">방문직원명</th>
																<th class="text-center">현재진행상태</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-2"><input type="checkbox"
																		value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
																<td>1</td>
																<td>Youngsub.lee</td>
																<td>부품 노후화 교체 요청</td>
																<th>경기도 성남시 수정구 우리동</th>
																<td>2014.11.23</td>
																<td>2014.11.25</td>
																<td>권순길(대리)</td>
																<td class="text-center">진행중</td>
															</tr>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-3"><input type="checkbox"
																		value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
																<td>2</td>
																<td>Youngsub</td>
																<td>고장(센서 오작동)</td>
																<th>경기도 성남시 수정구 우리동</th>
																<td>2014.11.23</td>
																<td>2014.11.25</td>
																<td>김종규(대리)</td>
																<td class="text-center">완료</td>
															</tr>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-4"><input type="checkbox"
																		value="" id="checkbox-table-4" data-toggle="checkbox"></label></td>
																<td>3</td>
																<td>ffdsfe12</td>
																<td>고장(센서 이상)</td>
																<th>경기도 성남시 수정구 우리동</th>
																<td>2014.11.23</td>
																<td>2014.11.26</td>
																<td>김종규(대리)</td>
																<td class="text-center">진행중</td>
															</tr>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-5"><input type="checkbox"
																		value="" id="checkbox-table-5" data-toggle="checkbox"></label></td>
																<td>4</td>
																<td>dldlgh43</td>
																<td>부품 이상 교체</td>
																<th>경기도 성남시 수정구 우리동</th>
																<td>2014.11.23</td>
																<td>2014.11.27</td>
																<td>이영섭(대리)</td>
																<td class="text-center">진행중</td>
															</tr>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-6"><input type="checkbox"
																		value="" id="checkbox-table-6" data-toggle="checkbox"></label></td>
																<td>5</td>
																<td>lew456</td>
																<td>센서 노후화</td>
																<th>경기도 성남시 수정구 우리동</th>
																<td>2014.11.23</td>
																<td>2014.11.27</td>
																<td>김종규(대리)</td>
																<td class="text-center">진행중</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
											<div class="pull-right">
												<a href="requestupdate.kosta">
													<button type="button" class="btn btn-primary btn-sm">
														<span class="fa fa-plus"></span> 수정
													</button>
												</a>
												<!-- 									<a href="request.kosta"> -->
												<!-- 										<button type="button" class="btn btn-primary btn-sm"> -->
												<!-- 											<span class="fa fa-plus"></span> 삭제 -->
												<!-- 										</button> -->
												<!-- 									</a> -->
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
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
