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
									<b> HADU WOORI </b> <small>������ �������Դϴ�</small>
								</h1>
							</div>
								<form class="form-horizontal" role="form" method="post" action="j_spring_security_check">
									<div class="form-group">
										<label for="inputEmail3" class="col-sm-2 control-label">�����ڹ�ȣ</label>
										<div class="col-sm-5">
											<input type="text" class="form-control" name="j_username"
												placeholder="������ȣ�� �Է��ϼ���">
										</div>
									</div>
									<div class="form-group">
										<label for="inputPassword3" class="col-sm-2 control-label">�����ں�й�ȣ</label>
										<div class="col-sm-5">
											<input type="password" class="form-control"
												name="j_password" placeholder="��й�ȣ���Է��ϼ���">
										</div>
									</div>
									<div class="col-sm-offset-5 col-sm-5">
									<input type="submit" value="�α���">
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