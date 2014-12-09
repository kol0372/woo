<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="gogekjungbo">

			<!-- Page Content -->
			<div class="container">
				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							����ȸ�� ����
							<div class="pull-right">
							<a href="servicechuga.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa"></span> �������� �Է�
									</button>
								</a>
								<a href="sc_update.kosta">
									<button type="button" class="btn btn-primary btn-sm">
										<span class="fa"></span> ȸ������ ����
									</button>
								</a>
							</div>
						</h1>
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
							<td class="text-center" style="border: 1px solid">����ó</td>
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
							<td class="text-center" style="border: 1px solid">�̸���</td>
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
							<td class="text-center" style="border: 1px solid">ȸ���ּ�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-8">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here��" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">�����ּ�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-8">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here��" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">���Թ��</td>
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
							<td class="text-center" style="border: 1px solid">��������</td>
							<td class="text-left" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here��" readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">������</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-2">
									<form role="form">
										<input class="form-control" type="text"
											placeholder="Readonly input here��" readonly="">
									</form>
								</div>
							</td>
						</tr>
					</tbody>
					<!-- /.row -->
				</table>
			</div>
			<!-- /.container -->
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>