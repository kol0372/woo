<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="seil2">





			<script>
				var radarChartData = {
					labels : [ "Eating", "Drinking", "Sleeping", "Designing",
							"Coding", "Cycling", "Running" ],
					datasets : [ {
						label : "My First dataset",
						fillColor : "rgba(220,220,220,0.2)",
						strokeColor : "rgba(220,220,220,1)",
						pointColor : "rgba(220,220,220,1)",
						pointStrokeColor : "#fff",
						pointHighlightFill : "#fff",
						pointHighlightStroke : "rgba(220,220,220,1)",
						data : [ 65, 59, 90, 81, 56, 55, 40 ]
					}, {
						label : "My Second dataset",
						fillColor : "rgba(151,187,205,0.2)",
						strokeColor : "rgba(151,187,205,1)",
						pointColor : "rgba(151,187,205,1)",
						pointStrokeColor : "#fff",
						pointHighlightFill : "#fff",
						pointHighlightStroke : "rgba(151,187,205,1)",
						data : [ 28, 48, 40, 19, 96, 27, 100 ]
					} ]
				};

				window.onload = function() {
					window.myRadar = new Chart(document
							.getElementById("canvas").getContext("2d")).Radar(
							radarChartData, {
								responsive : true
							});
				}
			</script>
			<body>
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
												<ul class="dropdown-menu" role="menu"
													aria-labelledby="drop1">
													<li role="presentation"><a tabindex="-1"
														href="request.kosta">�Ǹű��</a></li>
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
									<div style="width: 30%">
										<canvas id="canvas" height="450" width="450"></canvas>
									</div>
								</div>
								<!-- /.row -->
							</section>
							<!-- /.content -->
							<!-- e : Content ���� -->
						</aside>
						<!-- /.right-side -->
					</div>
				</section>
			</body>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>