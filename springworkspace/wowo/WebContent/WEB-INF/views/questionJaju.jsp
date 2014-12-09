<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="questionJaju">


    <!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">�����ϴ� ����
                    <small></small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="main.kosta">Home</a>
                    </li>
                    <li class="active">�����ϴ� ����</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
           <div class="mailbox table-responsive">
								<table id="example1" class="table table-mailbox table-striped">
									<!-- id="example1" : ��ϼ� ���� ���� �÷����� ��� -->
									<thead>
										<tr>							
											<th>����Ʈ��ȣ</th>
											<th>��������</th>
											<th>���������Ѵ亯</th>											
										</tr>
									</thead>
									<tbody>
										<tr>									
											<td>1</td>
											<td>�̰ſ��ؾߵǴ°ſ���?</td>
											<td>��������</td>											
										</tr>
										<tr>										
											<td>2</td>
											<td>���ϴ°����𸣰ڳ�</td>
											<td>���ƴ�!!!!</td>											
										</tr>
										<tr>										
											<td>3</td>
											<td>�ϵ�츮�� ��ũ�������ϳ���?</td>
											<td>������</td>											
										</tr>
										<tr>										
											<td>4</td>
											<td>���Դ� ���� �����ұ��?</td>
											<td>����Ÿ��;���</td>																					</tr>
									</tbody>
								</table>
							</div>									
        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
    
    </div>
    <!-- /.container -->




		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
