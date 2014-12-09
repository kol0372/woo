<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="service">


	

			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">����</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">Services</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->

				<!-- Image Header -->
				<div class="row">
					<div class="col-lg-12">
						<img class="img-responsive" src="http://placehold.it/1200x300"
							alt="">
					</div>
				</div>
				<!-- /.row -->

				<!-- Service Panels -->
				<!-- The circle icons use Font Awesome's stacked icon classes. For more information, visit http://fontawesome.io/examples/ -->
				<div class="row">
					<div class="col-lg-12">
						<h2 class="page-header">���� ������</h2>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="panel panel-default text-center">
							<div class="panel-heading">
								<span class="fa-stack fa-5x"> <i
									class="fa fa-circle fa-stack-2x text-primary"></i> <i
									class="fa fa-tree fa-stack-1x fa-inverse"></i>
								</span>
							</div>
							<div class="panel-body">
								<h4>Step One</h4>
								<p>ħ�� �溸 ����</p>
								<a href="#" class="btn btn-primary">Learn More</a>
							</div>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="panel panel-default text-center">
							<div class="panel-heading">
								<span class="fa-stack fa-5x"> <i
									class="fa fa-circle fa-stack-2x text-primary"></i> <i
									class="fa fa-support fa-stack-1x fa-inverse"></i>
								</span>
							</div>
							<div class="panel-body">
								<h4>Step Two</h4>
								<p>�� ����͸� �� ���� �⵿</p>
								<a href="#" class="btn btn-primary">Learn More</a>
							</div>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="panel panel-default text-center">
							<div class="panel-heading">
								<span class="fa-stack fa-5x"> <i
									class="fa fa-circle fa-stack-2x text-primary"></i> <i
									class="fa fa-database fa-stack-1x fa-inverse"></i>
								</span>
							</div>
							<div class="panel-body">
								<h4>Step Three</h4>
								<p>���� ����</p>
								<a href="#" class="btn btn-primary">Learn More</a>
							</div>
						</div>
					</div>
				</div>

				<!-- Service Tabs -->
				<div class="row">
					<div class="col-lg-12">
						<h2 class="page-header">���� �� ����</h2>
					</div>
					<div class="col-lg-12">

						<ul id="myTab" class="nav nav-tabs nav-justified">
							<li class="active"><a href="#step-one" data-toggle="tab"><i
									class="fa fa-tree"></i> Step One</a></li>
							<li class=""><a href="#step-two" data-toggle="tab"><i
									class="fa fa-car"></i> Step Two</a></li>
							<li class=""><a href="#step-three" data-toggle="tab"><i
									class="fa fa-support"></i> Step Three</a></li>
						</ul>

						<div id="myTabContent" class="tab-content">
							<div class="tab-pane fade active in" id="step-one">
								<h4>Step One</h4>
								<p>�����ļ����� �̿��Ͽ� ���� �������� �����մϴ�.</p>
								<p>�溸�⸦ �۵���Ų �� ���� �������� �����Ǹ� �溸��� ��� ���԰� ��� �������� �̸� �˸��ϴ�.</p>
							</div>
							<div class="tab-pane fade" id="step-two">
								<h4>Step Two</h4>
								<p>�溸�Ⱑ ������ ����Ʈ������ ħ�� �溸�� �˷����� ��� ������ ������� ������ �ǽð� ����͸� �� ��
									�ֽ��ϴ�.</p>
								<p>��� ������ ħ�� �溸 Ȯ�� �� ��� �⵿�ؼ� ���� ��Ȳ�� Ȯ���մϴ�.</p>
							</div>
							<div class="tab-pane fade" id="step-three">
								<h4>Step Three</h4>
								<p>���� ���۵�, ����ȭ ������ ���� ������ �������� ������ ���� ���� �� ���� ������ �ص帳�ϴ�.</p>
							</div>
						</div>

					</div>
				</div>
			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>