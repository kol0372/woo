<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>



<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="seil">
<script>
$(function () {
    $('#container').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '2014년 매출현황'
        },

        xAxis: {
            type: 'category',
            labels: {
                rotation: -45,
                style: {
                    fontSize: '13px',
                    fontFamily: 'Verdana, sans-serif'
                }
            }
        },
        yAxis: {
            min: 0,
            title: {
                text: '매출(원)'
            }
        },
        legend: {
            enabled: false
        },
        tooltip: {
            pointFormat: 'Population in 2008: <b>{point.y:.1f} millions</b>'
        },
        series: [{
            name: 'Population',
            data: [
                ['1월', 23.7],
                ['2월', 16.1],
                ['3월', 14.2],
                ['4월', 14.0],
                ['5월', 12.5],
                ['6월', 12.1],
                ['7월', 11.7],
                ['8월', 11.1],
                ['9월', 11.1],
                ['10월', 10.5],
                ['11월', 10.4],
                ['12월', 10.0],
               
            ],
            dataLabels: {
                enabled: true,
                rotation: -90,
                color: '#FFFFFF',
                align: 'right',
                x: 4,
                y: 10,
                style: {
                    fontSize: '13px',
                    fontFamily: 'Verdana, sans-serif',
                    textShadow: '0 0 3px black'
                }
            }
        }]
    });
});
</script>


			<section id="sidebar" class="col-md-2"
				style="min-height: 949px; background-color: #cccc99;">
				<div>
					<ul class="nav nav-list">
						<li class="nav-header"><a href="schedule.kosta">스케줄 관리</a></li>
						<li class="nav-header"><a href="gogo.kosta">출동</a></li>
						<li class="divider"></li>
						<li class="nav-header">보안부</li>
						<li><a href="request.kosta"> 점검요청조회 </a></li>
						<li><a href="chooldong.kosta"> 출동기록입력 </a></li>
						<li><a href="chooldonglist.kosta"> 출동기록조회 </a></li>
						<li class="divider"></li>
						<li class="nav-header">영업부</li>
						<li><a href="client.kosta"> 고객관리 </a></li>
						<li><a href="sangdam.kosta"> 상담페이지 </a></li>
						<li class="active"><a href="seil.kosta"> 영업실적관리 </a></li>
						<li><a href="y_chooldonglist.kosta"> 출동기록조회 </a></li>
						<li><a href="contract.kosta"> 계약관리 </a></li>
					</ul>
				</div>
			</section>
			<section Id="main" class="col-md-9">
				<div>
					<aside class="right-side">
						<!-- s : Content 영역 -->
						<section class="content col-xs-12">
							<div class="col-xs-12">
								<!-- .box는 Bootstrap의 .panel에 해당된다. -->
								<div class="box">
									<!-- e : Box Body 영역 -->
									<div class="page-header">
										<h1>
											<b> HADU WOORI </b> <small> 현재기록현황입니다</small>
										</h1>
									</div>
									<ul class="nav navbar-nav">

										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" aria-haspopup="true" role="button"
											aria-expanded=""> <i class="fa fa-group"></i> <span
												class="hidden-sm">부트스트랩</span> <b class="caret"></b>
										</a>
											<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
												<li role="presentation"><a tabindex="-1"
													href="seil3.kosta">판매기록</a></li>
												<li role="presentation"><a tabindex="-1"
													href="chooldong.kosta">출동기록입력</a></li>
												<li role="presentation"><a tabindex="-1"
													href="chooldonglist.kosta">출동기록조회</a></li>
											</ul></li>


										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" aria-haspopup="true" role="button"
											aria-expanded=""> <i class="fa fa-group"></i> <span
												class="hidden-sm">high chart</span> <b class="caret"></b>
										</a>
											<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
												<li role="presentation"><a tabindex="-1"
													href="seil5.kosta">매출통계</a></li>
												<li role="presentation"><a tabindex="-1"
													href="seil6.kosta">고객가입수</a></li>
												<li role="presentation"><a tabindex="-1"
													href="seil7.kosta">충동 및 점검</a></li>
											</ul></li>



									</ul>
								</div>
								<!-- /.box -->
								<!-- /.col -->
								<div id="container" style="min-width: 500px; height: 400px; margin: 0 auto"></div>
							</div>
							<!-- /.row -->
						</section>
						<!-- /.content -->
						<!-- e : Content 영역 -->
					</aside>
					<!-- /.right-side -->
				</div>
			</section>


		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
