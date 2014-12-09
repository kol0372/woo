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
								������Q&A <small></small>
							</h1>
							<ol class="breadcrumb">
								<li><a href="main.kosta">Home</a></li>
								<li class="active">������Q&A</li>
							</ol>
						</div>
					</div>
					<!-- /.row -->

					<!-- Content Row -->
					<div class="row">
						<div class="box-body table-responsive">
							<table id="example1" class="table table-bordered table-hover">
								<!-- id="example1" : ��ϼ� ���� ���� �÷����� ��� -->
								<thead>
									<tr>
										<th>��ȣ</th>
										<th>ȸ��ID</th>
										<th>����</th>
										<th>����</th>
										<th>�亯</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>${vo.qnum}</td>
										<td>young</td>
										<td>${vo.qtitle}</td>
										<td>${vo.qcontent}</td>
										<td>�������ʽ��ϴ�.�������Ͻø� �˴ϴ�.</td>
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

