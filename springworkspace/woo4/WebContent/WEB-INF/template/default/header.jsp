<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport'>
<title>haduwoori</title>
<script src="js/data.js"></script>
<script src="js/highcharts.js"></script>
<script src="exporting.js"></script>
<script src="js/Chart.js"></script>
<script src="js/Chart.min.js"></script>
<script src="js/gulpfile.js"></script>
<script src="js/jquery-1.8.3.min.js"></script>
<script src="js/jquery-ui-1.10.3.custom.min.js"></script>
<script src="js/jquery.ui.touch-punch.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-select.js"></script>
<script src="js/bootstrap-switch.js"></script>
<script src="js/flatui-checkbox.js"></script>
<script src="js/flatui-radio.js"></script>
<script src="js/flatui-fileinput.js"></script>
<script src="js/holder.js"></script>
<script src="js/jquery.tagsinput.js"></script>
<script src="js/jquery.placeholder.js"></script>
<script src="js/typeahead.js"></script>
<script src="bootstrap/js/google-code-prettify/prettify.js"></script>
<script src="js/application.js"></script>

<script type="text/javascript">
	function convert(sValue, sDataType) {
		switch (sDataType) {
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
			var vValue1 = convert(oTR1.cells[iCol].firstChild.nodeValue,
					sDataType);
			var vValue2 = convert(oTR2.cells[iCol].firstChild.nodeValue,
					sDataType);

			if (vValue1 < vValue2) {
				return -1;
			} else if (vValue1 > vValue2) {
				return 1;
			} else {
				return 0;
			}
		};
	}
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

        return  function compareTRs(oTR1, oTR2) {
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

		for (var i = 0; i < colDataRows.length; i++) {
			aTRs[i] = colDataRows[i];
		}

		if (oTable.sortCol == iCol) {
			aTRs.reverse();
		} else {
			aTRs.sort(generateCompareTRs(iCol, sDataType));
		}

		var oFragment = document.createDocumentFragment();
		for (var i = 0; i < aTRs.length; i++) {
			oFragment.appendChild(aTRs[i]);
		}

		oTBody.appendChild(oFragment);
		oTable.sortCol = iCol;
	}
</script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Loading Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/prettify.css" rel="stylesheet">

<!-- Loading Flat UI -->
<link href="css/flat-ui.css" rel="stylesheet">
<link href="css/demo.css" rel="stylesheet">



<link rel="shortcut icon" href="images/favicon.ico">

</head>

<body>
	<!-- 	<div class="bottom-menu"> -->
	<!-- 		<div class="container"></div> -->
	<!-- 	</div> -->
	<header>

		<div class="bottom-menu bottom-menu-inverse col-xs-12">

			<div class="navbar-collapse collapse">
				<div class="col-sm-4 col-sm-offset-9">
					<ul class="nav navbar-nav navbar-left">
						<li><a href="profile.kosta">${username}</a></li>
						<li><a href="dept.kosta">영업부</a></li>
						<li><a href="j_spring_security_logout">로그아웃</a></li>
					</ul>
				</div>


				<div class="col-sm-12">
					<nav class="navbar navbar-default" role="navigation">

						<div class="collapse navbar-collapse" id="navbar-collapse-01">

							<!-- 드롭 -->
							<ul class="nav navbar-nav">

								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" aria-haspopup="true" role="button"
									aria-expanded=""> <i class="fa fa-group"></i> <span
										class="hidden-sm">보안부</span> <b class="caret"></b>
								</a>
									<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
										<li role="presentation"><a tabindex="-1"
											href="request.kosta">점검요청조회</a></li>
										<li role="presentation"><a tabindex="-1"
											href="chooldong.kosta">출동기록입력</a></li>
										<li role="presentation"><a tabindex="-1"
											href="chooldonglist.kosta">출동기록조회</a></li>
									</ul></li>


								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" aria-haspopup="true" role="button"
									aria-expanded=""> <i class="fa fa-group"></i> <span
										class="hidden-sm">영업부</span> <b class="caret"></b>
								</a>
									<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
										<li role="presentation"><a tabindex="-1"
											href="client.kosta">고객관리</a></li>
										<li role="presentation"><a tabindex="-1"
											href="sangdam.kosta">상담페이지</a></li>
										<li role="presentation"><a tabindex="-1" href="seil.kosta">영업실적관리</a></li>
										<li role="presentation"><a tabindex="-1"
											href="y_chooldonglist.kosta">출동기록조회</a></li>
										<li role="presentation"><a tabindex="-1"
											href="contract.kosta">계약관리</a></li>

									</ul></li>

							
							

							</ul>
							
							<ul class="nav navbar-nav navbar-right col-sm-offset-6">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" aria-haspopup="true" role="button"
									aria-expanded=""> <i class="fa fa-group"></i> <span
										class="hidden-sm">검색큰카테고리</span> <b class="caret"></b>
								</a>
									<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
										<li role="presentation"><a tabindex="-1"
											href="client.kosta">고객관리</a></li>
										<li role="presentation"><a tabindex="-1"
											href="sangdam.kosta">상담페이지</a></li>
										<li role="presentation"><a tabindex="-1" href="seil.kosta">영업실적관리</a></li>
										<li role="presentation"><a tabindex="-1"
											href="y_chooldonglist.kosta">출동기록조회</a></li>
										<li role="presentation"><a tabindex="-1"
											href="contract.kosta">계약관리</a></li>

									</ul></li>
								<li class="dropdown-right"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" aria-haspopup="true" role="button"
									aria-expanded=""> <i class="fa fa-group"></i> <span
										class="hidden-sm">검색작은카테고리</span> <b class="caret"></b>
								</a>
									<ul class="dropdown-menu" role="menu" aria-labelledby="drop1">
										<li role="presentation"><a tabindex="-1"
											href="client.kosta">고객관리</a></li>
										<li role="presentation"><a tabindex="-1"
											href="sangdam.kosta">상담페이지</a></li>
										<li role="presentation"><a tabindex="-1" href="seil.kosta">영업실적관리</a></li>
										<li role="presentation"><a tabindex="-1"
											href="y_chooldonglist.kosta">출동기록조회</a></li>
										<li role="presentation"><a tabindex="-1"
											href="contract.kosta">계약관리</a></li>

									</ul></li>
							</ul>
								<form class="navbar-form navbar-right" action="#" role="search">
									
									<div class="form-group">
										<div class="input-group">
											<input class="form-control" id="navbarInput-01" type="search"
												placeholder="Search"> <span class="input-group-btn">
												<button type="submit" class="btn">
													<span class="fui-search"></span>
												</button>
											</span>
										</div>

									</div>
								</form>

							<!-- 드롭 -->
							<!-- 							<div class="col-xs-2 col-md-offset-3"> -->
							<!-- 								<div class="btn-group"> -->
							<!-- 									<button class="btn btn-info">Dropdown</button> -->
							<!-- 									<button class="btn btn-info dropdown-toggle" -->
							<!-- 										data-toggle="dropdown"> -->
							<!-- 										<span class="caret"></span> -->
							<!-- 									</button> -->
							<!-- 									<span class="dropdown-arrow dropdown-arrow-inverse"></span> -->
							<!-- 									<ul class="dropdown-menu dropdown-inverse"> -->
							<!-- 										<li><a href="#fakelink">Sub Menu Element</a></li> -->
							<!-- 										<li><a href="#fakelink">Sub Menu Element</a></li> -->
							<!-- 										<li><a href="#fakelink">Sub Menu Element</a></li> -->
							<!-- 									</ul> -->
							<!-- 								</div> -->
							<!-- 							</div> -->
							<!-- 							<div class="col-md-2 col-xs-1"> -->
							<!-- 								<div class="btn-group"> -->
							<!-- 									<button class="btn btn-info">Dropdown</button> -->
							<!-- 									<button class="btn btn-info dropdown-toggle" -->
							<!-- 										data-toggle="dropdown"> -->
							<!-- 										<span class="caret"></span> -->
							<!-- 									</button> -->
							<!-- 									<span class="dropdown-arrow dropdown-arrow-inverse"></span> -->
							<!-- 									<ul class="dropdown-menu dropdown-inverse"> -->
							<!-- 										<li><a href="#fakelink">Sub Menu Element</a></li> -->
							<!-- 										<li><a href="#fakelink">Sub Menu Element</a></li> -->
							<!-- 										<li><a href="#fakelink">Sub Menu Element</a></li> -->
							<!-- 									</ul> -->
							<!-- 								</div> -->
							<!-- 							</div> -->
							<!-- 							<form class="navbar-form navbar-right" action="#" role="search"> -->

							<!-- 								<div class="form-group"> -->
							<!-- 									<div class="input-group"> -->
							<!-- 										<input class="form-control" id="navbarInput-01" type="search" -->
							<!-- 											placeholder="Search"> <span class="input-group-btn"> -->
							<!-- 											<button type="submit" class="btn"> -->
							<!-- 												<span class="fui-search"></span> -->
							<!-- 											</button> -->
							<!-- 										</span> -->
							<!-- 									</div> -->

							<!-- 								</div> -->
							<!-- 							</form> -->
						</div>
						<!-- 찾기 -->
						</nav>
				</div>

			</div>
		</div>

	</header>
</html>