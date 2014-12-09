<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="seil3">
		
		
	<section id="sidebar" class="col-md-2"
		style="min-height: 949px; background-color: #cccc99;">
		<div>
			<ul class="nav nav-list">
				<li class="nav-header">
				<a href="schedule.kosta">������ ����</a></li>
				<li class="nav-header"><a href="gogo.kosta">�⵿</a></li>
				<li class="divider"></li>
				<li class="nav-header">���Ⱥ�</li>
				<li><a href="request.kosta"> ���˿�û��ȸ </a></li>
				<li><a href="chooldong.kosta"> �⵿����Է� </a></li>
				<li><a href="chooldonglist.kosta"> �⵿�����ȸ </a></li>
				<li class="divider"></li>
				<li class="nav-header">������</li>
				<li><a href="client.kosta"> ������ </a></li>
				<li><a href="sangdam.kosta"> ��������� </a></li>				
				<li class="active"><a href="seil.kosta"> ������������ </a></li>
				<li><a href="y_chooldonglist.kosta"> �⵿�����ȸ </a></li>
				<li><a href="contract.kosta"> ������ </a></li>
			</ul>
		</div>
	</section>
	<section Id="main" class="col-md-9">
		<div>
			<aside class="right-side">
				<!-- s : Content ���� -->
				<section class="content col-xs-12">
					<div class="col-xs-12">
						<!-- .box�� Bootstrap�� .panel�� �ش�ȴ�. -->
						 <div class="box">
                            	<!-- e : Box Body ���� -->
							<div class="page-header">
								<h1>
									<b> HADU WOORI </b> <small> ��������Ȳ�Դϴ�</small>
								</h1>
							</div>
							<div class="col-xs-12">
								<ul class="nav navbar-nav">

								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" aria-haspopup="true" role="button"
									aria-expanded=""> <i class="fa fa-group"></i> <span
										class="hidden-sm">��Ʈ��Ʈ��</span> <b class="caret"></b>
								</a>
									<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
										<li role="presentation"><a tabindex="-1"
											href="seil2.kosta">�Ǹű��</a></li>
										<li role="presentation"><a tabindex="-1"
											href="chooldong.kosta">�⵿����Է�</a></li>
										<li role="presentation"><a tabindex="-1"
											href="chooldonglist.kosta">�⵿�����ȸ</a></li>
									</ul></li>


								<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" aria-haspopup="true" role="button"
											aria-expanded=""> <i class="fa fa-group"></i> <span
												class="hidden-sm">high chart</span> <b class="caret"></b>
										</a>
											<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
												<li role="presentation"><a tabindex="-1"
													href="seil5.kosta">�������</a></li>
												<li role="presentation"><a tabindex="-1"
													href="seil6.kosta">�����Լ�</a></li>
												<li role="presentation"><a tabindex="-1"
													href="sei7l.kosta">�浿 �� ����</a></li>
											</ul></li>



							</ul>
							</div>
							<div class="box-body table-responsive">
								<div class="box box-solid">
									<div class="box-header">
										<i class="fa fa-bar-chart-o"></i>
										<h3 class="box-title">��������Ȳ</h3>
									</div>
									<!-- /.box-header -->
									<div class="box-body">
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success"
												role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 40%">
												14.8��������
												<span class="sr-only"></span>
												<b style="color: black">40% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-info"
												role="progressbar" aria-valuenow="20" aria-valuemin="0"
												aria-valuemax="100" style="width: 20%">
												14.9��������
												<span class="sr-only"></span>
												<b style="color: black">20% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-warning"
												role="progressbar" aria-valuenow="60" aria-valuemin="0"
												aria-valuemax="100" style="width: 60%">
												14.10��������
												<span class="sr-only"></span>
												<b style="color: black">60% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-danger"
												role="progressbar" aria-valuenow="80" aria-valuemin="0"
												aria-valuemax="100" style="width: 80%">
												14.11��������
												<span class="sr-only"></span>
												<b style="color: black">80% Complete(success)</b>
											</div>
										</div>
										<!-- /.row -->
									</div>
									<!-- /.box-body -->                           	
                            	</div>
                            	<div style="height: 50px"></div>
                            	<div class="box box-solid">
									<div class="box-header">
										<i class="fa fa-bar-chart-o"></i>
										<h3 class="box-title">����డ����Ȳ</h3>
									</div>
									<!-- /.box-header -->
									<div class="box-body">
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success"
												role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 20%">
												14.08�����ڼ�
												<span class="sr-only"></span>
												<b style="color: black">20% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-info"
												role="progressbar" aria-valuenow="20" aria-valuemin="0"
												aria-valuemax="100" style="width: 30%">
												14.09�����ڼ�
												<span class="sr-only"></span>
												<b style="color: black">30% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-warning"
												role="progressbar" aria-valuenow="60" aria-valuemin="0"
												aria-valuemax="100" style="width: 40%">
												14.10�����ڼ�
												<span class="sr-only"></span>
												<b style="color: black">40% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-danger"
												role="progressbar" aria-valuenow="80" aria-valuemin="0"
												aria-valuemax="100" style="width: 50%">
												14.11�����ڼ�
												<span class="sr-only"></span>
												<b style="color: black">50% Complete(success)</b>
											</div>
										</div>
										<!-- /.row -->
									</div>
									<!-- /.box-body -->                           	
                            	</div>
                            	<div style="height: 50px"></div>
                            	<div class="box box-solid">
									<div class="box-header">
										<i class="fa fa-bar-chart-o"></i>
										<h3 class="box-title">�⵿Ƚ����Ȳ</h3>
									</div>
									<!-- /.box-header -->
									<div class="box-body">
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-success"
												role="progressbar" aria-valuenow="40" aria-valuemin="0"
												aria-valuemax="100" style="width: 80%">
												14.08�⵿Ƚ��
												<span class="sr-only"></span>
												<b style="color: black">80% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-info"
												role="progressbar" aria-valuenow="20" aria-valuemin="0"
												aria-valuemax="100" style="width: 70%">
												14.09�⵿Ƚ��
												<span class="sr-only"></span>
												<b style="color: black">70% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-warning"
												role="progressbar" aria-valuenow="60" aria-valuemin="0"
												aria-valuemax="100" style="width: 50%">
												14.10�⵿Ƚ��
												<span class="sr-only"></span>
												<b style="color: black">50% Complete(success)</b>
											</div>
										</div>
										<div class="progress progress-striped active">
											<div class="progress-bar progress-bar-danger"
												role="progressbar" aria-valuenow="80" aria-valuemin="0"
												aria-valuemax="100" style="width: 80%">
												14.11�⵿Ƚ��
												<span class="sr-only"></span>
												<b style="color: black">80% Complete(success)</b>
											</div>
										</div>
										<!-- /.row -->
									</div>
									<!-- /.box-body -->                           	
                            	</div>
                            </div>
                            </div><!-- /.box -->
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</section>
				<!-- /.content -->
				<!-- e : Content ���� -->
			</aside>
			<!-- /.right-side -->
		</div>
	</section>
</div>
	</tiles:putAttribute>
</tiles:insertDefinition>