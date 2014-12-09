<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="chooldonglist">
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							�⵿�����ȸ <small></small>
						</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">�⵿�����ȸ</li>
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
										
										<th class="text-center">�⵿����</th>
										<th class="text-center">���������ð�</th>
										<th class="text-center">�⵿�ð�</th>
										
										<th class="text-center">�����̸�</th>

									</tr>
								</thead>
								<tbody>
									<tr onclick="location.href='chooldonglist.kosta'">
										<td class="text-center">abc1</td>
										
										<td class="text-center">ħ�Թ߻����� �⵿</td>
										<td class="text-center">2014-11-25 13:50</td>
										<td class="text-center">2014-11-25 13:55</td>
										
										<td class="text-center">�̿���</td>
									</tr>
									<tr onclick="location.href='chooldonglist.kosta'">
										<td class="text-center">abc1</td>
										
										<td class="text-center">ħ�Թ߻����� �⵿</td>
										<td class="text-center">2014-12-20 15:40</td>
										<td class="text-center">2014-12-20 15:45</td>
										
										<td class="text-center">�̿���</td>
									</tr>
									<tr onclick="location.href='chooldonglist.kosta'">
										<td class="text-center">abc1</td>
										
										<td class="text-center">ħ�Թ߻����� �⵿</td>
										<td class="text-center">2014-12-31 23:54</td>
										<td class="text-center">2014-12-31 23:59</td>
									
										<td class="text-center">��츮</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->

				<hr>

				<!-- Footer -->
		

			</div>

					</div>
	</tiles:putAttribute>
</tiles:insertDefinition>