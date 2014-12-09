<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="request">





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
										<h3 class="box-title">���˿�û��ȸ</h3>
									</div>
									<!-- /.box-header -->
									<!-- e : Box Header ���� -->
									<!-- s : Box Body ���� -->
									<div class="box-body">
										<div class="demo-row">
											<div class="demo-content-wide">
												<div class="table-responsive">
													<table class="table table-bordered">
														<thead>
															<tr>
																<th><label class="checkbox no-label toggle-all"
																	for="checkbox-table-1"><input type="checkbox"
																		value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>


																<th class="text-center">������ȣ</th>
																<th class="text-center">���񽺹�ȣ</th>
																<th class="text-center">��������</th>
																<th class="text-center">ȸ���ּ�</th>
																<th class="text-center">������¥</th>

																<th class="text-center">�湮��¥</th>
																<th class="text-center">�湮������</th>
																<th class="text-center">�����������</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-2"><input type="checkbox"
																		value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
																<td>1</td>
																<td>Youngsub.lee</td>
																<td>��ǰ ����ȭ ��ü ��û</td>
																<th>��⵵ ������ ������ �츮��</th>
																<td>2014.11.23</td>
																<td>2014.11.25</td>
																<td>�Ǽ���(�븮)</td>
																<td class="text-center">������</td>
															</tr>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-3"><input type="checkbox"
																		value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
																<td>2</td>
																<td>Youngsub</td>
																<td>����(���� ���۵�)</td>
																<th>��⵵ ������ ������ �츮��</th>
																<td>2014.11.23</td>
																<td>2014.11.25</td>
																<td>������(�븮)</td>
																<td class="text-center">�Ϸ�</td>
															</tr>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-4"><input type="checkbox"
																		value="" id="checkbox-table-4" data-toggle="checkbox"></label></td>
																<td>3</td>
																<td>ffdsfe12</td>
																<td>����(���� �̻�)</td>
																<th>��⵵ ������ ������ �츮��</th>
																<td>2014.11.23</td>
																<td>2014.11.26</td>
																<td>������(�븮)</td>
																<td class="text-center">������</td>
															</tr>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-5"><input type="checkbox"
																		value="" id="checkbox-table-5" data-toggle="checkbox"></label></td>
																<td>4</td>
																<td>dldlgh43</td>
																<td>��ǰ �̻� ��ü</td>
																<th>��⵵ ������ ������ �츮��</th>
																<td>2014.11.23</td>
																<td>2014.11.27</td>
																<td>�̿���(�븮)</td>
																<td class="text-center">������</td>
															</tr>
															<tr>
																<td><label class="checkbox no-label"
																	for="checkbox-table-6"><input type="checkbox"
																		value="" id="checkbox-table-6" data-toggle="checkbox"></label></td>
																<td>5</td>
																<td>lew456</td>
																<td>���� ����ȭ</td>
																<th>��⵵ ������ ������ �츮��</th>
																<td>2014.11.23</td>
																<td>2014.11.27</td>
																<td>������(�븮)</td>
																<td class="text-center">������</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
											<div class="pull-right">
												<a href="requestupdate.kosta">
													<button type="button" class="btn btn-primary btn-sm">
														<span class="fa fa-plus"></span> ����
													</button>
												</a>
												<!-- 									<a href="request.kosta"> -->
												<!-- 										<button type="button" class="btn btn-primary btn-sm"> -->
												<!-- 											<span class="fa fa-plus"></span> ���� -->
												<!-- 										</button> -->
												<!-- 									</a> -->
											</div>
											<div class="box-footer clearfix">
												<div class="pagination">
													<ul>
														<li class="previous"><a href="#fakelink"
															class="fui-arrow-left"></a></li>
														<li class="active"><a href="#fakelink">1</a></li>
														<li><a href="#fakelink">2</a></li>
														<li><a href="#fakelink">3</a></li>
														<li><a href="#fakelink">4</a></li>
														<li><a href="#fakelink">5</a></li>
														<li><a href="#fakelink">6</a></li>
														<li><a href="#fakelink">7</a></li>
														<li><a href="#fakelink">8</a></li>
														<li><a href="#fakelink">9</a></li>
														<li><a href="#fakelink">10</a></li>

														<li class="next"><a href="#fakelink"
															class="fui-arrow-right"></a></li>
													</ul>
												</div>


											</div>
										</div>





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
