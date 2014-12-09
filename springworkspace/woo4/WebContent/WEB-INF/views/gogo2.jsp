<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="gogo2">
			<section id="sidebar" class="col-md-2"
				style="min-height: 949px; background-color: #cccc99;">
				<div>
					<ul class="nav nav-list">
						<li class="nav-header"><a href="schedule.kosta">스케줄 관리</a></li>
						<li class="active"><a href="gogo.kosta">출동</a></li>
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
										<h3 class="box-title">출동</h3>
									</div>
									<div class="box-body">
										<div class="row">
											<div class="col-xs-12">
												<div class="mailbox table-responsive">
													<table id="tblSort" class="table table-mailbox table-striped">
														<thead>
															<tr>
																<th onclick="sortTable('tblSort', 0)"
																	style="cursor: pointer" class="text-center"
																	style="width: 80px">제품번호</th>
																<th onclick="sortTable('tblSort', 1)"
																	style="cursor: pointer" class="text-center">회원주소</th>
																<th onclick="sortTable('tblSort', 2)"
																	style="cursor: pointer" class="text-center">센서감지시간</th>
																<th onclick="sortTable('tblSort', 3)"
																	style="cursor: pointer" class="text-center">센서상태</th>
																<th onclick="sortTable('tblSort', 4)"
																	style="cursor: pointer" class="text-center">직원번호</th>
																<th onclick="sortTable('tblSort', 5)"
																	style="cursor: pointer" class="text-center">직원이름</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<td class="text-center">abc1</td>
																<td class="text-center">서울시 관악구 신림동 255-3번지</td>
																<td class="text-center">2014-11-25 13:55</td>
																<td class="text-center">문열림</td>
																<td class="text-center">1</td>
																<td class="text-center">권순길</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
											<div class="prettyprint"
												style="height: 500px; border: 2px solid">
												<img src="http://192.168.7.97:7777/loading.jpg" id="webcam1"
													width="100%" height="100%" alt="Live Stream" />
											</div>
										</div>
									</div>
								</div>
							</div>
						</section>
					</aside>
				</div>
			</section>
		</div>
		<script type="text/javascript">
			var per_frame = 40;
			DoIt1();
			document.images.webcam1.onload = DoIt1();

			function LoadImage1() {
				uniq1 = Math.random();
				document.images.webcam1.src = "http://192.168.7.97:7777/cam_1.jpg?uniq=1"
						+ uniq1;
				document.images.webcam1.onload = DoIt1;
			}
			function DoIt1() {
				window.setTimeout("LoadImage1();", per_frame);
			}
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
