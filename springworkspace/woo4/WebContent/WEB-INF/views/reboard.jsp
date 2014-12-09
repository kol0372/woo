<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sangdam_moo_ut">



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
											<h3 class="box-title">답변글달기</h3>
										</div>
										<div class="box-body table-responsive">
											<form action="reboard.kosta" method="post">
												<!-- 다음 페이지로 이동할때 답변글에 대한 처리를
                    해주기 위해서 답변글에 대한 정보를 갱신한 후 
                        폼의 히든 값으로 전송을 한다.-->
												<input type="text" name="ref" value="${vo.ref}" /> <input
													type="text" name="seq" value="${vo.seq+1}" /> <input
													type="text" name="lvl" value="${vo.lvl+1}" />

												<table class="table table-bordered table-hover">
													<thead>
														<tr>
															<th colspan="2">답변글 작성 폼</th>
														</tr>
													</thead>
													<tbody>
														<!-- 						<tr> -->
														<!-- 							<td>작성자</td> -->
														<!-- 							<td><input type="text" name="writer" id="writer" /></td> -->
														<!-- 						</tr> -->
														<!-- 						<tr> -->
														<!-- 							<td>비밀번호</td> -->
														<!-- 							<td><input type="password" name="pwd" id="pwd" /></td> -->
														<!-- 						</tr> -->
														<tr>
															<td>제목</td>
															<td><input type="text" name="qtitle" id="qtitle" /></td>
														</tr>
														<tr>
															<td>내용</td>
															<td><textarea name="qcontent" id="qcontent"></textarea></td>
														</tr>
														<tr>
															<td colspan="2" align="center"><input type="submit" value="답변글 작성" /></td>
														</tr>
													</tbody>
												</table>
											</form>
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
