<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="serviceup">


			<!-- /.container -->

			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">��������ó ���� ����</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->
				<h2>
					����ȣ <select class="form-control input-md-2">
						<option value="">����ȣ ��ȸ</option>
						<option>ABC123</option>
						<option>DSD345</option>
						<option>KED254</option>
					</select>
					<button type="button" class="btn btn-primary pull-right">��ȸ</button>
				</h2>
				<br /> <br />


				<h3>
					���� ����
					<div class="pull-right">
						<a href="conupdate.kosta">
							<button type="button" class="btn btn-primary btn-sm">
								<span class="fa"></span> ����
							</button>
						</a>
					</div>
				</h3>
				<P>
					<!-- ���� ��������: ��ҵ��� Ŭ������ �� �˾�â�� ����� ���� �����ϵ��� �����. -->
				<table id="tblSort" class="table table-mailbox table-striped">
					<thead style="border: 1px solid">
						<tr style="border: 1px solid">
							<th class="text-center" style="width: 80px">��û��</th>
							<th class="text-center">����ó</th>
							<th class="text-center">��������ó �ּ�</th>
							<th class="text-center">��ȭ��ȣ</th>
						</tr>
					</thead>
					<tbody style="border: 1px solid">
						<tr style="border: 1px solid">
							<td class="text-center">��浿</td>
							<td class="text-center">010-1234-5678</td>
							<td class="text-center">��⵵ ������ �д籸 ���� ����Ǳ��� �������̽�B�� 8��
								�ѱ�����Ʈ������������ȸ 2���ǽ�
								<div class="pull-right">
									<a href="">
										<button type="button" class="btn btn-primary btn-sm">
											<span class="fa"></span>����
										</button>
									</a>
								</div>
							</td>
							<td class="text-center">070-7090-4972</td>
						</tr>
					</tbody>
					<!-- /.row -->
				</table>

				</p>
				<br />

			</div>
			<!-- /.container -->
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>