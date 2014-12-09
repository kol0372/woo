<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="chooldong">	

				<section id="sidebar" class="col-md-2"
					style="min-height: 949px; background-color: #cccc99;">
					<div>
						<ul class="nav nav-list">
							<li class="nav-header"><a href="schedule.kosta">������ ����</a></li>
							<li class="nav-header"><a href="gogo.kosta">�⵿</a></li>
							<li class="divider"></li>
							<li class="nav-header">���Ⱥ�</li>

							<li><a href="request.kosta"> ���˿�û��ȸ </a></li>

							<li class="active"><a href="chooldong.kosta"> �⵿����Է� </a></li>
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
											<h3 class="box-title">�⵿����Է�</h3>
										
										</div>
										<!-- /.box-header -->
										<!-- /.box-header -->
										<!-- e : Box Header ���� -->

										<!-- s : Box Body ���� -->
										<!-- s : Box Body ���� -->
										<div class="box-body">
											<div class="row">
								<div class="col-xs-12">

									<div class="mailbox table-responsive">
										<form method="post" action="chooldong.kosta" id="f">
										
										<table id="" class="table table-mailbox table-striped">

											<thead>
												<tr>
													
													<th  class="text-center"
														style="width: 80px">���񽺹�ȣ</th>
													<th class="text-center">�湮�ð�</th>
													<th class="text-center">�湮����</th>
													<th class="text-center">�湮�з�</th>
													<th class="text-center">������ȣ</th>													

												</tr>
											</thead>
											<tbody>
											
												<tr>
													
													<td align="center">
													<input name="snum" id="snum"></td>					
													<td align="center">
													<input name="dtime" id="dtime"></td>
													<td align="center">
													<input name="dcontent" id="dcontent"></td>
													<td align="center">
													<input name="dtitle" id="dtitle"></td>
													<td align="center">
													<input name="mnum" id="mnum"></td>
													
												</tr>
											</tbody>											
										</table>
										<div class="pull-left">
										     <button type="submit" class="btn btn-primary btn-sm" onclick="sendForm()">
												<span class="fa fa-plus"></span> �⵿��ϵ��
											</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="location='chooldonglist.kosta'">
												<span class="fa fa-plus"></span> �⵿�����ȸ
											</button>										     
										</div>
										</form>
										<script type="text/javascript">
											// form��ȿ�� �˻� ���� ���� �����͸� �����ϴ� ��ũ��Ʈ
											function sendForm() {
												$('#f').submit();
											}
											
										</script>
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