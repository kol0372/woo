<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="wc_update">



			<!-- Page Content -->
			<div class="container">

				<!-- �Ϲ�ȸ�� ���� ���� ������ -->

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">ȸ������ ����</h1>
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
								kol7456
							</td>
						</tr>
						<tr>
							<td class="text-center" style="border: 1px solid">�̸�</td>
							<td class="text-center" style="border: 1px solid">
								��츮
							</td>
						</tr>
<!-- 						<tr> -->
<!-- 							<td class="text-center" style="border: 1px solid">���� ��й�ȣ �Է�</td> -->
<!-- 							<td class="text-center" style="border: 1px solid"> -->
<!-- 								<div class="col-sm-4"> -->
<!-- 									<input class="form-control" type="text" -->
<!-- 										id="formGroupInputSmall" placeholder=""> -->
<!-- 								</div> -->
<!-- 							</td> -->
<!-- 						</tr> -->
<!-- 						<tr> -->
<!-- 							<td class="text-center" style="border: 1px solid">���ο� ��й�ȣ -->
<!-- 								�Է�</td> -->
<!-- 							<td class="text-center" style="border: 1px solid"> -->
<!-- 								<div class="col-sm-4"> -->
<!-- 									<input class="form-control" type="text" -->
<!-- 										id="formGroupInputSmall" placeholder=""> -->
<!-- 								</div> -->
<!-- 							</td> -->
<!-- 						</tr> -->
<!-- 						<tr> -->
<!-- 							<td class="text-center" style="border: 1px solid">���ο� ��й�ȣ -->
<!-- 								Ȯ��</td> -->
<!-- 							<td class="text-center" style="border: 1px solid"> -->
<!-- 								<div class="col-sm-4"> -->
<!-- 									<input class="form-control" type="text" -->
<!-- 										id="formGroupInputSmall" placeholder=""> -->
<!-- 								</div> -->
<!-- 							</td> -->
<!-- 						</tr> -->
						<tr>
							<td class="text-center" style="border: 1px solid">�̸���</td>
							<td class="text-center" style="border: 1px solid">
								<table id="tblSort" class="table table-mailbox table-striped">
									<tbody>
										<tr>
											<td class="text-center">kol7456@naver.com</td>
<!-- 											<th class="text-left"> -->
<!-- 												<div class="col-sm-8"> -->
<!-- 													<form role="form"> -->
<!-- 														<input class="form-control" type="text" -->
<!-- 															placeholder="Readonly input here��" readonly=""> -->
<!-- 													</form> -->
<!-- 												</div> -->
<!-- 											</th> -->
										</tr>
<!-- 										<tr> -->
<!-- 											<td class="text-center">���ο� �̸���</td> -->
<!-- 											<td class="text-left"> -->
<!-- 												<form class="form-inline" role="form"> -->
<!-- 													<div class="form-group"> -->
<!-- 														<label class="sr-only" for="exampleInputEmail2">Email -->
<!-- 															address</label> <input type="email" class="form-control" -->
<!-- 															id="exampleInputEmail2" placeholder="abcde"> -->
<!-- 													</div> -->
<!-- 													<div class="form-group"> -->
<!-- 														<div class="input-group"> -->
<!-- 															<div class="input-group-addon">@</div> -->
<!-- 															<input class="form-control" type="email" -->
<!-- 																placeholder="abc.com"> -->
<!-- 														</div> -->
<!-- 													</div> -->
<!-- 												</form> -->
<!-- 											</td> -->
<!-- 										</tr> -->
									</tbody>
								</table>
							</td>
						</tr>

					</tbody>
					<!-- /.row -->
				</table>
				<p align="center">
					<a href="wc_update.kosta"><input class="btn btn-default" type="submit" value="����"></a>&nbsp;
					<a href="servicejoin.kosta"><input class="btn btn-default" type="button" value="����ȸ������"></a>
				</p>
			</div>
			<!-- /.container -->

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>