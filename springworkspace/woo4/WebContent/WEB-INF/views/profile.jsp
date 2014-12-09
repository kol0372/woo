<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="profile">





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
				<li ><a href="chooldonglist.kosta"> �⵿�����ȸ </a></li>
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
								<h3 class="box-title">������</h3>

							</div>
							<!-- /.box-header -->
							<!-- e : Box Header ���� -->

							<!-- s : Box Body ���� -->
							<div class="box-body">



								<!-- s : ���̺� ��ü -->
								<div class="row">
									<div class="col-xs-12">

										<div class="mailbox table-responsive">

											<table id="tblSort" class="table table-mailbox table-striped">

													<thead>
													<tr>
														<th class="text-center" >������ȣ</th>
														<th class="text-center" >�̸�</th>
														<th class="text-center" >�μ�</th>
														<th class="text-center" >��ȭ��ȣ</th>													

													</tr>
													</thead>
													<tbody>
													<tr>
														<td class="text-center">7</td>
														<td class="text-center">��츮</td>
														<td class="text-center">������</td>
														<td class="text-center">010-7465-0959</td>													
													</tr>													
												</tbody>
											</table>
										</div>

									</div>
								</div>
							</div>							<!-- /.box-body -->
							<!-- e : Box Body ���� -->

							<div class="box-footer clearfix">
								
																	
							</div>

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