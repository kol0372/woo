<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="request">

	<div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">���˿�û
                    <small></small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="main.kosta">Home</a>
                    </li>
                    <li class="active">���˿�û</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
            <div class="mailbox table-responsive">
										<table class="table table-mailbox table-striped">
											<thead>
												<tr>
													<th class="text-center">������ȣ</th>
													<th class="text-center">���񽺹�ȣ</th>
													<th class="text-center">��������</th>
													<th class="text-center">�湮��¥</th>
													<th class="text-center">�湮������</th>
													<th class="text-center">�����������</th>
												</tr>
											</thead>
											<tbody>
												<tr>													
													<td class="text-center">1</td>
													<td class="text-center">net54</td>
													<td class="text-center">��ǰ ����ȭ ��ü ��û</td>
													<td class="text-center">2014.11.25</td>
													<td class="text-center">�Ǽ���(�븮)</td>
													<td class="text-center">�Ϸ�</td>
												</tr>
												<tr>													
													<td class="text-center">10</td>
													<td class="text-center">net54</td>
													<td class="text-center">����(���� ���۵�)</td>
													<td class="text-center">2014.11.28</td>
													<td class="text-center">������(�븮)</td>
													<td class="text-center">�Ϸ�</td>
												</tr>
												<tr>
													<td class="text-center">37</td>
													<td class="text-center">net54</td>
													<td class="text-center">����(���� �̻�)</td>
													<td class="text-center">2014.11.30</td>
													<td class="text-center">������(�븮)</td>
													<td class="text-center">�Ϸ�</td>
												</tr>
												<tr>
													<td class="text-center">57</td>
													<td class="text-center">net54</td>
													<td class="text-center">��ǰ �̻� ��ü</td>
													<td class="text-center">2014.12.20</td>
													<td class="text-center">�̿���(�븮)</td>
													<td class="text-center">�Ϸ�</td>
												</tr>
												<tr>
													<td class="text-center">98</td>
													<td class="text-center">net54</td>
													<td class="text-center">���� ����ȭ</td>
													<td class="text-center">2014.12.25</td>
													<td class="text-center">������(�븮)</td>
													<td class="text-center">������</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="pull-right">
									<a href="requestUpdate.kosta">
										<button type="button" class="btn btn-primary btn-sm">
											<span class="fa fa-plus"></span> ���˿�û���
										</button>
									</a>
									</div>
									
        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
 

    </div>
  	</div>
	</tiles:putAttribute>
</tiles:insertDefinition>