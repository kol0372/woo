<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="seil">



			<section id="sidebar" class="col-md-2"
				style="min-height: 949px; background-color: #cccc99;">
				<div>
					<ul class="nav nav-list">
						<li class="nav-header"><a href="schedule.kosta">������ ����</a></li>
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
									<ul class="nav navbar-nav">

										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" aria-haspopup="true" role="button"
											aria-expanded=""> <i class="fa fa-group"></i> <span
												class="hidden-sm">��Ʈ��Ʈ��</span> <b class="caret"></b>
										</a>
											<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
												<li role="presentation"><a tabindex="-1"
													href="seil3.kosta">�Ǹű��</a></li>
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
								<!-- /.box -->
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
