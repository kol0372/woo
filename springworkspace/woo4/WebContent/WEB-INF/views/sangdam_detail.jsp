<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sangdam_detail">


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
											<h3 class="box-title">�����̵繰�����Q&A</h3>
										</div>
										<div class="box-body table-responsive">
											<table id="example1" class="table table-mailbox table-hover">
												<!-- id="example1" : ��ϼ� ���� ���� �÷����� ��� -->
												<tbody>
													<tr>
														<td class="text-center" style="border: 1px solid">��ȣ</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qnum}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">ȸ��ID</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>net54</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">����</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qtitle}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">����</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qcontent}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">��¥</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qdate}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													<tr>
														<td class="text-center" style="border: 1px solid">��ȸ��</td>
														<td class="text-center" style="border: 1px solid">
															<div class="col-sm-4">
																<form role="form">
																	<table>
																		<th>${vo.qhit}</th>
																	</table>
																</form>
															</div>
														</td>
													</tr>
													


												</tbody>
											</table>


											<form action="reboardf.kosta" method="post">
								<input type="hidden" name="ref" value="${vo.ref}" /> <input
									type="hidden" name="seq" value="${vo.seq}"> <input
									type="hidden" name="lvl" value="${vo.lvl}"> <input
									type="submit" value="�亯">

							</form>
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


