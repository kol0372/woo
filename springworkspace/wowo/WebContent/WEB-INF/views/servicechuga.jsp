<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="servicechuga">

			<!-- ���� ȸ�� ���� ���� ������ -->


			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">����ȸ�� �߰� ���� �Է�</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>


				<table id="tblSort" class="table table-mailbox table-striped"
					style="border: 1px solid">
					<tbody style="border: 1px solid">
						<tr>
							<td class="text-center" style="border: 1px solid">û���� �����ּ�</td>
							<td class="text-left" style="border: 1px solid">
								<div class="col-sm-6">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder=""> <label>
										<input type="checkbox" id="blankCheckbox" value="option1"
										aria-label=""> ȸ���ּҿ� ������
									</label>
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
							<td class="text-center" style="border: 1px solid">�������� or ī��</td>
							<td class="text-left" style="border: 1px solid">
								<div class="col-sm-3">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">���αݾ�</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-4">
									<form role="form">
										<input class="form-control" type="text" placeholder="80,000"
											readonly="">
									</form>
								</div>
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">������</td>
							<td class="text-center" style="border: 1px solid">
								<div class="col-sm-3">
									<input class="form-control" type="text"
										id="formGroupInputSmall" placeholder="">
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
					<a href="">
						<button type="submit" class="btn btn-primary btn-sm">
							<span class="fa"></span> ����
						</button>
					</a>&nbsp; <a href="main.kosta">
						<button type="button" class="btn btn-primary btn-sm">
							<span class="fa"></span> ���
						</button>
					</a>
				</p>
			</div>
			<!-- /.container -->

			<!-- jQuery -->
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>