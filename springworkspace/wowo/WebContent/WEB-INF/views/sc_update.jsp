<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="sc_update">




			<!-- ���� ȸ�� ���� ���� ������ -->


			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">����ȸ�� ���� ����</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>

				<!-- ���� ��������: ��ҵ��� Ŭ������ �� �˾�â�� ����� ���� �����ϵ��� �����. -->
				<table id="tblSort" class="table table-mailbox table-striped"
					style="border: 1px solid">
					<tbody style="border: 1px solid">
						<tr>
							<td class="text-center" style="border: 1px solid">���̵�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here��" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">��û�� �̸�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here��" readonly="">
								</div>
								</form>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">���� ��й�ȣ �Է�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">���ο� ��й�ȣ
								�Է�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">���ο� ��й�ȣ
								Ȯ��</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">����ó</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">�̸���</td>
							<td class="text-center" style="border: 1px solid">
								<table id="tblSort" class="table table-mailbox table-striped">
									<tbody>
										<tr>
											<th class="text-center">��ϵ� �̸���</th>
											<th class="text-left">
												<div class="col-sm-8">
													<form role="form">
														<input class="form-control" type="text"
															placeholder="Readonly input here��" readonly="">
													</form>
												</div>
											</th>
										</tr>
										<tr>
											<td class="text-center">���ο� �̸���</td>
											<td class="text-left">
												<form class="form-inline" role="form">
													<div class="form-group">
														<label class="sr-only" for="exampleInputEmail2">Email
															address</label> <input type="email" class="form-control"
															id="exampleInputEmail2" placeholder="abcde">
													</div>
													<div class="form-group">
														<div class="input-group">
															<div class="input-group-addon">@</div>
															<input class="form-control" type="email"
																placeholder="abc.com">
														</div>
													</div>
												</form>
											</td>
										</tr>
									</tbody>
								</table>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">ȸ���ּ�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-6">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">�����ּ�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-6">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">���Թ��</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-3">
									<select class="form-control">
										<option>���Թ������</option>
										<option>�������Ա�</option>
										<option>�ſ�ī��</option>
										<option>������ü</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">��������</td>
							<td class="text-left" style="border: 1px solid">
								<div class="col-sm-3">
									<select class="form-control">
										<option>���༱��</option>
										<option>�츮����</option>
										<option>��������</option>
										<option>�ϳ�����</option>
										<option>��ȯ����</option>
										<option>�������</option>
										<option>����</option>
									</select>

								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">������</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-2">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
					</tbody>
					<!-- /.row -->
				</table>
				<p align="center">
					<a href="sgogekjungbo.kosta">
						<button type="submit" class="btn btn-primary btn-sm">
							<span class="fa"></span> ����
						</button>
					</a>&nbsp; <a href="gogekjungbo.kosta">
						<button type="button" class="btn btn-primary btn-sm">
							<span class="fa"></span> ���
						</button>
					</a>
				</p>
			</div>
			<!-- /.container -->

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>