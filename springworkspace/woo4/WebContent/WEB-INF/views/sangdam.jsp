<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sangdam">





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
						<li class="active"><a href="sangdam.kosta"> 상담페이지 </a></li>
						<li><a href="sangdam_jaju.kosta"> --자주하는질문 </a></li>
						<li><a href="sangdam_moo_ut.kosta"> --무엇이든물어보세요Q/A </a></li>
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
										<h3 class="box-title">
											<b>[상 담 페 이 지]</b>
										</h3>
									</div>
									<!-- /.box-header -->
									<!-- e : Box Header 영역 -->
									<!-- s : Box Body 영역 -->
									<div class="box-body">
										<div class="box-header">
											<h3 class="box-title">자주하는질문</h3>
											<div class="box-tools pull-right">
												<a href="sangdam_deungrok.kosta"
													class="btn btn-sm btn-primary">질문등록</a>
											</div>
										</div>
										<div class="box-body table-responsive">
											<table id="example1" class="table table-bordered table-hover">
												<!-- id="example1" : 목록수 조정 가능 플러그인 사용 -->
												<thead>
													<tr>



														<th>리스트번호</th>
														<th>질문내용</th>
														<th>질문에대한답변</th>
														<th>조회수</th>
													</tr>
												</thead>
												<tbody>
													<tr>

														<td>1</td>
														<td>이거왜해야되는거에요?</td>
														<td>나도몰라</td>
														<td>178</td>
													</tr>
													<tr>

														<td>2</td>
														<td>왜하는건지모르겠네</td>
														<td>미쳤다!!!!</td>
														<td>236</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="box-header">
											<h3 class="box-title">무엇이든물어보세요 Q&A</h3>
										</div>
										<div class="box-body table-responsive">
											<table id="example1" class="table table-bordered table-hover">
												<!-- id="example1" : 목록수 조정 가능 플러그인 사용 -->
												<thead>
													<tr>

														<th>번호</th>
														<th>회원ID</th>
														<th>제목</th>
														<th>내용</th>
														<th>날짜</th>
														<th>조회수</th>
													</tr>
												</thead>
												<tbody>
													<tr>

														<th>1</th>
														<th>young</th>
														<th><a href="sangdam_detail.kosta">문의드립니다</a></th>
														<th>왜케빡쎄여</th>
														<th>2014.11.25</th>
														<th>3454</th>
													</tr>
													<tr>

														<th>2</th>
														<th>sub</th>
														<th><a href="sangdam_detail.kosta">아두이노가</a></th>
														<th>잘안되네여</th>
														<th>2014.11.25</th>
														<th>3839</th>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="box-footer clearfix" align="center">
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
									<!-- /.box -->
									<!-- /.col -->
								</div>
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
