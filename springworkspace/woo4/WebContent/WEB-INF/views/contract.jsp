<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="contract">

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
			<li><a href="y_chooldonglist.kosta"> 출동기록조회 </a></li>
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
							<h3 class="box-title">계약신청</h3>

						</div>
						<!-- /.box-header -->
						<!-- e : Box Header 영역 -->

						<!-- s : Box Body 영역 -->
						<div class="box-body">



							<!-- s : 테이블 본체 -->
							<div class="row">
								<div class="col-xs-12">

									<div class="mailbox table-responsive">

										<table id="tblSort" class="table table-mailbox table-striped">
											<thead>
												<tr>
													<th><label class="checkbox no-label toggle-all"
														for="checkbox-table-1"><input type="checkbox"
															value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>


													<th onclick="sortTable('tblSort', 0)"
														style="cursor: pointer" class="text-center"
														style="width: 80px">제품번호</th>
													<th onclick="sortTable('tblSort', 1)"
														style="cursor: pointer" class="text-center">신청처</th>
													<th onclick="sortTable('tblSort', 2)"
														style="cursor: pointer" class="text-center">회원주소</th>
													<th onclick="sortTable('tblSort', 3)"
														style="cursor: pointer" class="text-center">신청날짜</th>
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
													<td><label class="checkbox no-label"
														for="checkbox-table-2"><input type="checkbox"
															value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
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
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-3"><input type="checkbox"
															value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
													<td class="text-center">cyberk</td>
													<td class="text-center">김우리</td>
													<td class="text-center">서울시 금천구 우리동 300-5번지</td>
													<td class="text-center">2014-04-08</td>
													<td class="text-center">자동이체</td>
													<td class="text-center">국민은행</td>
													<td class="text-center">110-987-120-445</td>
													<td class="text-center">매월 20일</td>
													<td class="text-center">100,000</td>
												</tr>
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-4"><input type="checkbox"
															value="" id="checkbox-table-4" data-toggle="checkbox"></label></td>
													<td class="text-center">tieee</td>
													<td class="text-center">아이유</td>
													<td class="text-center">성남시 서현구 이유동 500-3번지</td>
													<td class="text-center">2014-05-16</td>
													<td class="text-center">무통장입금</td>
													<td class="text-center">신한은행</td>
													<td class="text-center">990-987-120-445</td>
													<td class="text-center">매월 31일</td>
													<td class="text-center">100,000</td>
												</tr>
											</tbody>


										</table>
										
									</div>

								</div>
							</div>
							<!-- /.row -->
							<!-- e : 테이블 본체 -->

						</div>
						<!-- /.box-body -->
						<!-- e : Box Body 영역 -->

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

							<div class="pull-right">
								<a href="contractregister.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> 계약신청승인
									</button>
								</a>
								<a href="contract.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> 계약신청삭제
									</button>
								</a>
							</div>

						</div>

					</div>
					
					<!-- /.box -->
					<!-- /.box -->
					<!-- /.col -->
					<div class="box">

						<!-- s : Box Header 영역 -->
						<div class="box-header">
							<h3 class="box-title">승인계약관리</h3>

						</div>
						<!-- /.box-header -->
						<!-- e : Box Header 영역 -->

						<!-- s : Box Body 영역 -->
						<div class="box-body">
					<div class="row">
								<div class="col-xs-12">

									<div class="mailbox table-responsive">

										<table id="tblSort" class="table table-mailbox table-striped">
											<thead>
												<tr>
													<th><label class="checkbox no-label toggle-all"
														for="checkbox-table-1"><input type="checkbox"
															value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>


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
													<td><label class="checkbox no-label"
														for="checkbox-table-2"><input type="checkbox"
															value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
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
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-3"><input type="checkbox"
															value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
													<td class="text-center">cyberk</td>
													<td class="text-center">김우리</td>
													<td class="text-center">서울시 금천구 우리동 300-5번지</td>
													<td class="text-center">2014-04-08</td>
													<td class="text-center">자동이체</td>
													<td class="text-center">국민은행</td>
													<td class="text-center">110-987-120-445</td>
													<td class="text-center">매월 20일</td>
													<td class="text-center">100,000</td>
												</tr>
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-4"><input type="checkbox"
															value="" id="checkbox-table-4" data-toggle="checkbox"></label></td>
													<td class="text-center">tieee</td>
													<td class="text-center">아이유</td>
													<td class="text-center">성남시 서현구 이유동 500-3번지</td>
													<td class="text-center">2014-05-16</td>
													<td class="text-center">무통장입금</td>
													<td class="text-center">신한은행</td>
													<td class="text-center">990-987-120-445</td>
													<td class="text-center">매월 31일</td>
													<td class="text-center">100,000</td>
												</tr>
											</tbody>


										</table>
										
									</div>

								</div>
							</div>
							<!-- /.row -->
							<!-- e : 테이블 본체 -->

						</div>
						<!-- /.box-body -->
						<!-- e : Box Body 영역 -->

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
							<div class="pull-right">
								<a href="changePay.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> 납부금액변경
									</button>
								</a>
							</div>

						</div>

					</div>
					<div class="box">

						<!-- s : Box Header 영역 -->
						<div class="box-header">
							<h3 class="box-title">계약해지</h3>

						</div>
						<!-- /.box-header -->
						<!-- e : Box Header 영역 -->

						<!-- s : Box Body 영역 -->
						<div class="box-body">
					<div class="row">
								<div class="col-xs-12">

									<div class="mailbox table-responsive">

										<table id="tblSort" class="table table-mailbox table-striped">
											<thead>
												<tr>
													<th><label class="checkbox no-label toggle-all"
														for="checkbox-table-1"><input type="checkbox"
															value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>


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
													<td><label class="checkbox no-label"
														for="checkbox-table-2"><input type="checkbox"
															value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
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
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-3"><input type="checkbox"
															value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
													<td class="text-center">cyberk</td>
													<td class="text-center">김우리</td>
													<td class="text-center">서울시 금천구 우리동 300-5번지</td>
													<td class="text-center">2014-04-08</td>
													<td class="text-center">자동이체</td>
													<td class="text-center">국민은행</td>
													<td class="text-center">110-987-120-445</td>
													<td class="text-center">매월 20일</td>
													<td class="text-center">100,000</td>
												</tr>
												
											</tbody>


										</table>
										
									</div>

								</div>
							</div>
							<!-- /.row -->
							<!-- e : 테이블 본체 -->

						</div>
						<!-- /.box-body -->
						<!-- e : Box Body 영역 -->

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

							<div class="pull-right">
								
								<a href="contract.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> 계약해지승인
									</button>
								</a>
							</div>

						</div>

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