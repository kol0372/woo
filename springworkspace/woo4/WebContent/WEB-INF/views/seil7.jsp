<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
$(function () {
    $('#container').highcharts({
        data: {
            table: document.getElementById('datatable')
        },
        chart: {
            type: 'column'
        },
        title: {
            text: '2014년 출동 현황'
        },
        yAxis: {
            allowDecimals: false,
            title: {
                text: '출동횟수'
            }
        },
        tooltip: {
            formatter: function () {
                return '<b>' + this.series.name + '</b><br/>' +
                    this.point.y + ' ' + this.point.name.toLowerCase();
            }
        }
    });
});
</script>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="seil">



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
								<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

<table id="datatable">
	<thead>
		<tr>
			<th></th>
			<th>긴급출동</th>
			<th>점검출동</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>1월</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>2월</th>
			<td>2</td>
			<td>0</td>
		</tr>
		<tr>
			<th>3월</th>
			<td>5</td>
			<td>11</td>
		</tr>
		<tr>
			<th>4월</th>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<th>5월</th>
			<td>2</td>
			<td>4</td>
		</tr>
		<tr>
			<th>6월</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>7월</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>8월</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>9월</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>10월</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>11월</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>12월</th>
			<td>3</td>
			<td>4</td>
		</tr>
	</tbody>
</table>
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
