<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="gogekjungbo">

			<!-- Page Content -->
			<div class="container">
				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							서비스회원 정보
							<div class="pull-right">
							<a href="servicechuga.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa"></span> 납입정보 입력
									</button>
								</a>
								<a href="sc_update.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa"></span> 회원정보 변경
									</button>
								</a>
							</div>
						</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>

				<!-- 차후 구현사항: 요소들을 클릭했을 때 팝업창을 띄워서 값을 변경하도록 만든다. -->
				<table id="tblSort" class="table table-mailbox table-striped"
					style="border: 1px solid">
					<tbody style="border: 1px solid">
						<tr>
							<td class="text-center" style="border: 1px solid">아이디</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">신청자 이름</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
								</div>
								</form>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">연락처</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">이메일</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">회원주소</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-8">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">수령주소</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-8">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">납입방법</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">납입은행</td>
							<td class="text-left" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">예금주</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-2">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here…" readonly="">
									</form>
								</div>
							</td>
						</tr>
					</tbody>
					<!-- /.row -->
				</table>
			</div>
			<!-- /.container -->
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>