<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="cameraCCTV">

			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							ī�޶�ǽð� <small>Camera CCTV</small>
						</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">ī�޶�ǽð�</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->

				<!-- Content Row -->
				<div class="row">
					<div class="col-xs-12">

						<div class="mailbox table-responsive">

							<table id="tblSort" class="table table-mailbox table-striped">

								<thead>
									<tr>
										<th class="text-center">���񽺹�ȣ</th>
										<th class="text-center">��û���̸�</th>
										<th class="text-center">��û���ּ�</th>
										<th class="text-center">����ð�</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="text-center">abc1</td>
										<td class="text-center">�Ǽ���</td>
										<td class="text-center">���� ���Ǳ� �Ÿ��� 499-35����</td>
										<td class="text-center">2014-12-31 23:59</td>
									</tr>

								</tbody>
							</table>
						</div>
					</div>
					<pre class="prettyprint"
						style="height: 400px; width: 1105px; margin: auto"></pre>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->

				<hr>

				<!-- Footer -->
				

			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
