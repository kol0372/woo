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
                <h1 class="page-header">자주하는 질문
                    <small></small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="main.kosta">Home</a>
                    </li>
                    <li class="active">자주하는 질문</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
           <div class="mailbox table-responsive">
								<table id="example1" class="table table-mailbox table-striped">
									<!-- id="example1" : 목록수 조정 가능 플러그인 사용 -->
									<thead>
										<tr>							
											<th>리스트번호</th>
											<th>질문내용</th>
											<th>질문에대한답변</th>											
										</tr>
									</thead>
									<tbody>
										<tr>									
											<td>1</td>
											<td>이거왜해야되는거에요?</td>
											<td>나도몰라</td>											
										</tr>
										<tr>										
											<td>2</td>
											<td>왜하는건지모르겠네</td>
											<td>미쳤다!!!!</td>											
										</tr>
										<tr>										
											<td>3</td>
											<td>하드우리는 핑크를좋아하나요?</td>
											<td>개좋아</td>											
										</tr>
										<tr>										
											<td>4</td>
											<td>종규는 내일 지각할까요?</td>
											<td>버스타고와야지</td>																					</tr>
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
