<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="contractregister">
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
											<h3 class="box-title">���������</h3>
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

												<div class="col-xs-12">
													<div class="row">
														<div class="col-sm-4">
															<div class="form-group">
																<label>��ǰ��ȣ</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>��û��</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>ȸ���ּ�</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>

														<div class="col-sm-4">
															<div class="bootstrap-datepicker">
																<div class="form-group">
																	<label>��೯¥</label>
																	<div class="form-group">
																		<div class="input-group">
																			<span class="input-group-btn">
																				<button class="btn" type="button">
																					<span class="fui-calendar"></span>
																				</button>
																			</span> <input type="text" class="form-control"
																				value="14 March, 2014" id="datepicker-01" />
																		</div>
																	</div>
																</div>
																<!-- /.form group -->
															</div>
														</div>
														<div class="col-sm-4">
															<!-- select -->
															<div class="form-group">
																<label>���Թ��</label> <select class="form-control" name=""
																	id="exam_type">
																	<option value="a">�ſ�ī��</option>
																	<option value="b">������ü</option>
																	<option value="c">�������Ա�</option>
																</select>
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>��������(ī��ȸ��)</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>���԰���(ī���ȣ)</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>��ü��¥</label> <input type="text"
																	class="form-control" name="" />
															</div>
														</div>
														<div class="col-sm-4">
															<div class="form-group">
																<label>���αݾ�</label> <input type="text"
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
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>