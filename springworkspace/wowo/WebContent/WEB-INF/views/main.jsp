<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="main">



	    <!-- Header Carousel -->
    <header id="myCarousel" class="carousel slide">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
            <div class="item active">
                <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide One');"></div>
                <div class="carousel-caption">
                    <h2>Caption 1</h2>
                </div>
            </div>
            <div class="item">
                <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide Two');"></div>
                <div class="carousel-caption">
                    <h2>Caption 2</h2>
                </div>
            </div>
            <div class="item">
                <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide Three');"></div>
                <div class="carousel-caption">
                    <h2>Caption 3</h2>
                </div>
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="icon-prev"></span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="icon-next"></span>
        </a>
    </header>

    <!-- Page Content -->
    <div class="container">

        <!-- Marketing Icons Section -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    Welcome to HaduWoori
                </h1>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4><i class="fa fa-fw fa-check"></i> HaduWoori 서비스</h4>
                    </div>
                    <div class="panel-body">
                        <p>HaduWoori의 서비스를 소개합니다.</p>
                       
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4><i class="fa fa-fw fa-compass"></i>고객 서비스</h4>
                    </div>
                    <div class="panel-body">
                        <p>편리한 고객 지원 서비스를 제공합니다.</p>
                       
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4><i class="fa fa-fw fa-gift"></i>??</h4>
                    </div>
                    <div class="panel-body">
                        <p>??</p>
                        
                    </div>
                </div>
            </div>            
        </div>
        <!-- /.row -->

        <!-- Portfolio Section -->
        <div class="row">            
            <div class="col-md-4 col-sm-6"> 
            	<div class="col-md-4">
            		<a href="service.kosta"><img src="https://www.s1.co.kr/images/main/icon_security03.gif" alt="24시간매장" /></a>
            	</div>            	
            	<div class="col-md-4">
            		<a href="service.kosta"><img src="https://www.s1.co.kr/images/main/icon_security02.gif" alt="일반매장" /></a>
            	</div> 
            	<div class="col-md-4">
            		<a href="service.kosta"><img src="https://www.s1.co.kr/images/main/icon_security01.gif" alt="사무실" /></a>
            	</div>              	            	
            	<div class="col-md-4">
            		<a href="service.kosta"><img src="https://www.s1.co.kr/images/main/icon_security04.gif" alt="음식점" /></a>
            	</div>
            	<div class="col-md-4">
            		<a href="service.kosta"><img src="https://www.s1.co.kr/images/main/icon_security05.gif" alt="귀금속점" /></a>
            	</div>
            	<div class="col-md-4">
            		<a href="service.kosta"><img src="https://www.s1.co.kr/images/main/icon_security06.gif" alt="병원" /></a>
            	</div>
            	<div class="col-md-4">
            		<a href="service.kosta"><img src="https://www.s1.co.kr/images/main/icon_security07.gif" alt="약국" /></a>
            	</div>
            	<div class="col-md-4">
            		<a href="service.kosta"><img src="https://www.s1.co.kr/images/main/icon_security08.gif" alt="공장" /></a>
            	</div>
            	<div class="col-md-4">
            		<a href="services.jsp"><img src="https://www.s1.co.kr/images/main/icon_security09.gif" alt="창고" /></a>
            	</div>
            </div>
            
            <div class="col-md-4 col-sm-6">
                <div class="col-md-4">
            		<a href="gogekjungbo.kosta"><img src="https://www.s1.co.kr/images/main/center_icon1.png" alt="사무실" /></a>
            	</div>  
            	<div class="col-md-4">
            		<a href="request.kosta"><img src="https://www.s1.co.kr/images/main/center_icon3.png" alt="일반매장" /></a>
            	</div>             	
            	<div class="col-md-4">
            		<a href="chooldonglist.kosta"><img src="https://www.s1.co.kr/images/main/center_icon9.png" alt="24시간매장" /></a>
            	</div> 
           <ul style="list-style:none;">
            	<li><a href="cameraCCTV.kosta"><img src="https://www.s1.co.kr/images/main/security_list02.gif" alt="영상보안 - 첨단 기술의 고화질 영상 감시 및 녹화 서비스" /></a><li>
                <li>    		
            		<h3><img src="https://www.s1.co.kr/images/main/h3_main08.gif" alt="고객의 소리" /></h3>
            		<p >소중한 문의와 상담을 통해<br />함께하는 HaduWorri가 되겠습니다.</p>            									
					<a href="questionjaju.kosta"><img src="https://www.s1.co.kr/images/main/voice_list04.gif" alt="자주하는 질문 바로가기" /></a>
					<a href="question.kosta"><img src="https://www.s1.co.kr/images/main/voice_list02.gif" alt="고객 문의 바로가기" /></a> 
	        	</li>
	        </ul>     	          	
            </div>
     
            <div class="col-md-4 col-sm-6">
                <a href="chooldonglist.kosta"><img src="" alt="" /></a>
            </div>            
        </div>
        <!-- /.row -->

        <!-- Features Section -->
        <div class="row">
            <div class="col-lg-12">
                <h2 class="page-header">회사소개</h2>
            </div>           
            <div class="col-md-6">                          
                <img src="https://www.s1.co.kr/images/s1/txt_s1_03_01.gif" alt="세상의 모든 안전과 안심, 편안함을 제공하겠습니다." />                        
            	<p></p>
            	 <p>저희 HaduWoori를 항상 변함없는 애정과 믿음으로 응원해주시는 고객 여러분께 진심으로 감사 드립니다.</p>
            
            	<h3>위치안내</h3>
                <p>
                    	경기도 성남시 분당구 삼평동<br> 대왕판교로 670길 유스페이스2 B동 8층<br>
                </p>
                <p><i class="fa fa-phone"></i> 
                    <abbr title="Phone">P</abbr>: (070) 7090-4856</p>
                <p><i class="fa fa-envelope-o"></i> 
                    <abbr title="Email">E</abbr>: <a href="mailto:haduwoori@naver.com">haduwoori@naver.com</a>
                </p>
                <p><i class="fa fa-clock-o"></i> 
                    <abbr title="Hours">H</abbr>: Monday - Friday: 9:00 AM to 5:00 PM</p>
                <ul class="list-unstyled list-inline list-social-icons">
                    <li>
                        <a href="#"><i class="fa fa-facebook-square fa-2x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-linkedin-square fa-2x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-twitter-square fa-2x"></i></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-google-plus-square fa-2x"></i></a>
                    </li>
                </ul>
            </div>                       
                
                    	         
            <div class="col-md-6">
                <img class="img-responsive" src="http://placehold.it/700x450" alt="">
            </div>
        </div>
        <!-- /.row -->

      
        <!-- Footer -->
     

    </div>
    <!-- /.container -->

 	</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
