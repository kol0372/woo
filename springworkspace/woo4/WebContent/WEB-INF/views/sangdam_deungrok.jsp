<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sangdam_deungrok">




			<script>
				function chkForm() {
					alert("저장되었습니다.");
					return false;
				}
			</script>

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
						<li class="active"><a href="sangdam_jaju.kosta"> --자주하는질문 </a></li>
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
								<div class="box">
									<div class="box-header">
										<h3 class="box-title">
											<b>[상 담 페 이 지]</b>
										</h3>
									</div>
									<div class="box-body">
										<div class="box-header">
											<h3 class="box-title">
												자주하는질문 <small> 질문등록페이지입니다 </small>
											</h3>

										</div>
										<div class="box-body table-responsive"></div>
										<div class="box-footer clearfix" align="center"></div>
									</div>
									<div class="box-tools pull-right" style="margin-top: 5px">
										<a href="sangdam_jaju.kosta" onClick="chkForm();">
											<button type="button" class="btn btn-success btn-sm">
												<span class="glyphicon glyphicon-floppy-saved"></span> 저장
											</button>
										</a> <a href="sangdam_jaju.kosta">
											<button type="button" class="btn btn-default btn-sm">
												<span class="glyphicon glyphicon-remove"></span> 취소
											</button>
										</a>
									</div>
									<div class="row">
										<div class="col-xs-12">
											<div class="row">
												<div class="col-sm-8">
													<div class="form-group">
														<label>자주하는질문</label> <input type="text"
															class="form-control" name="" />
													</div>
												</div>
												<div class="col-sm-8">
													<div class="form-group">
														<label>질문에대한답변</label> <input type="text"
															class="form-control" name="" />
													</div>
												</div>
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
	</tiles:putAttribute>
</tiles:insertDefinition>