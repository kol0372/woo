<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sangdam_deungrok">




			<script>
				function chkForm() {
					alert("����Ǿ����ϴ�.");
					return false;
				}
			</script>

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
						<li class="active"><a href="sangdam_jaju.kosta"> --�����ϴ����� </a></li>
						<li><a href="sangdam_moo_ut.kosta"> --�����̵繰�����Q/A </a></li>
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
								<div class="box">
									<div class="box-header">
										<h3 class="box-title">
											<b>[�� �� �� �� ��]</b>
										</h3>
									</div>
									<div class="box-body">
										<div class="box-header">
											<h3 class="box-title">
												�����ϴ����� <small> ��������������Դϴ� </small>
											</h3>

										</div>
										<div class="box-body table-responsive"></div>
										<div class="box-footer clearfix" align="center"></div>
									</div>
									<div class="box-tools pull-right" style="margin-top: 5px">
										<a href="sangdam_jaju.kosta" onClick="chkForm();">
											<button type="button" class="btn btn-success btn-sm">
												<span class="glyphicon glyphicon-floppy-saved"></span> ����
											</button>
										</a> <a href="sangdam_jaju.kosta">
											<button type="button" class="btn btn-default btn-sm">
												<span class="glyphicon glyphicon-remove"></span> ���
											</button>
										</a>
									</div>
									<div class="row">
										<div class="col-xs-12">
											<div class="row">
												<div class="col-sm-8">
													<div class="form-group">
														<label>�����ϴ�����</label> <input type="text"
															class="form-control" name="" />
													</div>
												</div>
												<div class="col-sm-8">
													<div class="form-group">
														<label>���������Ѵ亯</label> <input type="text"
															class="form-control" name="" />
													</div>
												</div>
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
	</tiles:putAttribute>
</tiles:insertDefinition>