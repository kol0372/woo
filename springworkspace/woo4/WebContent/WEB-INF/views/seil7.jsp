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
            text: '2014�� �⵿ ��Ȳ'
        },
        yAxis: {
            allowDecimals: false,
            title: {
                text: '�⵿Ƚ��'
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
						<li class="nav-header"><a href="schedule.kosta">������ ����</a></li>
						<li class="nav-header"><a href="gogo.kosta">�⵿</a></li>
						<li class="divider"></li>
						<li class="nav-header">���Ⱥ�</li>
						<li><a href="request.kosta"> ���˿�û��ȸ </a></li>
						<li><a href="chooldong.kosta"> �⵿����Է� </a></li>
						<li><a href="chooldonglist.kosta"> �⵿�����ȸ </a></li>
						<li class="divider"></li>
						<li class="nav-header">������</li>
						<li><a href="client.kosta"> �������� </a></li>
						<li><a href="sangdam.kosta"> ��������� </a></li>
						<li class="active"><a href="seil.kosta"> ������������ </a></li>
						<li><a href="y_chooldonglist.kosta"> �⵿�����ȸ </a></li>
						<li><a href="contract.kosta"> ������ </a></li>
					</ul>
				</div>
			</section>
			<section Id="main" class="col-md-9">
				<div>
					<aside class="right-side">
						<!-- s : Content ���� -->
						<section class="content col-xs-12">
							<div class="col-xs-12">
								<!-- .box�� Bootstrap�� .panel�� �ش�ȴ�. -->
								<div class="box">
									<!-- e : Box Body ���� -->
									<div class="page-header">
										<h1>
											<b> HADU WOORI </b> <small> ��������Ȳ�Դϴ�</small>
										</h1>
									</div>
									<ul class="nav navbar-nav">

										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" aria-haspopup="true" role="button"
											aria-expanded=""> <i class="fa fa-group"></i> <span
												class="hidden-sm">��Ʈ��Ʈ��</span> <b class="caret"></b>
										</a>
											<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
												<li role="presentation"><a tabindex="-1"
													href="seil3.kosta">�Ǹű��</a></li>
												<li role="presentation"><a tabindex="-1"
													href="chooldong.kosta">�⵿����Է�</a></li>
												<li role="presentation"><a tabindex="-1"
													href="chooldonglist.kosta">�⵿�����ȸ</a></li>
											</ul></li>


										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" aria-haspopup="true" role="button"
											aria-expanded=""> <i class="fa fa-group"></i> <span
												class="hidden-sm">high chart</span> <b class="caret"></b>
										</a>
											<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
												<li role="presentation"><a tabindex="-1"
													href="seil5.kosta">�������</a></li>
												<li role="presentation"><a tabindex="-1"
													href="seil6.kosta">�������Լ�</a></li>
												<li role="presentation"><a tabindex="-1"
													href="seil7.kosta">�浿 �� ����</a></li>
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
			<th>����⵿</th>
			<th>�����⵿</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>1��</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>2��</th>
			<td>2</td>
			<td>0</td>
		</tr>
		<tr>
			<th>3��</th>
			<td>5</td>
			<td>11</td>
		</tr>
		<tr>
			<th>4��</th>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<th>5��</th>
			<td>2</td>
			<td>4</td>
		</tr>
		<tr>
			<th>6��</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>7��</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>8��</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>9��</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>10��</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>11��</th>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<th>12��</th>
			<td>3</td>
			<td>4</td>
		</tr>
	</tbody>
</table>
							</div>
							<!-- /.row -->
						</section>
						<!-- /.content -->
						<!-- e : Content ���� -->
					</aside>
					<!-- /.right-side -->
				</div>
			</section>


		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>