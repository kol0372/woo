<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sangdam_moo_ut">



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
						<li><a href="sangdam_jaju.kosta"> --�����ϴ����� </a></li>
						<li class="active"><a href="sangdam_moo_ut.kosta">
								--�����̵繰�����Q/A </a></li>
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
										<h3 class="box-title">
											<b>[�� �� �� �� ��]</b>
										</h3>
									</div>
									<!-- /.box-header -->
									<!-- e : Box Header ���� -->
									<!-- s : Box Body ���� -->
									<div class="box-body">
										<div class="box-header">
											<h3 class="box-title">�亯�۴ޱ�</h3>
										</div>
										<div class="box-body table-responsive">
											<form action="reboard.kosta" method="post">
												<!-- ���� �������� �̵��Ҷ� �亯�ۿ� ���� ó����
                    ���ֱ� ���ؼ� �亯�ۿ� ���� ������ ������ �� 
                        ���� ���� ������ ������ �Ѵ�.-->
												<input type="text" name="ref" value="${vo.ref}" /> <input
													type="text" name="seq" value="${vo.seq+1}" /> <input
													type="text" name="lvl" value="${vo.lvl+1}" />

												<table class="table table-bordered table-hover">
													<thead>
														<tr>
															<th colspan="2">�亯�� �ۼ� ��</th>
														</tr>
													</thead>
													<tbody>
														<!-- 						<tr> -->
														<!-- 							<td>�ۼ���</td> -->
														<!-- 							<td><input type="text" name="writer" id="writer" /></td> -->
														<!-- 						</tr> -->
														<!-- 						<tr> -->
														<!-- 							<td>��й�ȣ</td> -->
														<!-- 							<td><input type="password" name="pwd" id="pwd" /></td> -->
														<!-- 						</tr> -->
														<tr>
															<td>����</td>
															<td><input type="text" name="qtitle" id="qtitle" /></td>
														</tr>
														<tr>
															<td>����</td>
															<td><textarea name="qcontent" id="qcontent"></textarea></td>
														</tr>
														<tr>
															<td colspan="2" align="center"><input type="submit" value="�亯�� �ۼ�" /></td>
														</tr>
													</tbody>
												</table>
											</form>
										</div>
									</div>
								</div>
								<!-- /.box -->
								<!-- /.col -->
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
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
