<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sangdam_detail">


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
						<li><a href="sangdam_jaju.kosta"> --자주하는질문 </a></li>
						<li class="active"><a href="sangdam_moo_ut.kosta">
								--무엇이든물어보세요Q/A </a></li>
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
											<h3 class="box-title">무엇이든물어보세요Q&A</h3>
										</div>
										<div class="box-body table-responsive">
											<table id="example1" class="table table-mailbox table-hover">
												<!-- id="example1" : 목록수 조정 가능 플러그인 사용 -->
												<tbody>
													<tr>
														<td class="text-center" style="border: 1px solid">번호</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qnum}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">회원ID</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>net54</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">제목</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qtitle}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">내용</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qcontent}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">날짜</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qdate}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">조회수</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qhit}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													


												</tbody>
											</table>


											<form action="reboardf.kosta" method="post">
								<input type="hidden" name="ref" value="${vo.ref}" /> <input
									type="hidden" name="seq" value="${vo.seq}"> <input
									type="hidden" name="lvl" value="${vo.lvl}"> <input
									type="submit" value="답변">

							</form>
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


