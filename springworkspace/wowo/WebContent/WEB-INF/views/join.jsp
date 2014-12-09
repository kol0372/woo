<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="join">

			<title>Insert title here</title>
			</head>
			<body>
				<!-- Page Content -->
				<div class="container">

					<!-- Page Heading/Breadcrumbs -->
					<div class="row">
						<div class="col-lg-12">
							<h1 class="page-header">
								회원가입 <small>Join</small>
							</h1>
							<ol class="breadcrumb">
								<li><a href="main.kosta">Home</a></li>
								<li class="active">회원가입</li>
							</ol>
						</div>
					</div>
					<!-- /.row -->

					<!-- Content Row -->
					<div class="row">
						<form method="post" action="add.kosta">
							<div class="col-sm-4">
								<div class="form-group">
									<!-- 	<input type="hidden" name="join" value="add">  -->
									<label>Id</label> <input type="text" class="form-control"
										name="id" />

									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa"></span>중복확인
									</button>

									<br /> <label>비번</label> <input type="password"
										class="form-control" name="pwd" /> <label>비번확인</label> <input
										type="password" class="form-control" name="pwd2" />
									<label>Name</label>
										<input type="text" class="form-control" name="name" />
									<label>Email</label>
										<div class="form-group">
											<div class="input-group">
											
												<input type="text" class="form-control" name="email" />
												<span class="input-group-addon">@</span>
												<input type="text" class="form-control" placeholder="email" />
										</div>
									</div>

									<a href="login.kosta">
										<button type="submit" class="btn btn-primary btn-sm">
											<span class="fa"></span> 가입
										</button>
									</a>
								</div>
							</div>
						</form>
					</div>
					<!-- /.row -->

					<hr>

					<!-- Footer -->


				</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
