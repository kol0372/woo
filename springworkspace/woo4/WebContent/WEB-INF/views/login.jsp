<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="login">

</head>
<body>
	<header>
		<div class="bottom-menu bottom-menu-inverse col-xs-12"></div>
	</header>
	<section id="sidebar" class="col-md-2"
		style="min-height: 949px; background-color: #cccc99;"></section>
	<section Id="main" class="col-md-9">
		<div>
			<aside class="right-side">
				<section class="content col-xs-12">
					<div class="col-xs-12">
						<div class="box">
							<div class="page-header">
								<h1>
									<b> HADU WOORI </b> <small>관리자 페이지입니다</small>
								</h1>
							</div>
								<form class="form-horizontal" role="form" method="post" action="j_spring_security_check">
									<div class="form-group">
										<label for="inputEmail3" class="col-sm-2 control-label">관리자번호</label>
										<div class="col-sm-5">
											<input type="text" class="form-control" name="j_username"
												placeholder="직원번호를 입력하세요">
										</div>
									</div>
									<div class="form-group">
										<label for="inputPassword3" class="col-sm-2 control-label">관리자비밀번호</label>
										<div class="col-sm-5">
											<input type="password" class="form-control"
												name="j_password" placeholder="비밀번호를입력하세요">
										</div>
									</div>
									<div class="col-sm-offset-5 col-sm-5">
									<input type="submit" value="로그인">
										</div>
								</form>
						</div>
					</div>
				</section>
			</aside>
		</div>
	</section>

</div>
	</tiles:putAttribute>
</tiles:insertDefinition>