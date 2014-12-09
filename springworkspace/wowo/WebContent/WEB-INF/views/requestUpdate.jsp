<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="requestUpdate">

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
            <div class="col-md-8">
                <h3>점검요청 등록</h3>
                <form name="sentMessage" id="contactForm" novalidate>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>서비스번호:</label>
                            <input type="text" class="form-control" id="sname" required data-validation-required-message="Please enter your name.">
                            <p class="help-block"></p>
                        </div>
                    </div>
                                   
                    <div class="control-group form-group">
                        <div class="controls">
                            <label>접수내용:</label>
                            <textarea rows="3" cols="100" class="form-control" id="message" required data-validation-required-message="Please enter your message" maxlength="999" style="resize:none"></textarea>
                        </div>
                    </div>                    
                </form>
                <div id="success">
                    <!-- For success/fail messages -->
                    <a href="request.kosta">
                    <button type="submit" class="btn btn-primary">등록</button>
                    </a>
                    <a href="request.kosta">
                    <button type="submit" class="btn btn-primary">취소</button>
                    </a>
            	</div>            	
            </div>           
        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
  

    </div>

		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
