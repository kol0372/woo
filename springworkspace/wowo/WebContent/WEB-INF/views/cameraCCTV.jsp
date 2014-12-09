<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="cameraCCTV">

			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							카메라실시간 <small>Camera CCTV</small>
						</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">카메라실시간</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->

				<!-- Content Row -->
				<div class="row">
					<div class="col-xs-12">

						<div class="mailbox table-responsive">

							<table id="tblSort" class="table table-mailbox table-striped">

								<thead>
									<tr>
										<th class="text-center">서비스번호</th>
										<th class="text-center">신청자이름</th>
										<th class="text-center">신청자주소</th>
										<th class="text-center">현재시간</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="text-center">abc1</td>
										<td class="text-center">권순길</td>
										<td class="text-center">서울 관악구 신림동 499-35번지</td>
										<td class="text-center">2014-12-31 23:59</td>
									</tr>

								</tbody>
							</table>
						</div>
					</div>
					<pre class="prettyprint"
						style="height: 400px; width: 1105px; margin: auto"></pre>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->

				<hr>

				<!-- Footer -->
				

			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
