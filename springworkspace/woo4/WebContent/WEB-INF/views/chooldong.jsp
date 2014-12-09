<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="chooldong">	

				<section id="sidebar" class="col-md-2"
					style="min-height: 949px; background-color: #cccc99;">
					<div>
						<ul class="nav nav-list">
							<li class="nav-header"><a href="schedule.kosta">스케줄 관리</a></li>
							<li class="nav-header"><a href="gogo.kosta">출동</a></li>
							<li class="divider"></li>
							<li class="nav-header">보안부</li>

							<li><a href="request.kosta"> 점검요청조회 </a></li>

							<li class="active"><a href="chooldong.kosta"> 출동기록입력 </a></li>
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
											<h3 class="box-title">출동기록입력</h3>
										
										</div>
										<!-- /.box-header -->
										<!-- /.box-header -->
										<!-- e : Box Header 영역 -->

										<!-- s : Box Body 영역 -->
										<!-- s : Box Body 영역 -->
										<div class="box-body">
											<div class="row">
								<div class="col-xs-12">

									<div class="mailbox table-responsive">
										<form method="post" action="chooldong.kosta" id="f">
										
										<table id="" class="table table-mailbox table-striped">

											<thead>
												<tr>
													
													<th  class="text-center"
														style="width: 80px">서비스번호</th>
													<th class="text-center">방문시간</th>
													<th class="text-center">방문내용</th>
													<th class="text-center">방문분류</th>
													<th class="text-center">직원번호</th>													

												</tr>
											</thead>
											<tbody>
											
												<tr>
													
													<td align="center">
													<input name="snum" id="snum"></td>					
													<td align="center">
													<input name="dtime" id="dtime"></td>
													<td align="center">
													<input name="dcontent" id="dcontent"></td>
													<td align="center">
													<input name="dtitle" id="dtitle"></td>
													<td align="center">
													<input name="mnum" id="mnum"></td>
													
												</tr>
											</tbody>											
										</table>
										<div class="pull-left">
										     <button type="submit" class="btn btn-primary btn-sm" onclick="sendForm()">
												<span class="fa fa-plus"></span> 출동기록등록
											</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="location='chooldonglist.kosta'">
												<span class="fa fa-plus"></span> 출동기록조회
											</button>										     
										</div>
										</form>
										<script type="text/javascript">
											// form유효성 검사 이후 폼의 데이터를 전송하는 스크립트
											function sendForm() {
												$('#f').submit();
											}
											
										</script>
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