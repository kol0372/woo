<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="conupdate">

			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">������������̷�</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->
				<h2>
					����ȣ <select class="form-control input-md-2">
						<option value="">����ȣ ����</option>
						<option>ABC123</option>
						<option>DSD345</option>
						<option>KED254</option>
					</select>
					<button type="button" class="btn btn-primary pull-right">��ȸ</button>
				</h2>
				<br />


				<h3>��ຯ���̷�</h3>
				<p>
				<table id="tblSort" class="table table-mailbox table-striped">
					<thead>
						<tr>
							<th onclick="sortTable('tblSort', 0)" style="cursor: pointer"
								class="text-center">��ȣ</th>
							<th onclick="sortTable('tblSort', 1)" style="cursor: pointer"
								class="text-center">��������ó</th>
							<th onclick="sortTable('tblSort', 2)" style="cursor: pointer"
								class="text-center">������</th>
							<th onclick="sortTable('tblSort', 4)" style="cursor: pointer"
								class="text-center">���� �� �ݾ�</th>
							<th onclick="sortTable('tblSort', 5)" style="cursor: pointer"
								class="text-center">���� �� �ݾ�</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="text-center">1</td>
							<td class="text-center"><p>��⵵ ������ �д籸 ���� ����Ǳ��� �������̽�B��
									8��</p>
								<p>�ѱ�����Ʈ������������ȸ 2���ǽ�</p></td>
							<td class="text-center">2014.08</td>
							<td class="text-center">80,000</td>
							<td class="text-center">80,000</td>

						</tr>
						<tr>
							<td class="text-center">2</td>
							<td class="text-center"><p>��⵵ ������ �д籸 ���� ����Ǳ��� �������̽�B��
									8��</p>
								<p>�ѱ�����Ʈ������������ȸ 5���ǽ�</p></td>
							<td class="text-center">2014.11</td>
							<td class="text-center">-</td>
							<td class="text-center">-</td>
						</tr>
						<tr>
							<td class="text-center">3</td>
							<td class="text-center">-</td>
							<td class="text-center">2014.12</td>
							<td class="text-center">-</td>
							<td class="text-center">-</td>
						</tr>
					</tbody>
					<!-- /.row -->
				</table>

				
			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>