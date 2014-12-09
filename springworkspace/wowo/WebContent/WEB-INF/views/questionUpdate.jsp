<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="questionUpdate">

			<!-- Page Content -->
			<div class="container">

				<!-- Page Heading/Breadcrumbs -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							고객문의Q&A <small></small>
						</h1>
						<ol class="breadcrumb">
							<li><a href="main.kosta">Home</a></li>
							<li class="active">고객문의Q&A</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->

				<!-- Content Row -->
				<div class="row">
					<div class="col-md-8">
						<h3>Q&A등록</h3>
						<form action="write.kosta" method="post" id="f">
							<!--                     <div class="control-group form-group"> -->
							<!--                         <div class="controls"> -->
							<!--                             <label>회원ID:(작성자)</label> -->
							<!--                             <input type="text" class="form-control" id="id" required data-validation-required-message="Please enter your id."> -->
							<!--                             <p class="help-block"></p> -->
							<!--                         </div> -->
							<!--                     </div> -->
							<div class="control-group form-group">
								<div class="controls">
									<label>제목:</label> <input type="text" class="form-control"
										id="qtitle" required
										data-validation-required-message="Please enter your qtitle." name="qtitle">
								</div>
							</div>
							<div class="control-group form-group">
								<div class="controls">
									<label>내용:</label>
									<textarea rows="3" cols="100" class="form-control"
										id="qcontent" name="qcontent" required
										data-validation-required-message="Please enter your message"
										maxlength="999" style="resize: none"></textarea>
								</div>
							</div>
							<label>파일올리기:</label>
							<div class="form-group">
								<div class="fileinput fileinput-new" data-provides="fileinput">
									<div class="input-group">
										<div class="form-control uneditable-input"
											data-trigger="fileinput">
											<span class="fui-clip fileinput-exists"></span> <span
												class="fileinput-filename"></span>
										</div>
										<span class="input-group-btn btn-file"> <span
											class="btn btn-default fileinput-new" data-role="select-file"><input
												type="file" name="..."></span>

										</span>
									</div>
								</div>
							</div>
							<div id="success">
							<!-- For success/fail messages -->
							
								<button type="submit" class="btn btn-primary">등록</button>
							<a href="question.kosta">
								<button class="btn btn-primary">취소</button>
							</a>
						</div>
						</form>
						
						
<!-- 						<td colspan="2"><input type="submit" onclick="sendForm()" -->
<!-- 						value="글작성"> &nbsp; <input type="button" -->
<!-- 						onclick="goList('list.kosta','')" value="리스트"></td> -->
						
						
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
