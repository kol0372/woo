<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="servicejoin">

			<!-- /.container -->
			</nav>

			<!-- 서비스 회원 정보 변경 페이지 -->
			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">서비스회원 가입</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>

				<div class="row">
					<form method="post" action="sadd.kosta">
						<table id="tblSort" class="table table-mailbox table-striped"
							style="border: 1px solid">
							<tbody style="border: 1px solid">
								<tr>
									<td class="text-center" style="border: 1px solid">신청처(신청자)</td>
									<td class="text-center" style="border: 1px solid">
										<div class="col-sm-4">
											<input class="form-control" type="text"
												id="formGroupInputSmall" placeholder="" name="srname">
										</div>
									</td>
								</tr>
								<tr>
									<td class="text-center" style="border: 1px solid">회원 연락처</td>
									<td class="text-center" style="border: 1px solid">
										<div class="col-sm-4">
											<input class="form-control" type="text"
												id="formGroupInputSmall" placeholder="" name="srtel">
										</div>
									</td>
								</tr>
								<tr>
									<td class="text-center" style="border: 1px solid">회원주소</td>
									<td class="text-center" style="border: 1px solid">
										<div class="col-sm-6">
											<input class="form-control" type="text"
												id="formGroupInputSmall" placeholder="" name="sraddress">
										</div>
									</td>
								</tr>
							</tbody>
							<!-- /.row -->
						</table>
						<p align="center">
							<a href="main.kosta">
								<button type="submit" class="btn btn-primary btn-sm">
									<span class="fa"></span> 제출
								</button>
							</a>
						</p>
					</form>
				</div>
			</div>
			<!-- /.container -->

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>