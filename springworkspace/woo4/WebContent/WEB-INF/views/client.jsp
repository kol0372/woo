<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="client">
<script type="text/javascript">

function convert(sValue, sDataType) {
switch(sDataType) {
case "int":
return parseInt(sValue);
case "float":
return parseFloat(sValue);
case "date":
return new Date(Date.parse(sValue));
default:
return sValue.toString();

}
}

function generateCompareTRs(iCol, sDataType) {

return function compareTRs(oTR1, oTR2) {
var vValue1 = convert(oTR1.cells[iCol].firstChild.nodeValue, sDataType);
var vValue2 = convert(oTR2.cells[iCol].firstChild.nodeValue, sDataType);

if (vValue1 < vValue2) {
return -1;
} else if (vValue1 > vValue2) {
return 1;
} else {
return 0;
}
};
}

function sortTable(sTableID, iCol, sDataType) {
var oTable = document.getElementById(sTableID);
var oTBody = oTable.tBodies[0];
var colDataRows = oTBody.rows;
var aTRs = new Array;

for (var i=0; i < colDataRows.length; i++) {
aTRs[i] = colDataRows[i];
}

if (oTable.sortCol == iCol) {
aTRs.reverse();
} else {
aTRs.sort(generateCompareTRs(iCol, sDataType));
}

var oFragment = document.createDocumentFragment();
for (var i=0; i < aTRs.length; i++) {
oFragment.appendChild(aTRs[i]);
}

oTBody.appendChild(oFragment);
oTable.sortCol = iCol;
}
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
				<li class="active"><a href="client.kosta"> 고객관리 </a></li>
				<li><a href="sangdam.kosta"> 상담페이지 </a></li>
				<li><a href="seil.kosta"> 영업실적관리 </a></li>
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

							<!-- s : Box Header 영역 -->
							<div class="box-header">
								<h3 class="box-title">고객관리</h3>

							</div>
							<!-- /.box-header -->
							<!-- e : Box Header 영역 -->

							<!-- s : Box Body 영역 -->
							<div class="box-body">



								<!-- s : 테이블 본체 -->
								<div class="row">
									<div class="col-xs-12">

										<div class="mailbox table-responsive">

											<table id="tblSort" class="table table-mailbox table-striped">
												<thead>
													<tr>
													<th><label class="checkbox no-label toggle-all"
																for="checkbox-table-1"><input type="checkbox"
																	value="" id="checkbox-table-1" data-toggle="checkbox"></label></th>
														<th onclick="sortTable('tblSort', 0)"
														style="cursor:pointer" class="text-center" style="width: 80px">서비스번호</th>
														<th onclick="sortTable('tblSort', 1)"
														style="cursor:pointer" class="text-center" style="width: 80px">ID</th>
														<th onclick="sortTable('tblSort', 2)"
														style="cursor:pointer" class="text-center" style="width: 80px">이름</th>
														<th onclick="sortTable('tblSort', 3)"
														style="cursor:pointer" class="text-center">이메일</th>
														<th onclick="sortTable('tblSort', 4)"
														style="cursor:pointer" class="text-center">신청처</th>
														<th onclick="sortTable('tblSort', 5)"
														style="cursor:pointer" class="text-center">신청주소</th>
														<th onclick="sortTable('tblSort', 6)"
														style="cursor:pointer" class="text-center">전화번호</th>
														<th onclick="sortTable('tblSort', 7)"
														style="cursor:pointer" class="text-center">계약날짜</th>
														

													</tr>
													</thead>
													<tbody>
													<tr>
													<td><label class="checkbox no-label"
																for="checkbox-table-2"><input type="checkbox"
																	value="" id="checkbox-table-2" data-toggle="checkbox"></label></td>
														<td class="text-center">abc3</td>
														<td class="text-center">abc3</td>
														<td class="text-center">권순길</td>
														<td class="text-center">kol7456@naver.com</td>
														<td class="text-center">럭키유통</td>
														<td class="text-center">서울시 관악구 신림동 255-3번지</td>
														<td class="text-center">011-2233-2223</td>
														<td class="text-center">2014-12-23</td>
														
													</tr>
													<tr>
													<td><label class="checkbox no-label"
																for="checkbox-table-3"><input type="checkbox"
																	value="" id="checkbox-table-3" data-toggle="checkbox"></label></td>
														<td class="text-center">abc2</td>
														<td class="text-center">abc3</td>
														<td class="text-center">권순길</td>
														<td class="text-center">kol7456@naver.com</td>
														<td class="text-center">럭키유통</td>
														<td class="text-center">서울시 관악구 신림동 255-3번지</td>
														<td class="text-center">011-2233-2442</td>
														<td class="text-center">2014-12-23</td>
														
													</tr>
													<tr>
													<td><label class="checkbox no-label"
																for="checkbox-table-4"><input type="checkbox"
																	value="" id="checkbox-table-4" data-toggle="checkbox"></label></td>
														<td class="text-center">abc1</td>
														<td class="text-center">abc3</td>
														<td class="text-center">권순길</td>
														<td class="text-center">kol7456@naver.com</td>
														<td class="text-center">럭키유통</td>
														<td class="text-center">서울시 관악구 신림동 255-3번지</td>
														<td class="text-center">011-2233-2222</td>
														<td class="text-center">2014-12-11</td>
													</tr>
												</tbody>


											</table>
										</div>

									</div>
								</div>
								<!-- /.row -->
								<!-- e : 테이블 본체 -->

							</div>
							<!-- /.box-body -->
							<!-- e : Box Body 영역 -->

							<div class="box-footer clearfix">
								<div class="pagination">
									<ul>
										<li class="previous"><a href="#fakelink"
											class="fui-arrow-left"></a></li>
										<li class="active"><a href="#fakelink">1</a></li>
										<li><a href="#fakelink">2</a></li>
										<li><a href="#fakelink">3</a></li>
										<li><a href="#fakelink">4</a></li>
										<li><a href="#fakelink">5</a></li>
										<li><a href="#fakelink">6</a></li>
										<li><a href="#fakelink">7</a></li>
										<li><a href="#fakelink">8</a></li>
										<li><a href="#fakelink">9</a></li>
										<li><a href="#fakelink">10</a></li>

										<li class="next"><a href="#fakelink"
											class="fui-arrow-right"></a></li>
									</ul>
								</div>
<!-- 									<div class="pull-right"> -->
<!-- 										<a href="client.kosta"> -->
<!-- 											<button type="button" class="btn btn-primary btn-sm"> -->
<!-- 												<span class="fa fa-plus"></span> 수정 -->
<!-- 											</button> -->
<!-- 										</a> -->
<!-- 										<a href="client.kosta"> -->
<!-- 											<button type="button" class="btn btn-primary btn-sm"> -->
<!-- 												<span class="fa fa-plus"></span> 삭제 -->
<!-- 											</button> -->
<!-- 										</a> -->
<!-- 									</div> -->


							</div>

						</div>
						<!-- /.box -->
						<!-- /.col -->
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
