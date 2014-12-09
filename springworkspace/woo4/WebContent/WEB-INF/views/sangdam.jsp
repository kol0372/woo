<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sangdam">





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
						<li class="active"><a href="sangdam.kosta"> ��������� </a></li>
						<li><a href="sangdam_jaju.kosta"> --�����ϴ����� </a></li>
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
											<h3 class="box-title">�����ϴ�����</h3>
											<div class="box-tools pull-right">
												<a href="sangdam_deungrok.kosta"
													class="btn btn-sm btn-primary">�������</a>
											</div>
										</div>
										<div class="box-body table-responsive">
											<table id="example1" class="table table-bordered table-hover">
												<!-- id="example1" : ��ϼ� ���� ���� �÷����� ��� -->
												<thead>
													<tr>



														<th>����Ʈ��ȣ</th>
														<th>��������</th>
														<th>���������Ѵ亯</th>
														<th>��ȸ��</th>
													</tr>
												</thead>
												<tbody>
													<tr>

														<td>1</td>
														<td>�̰ſ��ؾߵǴ°ſ���?</td>
														<td>��������</td>
														<td>178</td>
													</tr>
													<tr>

														<td>2</td>
														<td>���ϴ°����𸣰ڳ�</td>
														<td>���ƴ�!!!!</td>
														<td>236</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="box-header">
											<h3 class="box-title">�����̵繰����� Q&A</h3>
										</div>
										<div class="box-body table-responsive">
											<table id="example1" class="table table-bordered table-hover">
												<!-- id="example1" : ��ϼ� ���� ���� �÷����� ��� -->
												<thead>
													<tr>

														<th>��ȣ</th>
														<th>ȸ��ID</th>
														<th>����</th>
														<th>����</th>
														<th>��¥</th>
														<th>��ȸ��</th>
													</tr>
												</thead>
												<tbody>
													<tr>

														<th>1</th>
														<th>young</th>
														<th><a href="sangdam_detail.kosta">���ǵ帳�ϴ�</a></th>
														<th>���ɺ��꿩</th>
														<th>2014.11.25</th>
														<th>3454</th>
													</tr>
													<tr>

														<th>2</th>
														<th>sub</th>
														<th><a href="sangdam_detail.kosta">�Ƶ��̳밡</a></th>
														<th>�߾ȵǳ׿�</th>
														<th>2014.11.25</th>
														<th>3839</th>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="box-footer clearfix" align="center">
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
