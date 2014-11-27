
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
<head>


<title>홈 &lt; 종합 안심솔루션 기업 &lsquo;에스원&rsquo;</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="author" content="Pentabreed" />
<link rel="stylesheet" type="text/css" href="/common/css/s1.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="/common/css/print.css"
	media="print" />
<link rel="stylesheet" type="text/css"
	href="/common/css/jquery-ui-1.8.16.custom.css" media="screen" />
<script type="text/javascript" src="/common/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="/common/js/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="/common/js/jquery.touchwipe.min.js"></script>
<script type="text/javascript" src="/common/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="/common/js/jquery-popup.0.2.js"></script>
<script type="text/javascript" src="/common/js/common.js"></script>
<script type="text/javascript" src="/common/js/ui.js"></script>
<script type="text/javascript" src="/common/js/selectbox.js"></script>
<script type="text/javascript" src="/common/js/FFCheckbox.js"></script>
<script type="text/javascript" src="/common/js/FFImage.js"></script>
<script type="text/javascript" src="/common/js/FFLayer.js"></script>
<script type="text/javascript" src="/common/js/FFRadio.js"></script>
<script type="text/javascript" src="/common/js/FFString.js"></script>
<script type="text/javascript" src="/common/js/swfobject.js"></script>
<script type="text/javascript">
	<!--
	    $.ajaxSetup({dataType:"json"});
	    var memberType = '';
	    var grade = '';
	    var service ='true';
	    if(service =="true"){
		    if('https:' != document.location.protocol){
		    	location.href="https://"+location.host+location.pathname;
		    }
	    }
	//-->
	</script>



<script type="text/javascript">
	function mainList(path, popupYn){
		if(popupYn && popupYn == "Y"){
			window.open(path,'','');
		}else{
			location.href=path;
		}
	}   

	function faqSearch(){
		var keyword = $("#searchKeyword").val();
		if(keyword==""){
			alert("검색어를 입력해 주세요.");
			return; 
		} 
		location.href="/customer/faq/list.do?seqId=&searchCate=1&searchCate2=&searchCondition=0&searchKeyword="+keyword;
	}

	
	//2013.05.16 kkj 외부 유입시
	//에스원 서비스 상담 신청 자동 펼쳐지고 세콤홈 블랙박스 디폴트 체크
	function init()
	{
		
		
	}
</script>

<script type="text/javascript">
function setCookie(name, value, expiredays) {
	var todayDate = new Date();
	todayDate.setDate( todayDate.getDate() + expiredays );
	document.cookie = name + "=" + escape(value) + "; path=/; expires=" + todayDate.toGMTString() + ";"
}

function getCookie(name) {
   var nameOfCookie = name + "=";F
   var x = 0;
   while ( x <= document.cookie.length ){

      var y = (x+nameOfCookie.length);
      if (document.cookie.substring( x, y ) == nameOfCookie){
          if ((endOfCookie=document.cookie.indexOf( ";", y )) == -1)
               endOfCookie = document.cookie.length;
               return unescape( document.cookie.substring( y, endOfCookie ) );
      }
	  
      x = document.cookie.indexOf( " ", x ) + 1;
      if ( x == 0 )
           break;
   }
   return "";

}



function popShow(divid) {
	var popID = eval("document.getElementById('" + divid + "')"); 
	
	//popID.filters.blendTrans.apply(); 
	//popID.style.visibility = "visible";
	popID.style.display = "block";
	//popID.filters.blendTrans.play(); 
}	

function closeWin(formName,divid) {
	//var isIE  = (navigator.appVersion.indexOf("MSIE") != -1) ? true : false;
	var popID = eval("document.getElementById('" + divid + "')");   	
	var popFrm = eval("document.getElementById('" + formName + "')");
	
	//alert(isIE);
	
	if (popFrm.chkPop.checked) { 
	    setCookie(formName,"done", 1);
	}
	
	//if (isIE) {
		//popID.filters.blendTrans.apply();
		//popID.style.visibility = "hidden";
		//popID.filters.blendTrans.play();  
	//} else {
		popID.style.display = "none";
	//}
}

function setFocus(obj) {
	var objDiv = $("#"+obj);
	
	objDiv.attr("tabindex","0");
	objDiv.focus();
}
	
//레이어내 포커스 이동제어
function setLayerFocus(obj){
	var objDiv = $("#"+obj);

	objDiv.on({'keydown': function(event) {
		if (event.keyCode !== $.ui.keyCode.TAB ) {
			return;
		}
		
		if (!event.isDefaultPrevented() && event.keyCode && event.keyCode === $.ui.keyCode.ESCAPE ) {
			that.close( event );
			event.preventDefault();
		}			

		var tabbables = $( ":tabbable", objDiv ),
			first = tabbables.filter( ":first" ),
			last  = tabbables.filter( ":last" );

		if ( event.target === last[0] && !event.shiftKey ) {
			first.focus( 1 );
			return false;
		} else if ( event.target === first[0] && event.shiftKey ) {
			last.focus( 1 );
			return false;
		}
	}}); 
}
$(document).ready(function() {
//	setFocus('pop130520');
//	setLayerFocus('pop130520');
});
</script>

<style type="text/css">
#main-visual.visual01 {
	background: url('/attach/www/visual/20140902153516611003.jpg') no-repeat
		center top;
}

#main-visual.visual02 {
	background: url('/attach/www/visual/20140804174533939021.jpg') no-repeat
		center top;
}
</style>
</head>
<body onload="javascript:init ();">


	<div
		style="position: relative; z-index: 999999999; width: 963px; margin: auto">
		<div id="pop130520"
			style="position: absolute; left: 470px; top: 127px; border: 1px solid #b0b0b0;">
			<img src="/images/event/pop_140701.jpg"
				alt="편리하고 안전한 청구서 관리! 이메일 청구서를 신청하세요! 편리합니다! 분실위험이 없고 보관 및 확인이 간편! 안전합니다! 암호화 된 e-청구서로 개인정보 보호! 환경을 보호합니다! 종이도 아끼고 환경보호에 동참! 신청방법:고객지원 > 고객정보 변경 > 청구서 수령방법 선택"
				usemap="#Map" />
			<map name="Map" id="Map">
				<area shape="rect" coords="106,556,369,604"
					href="http://81.21.91.221:8080/loginView.do?resultURL=/custctr/inquire/info.do"
					target="_blank" alt="고객정보 변경 페이지 바로가기" />
			</map>

			<div
				style="overflow: hidden; width: 453px; padding: 5px 10px 5px 10px; background: #666666; font-size: 11px; line-height: 11px; color: #fff">
				<form id='popFrm1' name='popFrm1'>
					<p style="float: left">
						<input type="checkbox"
							style="background-color: #000000; width: 11px; height: 11px; vertical-align: middle; . vertical-align: top; _vertical-align: top;"
							class="bor0" value="" name="chkPop" id="chkPop"> <span
							style="font-size: 12px; line-height: 11px; color: #ffffff"><label
							for="chkPop">오늘하루 열지않기</label></span>
					</p>
					<span class="pd_l10 pd_r10" style="float: right"><a
						href="javascript:closeWin('popFrm1','pop130520');"
						style="color: #FFF; text-decoration: none; font-size: 12px;">X
							창닫기</a></span>
				</form>
			</div>
		</div>
	</div>

	<input type="hidden" name="userId" id="userId" value="" />



	<script type="text/javascript">
//var isIE = (navigator.appVersion.indexOf('MSIE') != -1) ? true : false;
var login_yn = document.getElementById('userId').value;
var cookiedata = document.cookie;

if(cookiedata.indexOf('popFrm1=done') < 0 && login_yn != "" ) {
	popShow('pop130520');	//-> 여기에 팝업
	
}else{
	document.getElementById('pop130520').style.display = 'none';

}

//	if(isIE) {
//		document.getElementById('pop130520').style.visibility = 'hidden';
//	} else {
//		document.getElementById('pop130520').style.display = 'none';
//	}


</script>


	<!-- 140805팝업추가시작  -->
	<div
		style="position: relative; z-index: 999999999; width: 963px; margin: auto">
		<div id="pop141023"
			style="position: absolute; width: 372px; left: 0; top: 127px; border: 1px solid #b0b0b0;">
			<img src="/images/event/pop_141023.gif" usemap="#Map4"
				alt="SVMS 사업파트너 등록신청 에스원의 SVMS와 S-1 ACCESS 상품의 비즈니스 파트너를 모집합니다.
		파트너 등록을 원하시는 분들은 아래의 바로가기를 통해 쉽게 이동하실 수 있습니다. SVMS 파트너 등록 바로가기"
				title="" />
			<map name="Map4" id="Map4">
				<area shape="rect" coords="65,217,308,264"
					href="/service/service03.do?num=4#service-position04" />
			</map>
			<div
				style="overflow: hidden; width: 352px; padding: 5px 10px 5px 10px; background: #666666; font-size: 11px; line-height: 11px; color: #fff">
				<form id='popFrm2' name='popFrm2'>
					<p style="float: left">
						<input type="checkbox"
							style="background-color: #000000; width: 11px; height: 11px; vertical-align: middle; . vertical-align: top; _vertical-align: top;"
							class="bor0" value="" name="chkPop" id="chkPop"> <span
							style="font-size: 12px; line-height: 13px; color: #ffffff"><label
							for="chkPop">오늘하루 열지않기</label></span>
					</p>
					<span class="pd_l10 pd_r10" style="float: right"><a
						href="javascript:closeWin('popFrm2','pop141023');"
						style="color: #FFF; text-decoration: none; font-size: 12px;">X
							창닫기</a></span>
				</form>
			</div>

		</div>
	</div>



	<!-- 140805팝업추가끝 -->


	<!--// popup 130613 -->


	<div id="skipnavi">
		<a href="#article">본문 바로가기</a> <a href="#navigation-title">주 메뉴
			바로가기</a>
		<!-- <a href="/footer/footer08.do">사이트맵 바로가기</a> -->
	</div>

	<div id="wrap" class="main-wrap">











		<div id="service-request">
			<div class="request-inner">
				<fieldset>
					<legend>서비스 상담 신청</legend>

					<div class="request-form clear-obj">
						<form name="topform" action="/customer/new/request.do">
							<input type="hidden" name="ctMotive" id="ctMotive">
							<h1>
								<img src="/images/title/h1_service_request.png"
									alt="에스원 서비스 상담 신청" />
							</h1>
							<div class="input-form-wrap">
								<ul class="form">
									<li><label for="ctCtName-top" class="title"><img
											src="/images/common/txt_service_request01.gif" alt="성명" /></label>
										<div class="input-form">
											<input type="text" name="ctCtName" id="ctCtName-top"
												class="txt" style="width: 314px;" maxlength="20"
												title="신청자 성명 입력" />
										</div></li>
									<li><label for="ctCtTel1-top" class="title"><img
											src="/images/common/txt_service_request02.gif" alt="전화번호" /></label>
										<div class="input-form">
											<input type="text" name="ctCtTel1" id="ctCtTel1-top"
												class="txt" style="width: 98px;" maxlength="3"
												title="전화번호 지역번호 입력" /> <input type="text" name="ctCtTel2"
												class="txt" style="width: 98px;" maxlength="4"
												title="전화번호 앞자리 입력" /> <input type="text" name="ctCtTel3"
												class="txt" style="width: 98px;" maxlength="4"
												title="전화번호 뒷자리 입력" />
										</div></li>
									<li><label for="ctPostNo1-top" class="title"><img
											src="/images/common/txt_service_request03.gif" alt="주소" /></label>
										<div class="input-form">
											<input type="text" name="ctPostNo1" id="ctPostNo1-top"
												class="txt" style="width: 98px;" readonly="readonly"
												title="우편번호 앞자리" /> <input type="text" name="ctPostNo2"
												class="txt" style="width: 98px;" readonly="readonly"
												title="우편번호 뒷자리" /> <a href="#"
												onclick="openWinZipCode('topFrom'); return false;"
												title="우편번호 찾기 새창열림"><img
												src="/images/common/button/btn_find_address02.gif"
												alt="우편번호 검색" /></a>
											<p class="sect">
												<input type="text" name="ctAddr1" class="txt"
													style="width: 314px;" readonly="readonly" title="주소 입력" />
											</p>
											<p class="sect">
												<input type="text" name="ctAddr2" class="txt"
													style="width: 314px;" maxlength="50" title="상세주소 입력" />
											</p>
										</div></li>
								</ul>
								<ul class="form">
									<li><label for="ctTargetName-top" class="title"><img
											src="/images/common/txt_service_request04.gif" alt="상호명" /></label>
										<div class="input-form">
											<input type="text" name="ctTargetName" id="ctTargetName-top"
												class="txt" style="width: 314px;" maxlength="25"
												title="상호명 입력" />
										</div></li>
									<li><label for="ctCtHp1-top" class="title"><img
											src="/images/common/txt_service_request05.gif" alt="휴대폰" /></label>
										<div class="input-form">
											<input type="text" name="ctCtHp1" id="ctCtHp1-top"
												class="txt" style="width: 98px;" maxlength="3"
												title="휴대폰 앞자리 입력" /> <input type="text" name="ctCtHp2"
												class="txt" style="width: 98px;" maxlength="4"
												title="휴대폰 가운데자리 입력" /> <input type="text" name="ctCtHp3"
												class="txt" style="width: 98px;" maxlength="4"
												title="휴대폰 마지막자리 입력" />
										</div></li>
									<li><em class="title"><img
											src="/images/common/txt_service_request06.gif" alt="관심상품" /></em>
										<div class="input-form check-form">
											<label for="sService-top"> <input type="checkbox"
												class="check" name="sService" id="sService-top" value="1"
												title="세콤서비스" /> <img
												src="/images/common/txt_service_request08.gif" alt="세콤서비스" />
											</label> <label for="sNs-top"> <input type="checkbox"
												class="check" name="sNs" id="sNs-top" value="1" title="정보보안" />
												<img src="/images/common/txt_service_request10.gif"
												alt="정보보안" />
											</label> <label for="sCctv-top"> <input type="checkbox"
												class="check" name="sCctv" id="sCctv-top" value="1"
												title="CCTV" /> <img
												src="/images/common/txt_service_request11.gif" alt="CCTV" />
											</label>
											<!-- 	<label for="sGini-top">
								<input type="checkbox" class="check" name="sGini" id="sGini-top" value="1" title="지니콜" />
								<img src="/images/common/txt_service_request12.gif" alt="지니콜" />
							</label>
						 -->
											<input type="hidden" id="sGini" name="sGini"> <label
												for="sSafe-top"> <input type="checkbox"
												class="check" name="sSafe" id="sSafe-top" value="1"
												title="안전금고" /> <img
												src="/images/common/txt_service_request13.gif" alt="안전금고" />
											</label> <label for="sAed-top"> <input type="checkbox"
												class="check" name="sAed" id="sAed-top" value="1"
												title="AED" /> <img
												src="/images/common/txt_service_request15.gif" alt="AED" />
											</label>
											<!-- <label for="sSafetalk-top">
								 <input type="checkbox" class="check" name="sSafetalk" id="sSafetalk-top" value="1"  title="세이프톡" />
							 	<input type="hidden" name="sSafetalk" id="sSafetalk-top" value="1" title="세이프톡" /> 
								 <img src="/images/common/txt_service_request17.gif" alt="세이프톡" /> 
							</label>  -->
											<input type="hidden" name="sSafetalk" id="sSafetalk-top" />
											<label for="sHomes-top" class="blackBox"> <input
												type="checkbox" class="check" name="sHomes" id="sHomes-top"
												value="1" title="세콤홈블랙박스" /> <img
												src="/images/common/txt_service_request09.gif" alt="세콤홈블랙박스" />
											</label>
										</div></li>
								</ul>
							</div>
							<div class="request-submit-form">
								<div class="submit-form-inner clear-obj">
									<em class="title"><img
										src="/images/common/txt_service_request07.gif"
										alt="개인정보수집/이용동의" /></em>
									<div class="input-form">
										<ul class="bul-list">
											<li>개인정보 항목 : 성명, 상호명, 전화번호, 휴대폰, 주소</li>
											<li>수집 및 이용목적 : 상품안내 및 정보제공, 고객상담</li>
											<li>보유 및 이용기간 : 개인정보 수집일로부터 개인정보 파기 요청 시 까지</li>
										</ul>
									</div>
								</div>
								<label for="topCheck-top" class="agree-check"> <input
									type="checkbox" class="check" name="topCheck" id="topCheck-top"
									title="개인정보 수집 이용에 동의합니다." /> <img
									src="/images/common/txt_service_request16.gif"
									alt="개인정보 수집 이용에 동의합니다." />
								</label>
								<div class="btnwrap">
									<button onclick="javascript:insertNew(); return false;">
										<img src="/images/common/button/btn_service_request02.gif"
											alt="신청 완료" />
									</button>
								</div>
							</div>
						</form>
					</div>
				</fieldset>
				<a href="#ctCtName-top" class="request-btn"><img
					src="/images/common/service_request.png" alt="에스원 서비스 상담 신청 열기" /></a>
				<!-- p id="secom-join-guide">
		
				<img src="/images/common/txt_join_guide.png" alt="세콤가입안내 1588-3112" />
		

		

	</p -->
			</div>
		</div>
		<hr />
		<div id="header-wrap">
			<div id="header">
				<h1>
					<a href="/index.do"><img src="/images/common/logo.png"
						alt="Security N0.1 에스원" /></a>
				</h1>
				<div id="utillmenu">

					<a href="/loginView.do"><img
						src="/images/common/utill_menu01.png" alt="로그인" class="first" /></a>
					<a href="/member/member02.do"><img
						src="/images/common/utill_menu02.png" alt="회원가입" /></a> <a
						href="/eng/index.do" title="ENGLISH 영문사이트 이동"><img
						src="/images/common/utill_menu03.png" alt="ENGLISH 영문사이트 이동" /></a> <a
						href="#"
						onclick="loginLink('/custctr/reissue/request.do'); return false;"><img
						src="/images/common/btn_request.gif" alt="세금계산서 재발행"
						class="tax-btn" /></a>
				</div>
				<h2 id="navigation-title" class="depth2-position">주메뉴 영역</h2>
				<ul id="navigation">
					<li><span class="item"><a href="#"
							title="클릭시 상품/서비스 하위 메뉴가 보여집니다."><img
								src="/images/common/gnb/gnb02.png" alt="상품/서비스" /></a></span>
						<div class="submenu">
							<ul>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb02_01.png" alt="세콤서비스" /></strong> <span
									class="s-menu"> <a href="/service/service01.do"><img
											src="/images/common/gnb/gnb02_01_01_out.png" alt="서비스 소개"
											class="first" /></a> <a
										href="/service/service01.do#service-position02"><img
											src="/images/common/gnb/gnb02_01_02_out.png" alt="업종별 서비스" /></a>
										<a href="/service/service01_01.do"><img
											src="/images/common/gnb/gnb02_01_03_out.png" alt="세콤 홈 블랙박스" /></a>

										<a href="/service/service01_02.do"><img
											src="/images/common/gnb/gnb02_01_04_out.png" alt="세콤듀얼" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb02_02.png" alt="정보 보안" /></strong> <span
									class="s-menu"> <!--  a href="/service/service02_01.do"><img src="/images/common/gnb/gnb02_02_01_out.png"
alt="서비스 소개" class="first" /></a--> <a href="/service/service02_07.do"><img
											src="/images/common/gnb/gnb02_02_08_out.png" alt="융합관제" /></a> <a
										href="/service/service02_02.do"><img
											src="/images/common/gnb/gnb02_02_02_out.png" alt="네트워크보안"
											class="first" /></a> <a href="/service/service02_03.do"><img
											src="/images/common/gnb/gnb02_02_03_out.png" alt="PC보안" /></a> <a
										href="/service/service02_06.do"><img
											src="/images/common/gnb/gnb02_02_07_out.png" alt="바이러스 백신" /></a>
										<!-- a href="/service/service02_04.do"><img src="/images/common/gnb/gnb02_02_05_out.png"
alt="보안관제" /></a--> <!-- a href="/service/service02_05.do"><img src="/images/common/gnb/gnb02_02_06_out.png"
alt="세이프톡" /></a -->
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb02_03.png" alt="영상 보안" /></strong> <span
									class="s-menu"> <a href="/service/service03.do?num=1"><img
											src="/images/common/gnb/gnb02_03_01_out.png" alt="서비스 소개"
											class="first" /></a> <a
										href="/service/service03.do?num=2#service-position02"><img
											src="/images/common/gnb/gnb02_03_02_out.png" alt="NVR/DVR" /></a>
										<a href="/service/service03.do?num=3#service-position03"><img
											src="/images/common/gnb/gnb02_03_03_out.png" alt="카메라" /></a> <a
										href="/service/service03.do?num=4#service-position04"><img
											src="/images/common/gnb/gnb02_03_04_out.png"
											alt="지능형 영상보안 솔루션" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb02_07.png" alt="영상 보안" /></strong> <span
									class="s-menu"> <a href="/service/service05_05.do?num=1"><img
											src="/images/common/gnb/gnb02_05_05_out.png" alt="차량운행관리" /></a>
										<a href="/service/service05_05.do?num=2#service-position02"><img
											src="/images/common/gnb/gnb02_07_01_out.png" alt="차량데이터자동제출" /></a>
										<a href="/service/service05_05.do?num=3#service-position03"><img
											src="/images/common/gnb/gnb02_07_02_out.png" alt="운송관리" /></a> <a
										href="/service/service05_05.do?num=4#service-position04"><img
											src="/images/common/gnb/gnb02_07_03_out.png" alt="렌터카/법인차" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb02_04.png" alt="생활안전상품" /></strong> <span
									class="s-menu"> <a href="/service/service04_01.do"><img
											src="/images/common/gnb/gnb02_04_06_out.png" alt="안심폰" /></a> <a
										href="/service/service04.do?num=3#service-position03"><img
											src="/images/common/gnb/gnb02_04_03_out.png" alt="안전금고" /></a> <a
										href="/service/service04.do?num=4#service-position04"><img
											src="/images/common/gnb/gnb02_04_04_out.png"
											alt="AED(자동심장제세동기)" /></a>

								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb02_05.png" alt="보안솔루션" /></strong> <span
									class="s-menu"> <a href="/service/service05_01.do"><img
											src="/images/common/gnb/gnb02_05_01_out.png" alt="보안 솔루션"
											class="first" /></a> <a href="/service/service05_02.do"><img
											src="/images/common/gnb/gnb02_05_02_out.png" alt="보안 컨설팅" /></a>

										<!--a href="/service/service05_04.do"><img src="/images/common/gnb/gnb02_05_04_out.png"
alt="헬스케어" /></a --> <!--a href="/service/service05_05.do"><img src="/images/common/gnb/gnb02_05_05_out.png"
alt="차량운행관리" /></a -->

								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb02_06.png" alt="빌딩 솔루션" /></strong> <span
									class="s-menu"> <a href="/service/service06.do?num=1"><img
											src="/images/common/gnb/gnb02_06_01_out.png" alt="부동산 관리"
											class="first" /></a> <a
										href="/service/service06.do?num=2#service-position02"><img
											src="/images/common/gnb/gnb02_06_02_out.png" alt="임대차 컨설팅" /></a>

										<a href="/service/service06.do?num=3#service-position03"><img
											src="/images/common/gnb/gnb02_06_03_out.png" alt="투자 자문" /></a>
										<a href="/service/service06.do?num=4#service-position04"><img
											src="/images/common/gnb/gnb02_06_04_out.png" alt="기술 컨설팅" /></a>
										<a href="/service/service06.do?num=5#service-position05"><img
											src="/images/common/gnb/gnb02_06_05_out.png" alt="에너지 효율화" /></a>
										<a href="/service/service06.do?num=6#service-position06"><img
											src="/images/common/gnb/gnb02_06_06_out.png" alt="주요 실적" /></a>

								</span></li>
							</ul>
						</div></li>
					<li><span class="item"><a href="#"
							title="클릭시 고객지원 하위 메뉴가 보여집니다."><img
								src="/images/common/gnb/gnb01.png" alt="고객지원" /></a></span>
						<div class="submenu">
							<ul>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb01_07.png" alt="고객정보 관리" /></strong> <span
									class="s-menu"> <a href="#"
										onclick="loginLink('/custctr/inquire/info.do'); return false;"><img
											src="/images/common/gnb/gnb01_07_01_out.png" alt="고객정보 변경"
											class="first" /></a> <a href="#"
										onclick="isLogin('/member/myinfo04.do'); return false;"><img
											src="/images/common/gnb/gnb01_140307_out.png"
											alt="세콤고객 회원 등록" class="first" /></a>

								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb01_01.png" alt="조회/신청" /></strong> <span
									class="s-menu s-menu-type02"> <a href="#"
										onclick="loginLink('/custctr/inquire/list.do'); return false;"><img
											src="/images/common/gnb/gnb01_01_01_out.png" alt="계약정보"
											class="first" /></a> <a href="#"
										onclick="loginLink('/custctr/inquire/certificate.do'); return false;"><img
											src="/images/common/gnb/gnb01_01_02_out.png"
											alt="계약증서 조회 및 출력" /></a> <a href="#"
										onclick="loginLink('/custctr/history/gate.do'); return false;"><img
											src="/images/common/gnb/gnb01_01_03_02_out.png"
											alt="세트해제 이력 조회 및 신청" /></a> <a href="#"
										onclick="loginLink('/custctr/payment/list.do'); return false;"><img
											src="/images/common/gnb/gnb01_01_04_out.png" alt="청구 및 입금내역" /></a>
										<a href="#"
										onclick="loginLink('/custctr/cash/list.do'); return false;"><img
											src="/images/common/gnb/gnb01_01_05_out.png"
											alt="현금영수증 신청 및 취소" /></a> <a href="#"
										onclick="loginLink('/custctr/optional/request.do'); return false;"><img
											src="/images/common/gnb/gnb01_01_06_out.png"
											alt="부가서비스 조회 및 신청" /></a> <a href="#"
										onclick="loginLink('/custctr/device/list.do'); return false;"><img
											src="/images/common/gnb/gnb01_01_07_out.png" alt="기기점검 요청" /></a>
										<!-- 	<a href="#" onclick="loginLink('/custctr/grade/inquiry.do'); return false;"><img src="/images/common/gnb/gnb01_01_08_out.png"
alt="고객등급 조회" /></a>  -->
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb01_02.png" alt="재발급 / 재발행" /></strong> <span
									class="s-menu"> <a href="#"
										onclick="loginLink('/custctr/card/mylist.do'); return false;"><img
											src="/images/common/gnb/gnb01_02_02_out.png" alt="세콤카드 발급 신청"
											class="first" /></a> <a href="#"
										onclick="loginLink('/custctr/reissue/request.do'); return false;"><img
											src="/images/common/gnb/gnb01_02_01_out.png" alt="세금계산서 재발행" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb01_03.png" alt="고객의 소리" /></strong> <span
									class="s-menu"> <a href="/customer/faq/list.do"><img
											src="/images/common/gnb/gnb01_03_01_out.png" alt="자주하는 질문"
											class="first" /></a> <a href="/customer/thankyou/list.do"><img
											src="/images/common/gnb/gnb01_03_02_out.png" alt="고마워요 에스원" /></a>
										<a href="/customer/inquiry/list.do"><img
											src="/images/common/gnb/gnb01_03_03_out.png" alt="고객문의" /></a> <!-- a href="/customer/interview/write.do"><img src="/images/common/gnb/gnb01_03_04_out.png"
alt="행복 인터뷰 신청" /></a -->
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb01_04.png" alt="영상조회서비스" /></strong> <span
									class="s-menu"> <a
										href="http://www.s1view.co.kr/login_frame.html"
										target="_blank" title="새창열림"><img
											src="/images/common/gnb/gnb01_04_01_out.png" alt="세콤 웹 뷰어"
											class="first" /></a> <a href="http://www.s1webview.co.kr"
										target="_blank" title="새창열림"><img
											src="/images/common/gnb/gnb01_04_02_out.png" alt="에스원 웹 뷰어" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb01_05.png" alt="가입추천" /></strong> <span
									class="s-menu"> <a href="/recommend/main.do"><img
											src="/images/common/gnb/gnb01_05_01_out.png" alt="세콤 고객소개"
											class="first" /></a> <!-- <a href="#" onclick="isLogin('/recommend/list.do'); return false;"><img src="/images/common/gnb/gnb01_05_02_out.png"
alt="고객소개" /></a> --> <a href="/customer/new/write.do"><img
											src="/images/common/gnb/gnb01_05_04_out.png" alt="서비스 상담 신청" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb01_06.png" alt="자료실" /></strong> <span
									class="s-menu"> <a href="/customer/manual/list.do"><img
											src="/images/common/gnb/gnb01_06_01_out.png" alt="사용자 매뉴얼"
											class="first" /></a> <a href="/customer/morgue/list.do"><img
											src="/images/common/gnb/gnb01_06_02_out.png" alt="S/W 프로그램" /></a>
										<a href="/customer/morgueEtc/list.do"><img
											src="/images/common/gnb/gnb01_06_03_out.png" alt="기타 자료" /></a>
								</span></li>

								<!-- li>
							<strong class="s-title"><a href="#"><img src="/images/common/gnb/gnb01_08.png" alt="로그인" /></a></strong>
							<span class="s-menu">
								<a href="#"><img src="/images/common/gnb/gnb01_08_01_out.png" alt="회원가입" class="first" /></a>
							</span>
						</li-->
							</ul>
						</div></li>

					<li><span class="item"><a href="#"
							title="클릭시 에스원 하위 메뉴가 보여집니다."><img
								src="/images/common/gnb/gnb03.png" alt="에스원" /></a></span>
						<div class="submenu">
							<ul>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb03_01.png" alt="에스원 소개" /></strong> <span
									class="s-menu"> <a href="/s1/s1.do"><img
											src="/images/common/gnb/gnb03_01_01_out.png" alt="에스원 소개"
											class="first" /></a> <a href="/s1/s1_02.do"><img
											src="/images/common/gnb/gnb03_01_02_out.png" alt="에스원 경영" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb03_02.png" alt="홍보센터" /></strong> <span
									class="s-menu"> <a href="/content/notice/list.do"><img
											src="/images/common/gnb/gnb03_02_01_out.png" alt="뉴스 및 공지"
											class="first" /></a> <a href="/content/mediaCenter/list.do"><img
											src="/images/common/gnb/gnb03_02_02_out.png" alt="미디어센터" /></a>
										<a href="/content/advertisement/list.do"><img
											src="/images/common/gnb/gnb03_02_03_out.png" alt="광고" /></a> <a
										href="/content/webzine/list.do"><img
											src="/images/common/gnb/gnb03_02_04_out.png" alt="웹진" /></a> <!-- <a href="/content/fun/view.do"><img src="/images/common/gnb/gnb03_02_05_out.png"
alt="FUN 에스원" /></a> --> <a href="/content/event/list.do"><img
											src="/images/common/gnb/gnb03_02_06_out.png" alt="이벤트" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb03_03.png" alt="투자정보" /></strong> <span
									class="s-menu"> <a href="/invest/quarterResult.do"><img
											src="/images/common/gnb/gnb03_03_01_out.png" alt="분기별 실적"
											class="first" /></a> <a href="/invest/financial.do"><img
											src="/images/common/gnb/gnb03_03_02_out.png" alt="요약채무자료" /></a>
										<a href="/invest/stocks.do"><img
											src="/images/common/gnb/gnb03_03_03_out.png" alt="주가정보" /></a> <a
										href="/invest/operatingReport.do"><img
											src="/images/common/gnb/gnb03_03_04_out.png" alt="영업보고서" /></a>
										<a href="/invest/stockinfo05.do"><img
											src="/images/common/gnb/gnb03_03_05_out.png" alt="공시" /></a> <a
										href="/invest/electronNotice.do"><img
											src="/images/common/gnb/gnb03_03_06_out.png" alt="전자공고" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb03_04.png" alt="인재채용" /></strong> <span
									class="s-menu"> <a href="/recruit/noticelist.do"><img
											src="/images/common/gnb/gnb03_04_01_out.png" alt="채용정보"
											class="first" /></a> <a href="/s1/recruit02.do"><img
											src="/images/common/gnb/gnb03_04_02_out.png" alt="인재상" /></a> <a
										href="/s1/recruit03.do"><img
											src="/images/common/gnb/gnb03_04_03_out.png" alt="인사제도" /></a> <a
										href="/s1/recruit04.do"><img
											src="/images/common/gnb/gnb03_04_04_out.png" alt="직무소개" /></a> <a
										href="/recruit/faq.do"><img
											src="/images/common/gnb/gnb03_04_05_out.png" alt="채용문의" /></a> <!--							<a href="/recruit/agree.do"><img src="/images/common/gnb/gnb03_04_06_out.png"
alt="입사지원" /></a>
								<a href="/recruit/recruitupdate.do"><img src="/images/common/gnb/gnb03_04_07_out.png"
alt="지원서 수정" /></a>
								<a href="/recruit/recruitresult.do"><img src="/images/common/gnb/gnb03_04_08_out.png"
alt="지원결과 조회" /></a> -->
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb03_05.png" alt="사회공헌" /></strong> <span
									class="s-menu"> <a href="/s1/welfare01.do"><img
											src="/images/common/gnb/gnb03_05_01_out.png" alt="사회봉사단"
											class="first" /></a> <a href="/s1/welfare04.do"><img
											src="/images/common/gnb/gnb03_05_05_out.png" alt="삼성3119구조단" /></a>
										<a href="/welfare/news/list.do"><img
											src="/images/common/gnb/gnb03_05_03_out.png" alt="사회공헌 뉴스" /></a>
										<!--  a href="/service/blank.do"><img src="/images/common/gnb/gnb03_05_02_out.png"
alt="주요활동 및 실적" /></a--> <a href="/welfare/cprinfo.do"><img
											src="/images/common/gnb/gnb03_05_04_out.png" alt="심폐소생 교육" /></a>
								</span></li>
								<li><strong class="s-title"><img
										src="/images/common/gnb/gnb03_06.png" alt="부가사업" /></strong> <span
									class="s-menu"> <a href="/s1/optional01.do"><img
											src="/images/common/gnb/gnb03_06_01_out.png" alt="태권도단"
											class="first" /></a> <a href="/s1/optional02.do"><img
											src="/images/common/gnb/gnb03_06_02_out.png" alt="천안연수원" /></a>
								</span></li>
							</ul>
						</div></li>
				</ul>
			</div>

		</div>
		<script type="text/javascript">
		$('#header-wrap').headerControl();
</script>

		<!-- AceCounter Log Gathering Script V.72.2013010701 -->
		<script language='javascript'>
var _AKC = "NaPm,Ncisy";
if(typeof _GUL == 'undefined'){
var _JV="AMZ2013010701";//script Version
var _GUL = 'gtp3.acecounter.com';var _GPT='8080'; var _AIMG = new Image(); var _bn=navigator.appName; var _PR = location.protocol=="https:"?"https://"+_GUL:"http://"+_GUL+":"+_GPT;if( _bn.indexOf("Netscape") > -1 || _bn=="Mozilla"){ setTimeout("_AIMG.src = _PR+'/?cookie';",1); } else{ _AIMG.src = _PR+'/?cookie'; };	
var _GCD = 'AM3A38046253882'; // gcode
var _UD='undefined';var _UN='unknown';var _mset=0;
function _IX(s,t){return s.indexOf(t)}
function _GV(b,a,c,d){ var f = b.split(c);for(var i=0;i<f.length; i++){ if( _IX(f[i],(a+d))==0) return f[i].substring(_IX(f[i],(a+d))+(a.length+d.length),f[i].length); }	return ''; }
function _XV(b,a,c,d,e){ var f = b.split(c);var g='';for(var i=0;i<f.length; i++){ if( _IX(f[i],(a+d))==0){ try{eval(e+"=f[i].substring(_IX(f[i],(a+d))+(a.length+d.length),f[i].length);");}catch(_e){}; continue;}else{ if(g) g+= '&'; g+= f[i];}; } return g;};
function _NOB(a){return (a!=_UD&&a>0)?new Object(a):new Object()}
function _NIM(){return new Image()}
function _IL(a){return a!=_UD?a.length:0}
function _ILF(a){ var b = 0; try{eval("b = a.length");}catch(_e){b=0;}; return b; }
function _VF(a,b){return a!=_UD&&(typeof a==b)?1:0}
function _LST(a,b){if(_IX(a,b)>0){ a=a.substring(0,_IX(a,b));}; return a;}
function _CST(a,b){if(_IX(a,b)>0) a=a.substring(_IX(a,b)+_IL(b),_IL(a));return a}
function _UL(a){a=_LST(a,'#');a=_CST(a,'://');if(a.length>512){a=a.substring(0,511);};return a}
function _AA(a){return new Array(a?a:0)}
_DC = document.cookie ;
function _AGC(nm) { var cn = nm + "="; var nl = cn.length; var cl = _DC.length; var i = 0; while ( i < cl ) { var j = i + nl; if ( _DC.substring( i, j ) == cn ){ var val = _DC.indexOf(";", j ); if ( val == -1 ) val = _DC.length; return unescape(_DC.substring(j, val)); }; i = _DC.indexOf(" ", i ) + 1; if ( i == 0 ) break; } return ''; }
function _ASC( nm, val, exp ){var expd = new Date(); if ( exp ){ expd.setTime( expd.getTime() + ( exp * 1000 )); document.cookie = nm+"="+ escape(val) + "; expires="+ expd.toGMTString() +"; path="; }else{ document.cookie = nm + "=" + escape(val);};}
function SetUID() {     var newid = ''; var d = new Date(); var t = Math.floor(d.getTime()/1000); newid = 'UID-' + t.toString(16).toUpperCase(); for ( var i = 0; i < 16; i++ ){ var n = Math.floor(Math.random() * 16).toString(16).toUpperCase(); newid += n; }       return newid; }
var _FCV = _AGC("ACEFCID"); if ( !_FCV ) { _FCV = SetUID(); _ASC( "ACEFCID", _FCV , 86400 * 30 * 12 ); _FCV=_AGC("ACEFCID");}
var _AIO = _NIM(); var _AIU = _NIM();  var _AIW = _NIM();  var _AIX = _NIM();  var _AIB = _NIM();  var __hdki_xit = _NIM();
var _gX='/?xuid='+_GCD+'&sv='+_JV,_gF='/?fuid='+_GCD+'&sv='+_JV,_gU='/?uid='+_GCD+'&sv='+_JV+"&FCV="+_FCV,_gE='/?euid='+_GCD+'&sv='+_JV,_gW='/?wuid='+_GCD+'&sv='+_JV,_gO='/?ouid='+_GCD+'&sv='+_JV,_gB='/?buid='+_GCD+'&sv='+_JV;
function _IDV(a){return (typeof a!=_UD)?1:0}

var _d=_rf=_end=_fwd=_arg=_xrg=_av=_bv=_rl=_ak=_xrl=_cd=_cu=_bz='',_sv=11,_tz=20,_ja=_sc=_ul=_ua=_UA=_os=_vs=_UN,_je='n',_bR='blockedReferrer';
if(!_IDV(_CODE)) var _CODE = '' ;
_tz = Math.floor((new Date()).getTimezoneOffset()/60) + 29 ;if( _tz > 24 ) _tz = _tz - 24 ;
// Javascript Variables
if(!_IDV(_AKC)) var _AKC='';
if(!_IDV(_amt)) var _amt=0 ;if(!_IDV(_pk)) var _pk='' ;if(!_IDV(_pd)) var _pd='';if(!_IDV(_ct)) var _ct='';
if(!_IDV(_ll)) var _ll='';if(!_IDV(_ag)) var _ag=0;	if(!_IDV(_id)) var _id='' ;if(!_IDV(_mr)) var _mr = _UN;
if(!_IDV(_gd)) var _gd=_UN;if(!_IDV(_jn)) var _jn='';if(!_IDV(_jid)) var _jid='';if(!_IDV(_skey)) var _skey='';
if(!_IDV(_ud1)) var _ud1='';if(!_IDV(_ud2)) var _ud2='';if(!_IDV(_ud3)) var _ud3='';
if( !_ag ){ _ag = 0 ; }else{ _ag = parseInt(_ag); }
if( _ag < 0 || _ag > 150 ){ _ag = 0; }
if( _gd != 'man' && _gd != 'woman' ){ _gd =_UN;};if( _mr != 'married' && _mr != 'single' ){ _mr =_UN;};if( _jn != 'join' && _jn != 'withdraw' ){ _jn ='';};
if( _id != '' ){ _mset|=1 };
if( _jid != '' ){ _mset|=2 };
_je = (navigator.javaEnabled()==true)?'1':'0';_bn=navigator.appName;
if(_bn.substring(0,9)=="Microsoft") _bn="MSIE";
_bN=(_bn=="Netscape"),_bI=(_bn=="MSIE"),_bO=(_IX(navigator.userAgent,"Opera")>-1);if(_bO)_bI='';
_bz=navigator.appName; _pf=navigator.platform; _av=navigator.appVersion; _bv=parseFloat(_av) ;
if(_bI){_cu=navigator.cpuClass;}else{_cu=navigator.oscpu;};
if((_bn=="MSIE")&&(parseInt(_bv)==2)) _bv=3.01;_rf=document.referrer;var _prl='';var _frm=false;
function _WO(a,b,c){window.open(a,b,c)}
function ACEF_Tracking(a,b,c,d,e,f){ if(!_IDV(b)){var b = 'FLASH';}; if(!_IDV(e)){ var e = '0';};if(!_IDV(c)){ var c = '';};if(!_IDV(d)){ var d = '';}; var a_org=a; b = b.toUpperCase(); var b_org=b;	if(b_org=='FLASH_S'){ b='FLASH'; }; if( typeof CU_rl == 'undefined' ) var CU_rl = _PT(); if(_IDV(_GCD)){ var _AF_rl = document.URL; if(a.indexOf('://') < 0  && b_org != 'FLASH_S' ){ var _AT_rl  = ''; if( _AF_rl.indexOf('?') > 0 ){ _AF_rl = _AF_rl.substring(0,_AF_rl.indexOf('?'));}; var spurl = _AF_rl.split('/') ;	for(var ti=0;ti < spurl.length ; ti ++ ){ if( ti == spurl.length-1 ){ break ;}; if( _AT_rl  == '' ){ _AT_rl  = spurl[ti]; }else{ _AT_rl  += '/'+spurl[ti];}; }; var _AU_arg = ''; if( a.indexOf('?') > 0 ){ _AU_arg = a.substring(a.indexOf('?'),a.length); a = a.substring(0,a.indexOf('?')); }; var spurlt = a.split('/') ; if( spurlt.length > 0 ){ a = spurlt[spurlt.length-1];}; a = _AT_rl +'/'+a+_AU_arg;	_AF_rl=document.URL;}; _AF_rl = _AF_rl.substring(_AF_rl.indexOf('//')+2,_AF_rl.length); if( typeof f == 'undefined' ){ var f = a }else{f='http://'+_AF_rl.substring(0,_AF_rl.indexOf('/')+1)+f}; var _AS_rl = CU_rl+'/?xuid='+_GCD+'&url='+escape(_AF_rl)+'&xlnk='+escape(f)+'&fdv='+b+'&idx='+e+'&'; var _AF_img = new Image(); _AF_img.src = _AS_rl; if( b_org == 'FLASH' && a_org != '' ){ if(c==''){ window.location.href = a_org; }else{ if(d==''){ window.open(a_org,c);}else{ window.open(a_org,c,d); };};	};} ; }
function _PT(){return location.protocol=="https:"?"https://"+_GUL:"http://"+_GUL+":"+_GPT}
function _EL(a,b,c){if(a.addEventListener){a.addEventListener(b,c,false)}else if(a.attachEvent){a.attachEvent("on"+b,c)} }
function _NA(a){return new Array(a?a:0)}
function _ER(a,b,c,d){if(String(navigator.userAgent).indexOf('Mobile Safari')!=-1){return 0;}; _xrg=_PT()+_gW+"&url="+escape(_UL(document.URL))+"&err="+((typeof a=="string")?a:"Unknown")+"&ern="+c+"&bz="+_bz+"&bv="+_vs+"&RID="+Math.random()+"&";
if(_IX(_bn,"Netscape") > -1 || _bn == "Mozilla"){ setTimeout("_AIW.src=_xrg;",1); } else{ _AIW.src=_xrg; } }
function _PL(a){if(!_IL(a))a=_UL(document.URL);
_arg = _PT()+_gU;
if( typeof _ERR !=_UD && _ERR == 'err'){ _arg = _PT()+_gE;};
_AIU.src = _arg+"&url="+escape(a)+"&ref="+escape(_rf)+"&cpu="+_cu+"&bz="+_bz+"&bv="+_vs+"&os="+_os+"&dim="+_d+"&cd="+_cd+"&je="+_je+"&jv="+_sv+"&tz="+_tz+"&ul="+_ul+"&ad_key="+escape(_ak)+"&skey="+escape(_skey)+"&age="+_ag+"&gender="+_gd+"&marry="+_mr+"&join="+_jn+"&mset="+_mset+"&udf1="+_ud1+"&udf2="+_ud2+"&udf3="+_ud3+"&amt="+_amt+"&frwd="+_fwd+"&pd="+escape(_pd)+"&ct="+escape(_ct)+"&ll="+escape(_ll)+"&RID="+Math.random()+"&";
setTimeout("",300);
}
_EL(window,"error",_ER); //window Error
if( typeof window.screen == 'object'){_sv=12;_d=screen.width+'*'+screen.height;_sc=_bI?screen.colorDepth:screen.pixelDepth;if(_sc==_UD)_sc=_UN;}
_ro=_NA();if(_ro.toSource||(_bI&&_ro.shift))_sv=13;
if( top && typeof top == 'object' &&_ILF(top.frames)){eval("try{_rl=top.document.URL;}catch(_e){_rl='';};"); if( _rl != document.URL ) _frm = true;};
if(_frm){ eval("try{_prl = top.document.URL;}catch(_e){_prl=_bR;};"); if(_prl == '') eval("try{_prl=parent.document.URL;}catch(_e){_prl='';};"); 
if( _IX(_prl,'#') > 0 ) _prl=_prl.substring(0,_IX(_prl,'#')); 
_prl=_LST(_prl,'#');
if( _IX(_rf,'#') > 0 ) _rf=_rf.substring(0,_IX(_rf,'#')); 
if( _IX(_prl,'/') > 0 && _prl.substring(_prl.length-1,1) == '/' ) _prl = _prl.substring(0,_prl.length-1);
if( _IX(_rf,'/') > 0 && _rf.substring(_rf.length-1,1) == '/' ) _rf = _rf.substring(0,_rf.length-1);
if( _rf == '' ) eval("try{_rf=parent.document.URL;}catch(_e){_rf=_bR;}"); 
if(_rf==_bR||_prl==_bR){ _rf='',_prl='';}; if( _rf == _prl ){ eval("try{_rf=top.document.referrer;}catch(_e){_rf='';}"); 
if( _rf == ''){ _rf = 'bookmark';};if( _IX(document.cookie,'ACENASP_CK='+escape(_rf)) > -1 ){ _rf = _prl;} 
else{ 
if(_IX(_prl,'?') > 0){ _ak = _prl.substring(_IX(_prl,'?')+1,_prl.length); _prl = _ak; }
_fwd = _GV(_ak,'FWDIDX','&','=');
if( _IX(_prl.toUpperCase(),'OVRAW=') >= 0 ){ _ak = 'src=overture&kw='+_GV(_prl.toUpperCase(),'OVRAW','&','=')+'&OVRAW='+_GV(_prl.toUpperCase(),'OVRAW','&','=')+'&OVKEY='+_GV(_prl.toUpperCase(),'OVKEY','&','=')+'&OVMTC='+_GV(_prl.toUpperCase(),'OVMTC','&','=').toLowerCase() }; 
if(_IX(_prl,'gclid=') >= 0 ){ _ak='src=adwords'; }; if(_IX(_prl,'DWIT=') >= 0 ){_ak='src=dnet_cb';}; 
if( _GV(_prl,'src','&','=') ) _ak += '&src='+_GV(_prl,'src','&','='); if( _GV(_prl,'kw','&','=') ) _ak += '&kw='+_GV(_prl,'kw','&','='); if(_prl.length>0){ _prl = _XV(_prl,'FWDRL','&','=','_rf'); _rf = unescape(_rf); _ak = _XV(_ak,'FWDRL','&','=','_prl'); }; if( typeof FD_ref=='string' && FD_ref != '' ) _rf = FD_ref;
document.cookie='ACENASP_CK='+escape(_rf)+';path=/;'; 
}; 
if(document.URL.indexOf('?') > 0 && ( _IX(_ak,'rcsite=') < 0 && _IX(_ak,'NVAR=') < 0 && _IX(_ak,'src=') < 0 && _IX(_ak,'source=') < 0 && _IX(_ak,'DMCOL=') < 0 && _IX(_ak,'ref=') < 0 ) ) _ak =document.URL.substring(document.URL.indexOf('?')+1,document.URL.length); };
}
else{ 
_rf=_LST(_rf,'#');_ak=_CST(document.URL,'?');
}
_rl=document.URL;
var _trl = _rl.split('?'); if(_trl.length>1){ _trl[1] = _XV(_trl[1],'FWDRL','&','=','_rf'); _rf = unescape(_rf); _fwd = _GV(_trl[1],'FWDIDX','&','='); _rl=_trl.join('?'); 
_ak = _XV(_ak,'FWDRL','&','=','_prl');
}; if( typeof FD_ref=='string' && FD_ref != '' ) _rf = FD_ref;
if( _rf.indexOf('googlesyndication.com') > 0 ){ 
var _rf_idx = _rf.indexOf('&url=');  if( _rf_idx > 0 ){ var _rf_t = unescape(_rf.substring(_rf_idx+5,_rf.indexOf('&',_rf_idx+5)));  if( _rf_t.length > 0 ){ _rf = _rf_t ;};  };  };
_rl = _UL(_rl); _rf = _UL(_rf);

if( typeof _rf_t != 'undefined' && _rf_t != '' ) _rf = _rf_t ;
if( typeof _ak_t != 'undefined' && _ak_t != '' ) _ak = _ak_t ;
if(_AKC != ''){var _R_a = _AKC.split(','); var _ak2 = ''; var _ak_list = _ak.split('&'); for(var i=0;i<_ak_list.length;i++){ var cnt=0; for(var a=0;a<_R_a.length;a++){ if( _ak_list[i].indexOf(_R_a[a]) == 0 )  cnt++;}; if(cnt > 0 ) continue; if( _ak2 != '' ) _ak2 += '&'; _ak2 += _ak_list[i]; }; if( _ak2 != '' ) _ak = _ak2;};
if(_ak.length>512){_ak=_ak.substring(0,512);};
if( typeof _rf==_UD||( _rf == '' )) _rf = 'bookmark' ;_cd=(_bI)?screen.colorDepth:screen.pixelDepth;
_UA = navigator.userAgent;_ua = navigator.userAgent.toLowerCase();
if (navigator.language){  _ul = navigator.language.toLowerCase();}else if(navigator.userLanguage){  _ul = navigator.userLanguage.toLowerCase();};

_st = _IX(_UA,';') ;if(_st > 0 ){ _end = _UA.indexOf(')',_st);};_str = _UA.substring(_st, _end);_if = _str.split('; ');_cmp = _UN ; 
if(_bI){	_cmp = navigator.appName; _str = _if[1].substring(5, _if[1].length); if( _IX(_cmp,'Mobile') >= 0 ) _str = _if[3].substring(8, _if[3].length); _vs = (parseFloat(_str)).toString();} 
else if ( (_st = _IX(_ua,"opera")) >= 0){_cmp = "Opera" ;_vs = _ua.substring(_st+6, _ua.indexOf('.',_st+6)); } 
else if ((_st = _IX(_ua,"firefox")) >= 0){_cmp = "Firefox"; _vs = _ua.substring(_st+8, _ua.indexOf('.',_st+8)); } 
else if ((_st = _IX(_ua,"chrome")) > 0) { _cmp = "Chrome"; _vs =parseFloat( _ua.substring(_st+7,_ua.indexOf(' ',_st+7))).toString(); } 
else if ((_st = _IX(_ua,"safari")) > 0) { _cmp = "Safari";  _vs = parseFloat(_ua.substring(_st+7,_ua.indexOf(' ',_st+7))).toString(); }
else if ((_st = _IX(_ua,"netscape6")) >= 0){ _cmp = "Netscape"; _vs = _ua.substring(_st+10, _ua.length);  if ((_st = _IX(_vs,"b")) > 0 ) { _str = _vs.substring(0,_IX(_vs,"b")); _vs = _str ;  };} 
else if ((_st = _IX(_ua,"netscape/7")) >= 0){  _cmp = "Netscape";  _vs = _ua.substring(_st+9, _ua.length);  if ((_st = _IX(_vs,"b")) > 0 ){ _str = _vs.substring(0,_IX(_vs,"b")); _vs = _str;};
}else{ if (_IX(_ua,"gecko") > 0){ if(_IX(_ua,"safari")>=0){ _cmp = "Safari";_ut = _ua.split(' ');for( var ii=0;ii<_ut.length;ii++) if(_IX(_ut[ii],'version')>=0){ _vst = (_ut[ii]+'/').split('/'); _vs = _vst[1];} }else{ _cmp = navigator.vendor;  } }else if (_IX(_ua,"nav") >= 0){ _cmp = "Netscape Navigator";}else{ _cmp = navigator.appName;}; _av = _UA ; }
if (_IX(_vs,'.')<0){  _vs = _vs + '.0'}
_bz = _cmp; 

var Asp_Link_ssn={s:_JV,n:'AM3A38046253882',g:_GUL,p:_GPT,pu:_rl,m:[],run:Asp_Link_ssn?Asp_Link_ssn.n:this.n};
function ACEF_Click(file,menu){if((typeof file!='number') && (file!='') && (typeof menu!='number') && (menu!='')){eval("LA_"+Asp_Link_ssn.n+"('"+ file+"','"+ menu +  "')");}  };
function LA_AM3A38046253882(){var ssn=Asp_Link_ssn;var f={nm:function(st){ var v = String(st); var r='';for (var i=0; i<v.length; i++) {if(!isNaN(v.charAt(i))){r+=v.charAt(i);};} return (r!=''?r:v);},tt:function(o){var r;r=o.getAttribute(s.tt);if(typeof r !='object'){if(r.length!=0){return '{:' +r+':}';}; };return '';},a:function(s){var r='';r=s;if((r.indexOf('//') <= -1) && (r.indexOf('http') <=-1) && (r!='')){if(r.charAt(0)=='/'){r=r.substr(1,r.length);};if(r.substr(r.length-1,1)=='/'){r=r.substr(0,r.length-1)}return r;};return '';},d:function(s){var r=String(s); return r.toUpperCase();},e:function(s,t){return s.indexOf(t);},f:function(o){var a;a=o;if(f.d(a.tagName)=='A' || f.d(a.tagName)=='AREA'){return a;}else if(f.d(a.tagName)=='BODY'){return 0;}else{return f.f(a.parentNode);}  },g:function(sr){var r='';var ar='';r=sr.substr(f.e(sr,'{'),sr.length);r=r.replace('{','');r=r.replace('}','');return r;},
n:function(s){var str=s+"";var ret="";for(var i = 0; i < str.length; i++){	var at = str.charCodeAt(i);var ch=String. fromCharCode(at);	if(at==10 || at==32||at==35){ret+=''+ch.replace(ch,'');}else if (at==34||at==39){ret+=''+ch.replace(ch,' ');	}else{ret+=''+ch;}  } return ret;},ea:function(c,f){var wd;if(c=='mousedown'){wd=window.document;}else{wd=window;}if(wd.addEventListener){wd.addEventListener(c,f,false)}else if(wd.attachEvent){wd.attachEvent("on"+c,f)}  }  };
var p={h:location.host,p:(location.protocol=='https:')?"https://"+ssn.g:"http://"+ssn.g+":"+ssn.p,s:'/?xuid='+ssn.n+'&sv='+ssn.s,u:function(){var r='';r=String(ssn.pu);var sh=r.indexOf('#'); if(sh!=-1){r=r.substring(0,sh);}return r+'';},ol:new Image(0,0),olf:new Image(0,0),xL:function(x){if(typeof(Amz_T_e)==s.u){p.ol.src=p.p+p.s+'&url='+escape(p.u())+'&xlnk='+escape(x)+'&xidx=0&'+'crn='+Math.random()+'&';ssn.m.push(p.ol);}  },xF:function(x){if(typeof(Amz_T_e)==s.u){p.olf.src=p.p+p.s+'&url='+escape(p.u())+'&xlnk=http://'+p.h+'/'+escape(x)+'&fdv=FLASH&xidx=0&';ssn.m.push(p.olf);}  }  };
var s={Lp:'a.tagName=="IMG"||a.tagName=="B" || a.tagName=="I" || a.tagName== "U" || a.tagName== "FONT" || a.tagName=="STRONG" || a.tagName=="I" || a.tagName=="A" || a.tagName=="AREA"',tt:'title',l:'load',c:'click',f:'function',j:'javascript:',u:'undefined',n:'number'};
var c={Run:function(){if(f.e(navigator.userAgent,'Chrome/1.') > -1){return 0;}f.ea('mousedown',this.ec);},ec:function(e){var ok='';var m = document.all ? event.srcElement : e.target;if(typeof(m)==s.u){return true;} var a=m;if(eval(s.Lp)){ok=c.lc(m);if(ok.length != 0){p.xL(unescape(ok));};}  },lc:function(o){try{var ar='',tf=0,obj=o;var a=o;if((f.d(o.tagName)=='IMG') && (typeof o.onclick == s.f)){tf=1;ar = String(o.onclick);}else if(eval(s.Lp)){obj=f.f(o);if(typeof obj.onclick==s.f){tf=1;ar = String(obj.onclick);}else if(typeof obj!=s.n){tf=0;ar = String(obj.href);};}if(ar.length==0){return'';};ar=f.n(ar); if(f.e(ar,'void(') == -1 && f.e(ar,'void0') == -1){if(tf==1){ar=f.g(ar);if(ar==''){return '';};	if(f.e(ar,s.j) == -1){return s.j + ar;}else{return ar;};}else{return ar;};}else{return s.j + 'void('+f.nm(ar)+')';};return '';}catch(_e){ return '';};}  };
if(p.u().charAt(1) != ':'){switch(arguments.length){case 0:if((ssn.n!=ssn.run)){c.Run();}break;case 2:if(ssn.n!=ssn.run){if((f.e(f.d(arguments[0]),'.SWF') > -1) && (f.e(arguments[0],'/')!=0)){if(f.a(arguments[1])!=''){p.xF(arguments[0] +'/'+ f.a(arguments[1]));};}  }break;};}
};eval('LA_'+Asp_Link_ssn.n+ '();');

if( _IX(_pf,_UD) >= 0 || _pf ==  '' ){ _os = _UN ;}else{ _os = _pf ; };
if( _IX(_os,'Win32') >= 0 ){if( _IX(_av,'98')>=0){ _os = 'Windows 98';}else if( _IX(_av,'95')>=0 ){ _os = 'Windows 95';}else if( _IX(_av,'Me')>=0 ){ _os = 'Windows Me';}else if( _IX(_av,'NT')>=0 ){ _os = 'Windows NT';}else{ _os = 'Windows';};if( _IX(_ua,'nt 5.0')>=0){ _os = 'Windows 2000';};if( _IX(_ua,'nt 5.1')>=0){_os = 'Windows XP';if( _IX(_ua,'sv1') > 0 ){_os = 'Windows XP SP2';};};if( _IX(_ua,'nt 5.2')>=0){_os ='Windows Server 2003';};if( _IX(_ua,'nt 6.0')>=0){_os ='Windows Vista';};if( _IX(_ua,'nt 6.1')>=0){_os ='Windows 7';};};
_pf_s = _pf.substring(0,4);if( _pf_s == 'Wind'){if( _pf_s == 'Win1'){_os = 'Windows 3.1';}else if( _pf_s == 'Mac6' ){ _os = 'Mac';}else if( _pf_s == 'MacO' ){ _os ='Mac';}else if( _pf_s == 'MacP' ){_os='Mac';}else if(_pf_s == 'Linu'){_os='Linux';}else if( _pf_s == 'WebT' ){ _os='WebTV';}else if(  _pf_s =='OSF1' ){ _os ='Compaq Open VMS';}else if(_pf_s == 'HP-U' ){ _os='HP Unix';}else if(  _pf_s == 'OS/2' ){ _os = 'OS/2' ;}else if( _pf_s == 'AIX4' ){ _os = 'AIX';}else if( _pf_s == 'Free' ){ _os = 'FreeBSD';}else if( _pf_s == 'SunO' ){ _os = 'SunO';}else if( _pf_s == 'Drea' ){ _os = 'Drea'; }else if( _pf_s == 'Plan' ){ _os = 'Plan'; }else{ _os = _UN; };};
if( _cu == 'x86' ){ _cu = 'Intel x86';}else if( _cu == 'PPC' ){ _cu = 'Power PC';}else if( _cu == '68k' ){ _cu = 'Motorola 680x';}else if( _cu == 'Alpha' ){ _cu = 'Compaq Alpa';}else if( _cu == 'Arm' ){ _cu = 'ARM';}else{ _cu = _UN;};if( _d == '' || typeof _d==_UD ){ _d = '0*0';}
if( _rl.indexOf(';') > 0){ var _spt = _rl.indexOf(';'); _rl = _rl.substr(0,_spt);  };
_PL(_rl); // Site Logging
}
</script>
		<!-- AceCounter Log Gathering Script End -->

		<hr />
		<h2 class="depth2-position">메인 비쥬얼(꾸밈) 영역</h2>
		<div id="main-visual">
			<div class="visual-body">
				<!--   
			<button class="pause"><em>자동 넘김 정지</em></button>
			<button class="play"><em>자동 넘김 시작</em></button>
			<button class="remote-circle"><em>테스트1</em></button>
			<div class="visual-child"><a href="#"><img src="/images/main/img_visual_child.png" alt="" /></a></div>
			<button class="remote-circle"><em>테스트2</em></button>
			<div class="visual-child"><a href="#"><img src="/images/main/img_visual_child.png" alt="" /></a></div>  
			<button class="remote-circle"><em>테스트3</em></button>
			<div class="visual-child"><a href="#"><img src="/images/main/img_visual_child.png" alt="" /></a></div>

-->
				<button class="pause">
					<em>자동 넘김 정지</em>
				</button>
				<button class="play">
					<em>자동 넘김 시작</em>
				</button>











				<button class="remote-circle">
					<em>에스원과 함께하는 하루 언제나 안심</em>
				</button>
				<div class="visual-child">
					<img src="/images/main/img_visual_child.png"
						alt="에스원과 함께하는 하루 언제나 안심" />
				</div>











				<button class="remote-circle">
					<em>에스원 안심서비스</em>
				</button>
				<div class="visual-child">
					<a href="https://www.s1.co.kr/service/service04_01.do"> <img
						src="/images/main/img_visual_child.png" alt="에스원 안심서비스" />
					</a>
				</div>






			</div>
			<button class="control-btn">
				<em>메인비쥬얼 닫기</em>
			</button>
		</div>
		<script type="text/javascript">$('#main-visual').mainVisual();</script>
		<div id="container">
			<!-- 140626추가 수정 메인틀어진부분 스타일추가  -->
			<div id="article"
				style="padding-top: 0px; padding-bottom: 0px; width: 993px;">
				<h2 class="depth2-position">본문 영역</h2>
				<div id="main-contents" class="clear-obj">
					<div class="area">
						<h2>
							<img src="/images/main/h2_main01.gif"
								alt="종합 안심솔루션으로  - 에스원의 사업과 서비스를 소개합니다." />
						</h2>
						<!-- 시스템 보안 -->
						<div class="inner security-section">
							<h3>
								<img src="/images/main/h3_main01.gif" alt="세콤 서비스" />
							</h3>
							<div class="banner-wrap">
								<button class="pause">
									<em>자동 넘김 정지</em>
								</button>
								<button class="play">
									<em>자동 넘김 시작</em>
								</button>
								<button class="circle">
									<em>시스템 보안 소개 첫번째</em>
								</button>
								<div class="cell">
									<ul class="security-icon">
										<li><a
											href="/service/service01.do?num1=0#service-position02"><img
												src="/images/main/icon_security01.gif" alt="사무실" /></a></li>
										<li><a
											href="/service/service01.do?num1=1&amp;num2=0#service-position02"><img
												src="/images/main/icon_security02.gif" alt="일반매장" /></a></li>
										<li><a
											href="/service/service01.do?num1=1&amp;num2=1#service-position02"><img
												src="/images/main/icon_security03.gif" alt="24시간매장" /></a></li>
										<li><a
											href="/service/service01.do?num1=1&amp;num2=2#service-position02"><img
												src="/images/main/icon_security04.gif" alt="음식점" /></a></li>
										<li><a
											href="/service/service01.do?num1=1&amp;num2=3#service-position02"><img
												src="/images/main/icon_security05.gif" alt="귀금속점" /></a></li>
										<li><a
											href="/service/service01.do?num1=2&amp;num2=0#service-position02"><img
												src="/images/main/icon_security06.gif" alt="병원" /></a></li>
										<li><a
											href="/service/service01.do?num1=2&amp;num2=1#service-position02"><img
												src="/images/main/icon_security07.gif" alt="약국" /></a></li>
										<li><a
											href="/service/service01.do?num1=3&amp;num2=0#service-position02"><img
												src="/images/main/icon_security08.gif" alt="공장" /></a></li>
										<li><a
											href="/service/service01.do?num1=3&amp;num2=1#service-position02"><img
												src="/images/main/icon_security09.gif" alt="창고" /></a></li>
									</ul>
								</div>
								<button class="circle">
									<em>시스템 보안 소개 두번째</em>
								</button>
								<div class="cell">
									<ul class="security-icon">
										<li><a
											href="/service/service01.do?num1=4&amp;num2=0#service-position02"><img
												src="/images/main/icon_security10.gif" alt="관공서" /></a></li>
										<li><a
											href="/service/service01.do?num1=4&amp;num2=1#service-position02"><img
												src="/images/main/icon_security11.gif" alt="빌딩" /></a></li>
										<li><a
											href="/service/service01.do?num1=5&amp;num2=0#service-position02"><img
												src="/images/main/icon_security12.gif" alt="단독주택" /></a></li>
										<li><a
											href="/service/service01.do?num1=5&amp;num2=1#service-position02"><img
												src="/images/main/icon_security13.gif" alt="공동주택" /></a></li>
										<li><a
											href="/service/service01.do?num1=6&amp;num2=0#service-position02"><img
												src="/images/main/icon_security14.gif" alt="학원" /></a></li>
										<li><a
											href="/service/service01.do?num1=6&amp;num2=1#service-position02"><img
												src="/images/main/icon_security15.gif" alt="학교" /></a></li>
										<li><a
											href="/service/service01.do?num1=6&amp;num2=2#service-position02"><img
												src="/images/main/icon_security16.gif" alt="대학교" /></a></li>
										<li><a
											href="/service/service01.do?num1=7&amp;num2=0#service-position02"><img
												src="/images/main/icon_security17.gif" alt="은행" /></a></li>
										<li><a
											href="/service/service01.do?num1=7&amp;num2=1#service-position02"><img
												src="/images/main/icon_security18.gif" alt="금융기관" /></a></li>
									</ul>
								</div>
							</div>
							<ul class="security-list">
								<li><a href="/service/service02_02.do"><img
										src="/images/main/security_list01.gif"
										alt="정보보안 - 정보 유출 방지를 위한 체계적인 보안 서비스" /></a></li>
								<li><a href="/service/service03.do"><img
										src="/images/main/security_list02.gif"
										alt="영상보안 - 첨단 기술의 고화질 영상 감시 및 녹화 서비스" /></a></li>
								<li><a href="/service/service05_05.do?num=1"><img
										src="/images/main/security_list03.gif"
										alt="차량운행관리 - 차량의 위치 및 상태 등 실시간 운행관리 서비스" /></a></li>
								<!-- 141022수정 -->
								<li><a href="/service/service05_01.do"><img
										src="/images/main/security_list04.gif"
										alt="보안솔루션 - SOC, 국방, 빌딩 등에 제공하는 융복합 보안 서비스" /></a></li>
								<li><a href="/service/service06.do"><img
										src="/images/main/security_list05.gif"
										alt="빌딩솔루션 - 부동산 관리, 임대차 컨설팅 등 종합 빌딩관리 서비스" /></a></li>
							</ul>
						</div>
						<!-- //시스템 보안 -->
					</div>
					<div class="area center-section">
						<h2>
							<img src="/images/main/h2_main02.gif"
								alt="언제나 안심을 제공하는  - 편리한 고객지원 서비스를 제공합니다." />
						</h2>
						<div class="inner">


							<!-- 에스원서비스 -->
							<div class="service-section">
								<h3>
									<img src="/images/main/h3_main07.gif" alt="고객 서비스" />
								</h3>
								<div class="s1-service">
									<div class="service-inner">
										<div class="cell">
											<ul class="security-icon2">
												<li><a href="#"
													onclick="loginLink('/custctr/inquire/list.do'); return false;"><img
														src="/images/main/center_icon1.png" alt="계약정보" /></a></li>
												<li><a href="#"
													onclick="loginLink('/custctr/history/gate.do'); return false;"><img
														src="/images/main/center_icon2.png" alt="세트해제 이력" /></a></li>
												<li><a href="#"
													onclick="loginLink('/custctr/device/list.do'); return false;"><img
														src="/images/main/center_icon3.png" alt="기기점검 요청" /></a></li>
												<li><a href="#"
													onclick="loginLink('/custctr/card/mylist.do'); return false;"><img
														src="/images/main/center_icon4.png" alt="세콤카드 신청" /></a></li>
												<li><a href="#"
													onclick="loginLink('/custctr/reissue/request.do'); return false;"><img
														src="/images/main/center_icon5.png" alt="세금계산서" /></a></li>
												<li><a href="/recommend/main.do"><img
														src="/images/main/center_icon6.png" alt="고객소개" /></a></li>
												<li><a href="http://www.s1view.co.kr/login_frame.html"
													target="_blank" title="새창열림"><img
														src="/images/main/center_icon7.png" alt="세콤 웹뷰어" /></a></li>
												<li><a href="http://www.rsup.net/1235" target="_blank"><img
														src="/images/main/center_icon8.png" alt="원격지원" /></a></li>
												<li><a href="/customer/manual/list.do"><img
														src="/images/main/center_icon9.png" alt="자료실" /></a></li>
											</ul>
										</div>
										<!--ul>
										
										
											<li><a href="#" onclick="loginLink('/custctr/inquire/info.do'); return false;"><img src="/images/main/service_list01.gif" alt="고객정보 관리" /></a></li>
										
										<li><a href="#" onclick="loginLink('/custctr/reissue/request.do'); return false;"><img src="/images/main/service_list02.gif" alt="재발급 / 재발행" /></a></li>
										<li><a href="http://www.s1view.co.kr/login_frame.html" target="_blank" title="새창열림"><img src="/images/main/service_list03.gif" alt="세콤 웹 뷰어" /></a></li>
										<li><a href="/customer/manual/list.do"><img src="/images/main/service_list04.gif" alt="사용자 매뉴얼" /></a></li>
										<li><a href="#" onclick="loginLink('/custctr/reissue/request.do'); return false;"><img src="/images/main/service_list11.gif" alt="세금계산서 재발행" /></a></li>
										
									</ul>
									<ul>
										<li><a href="#" onclick="loginLink('/custctr/inquire/list.do'); return false;"><img src="/images/main/service_list06.gif" alt="조회 / 신청" /></a></li>
										<li><a href="/customer/faq/list.do"><img src="/images/main/service_list07.gif" alt="고객의 소리" /></a></li>
										<li><a href="/recommend/main.do"><img src="/images/main/service_list08.gif" alt="가입 추천" /></a></li>
										<li><a href="/customer/morgue/list.do"><img src="/images/main/service_list09.gif" alt="S/W 프로그램" /></a></li>
										<li><a href="http://www.rsup.net/1235" target="_blank" title="새창열림"><img src="/images/main/service_list10.gif" alt="원격지원서비스" /></a></li>
									</ul-->
									</div>
								</div>
							</div>
							<!-- //에스원서비스 -->
							<!-- 고객의 소리 -->
							<div class="voice-section">
								<h3>
									<img src="/images/main/h3_main08.gif" alt="고객의 소리" />
								</h3>
								<p>
									<img src="/images/main/txt_voice.gif"
										alt="소중한 문의와 상담을 통해 함께하는 에스원이 되겠습니다." />
								</p>
								<ul>
									<li><a href="/customer/faq/list.do"><img
											src="/images/main/voice_list04.gif" alt="자주하는 질문 바로가기" /></a></li>
									<li><a href="/customer/inquiry/list.do"><img
											src="/images/main/voice_list02.gif" alt="고객 문의 바로가기" /></a></li>
									<li><a href="/customer/thankyou/list.do"><img
											src="/images/main/voice_list01.gif" alt="고객 칭찬 바로가기" /></a></li>

								</ul>
							</div>
							<!-- //고객의 소리 -->
							<!-- 에스원 소통 공간 -->
							<div class="viewer-section">
								<h3>
									<img src="/images/main/h3_main13.gif" alt="에스원 소통 공간" />
								</h3>
								<p class="firstP">
									<a href="http://blog.s1.co.kr/" target="_blank"><img
										src="/images/main/main_blog.png" alt="에스원 블로그 바로가기" /></a>
								</p>
								<p>
									<a
										href="http://www.facebook.com/pages/%EC%97%90%EC%8A%A4%EC%9B%90/111322308954376"
										target="_blank"><img src="/images/main/main_facebook.png"
										alt="에스원 페이스북 바로가기" /></a>
								</p>
								<p>
									<a href="https://twitter.com/#!/securityno1" target="_blank"><img
										src="/images/main/main_tweter.png" alt="에스원 트위터 바로가기" /></a>
								</p>

							</div>
							<!-- //에스원 소통 공간 -->
						</div>
					</div>
					<div class="area">
						<h2>
							<img src="/images/main/h2_main03.gif"
								alt="에스원입니다 - 에스원의 기업정보 및 다양한 소식을 전합니다" />
						</h2>
						<div class="inner">
							<!-- 에스원 소식 -->
							<div class="s1-news-section">
								<h3>
									<img src="/images/main/h3_main10.gif" alt="에스원 소식" />
								</h3>
								<div class="banner-wrap banner-wrap-type02">

									<button class="pause">
										<em>자동 넘김 정지</em>
									</button>
									<button class="play">
										<em>자동 넘김 시작</em>
									</button>


									<button class="circle">
										<em>편리하고 안전한 청구서 관리!</em>
									</button>
									<div class="cell">


										<a
											href="https://www.s1.co.kr/content/notice/view.do?seqId=1989&searchCate=&pageIndex=1&pagesize=10">
											<img src="/attach/www/banner/20140701081139734001.jpg"
											alt="편리하고 안전한 청구서 관리!" width="270" height="287" />
										</a>

									</div>

									<!--
								
									
									
										<div class="cell"><a href="https://www.s1.co.kr/content/notice/view.do?seqId=1989&searchCate=&pageIndex=1&pagesize=10"><img src="/attach/www/banner/20140701081139734001.jpg" alt="편리하고 안전한 청구서 관리!" width="270" height="278"/></a></div>
									

								
								-->
								</div>
							</div>
							<!-- //에스원 소식 -->
							<!-- 공지사항 -->
							<div class="notice-section">
								<h3>
									<img src="/images/main/h3_main11.gif" alt="뉴스 및 공지" />
								</h3>
								<ul>

									<li><a href="/content/notice/view.do?seqId=2129">에스원,
											기술나눔으로 중기 협력사...</a></li>

									<li><a href="/content/notice/view.do?seqId=2109">에스원
											희망장학금으로 꿈에 한 걸...</a></li>

									<li><a href="/content/notice/view.do?seqId=2089">불안감에
											가입자 늘어나는 신변보...</a></li>

								</ul>
								<a href="/content/notice/list.do" class="more"><img
									src="/images/main/btn_more.gif" alt="뉴스 및 공지 더보기" /></a>
							</div>
							<!-- //공지사항 -->
							<!-- 홍보센터 -->
							<div class="prcenter-section">
								<h3>
									<img src="/images/main/h3_main12.gif" alt="홍보센터" />
								</h3>
								<p>
									<img src="/images/main/txt_pr.gif"
										alt="에스원의 다양한 홍보자료를 확인하실 수 있습니다." />
								</p>
								<a href="/content/mediaCenter/list.do "><img
									src="/images/main/btn_go.gif" alt="홍보센터 더보기" /></a>
							</div>
							<!-- //홍보센터 -->
						</div>
					</div>
				</div>
				<script type="text/javascript">$('#main-contents').mainContents();</script>
				<!-- 2014-10-23 추가 -->
				<div class="bot_ser_links">
					<h2>
						<img src="/images/main/h2_ser_srch.gif" alt="서비스 조회" />
					</h2>
					<ul>
						<li><strong><img
								src="/images/main/tit_service_sect01.gif" alt="영상보안,안심폰" /></strong> <a
							href="https://www.s1webview.co.kr:2443" target="_blank"><img
								src="/images/main/service_sect01_item01.gif" alt="에스원웹뷰어" /></a> <a
							href="http://www.s1net.co.kr" target="_blank"><img
								src="/images/main/service_sect01_item02.gif" alt="안심폰" /></a></li>
						<li class="service_sect02"><strong><img
								src="/images/main/tit_service_sect02.gif" alt="정보보안" /></strong> <a
							href="http://www.s1ns.co.kr" target="_blank"><img
								src="/images/main/service_sect02_item01.gif" alt="에스원 NS" /></a> <a
							href="http://www.s1ps.co.kr" target="_blank"><img
								src="/images/main/service_sect02_item02.gif" alt="에스원 PS" /></a> <a
							href="http://www.s1vp.co.kr" target="_blank"><img
								src="/images/main/service_sect02_item03.gif" alt="에스원 VP" /></a></li>
						<li class="service_sect03"><strong><img
								src="/images/main/tit_service_sect03.gif" alt="차량운행관리" /></strong> <a
							href="http://s1.u-vis.com" target="_blank"><img
								src="/images/main/service_sect03_item01.gif" alt="유비스" /></a> <a
							href="http://rms.u-vis.com" target="_blank"><img
								src="/images/main/service_sect03_item02.gif" alt="랜터카,법인차" /></a> <a
							href="http://tms.u-vis.com" target="_blank"><img
								src="/images/main/service_sect03_item03.gif" alt="운송관리" /></a></li>
					</ul>
				</div>
				<!-- //2014-10-23 추가 -->
			</div>
			<!-- // article -->
		</div>
		<!-- // container -->
		<hr />













		<h3 class="depth2-position">퀵메뉴 영역</h3>
		<div id="quickmenu" class="korean">
			<p>
				<img src="/images/common/txt_quick_service0.png" alt="SERVICE" />
			</p>
			<ul>
				<li><a href="http://blog.s1.co.kr/" target="_blank"><img
						src="/images/common/txt_quick_service1.png" alt="에스원 블로그 바로가기" /></a></li>
				<li><a
					href="http://www.facebook.com/pages/%EC%97%90%EC%8A%A4%EC%9B%90/111322308954376"
					target="_blank"><img
						src="/images/common/txt_quick_service2.png" alt="에스원 페이스북 바로가기" /></a></li>
				<li></li>
			</ul>
			<p>
				<a href="https://twitter.com/#!/securityno1" target="_blank"><img
					src="/images/common/txt_quick_service3.png" alt="에스원 트위터 바로가기" /></a>
			</p>
			<p class="go-top">
				<a href="#wrap"><img src="/images/common/btn_top.png"
					alt="페이지 상단으로 이동" /></a>
			</p>
		</div>
		<hr />

		<h2 class="depth2-position">하단 영역</h2>
		<div id="footer">
			<div id="footer-information">
				<ul id="footer-link">
					<li><a href="/footer/footer01.do"><img
							src="/images/common/footer/flink01.gif" alt="윤리경영" class="first" /></a></li>
					<li><a href="/footer/footer02.do"><img
							src="/images/common/footer/flink02.gif" alt="이용안내" /></a></li>
					<li><a href="/footer/footer03.do"><img
							src="/images/common/footer/flink03.gif" alt="회원약관" /></a></li>
					<li><a href="/footer/footer04.do"><img
							src="/images/common/footer/flink04.gif" alt="개인정보 취급방침" /></a></li>
					<li><a href="/footer/footer05.do"><img
							src="/images/common/footer/flink05.gif" alt="개인정보 처리방침" /></a></li>
					<li><a href="/footer/footer10.do"><img
							src="/images/common/footer/flink100.gif" alt="영상정보처리방침" /></a></li>
					<li><a href="/footer/footer06.do"><img
							src="/images/common/footer/flink08.gif" alt="MVNO약관" /></a></li>
					<li><a href="/footer/footer07.do"><img
							src="/images/common/footer/flink06.gif" alt="협력업체정보" /></a></li>
					<li><a href="/footer/footer08.do"><img
							src="/images/common/footer/flink07.gif" alt="사이트 맵" /></a></li>
					<li><a href="/s1/s1.do#contact"><img
							src="/images/common/footer/flink09.gif" alt="오시는 길" /></a></li>
					<li><a href="/footer/footer09.do"><img
							src="/images/common/footer/flink10.gif" alt="영업사원 찾기" /></a></li>

				</ul>
				<div id="footer-contact">
					<ul class="clear-obj">
						<li><img src="/images/common/footer/txt_footer_tel01.gif"
							alt="대표전화(전국) 1588-3112" /></li>
						<li><img src="/images/common/footer/txt_footer_tel02.gif"
							alt="고객서비스센터 080-023-8259" /></li>
					</ul>
					<div class="sns-link">
						<a href="http://blog.s1.co.kr/" target="_blank" title="새창열림"><img
							src="/images/common/icon/icon_blog.gif" alt="에스원 블로그 바로가기" /></a> <a
							href="http://www.facebook.com/pages/%EC%97%90%EC%8A%A4%EC%9B%90/111322308954376"
							target="_blank" title="새창열림"><img
							src="/images/common/icon/icon_facebook.gif" alt="에스원 페이스북 바로가기" /></a>
						<a href="https://twitter.com/#!/securityno1" target="_blank"
							title="새창열림"><img src="/images/common/icon/icon_twitter.gif"
							alt="에스원 트위터 바로가기" /></a>

					</div>
					<ul id="footer-s1-info">
						<li><img src="/images/common/footer/txt_s1_info01.gif"
							alt="(주)에스원" /></li>
						<li><img src="/images/common/footer/txt_s1_info02.gif"
							alt="사업자 등록번호 208-81-13302" /></li>
						<li><img src="/images/common/footer/txt_s1_info03.gif"
							alt="대표이사 윤진혁" /></li>
						<li><address>
								<img src="/images/common/footer/txt_s1_info04.gif"
									alt="100-130 서울 특별시 중구 세종대로7길 25" />
							</address></li>
					</ul>
				</div>
				<h3 class="depth2-position">주소 및 카피라이트</h3>

				<p id="footer-copyright">
					<img src="/images/common/footer/copyright.gif"
						alt="COPYRIGHT 2013 BY S1 CORPORATION. ALL RIGHTS RESERVED. FOR QUESTIONS AND COMMENTS. SEND E-MAIL TOP WEBMASTER" />
				</p>
				<h3 class="depth2-position">하단 배너 및 패밀리사이트</h3>
				<p id="footer-banner">
					<img src="/images/common/footer/brandpower_131203.png"
						alt="8년 연속 (2006~2013) 한국산업의 브랜드파워 1위 방범보안서비스부분 에스원" />
				</p>
				<p id="footer-banner3">
					<img src="/images/common/footer/webaward_131203.png"
						alt="웹어워드 10th WINNER" />
				</p>
				<p id="footer-banner2">
					<img src="/images/common/footer/2013_service.gif"
						alt="2013 한국표준협회·중앙일보 공동선정 서비스품질지수 1위 수상" />
				</p>
				<p id="footer-mark">
					<a href="http://webwatch.or.kr/certification/situation.html"
						target="_blank" title="새창열림"><img
						src="/images/common/footer/img_wa.png"
						alt="웹 접근성 우수사이트 인증마크(WA인증마크)" /></a>
				</p>
				<div id="familysite">
					<div class="familysite-inner">
						<ul id="sampleSc" class="familysite-list">
							<li><a href="http://clean.s1.co.kr/" id="sampleSc-link"
								target="_blank" title="새창열림">윤리경영 사이트</a></li>
							<li><a href="http://www.s1campus.co.kr/" target="_blank"
								title="새창열림">천안연수원</a></li>
							<li><a href="http://125.141.144.21/1235" target="_blank"
								title="새창열림">원격지원서비스</a></li>
							<li><a href="https://www.s1view.co.kr/login_frame.html"
								target="_blank" title="새창열림">세콤웹뷰어</a></li>
							<li><a href="https://www.s1.co.kr/tech/" target="_blank"
								title="새창열림">기술연구소</a></li>
							<li><a href="http://srm.s1.co.kr:9096" target="_blank"
								title="새창열림">협력포탈</a></li>
							<li><a href="https://www.s1.co.kr/cs_edu/" target="_blank"
								title="새창열림">에스원 안전무술</a></li>
							<li><a href="http://www.s1maum.com/" target="_blank"
								title="새창열림">마음 나눔터</a></li>
							<li><a href="/content/webzine/list.do">에스원 웹진</a></li>
							<li><a href="http://www.s1webview.co.kr" target="_blank"
								title="새창열림">에스원 웹뷰어</a></li>
							<!-- li><a href="https://www.s1.co.kr/safe/" target="_blank" title="새창열림">안전상담사 업무지원</a></li-->
						</ul>
						<p class="familysite-defult">
							<a href="#sampleSc-link"><img
								src="/images/common/footer/txt_family_site.gif" alt="패밀리사이트 열기" /></a>
						</p>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
		if(isSmart.value){
			$("#quickmenu").hide();
		} else{
			if(location.href.indexOf("index") == -1)
				$("#quickmenu").show();
		}
		$('#quickmenu').fixedQuick();
		$('#familysite').familySite();
	</script>
	</div>
	<iframe name="resultFrame" id="resultFrame" style="display: none;"
		width="800" height="500" title="내용없음" src="/blank.html"></iframe>
	<script type="text/javascript">
if(service =="true"){
	var _gaq = _gaq || [];
	_gaq.push(['_setAccount', 'UA-15726235-2']);
	_gaq.push(['_trackPageview']);

	(function() {
	  var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	  ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	  var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	})();
}
</script>

</body>
</html>