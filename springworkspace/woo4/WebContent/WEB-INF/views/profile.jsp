<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="profile">





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
				<li ><a href="chooldonglist.kosta"> 출동기록조회 </a></li>
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
								<h3 class="box-title">프로필</h3>

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
														<th class="text-center" >직원번호</th>
														<th class="text-center" >이름</th>
														<th class="text-center" >부서</th>
														<th class="text-center" >전화번호</th>													

													</tr>
													</thead>
													<tbody>
													<tr>
														<td class="text-center">7</td>
														<td class="text-center">고우리</td>
														<td class="text-center">영업부</td>
														<td class="text-center">010-7465-0959</td>													
													</tr>													
												</tbody>
											</table>
										</div>

									</div>
								</div>
							</div>							<!-- /.box-body -->
							<!-- e : Box Body 영역 -->

							<div class="box-footer clearfix">
								
																	
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