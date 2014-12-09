<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="servicejoin">

			<!-- /.container -->
			</nav>

			<!-- ���� ȸ�� ���� ���� ������ -->
			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">����ȸ�� ����</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Blog Home One</li>
						</ol>
					</div>
				</div>

				<div class="row">
					<form method="post" action="sadd.kosta">
						<table id="tblSort" class="table table-mailbox table-striped"
							style="border: 1px solid">
							<tbody style="border: 1px solid">
								<tr>
									<td class="text-center" style="border: 1px solid">��ûó(��û��)</td>
									<td class="text-center" style="border: 1px solid">
										<div class="col-sm-4">
											<input class="form-control" type="text"
												id="formGroupInputSmall" placeholder="" name="srname">
										</div>
									</td>
								</tr>
								<tr>
									<td class="text-center" style="border: 1px solid">ȸ�� ����ó</td>
									<td class="text-center" style="border: 1px solid">
										<div class="col-sm-4">
											<input class="form-control" type="text"
												id="formGroupInputSmall" placeholder="" name="srtel">
										</div>
									</td>
								</tr>
								<tr>
									<td class="text-center" style="border: 1px solid">ȸ���ּ�</td>
									<td class="text-center" style="border: 1px solid">
										<div class="col-sm-6">
											<input class="form-control" type="text"
												id="formGroupInputSmall" placeholder="" name="sraddress">
										</div>
									</td>
								</tr>
							</tbody>
							<!-- /.row -->
						</table>
						<p align="center">
							<a href="main.kosta">
								<button type="submit" class="btn btn-primary btn-sm">
									<span class="fa"></span> ����
								</button>
							</a>
						</p>
					</form>
				</div>
			</div>
			<!-- /.container -->

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>