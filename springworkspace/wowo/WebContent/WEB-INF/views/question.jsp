<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="question">


			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							고객문의Q&A <small></small>
						</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">고객문의Q&A</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->

				<!-- Content Row -->
				<div class="row">
					<div class="mailbox table-responsive">
						<table id="example1" class="table table-mailbox table-striped">
							<!-- id="example1" : 목록수 조정 가능 플러그인 사용 -->
							<thead>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>내용</th>
									<th>날짜</th>
									<th>조회수</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="listv" items="${list}">
									<tr>
										<td align="center">${listv.qnum}</td>
										<td><c:forEach begin="1" end="${listv.lvl}">&nbsp;&nbsp;&nbsp;</c:forEach>
											<a href="detail.kosta?no=${listv.qnum}"> <c:if
													test="${listv.lvl != 0}">
													<img src="images/re.PNG" border="0" />
												</c:if>${listv.qtitle}
										</a></td>
										<td align="center">${listv.qcontent}</td>

										<td align="center">${listv.qdate}</td>
										<td align="center">${listv.qhit}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="pull-right">
<a href="questionUpdate.kosta"><button type="button" class="btn btn-primary btn-sm"
							>Q&A등록</button></a>
						

					</div>

					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->

				<hr>

				<!-- Footer -->

			</div>
			<!-- /.container -->


		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
