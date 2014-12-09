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
						<h1 class="page-header">서비스</h1>
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
						<h2 class="page-header">서비스 순서도</h2>
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
								<p>침입 경보 전달</p>
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
								<p>고객 모니터링 및 현장 출동</p>
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
								<p>사후 관리</p>
								<a href="#" class="btn btn-primary">Learn More</a>
							</div>
						</div>
					</div>
				</div>

				<!-- Service Tabs -->
				<div class="row">
					<div class="col-lg-12">
						<h2 class="page-header">서비스 상세 설명</h2>
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
								<p>초음파센서를 이용하여 문의 움직임을 측정합니다.</p>
								<p>경보기를 작동시킨 후 문의 움직임이 감지되면 경보기는 즉시 고객님과 담당 직원에게 이를 알립니다.</p>
							</div>
							<div class="tab-pane fade" id="step-two">
								<h4>Step Two</h4>
								<p>경보기가 고객님의 스마트폰으로 침입 경보를 알려오면 즉시 어플을 실행시켜 현장을 실시간 모니터링 할 수
									있습니다.</p>
								<p>담당 직원은 침입 경보 확인 뒤 즉시 출동해서 현장 상황을 확인합니다.</p>
							</div>
							<div class="tab-pane fade" id="step-three">
								<h4>Step Three</h4>
								<p>센서 오작동, 노후화 등으로 인한 고객님의 불편함이 없도록 정기 점검 및 수시 점검을 해드립니다.</p>
							</div>
						</div>

					</div>
				</div>
			</div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>