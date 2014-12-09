<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="login">




	<!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">로그인
                    <small>Login</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="main.kosta">Home</a>
                    </li>
                    <li class="active">로그인</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
	 <form method="post" action="j_spring_security_check"> 
      		<div class="col-sm-4">
			<div class="form-group">				
			<label>Id</label>
			<input type="text" class="form-control" name="id" />	
			
			<label>Pwd</label>
			<input type="text" class="form-control" name="id" />			
			</div>
			
			<div class="form-group">
			<a href="main.kosta">
				<button type="button" class="btn btn-primary btn-sm">
					<span class="fa fa-plus"></span> 로그인
				</button>
			</a>
			</div>
			</div>
				
		</form>
		    <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->


    </div>
    <!-- /.container -->

	</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
