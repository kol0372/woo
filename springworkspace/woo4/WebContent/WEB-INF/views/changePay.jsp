<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="changePay">

		
			<script>
				function chkForm() {
					alert("����Ǿ����ϴ�.");
					return false;
				}
			</script>


			</head>

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
							<li><a href="seil.kosta"> ������������ </a></li>
							<li><a href="y_chooldong.kosta"> �⵿�����ȸ </a></li>
							<li class="active"><a href="contract.kosta"> ������ </a></li>
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
										<!-- s : Box Header ���� -->
										<div class="box-header">
											<h3 class="box-title">���αݾ׺���</h3>
											<div class="box-tools pull-right">
												<a href="contract.kosta">
													<button onClick="chkForm();" type="button"
														class="btn btn-success btn-sm">
														<span class="glyphicon glyphicon-floppy-saved"></span>����
													</button>
												</a> <a href="contract.kosta">
													<button type="button" class="btn btn-default btn-sm">
														<span class="glyphicon glyphicon-remove"></span> ���
													</button>
												</a>
											</div>
										</div>
										<!-- /.box-header -->
										<!-- /.box-header -->
										<!-- e : Box Header ���� -->

										<!-- s : Box Body ���� -->
										<div class="box-body">
											<div class="row">
												<div class="mailbox table-responsive">

													<table id="tblSort"
														class="table table-mailbox table-striped">
														<thead>
															<tr>


																<th onclick="sortTable('tblSort', 0)"
																	style="cursor: pointer" class="text-center"
																	style="width: 80px">��ǰ��ȣ</th>
																<th onclick="sortTable('tblSort', 1)"
																	style="cursor: pointer" class="text-center">��ûó</th>
																<th onclick="sortTable('tblSort', 2)"
																	style="cursor: pointer" class="text-center">ȸ���ּ�</th>
																<th onclick="sortTable('tblSort', 3)"
																	style="cursor: pointer" class="text-center">��೯¥</th>
																<th onclick="sortTable('tblSort', 4)"
																	style="cursor: pointer" class="text-center">���Թ��</th>
																<th onclick="sortTable('tblSort', 5)"
																	style="cursor: pointer" class="text-center">��������</th>
																<th onclick="sortTable('tblSort', 6)"
																	style="cursor: pointer" class="text-center">���԰���</th>
																<th onclick="sortTable('tblSort', 7)"
																	style="cursor: pointer" class="text-center">��ü��¥</th>
																<th onclick="sortTable('tblSort', 8)"
																	style="cursor: pointer" class="text-center">���αݾ�</th>

															</tr>
														</thead>
														<tbody>
															<tr>

																<td class="text-center">abc1</td>
																<td class="text-center">�Ǽ���</td>
																<td class="text-center">����� ���Ǳ� �Ÿ��� 255-3����</td>
																<td class="text-center">2014-04-06</td>
																<td class="text-center">�������Ա�</td>
																<td class="text-center">�츮����</td>
																<td class="text-center">647-987-120-445</td>
																<td class="text-center">�ſ� 6��</td>
																<td class="text-center">100,000</td>
															</tr>

														</tbody>


													</table>

												</div>

												<div class="col-xs-12">
													<div class="row">
														<div class="col-sm-4">
															<div class="form-group">
																<label>����ɱݾ�</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
													</div>
												</div>
											</div>
											<!-- /.row -->
										</div>
										<!-- /.box-body -->
										<!-- /.box -->
									</div>
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

			</body>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>