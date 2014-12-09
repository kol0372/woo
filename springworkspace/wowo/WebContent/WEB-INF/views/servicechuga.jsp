<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="servicechuga">

			<!-- 서비스 회원 정보 변경 페이지 -->


			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">서비스회원 추가 정보 입력</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>


				<table id="tblSort" class="table table-mailbox table-striped"
					style="border: 1px solid">
					<tbody style="border: 1px solid">
						<tr>
							<td class="text-center" style="border: 1px solid">청구서 수령주소</td>
							<td class="text-left" style="border: 1px solid">
								<div class="col-sm-6">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder=""> <label>
										<input type="checkbox" id="blankCheckbox" value="option1"
										aria-label=""> 회원주소와 동일함
									</label>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">납입방법</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-3">
									<select class="form-control">
										<option>납입방법선택</option>
										<option>무통장입금</option>
										<option>신용카드</option>
										<option>계좌이체</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">납입은행 or 카드</td>
							<td class="text-left" style="border: 1px solid">
								<div class="col-sm-3">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">납부금액</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text" placeholder="80,000"
											readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">결제일</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-3">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">예금주</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-2">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
					</tbody>
					<!-- /.row -->
				</table>
				<p align="center">
					<a href="">
						<button type="submit" class="btn btn-primary btn-sm">
							<span class="fa"></span> 저장
						</button>
					</a>&nbsp; <a href="main.kosta">
						<button type="button" class="btn btn-primary btn-sm">
							<span class="fa"></span> 취소
						</button>
					</a>
				</p>
			</div>
			<!-- /.container -->

			<!-- jQuery -->
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>