<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<script>
	function chkForm() {
		alert("해지신청을 보냈습니다.");
		return false;
	}
</script>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="contactEnd">

			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							계약해지 <small></small>
						</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">계약해지</li>
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
										<th>
											<div class="checkbox">
												<label> <input type="checkbox" id="blankCheckbox"
													value="option1" aria-label="...">
												</label>
											</div>
										</th>
										<th class="text-center">서비스번호</th>
										<th class="text-center">신청자</th>
										<th class="text-center">회원주소</th>
										<th class="text-center">계약날짜</th>
										<th class="text-center">ip번호</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
										<div class="checkbox">
												<label> <input type="checkbox" id="blankCheckbox"
													value="option1" aria-label="...">
												</label>
											</div>
										</td>
										<td class="text-center">abc1</td>
										<td class="text-center">권순길</td>
										<td class="text-center">서울시 관악구 신림동</td>
										<td class="text-center">2014-11-25</td>

										<td class="text-center">754.254.05.94</td>
									</tr>
								</tbody>
							</table>
							<div class="box-tools pull-right">
								<a onClick="chkForm();">
									<button type="submit" class="btn btn-primary">해지신청</button>
								</a>
							</div>
						</div>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->

				<hr>

				<!-- Footer -->


			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>