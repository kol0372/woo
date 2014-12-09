<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="requestupdate">

	<section id="sidebar" class="col-md-2"
		style="min-height: 949px; background-color: #cccc99;">
		<div>
			<ul class="nav nav-list">
				<li class="nav-header"><a href="schedule.kosta">������ ����</a></li>
				<li class="nav-header"><a href="gogo.kosta">�⵿</a></li>
				<li class="divider"></li>
				<li class="nav-header">���Ⱥ�</li>
				<li class="active"><a href="request.kosta"> ���˿�û��ȸ </a></li>
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
				<!-- s : Content ���� -->
				<section class="content col-xs-12">
					<div class="col-xs-12">
						<!-- .box�� Bootstrap�� .panel�� �ش�ȴ�. -->
						<div class="box">
							<!-- s : Box Header ���� -->
							<div class="box-header">
								<h3 class="box-title">���˿�û ��� ����</h3>
							</div>
							<!-- /.box-header -->
							<!-- e : Box Header ���� -->
							<!-- s : Box Body ���� -->
							<div class="box-body">
								<div class="row">
									<div class="col-xs-12">
										<div class="row">
											<div class="col-sm-4">
												<div class="form-group">
													<label>������ȣ</label> <input type="text" value="������ȣ"
														disabled="disabled" class="form-control">
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>ȸ��ID</label> <input type="text" value="ȸ��ID"
														disabled="disabled" class="form-control">
												</div>
											</div>
											<div class="col-sm-4">
												<div class="form-group">
													<label>��������</label> <input type="text" value="��������"
														disabled="disabled" class="form-control">
												</div>
											</div>

											<div class="col-sm-4">
												<div class="bootstrap-datepicker">
													<div class="form-group">
														<label>�湮��¥</label>
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
													<label>�湮������</label> <select class="form-control" name=""
														id="exam_type">
														<option value="a">�Ǽ���(�븮)</option>
														<option value="b">������(�븮)</option>
													</select>
												</div>
											</div>
											<div class="col-sm-4">
												<!-- select -->
												<div class="form-group">
													<label>�����������</label> <select class="form-control" name=""
														id="exam_type">
														<option value="a">������</option>
														<option value="b">�Ϸ�</option>
														<option value="b">���</option>
													</select>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!-- /.row -->
							</div>
							<div class="pull-right">
								<a href="request.kosta">
									<button type="button" class="btn btn-primary btn-sm btn-sm-offset-4">
										<span class="fa fa-plus"></span> ���
									</button>
								</a>
							</div>							
							<div class="pull-right-md-offset-4">
								<a href="request.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> ����
									</button>
								</a>
							</div>
							


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