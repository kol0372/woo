<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="contract">

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
			<li><a href="y_chooldonglist.kosta"> �⵿�����ȸ </a></li>
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
							<h3 class="box-title">����û</h3>

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
													<th><label class="checkbox no-label toggle-all"
														for="checkbox-table-1"><input type="checkbox"
															value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>


													<th onclick="sortTable('tblSort', 0)"
														style="cursor: pointer" class="text-center"
														style="width: 80px">��ǰ��ȣ</th>
													<th onclick="sortTable('tblSort', 1)"
														style="cursor: pointer" class="text-center">��ûó</th>
													<th onclick="sortTable('tblSort', 2)"
														style="cursor: pointer" class="text-center">ȸ���ּ�</th>
													<th onclick="sortTable('tblSort', 3)"
														style="cursor: pointer" class="text-center">��û��¥</th>
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
													<td><label class="checkbox no-label"
														for="checkbox-table-2"><input type="checkbox"
															value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
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
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-3"><input type="checkbox"
															value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
													<td class="text-center">cyberk</td>
													<td class="text-center">��츮</td>
													<td class="text-center">����� ��õ�� �츮�� 300-5����</td>
													<td class="text-center">2014-04-08</td>
													<td class="text-center">�ڵ���ü</td>
													<td class="text-center">��������</td>
													<td class="text-center">110-987-120-445</td>
													<td class="text-center">�ſ� 20��</td>
													<td class="text-center">100,000</td>
												</tr>
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-4"><input type="checkbox"
															value="" id="checkbox-table-4" data-toggle="checkbox"></label></td>
													<td class="text-center">tieee</td>
													<td class="text-center">������</td>
													<td class="text-center">������ ������ ������ 500-3����</td>
													<td class="text-center">2014-05-16</td>
													<td class="text-center">�������Ա�</td>
													<td class="text-center">��������</td>
													<td class="text-center">990-987-120-445</td>
													<td class="text-center">�ſ� 31��</td>
													<td class="text-center">100,000</td>
												</tr>
											</tbody>


										</table>
										
									</div>

								</div>
							</div>
							<!-- /.row -->
							<!-- e : ���̺� ��ü -->

						</div>
						<!-- /.box-body -->
						<!-- e : Box Body ���� -->

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

							<div class="pull-right">
								<a href="contractregister.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> ����û����
									</button>
								</a>
								<a href="contract.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> ����û����
									</button>
								</a>
							</div>

						</div>

					</div>
					
					<!-- /.box -->
					<!-- /.box -->
					<!-- /.col -->
					<div class="box">

						<!-- s : Box Header ���� -->
						<div class="box-header">
							<h3 class="box-title">���ΰ�����</h3>

						</div>
						<!-- /.box-header -->
						<!-- e : Box Header ���� -->

						<!-- s : Box Body ���� -->
						<div class="box-body">
					<div class="row">
								<div class="col-xs-12">

									<div class="mailbox table-responsive">

										<table id="tblSort" class="table table-mailbox table-striped">
											<thead>
												<tr>
													<th><label class="checkbox no-label toggle-all"
														for="checkbox-table-1"><input type="checkbox"
															value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>


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
													<td><label class="checkbox no-label"
														for="checkbox-table-2"><input type="checkbox"
															value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
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
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-3"><input type="checkbox"
															value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
													<td class="text-center">cyberk</td>
													<td class="text-center">��츮</td>
													<td class="text-center">����� ��õ�� �츮�� 300-5����</td>
													<td class="text-center">2014-04-08</td>
													<td class="text-center">�ڵ���ü</td>
													<td class="text-center">��������</td>
													<td class="text-center">110-987-120-445</td>
													<td class="text-center">�ſ� 20��</td>
													<td class="text-center">100,000</td>
												</tr>
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-4"><input type="checkbox"
															value="" id="checkbox-table-4" data-toggle="checkbox"></label></td>
													<td class="text-center">tieee</td>
													<td class="text-center">������</td>
													<td class="text-center">������ ������ ������ 500-3����</td>
													<td class="text-center">2014-05-16</td>
													<td class="text-center">�������Ա�</td>
													<td class="text-center">��������</td>
													<td class="text-center">990-987-120-445</td>
													<td class="text-center">�ſ� 31��</td>
													<td class="text-center">100,000</td>
												</tr>
											</tbody>


										</table>
										
									</div>

								</div>
							</div>
							<!-- /.row -->
							<!-- e : ���̺� ��ü -->

						</div>
						<!-- /.box-body -->
						<!-- e : Box Body ���� -->

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
							<div class="pull-right">
								<a href="changePay.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> ���αݾ׺���
									</button>
								</a>
							</div>

						</div>

					</div>
					<div class="box">

						<!-- s : Box Header ���� -->
						<div class="box-header">
							<h3 class="box-title">�������</h3>

						</div>
						<!-- /.box-header -->
						<!-- e : Box Header ���� -->

						<!-- s : Box Body ���� -->
						<div class="box-body">
					<div class="row">
								<div class="col-xs-12">

									<div class="mailbox table-responsive">

										<table id="tblSort" class="table table-mailbox table-striped">
											<thead>
												<tr>
													<th><label class="checkbox no-label toggle-all"
														for="checkbox-table-1"><input type="checkbox"
															value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>


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
													<td><label class="checkbox no-label"
														for="checkbox-table-2"><input type="checkbox"
															value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
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
												<tr>
													<td><label class="checkbox no-label"
														for="checkbox-table-3"><input type="checkbox"
															value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
													<td class="text-center">cyberk</td>
													<td class="text-center">��츮</td>
													<td class="text-center">����� ��õ�� �츮�� 300-5����</td>
													<td class="text-center">2014-04-08</td>
													<td class="text-center">�ڵ���ü</td>
													<td class="text-center">��������</td>
													<td class="text-center">110-987-120-445</td>
													<td class="text-center">�ſ� 20��</td>
													<td class="text-center">100,000</td>
												</tr>
												
											</tbody>


										</table>
										
									</div>

								</div>
							</div>
							<!-- /.row -->
							<!-- e : ���̺� ��ü -->

						</div>
						<!-- /.box-body -->
						<!-- e : Box Body ���� -->

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

							<div class="pull-right">
								
								<a href="contract.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa fa-plus"></span> �����������
									</button>
								</a>
							</div>

						</div>

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