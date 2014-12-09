<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="serviceup">


			<!-- /.container -->

			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">서비스제공처 정보 변경</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->
				<h2>
					계약번호 <select class="form-control input-md-2">
						<option value="">계약번호 조회</option>
						<option>ABC123</option>
						<option>DSD345</option>
						<option>KED254</option>
					</select>
					<button type="button" class="btn btn-primary pull-right">조회</button>
				</h2>
				<br /> <br />


				<h3>
					정보 변경
					<div class="pull-right">
						<a href="conupdate.kosta">
							<button type="button" class="btn btn-primary btn-sm">
								<span class="fa"></span> 저장
							</button>
						</a>
					</div>
				</h3>
				<P>
					<!-- 차후 구현사항: 요소들을 클릭했을 때 팝업창을 띄워서 값을 변경하도록 만든다. -->
				<table id="tblSort" class="table table-mailbox table-striped">
					<thead style="border: 1px solid">
						<tr style="border: 1px solid">
							<th class="text-center" style="width: 80px">신청자</th>
							<th class="text-center">연락처</th>
							<th class="text-center">서비스제공처 주소</th>
							<th class="text-center">전화번호</th>
						</tr>
					</thead>
					<tbody style="border: 1px solid">
						<tr style="border: 1px solid">
							<td class="text-center">김길동</td>
							<td class="text-center">010-1234-5678</td>
							<td class="text-center">경기도 성남시 분당구 삼평동 대왕판교로 유스페이스B동 8층
								한국소프트웨어기술진흥협회 2강의실
								<div class="pull-right">
									<a href="">
										<button type="button" class="btn btn-primary btn-sm">
											<span class="fa"></span>수정
										</button>
									</a>
								</div>
							</td>
							<td class="text-center">070-7090-4972</td>
						</tr>
					</tbody>
					<!-- /.row -->
				</table>

				</p>
				<br />

			</div>
			<!-- /.container -->
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>