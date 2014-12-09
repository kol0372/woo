<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="gogo2">
			<section id="sidebar" class="col-md-2"
				style="min-height: 949px; background-color: #cccc99;">
				<div>
					<ul class="nav nav-list">
						<li class="nav-header"><a href="schedule.kosta">������ ����</a></li>
						<li class="active"><a href="gogo.kosta">�⵿</a></li>
						<li class="divider"></li>
						<li class="nav-header">���Ⱥ�</li>
						<li><a href="request.kosta"> ���˿�û��ȸ </a></li>
						<li><a href="chooldong.kosta"> �⵿����Է� </a></li>
						<li><a href="chooldonglist.kosta"> �⵿�����ȸ </a></li>
						<li class="divider"></li>
						<li class="nav-header">������</li>
						<li><a href="client.kosta"> ������ </a></li>
						<li><a href="sangdam.kosta"> ��������� </a></li>
						<li><a href="seil.kosta"> ������������ </a></li>
						<li><a href="y_chooldonglist.kosta"> �⵿�����ȸ </a></li>
						<li><a href="contract.kosta"> ������ </a></li>
					</ul>
				</div>
			</section>
			<section Id="main" class="col-md-9">
				<div>
					<aside class="right-side">
						<section class="content col-xs-12">
							<div class="col-xs-12">
								<div class="box">
									<div class="box-header">
										<h3 class="box-title">�⵿</h3>
									</div>
									<div class="box-body">
										<div class="row">
											<div class="col-xs-12">
												<div class="mailbox table-responsive">
													<table id="tblSort" class="table table-mailbox table-striped">
														<thead>
															<tr>
																<th onclick="sortTable('tblSort', 0)"
																	style="cursor: pointer" class="text-center"
																	style="width: 80px">��ǰ��ȣ</th>
																<th onclick="sortTable('tblSort', 1)"
																	style="cursor: pointer" class="text-center">ȸ���ּ�</th>
																<th onclick="sortTable('tblSort', 2)"
																	style="cursor: pointer" class="text-center">���������ð�</th>
																<th onclick="sortTable('tblSort', 3)"
																	style="cursor: pointer" class="text-center">��������</th>
																<th onclick="sortTable('tblSort', 4)"
																	style="cursor: pointer" class="text-center">������ȣ</th>
																<th onclick="sortTable('tblSort', 5)"
																	style="cursor: pointer" class="text-center">�����̸�</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<td class="text-center">abc1</td>
																<td class="text-center">����� ���Ǳ� �Ÿ��� 255-3����</td>
																<td class="text-center">2014-11-25 13:55</td>
																<td class="text-center">������</td>
																<td class="text-center">1</td>
																<td class="text-center">�Ǽ���</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
											<div class="prettyprint"
												style="height: 500px; border: 2px solid">
												<img src="http://192.168.7.97:7777/loading.jpg" id="webcam1"
													width="100%" height="100%" alt="Live Stream" />
											</div>
										</div>
									</div>
								</div>
							</div>
						</section>
					</aside>
				</div>
			</section>
		</div>
		<script type="text/javascript">
			var per_frame = 40;
			DoIt1();
			document.images.webcam1.onload = DoIt1();

			function LoadImage1() {
				uniq1 = Math.random();
				document.images.webcam1.src = "http://192.168.7.97:7777/cam_1.jpg?uniq=1"
						+ uniq1;
				document.images.webcam1.onload = DoIt1;
			}
			function DoIt1() {
				window.setTimeout("LoadImage1();", per_frame);
			}
		</script>
	</tiles:putAttribute>
</tiles:insertDefinition>
