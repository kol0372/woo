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
                <h1 class="page-header">점검요청
                    <small></small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="main.kosta">Home</a>
                    </li>
                    <li class="active">점검요청</li>
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
													<th class="text-center">접수번호</th>
													<th class="text-center">서비스번호</th>
													<th class="text-center">접수내용</th>
													<th class="text-center">방문날짜</th>
													<th class="text-center">방문직원명</th>
													<th class="text-center">현재진행상태</th>
												</tr>
											</thead>
											<tbody>
												<tr>													
													<td class="text-center">1</td>
													<td class="text-center">net54</td>
													<td class="text-center">부품 노후화 교체 요청</td>
													<td class="text-center">2014.11.25</td>
													<td class="text-center">권순길(대리)</td>
													<td class="text-center">완료</td>
												</tr>
												<tr>													
													<td class="text-center">10</td>
													<td class="text-center">net54</td>
													<td class="text-center">고장(센서 오작동)</td>
													<td class="text-center">2014.11.28</td>
													<td class="text-center">김종규(대리)</td>
													<td class="text-center">완료</td>
												</tr>
												<tr>
													<td class="text-center">37</td>
													<td class="text-center">net54</td>
													<td class="text-center">고장(센서 이상)</td>
													<td class="text-center">2014.11.30</td>
													<td class="text-center">김종규(대리)</td>
													<td class="text-center">완료</td>
												</tr>
												<tr>
													<td class="text-center">57</td>
													<td class="text-center">net54</td>
													<td class="text-center">부품 이상 교체</td>
													<td class="text-center">2014.12.20</td>
													<td class="text-center">이영섭(대리)</td>
													<td class="text-center">완료</td>
												</tr>
												<tr>
													<td class="text-center">98</td>
													<td class="text-center">net54</td>
													<td class="text-center">센서 노후화</td>
													<td class="text-center">2014.12.25</td>
													<td class="text-center">김종규(대리)</td>
													<td class="text-center">진행중</td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="pull-right">
									<a href="requestUpdate.kosta">
										<button type="button" class="btn btn-primary btn-sm">
											<span class="fa fa-plus"></span> 점검요청등록
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