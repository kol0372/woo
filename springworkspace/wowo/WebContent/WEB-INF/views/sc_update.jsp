<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sc_update">




			<!-- 서비스 회원 정보 변경 페이지 -->


			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">서비스회원 정보 변경</h1>
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
							<td class="text-center" style="border: 1px solid">현재 비밀번호 입력</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">새로운 비밀번호
								입력</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">새로운 비밀번호
								확인</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">연락처</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">이메일</td>
							<td class="text-center" style="border: 1px solid">
								<table id="tblSort" class="table table-mailbox table-striped">
									<tbody>
										<tr>
											<th class="text-center">등록된 이메일</th>
											<th class="text-left">
												<div class="col-sm-8">
													<form role="form">
														<input class="form-control" type="text"
															placeholder="Readonly input here…" readonly="">
													</form>
												</div>
											</th>
										</tr>
										<tr>
											<td class="text-center">새로운 이메일</td>
											<td class="text-left">
												<form class="form-inline" role="form">
													<div class="form-group">
														<label class="sr-only" for="exampleInputEmail2">Email
															address</label> <input type="email" class="form-control"
															id="exampleInputEmail2" placeholder="abcde">
													</div>
													<div class="form-group">
														<div class="input-group">
															<div class="input-group-addon">@</div>
															<input class="form-control" type="email"
																placeholder="abc.com">
														</div>
													</div>
												</form>
											</td>
										</tr>
									</tbody>
								</table>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">회원주소</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-6">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">수령주소</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-6">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
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
							<td class="text-center" style="border: 1px solid">납입은행</td>
							<td class="text-left" style="border: 1px solid">
								<div class="col-sm-3">
									<select class="form-control">
										<option>은행선택</option>
										<option>우리은행</option>
										<option>국민은행</option>
										<option>하나은행</option>
										<option>외환은행</option>
										<option>기업은행</option>
										<option>농협</option>
									</select>

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
					<a href="sgogekjungbo.kosta">
						<button type="submit" class="btn btn-primary btn-sm">
							<span class="fa"></span> 수정
						</button>
					</a>&nbsp; <a href="gogekjungbo.kosta">
						<button type="button" class="btn btn-primary btn-sm">
							<span class="fa"></span> 취소
						</button>
					</a>
				</p>
			</div>
			<!-- /.container -->

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>