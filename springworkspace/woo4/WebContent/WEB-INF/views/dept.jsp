<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="dept">

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
								<h3 class="box-title">영업부</h3>

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
														style="cursor:pointer"class="text-center">직원번호</th>
														<th onclick="sortTable('tblSort', 1)"
														style="cursor:pointer" class="text-center">이름</th>
														<th onclick="sortTable('tblSort', 2)"
														style="cursor:pointer" class="text-center">부서</th>
														<th onclick="sortTable('tblSort', 3)"
														style="cursor:pointer" class="text-center">전화번호</th>											

													</tr>
													</thead>
													<tbody>
													<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-2"><input type="checkbox"
															value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
														<td class="text-center">1</td>
														<td class="text-center">권순길</td>
														<td class="text-center">영업부</td>
														<td class="text-center">010-4568-5844</td>
														
													</tr>
													<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-3"><input type="checkbox"
															value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
														<td class="text-center">2</td>
														<td class="text-center">이영섭</td>
														<td class="text-center">영업부</td>
														<td class="text-center">010-9884-5343</td>
														
													</tr>
													<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-4"><input type="checkbox"
															value="" id="checkbox-table-4" data-toggle="checkbox"></label></td>
														<td class="text-center">3</td>
														<td class="text-center">김경민</td>
														<td class="text-center">영업부</td>
														<td class="text-center">011-3483-4777</td>
														
													</tr>
													<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-5"><input type="checkbox"
															value="" id="checkbox-table-5" data-toggle="checkbox"></label></td>
														<td class="text-center">4</td>
														<td class="text-center">이원구</td>
														<td class="text-center">영업부</td>
														<td class="text-center">019-8443-5677</td>														
													</tr>
													<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-6"><input type="checkbox"
															value="" id="checkbox-table-6" data-toggle="checkbox"></label></td>
														<td class="text-center">5</td>
														<td class="text-center">김종규</td>
														<td class="text-center">영업부</td>
														<td class="text-center">010-6542-3617</td>														
													</tr>
													<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-7"><input type="checkbox"
															value="" id="checkbox-table-7" data-toggle="checkbox"></label></td>
														<td class="text-center">6</td>
														<td class="text-center">아이유</td>
														<td class="text-center">영업부</td>
														<td class="text-center">010-1004-6677</td>														
													</tr>
													<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-8"><input type="checkbox"
															value="" id="checkbox-table-8" data-toggle="checkbox"></label></td>
														<td class="text-center">7</td>
														<td class="text-center">김우리</td>
														<td class="text-center">영업부</td>
														<td class="text-center">010-2243-0670</td>														
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
												

												<li class="next"><a href="#fakelink"
													class="fui-arrow-right"></a></li>
											</ul>
										</div>							

								
							</div>

						</div>
						<!-- /.box -->
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