<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="questionDetail">


			<title>Insert title here</title>
			</head>
			<body>
				<!-- Page Content -->
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
						<div class="box-body table-responsive">
							<table id="example1" class="table table-bordered table-hover">
								<!-- id="example1" : 목록수 조정 가능 플러그인 사용 -->
								<thead>
									<tr>
										<th>번호</th>
										<th>회원ID</th>
										<th>제목</th>
										<th>내용</th>
										<th>답변</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>${vo.qnum}</td>
										<td>young</td>
										<td>${vo.qtitle}</td>
										<td>${vo.qcontent}</td>
										<td>빡세지않습니다.열심히하시면 됩니다.</td>
									</tr>
									
								</tbody>
							</table>
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

