<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="conupdate">

			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">계약정보변경이력</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->
				<h2>
					계약번호 <select class="form-control input-md-2">
						<option value="">계약번호 선택</option>
						<option>ABC123</option>
						<option>DSD345</option>
						<option>KED254</option>
					</select>
					<button type="button" class="btn btn-primary pull-right">조회</button>
				</h2>
				<br />


				<h3>계약변경이력</h3>
				<p>
				<table id="tblSort" class="table table-mailbox table-striped">
					<thead>
						<tr>
							<th onclick="sortTable('tblSort', 0)" style="cursor: pointer"
								class="text-center">번호</th>
							<th onclick="sortTable('tblSort', 1)" style="cursor: pointer"
								class="text-center">서비스제공처</th>
							<th onclick="sortTable('tblSort', 2)" style="cursor: pointer"
								class="text-center">변경일</th>
							<th onclick="sortTable('tblSort', 4)" style="cursor: pointer"
								class="text-center">변경 전 금액</th>
							<th onclick="sortTable('tblSort', 5)" style="cursor: pointer"
								class="text-center">변경 후 금액</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="text-center">1</td>
							<td class="text-center"><p>경기도 성남시 분당구 삼평동 대왕판교로 유스페이스B동
									8층</p>
								<p>한국소프트웨어기술진흥협회 2강의실</p></td>
							<td class="text-center">2014.08</td>
							<td class="text-center">80,000</td>
							<td class="text-center">80,000</td>

						</tr>
						<tr>
							<td class="text-center">2</td>
							<td class="text-center"><p>경기도 성남시 분당구 삼평동 대왕판교로 유스페이스B동
									8층</p>
								<p>한국소프트웨어기술진흥협회 5강의실</p></td>
							<td class="text-center">2014.11</td>
							<td class="text-center">-</td>
							<td class="text-center">-</td>
						</tr>
						<tr>
							<td class="text-center">3</td>
							<td class="text-center">-</td>
							<td class="text-center">2014.12</td>
							<td class="text-center">-</td>
							<td class="text-center">-</td>
						</tr>
					</tbody>
					<!-- /.row -->
				</table>

				
			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>