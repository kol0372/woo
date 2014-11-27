
jQuery(function($){
    //달력 팝업 설정
    $.datepicker.regional['ko'] = {
        closeText: '닫기',
        prevText: '이전달',
        nextText: '다음달',
        currentText: '오늘',
        monthNames: ['1월','2월','3월','4월','5월','6월',
        '7월','8월','9월','10월','11월','12월'],
        monthNamesShort: ['1월','2월','3월','4월','5월','6월',
        '7월','8월','9월','10월','11월','12월'],
        dayNames: ['일','월','화','수','목','금','토'],
        dayNamesShort: ['일','월','화','수','목','금','토'],
        dayNamesMin: ['일','월','화','수','목','금','토'],
        weekHeader: 'Wk',
        dateFormat: 'yy-mm-dd',
        showOn:"button",
        //buttonImage: '/images/ico_cal.gif',
        buttonImage: '/images/common/icon/icon_calendar.gif',
        buttonImageOnly:false,
        firstDay: 0,
        isRTL: false,
        showMonthAfterYear: false,
        yearSuffix: '',
        changeMonth:true,
        changeYear:true,   
        yearRange:'c-1:c+5',
        showOtherMonths: true,
        selectOtherMonths: false,
        showWeek: false,
        showButtonPanel: true,
        onSelect: function( selectedDate ) {
            var option = this.id == "fromDate" ? "minDate" : "maxDate",
                instance = $( this ).data( "datepicker" ),
                date = $.datepicker.parseDate(
                    instance.settings.dateFormat ||
                    $.datepicker._defaults.dateFormat,
                    selectedDate, instance.settings );
            if($("#fromDate") && $("#toDate")){
                $("#fromDate, #toDate").not(this).datepicker( "option", option, date );
            }
            
        }


    };  
    $.datepicker.setDefaults($.datepicker.regional['ko']);
});
//이미지 팝업
function openImgPopup(imgPath){
    window.open(imgPath,'IMGPOPUP','');
}


function setValue(id, value){
    value  = $.trim(value);  
    var obj = $("#"+id);
    if(obj.size()>0 && value){
        if(obj[0].type == "text" 
                || obj[0].type == "textarea" 
                || obj[0].type == "password"){
            obj.val(value);
            
        }else if(obj[0].type == "select-one"){
            $("select[id="+id+"] option[value="+value + "]").attr("selected", true);
        }else if(obj[0].type == "radio"){
            $("select[id="+id+"] option[value="+value + "]").attr("selected", true);
        }else if(obj[0].type == ""){
            
        }else if(obj[0].type == ""){
            
        }
            
    }else{
        var obj = $(':radio[name="'+id+'"]');
        if(obj.size()>0 && value){   
            obj.each(function(){  
                if(this.value == value){
                    this.checked = true;   
                }
             });
        } 
    }
}


String.prototype.replaceAll = function (str1,str2){
    var str    = this;     
    var result   = str.replace(eval("/"+str1+"/gi"),str2);
    return result;
}

function openWin(url, id, wid, hei, scroll){
	var openPopWindow = window.open(url, id, "width="+ wid +", height="+ hei +", scrollbars="+ scroll +", left=100, top=50, toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no");
	openPopWindow.focus();
}

function openWinZipCode(parents){
	if(parents){
		openWin("/popup/newaddressFind.do?parents="+parents, "zipCode", "950px", "745px");
	//	openWin("/popup/addressFind.do?parents="+parents, "zipCode", "560px", "425px");
	}else{
		openWin("/popup/newaddressFind.do", "zipCode", "950px", "745px");
	//	openWin("/popup/addressFind.do", "zipCode", "560px", "425px");
	}
}



//숫자만 체크
function fnOnlyNumber(loc) {
    if(/[^0123456789]/g.test(loc.value)) {
        alert("숫자만 입력하세요.");
        loc.value = "";
        loc.focus();
    }
}

/************************************************************************
함수명 : fnSelectBox
설 명  : 셀렉트 박스 생성
인 자  : _obj : 셀렉트박스 오브젝트명, _start : 시작, _end : 종료, _selected : 선택값, _txt : 년도등 문자, _step
사용법 : fnSelectBox(_obj, _start, _end, _selected, _txt, _step)
작성일 : 2012-11-20
작성자 : jePark
수정일     수정자     수정내용
------   ------    -------------------
************************************************************************/
function fnSelectBox(_obj, _start, _end, _selected, _txt, _step, odr){

	if (odr == "asc"){
		for(var i = _start ;i <= _end ; i = i + _step){
			$("#" + _obj).append("<option value='" + i + "'>" + i + _txt +  "</option>");
			
			if (_selected && i == _selected)  $("select[id=" + _obj + "] option[value=" + i + "]").attr("selected", true);
		}
	}else{
		for(var i = _end ;i >= _start ; i = i - _step){
			$("#" + _obj).append("<option value='" + i + "'>" + i + _txt +  "</option>");
			
			if (_selected && i == _selected)  $("select[id=" + _obj + "] option[value=" + i + "]").attr("selected", true);
		}		
	}
 }

function loginLink(url){
	if(memberType ==''){
		isLogin(url);
	}else{
		if(memberType=="1"){
			alert("새콤 회원만 이용이 가능합니다.");
			return;
		}else{
			location.href=url;
		}  
	}
	
}
function isLogin(returnUrl){
    if(memberType ==''){
    	alert("로그인을 하셔야 하는 서비스입니다.");
    	if(!returnUrl){
            returnUrl = location.href;
        }
        location.href = '/loginView.do?resultURL='+returnUrl;
        return; 
    }else{
    	location.href = returnUrl;
    	return; 
    }
}

function setZipcode(address, postNo, postNo1, postNo2, parents){
	if(parents=="topFrom"){
		var f = document.topform;
		f.ctPostNo1.value = postNo1;
		f.ctPostNo2.value = postNo2;
		f.ctAddr1.value = address;
		f.ctAddr2.select();
	}
	
	if(parents=="serviceFrom"){
		var f = document.serviceFrom;
		f.ctPostNo1.value = postNo1;
		f.ctPostNo2.value = postNo2;
		f.ctAddr1.value = address;
		f.ctAddr2.select();
	}
	if(parents=="svcForm"){
		var f = document.svcForm;
		f.zipCode1.value = postNo1;
		f.zipCode2.value = postNo2;
		f.svcplAddr1.value = address;
		f.svcplAddr2.select();
	}
	if(parents=="interviewForm"){
		var f = document.interviewForm;
		f.zipcode1.value = postNo1;
		f.zipcode2.value = postNo2;
		f.address1.value = address;
		f.address2.select();
	}	
	
	if(parents == "eventEntryForm"){
		var f = document.eventEntryForm;
		f.zipno1.value = postNo1;
		f.zipno2.value = postNo2;
		f.addr1.value = address;	
		f.addr2.select();
	}
	
	if(parents == "card_general"){
		var f = document.insertForm;
		f.zip1.value = postNo1;
		f.zip2.value = postNo2;
		f.addr1.value = address;	
		f.addr2.select();
	}	
	if(parents=="postForm" ){
		var f = document.postForm;
		f.reqZip1.value = postNo1;
		f.reqZip2.value = postNo2;
		f.reqAddr1.value = address;
		f.reqAddr2.select();
	}
	
	if(parents == "insertForm"){
		var f = document.insertForm;
		f.reqZip1.value = postNo1;
		f.reqZip2.value = postNo2;
		f.reqAddr1.value = address;
		f.reqAddr2.select();
	}		
}

function setNewZipcode(address, address2 , postNo, postNo1, postNo2, parents){
	if(parents=="topFrom"){
		var f = document.topform;
		f.ctPostNo1.value = postNo1;
		f.ctPostNo2.value = postNo2;
		f.ctAddr1.value = address;
		f.ctAddr2.value = address2;
	}
	
	if(parents=="serviceFrom"){
		var f = document.serviceFrom;
		f.ctPostNo1.value = postNo1;
		f.ctPostNo2.value = postNo2;
		f.ctAddr1.value = address;
		f.ctAddr2.value = address2;
	}
	if(parents=="svcForm"){
		var f = document.svcForm;
		f.zipCode1.value = postNo1;
		f.zipCode2.value = postNo2;
		f.svcplAddr1.value = address;
		f.svcplAddr2.value = address2;
	}
	if(parents=="interviewForm"){
		var f = document.interviewForm;
		f.zipcode1.value = postNo1;
		f.zipcode2.value = postNo2;
		f.address1.value = address;
		f.address2.value = address2;
	}	
	
	if(parents == "eventEntryForm"){
		var f = document.eventEntryForm;
		f.zipno1.value = postNo1;
		f.zipno2.value = postNo2;
		f.addr1.value = address;	
		f.addr2.value = address2;
	}
	
	if(parents == "card_general"){
		var f = document.insertForm;
		f.zip1.value = postNo1;
		f.zip2.value = postNo2;
		f.addr1.value = address;	
		f.addr2.value = address2;
	}	
	if(parents=="postForm" ){
		var f = document.postForm;
		f.reqZip1.value = postNo1;
		f.reqZip2.value = postNo2;
		f.reqAddr1.value = address;
		f.reqAddr2.value = address2;
	}
	
	if(parents == "insertForm"){
		var f = document.insertForm;
		f.reqZip1.value = postNo1;
		f.reqZip2.value = postNo2;
		f.reqAddr1.value = address;
		f.reqAddr2.value = address2;
	}		
}

function insertNew(){
	
	var param = {};
	var f = document.topform;
	$(".btnwrap").hide ();
	
	if ( FFString.checkBlank(f.ctCtName	 , "성명"		, true) ){ $(".btnwrap").show (); return; }
		param["ctCtName"]=f.ctCtName.value;
	if ( FFString.checkBlank(f.ctTargetName, "상호"		, false) ){
		$(".btnwrap").show ();
		alert("상호을 입력해 주세요.\n\n주택인 경우에는 '주택'이라고 입력 하세요");
		f.ctTargetName.focus();
		return; 
	}
	param["ctTargetName"]=f.ctTargetName.value;
	if( !FFString.checkBlank(f.ctCtTel1	, "전화번호"	, false)){
		if ( FFString.checkBlank(f.ctCtTel1	, "전화번호"	, true) ){ $(".btnwrap").show (); return; }
		if ( FFString.checkBlank(f.ctCtTel2	, "전화번호"	, true) ){ $(".btnwrap").show (); return; }
		if ( FFString.checkBlank(f.ctCtTel3	, "전화번호"	, true) ){$(".btnwrap").show ();  return; }
		if ( !FFString.checkNumber(f.ctCtTel1	, "전화번호"	, true) ){$(".btnwrap").show ();  return; }
		if ( !FFString.checkNumber(f.ctCtTel2	, "전화번호"	, true) ){ $(".btnwrap").show (); return; }		
		if ( !FFString.checkNumber(f.ctCtTel3	, "전화번호"	, true) ){$(".btnwrap").show (); return; }
	}

	if( !FFString.checkBlank(f.ctCtHp1	, "핸드폰"	, false)){
		if ( FFString.checkBlank(f.ctCtHp1	, "핸드폰"	, true) ){ $(".btnwrap").show (); return; }
		if ( FFString.checkBlank(f.ctCtHp2	, "핸드폰"	, true) ){$(".btnwrap").show ();  return; }
		if ( FFString.checkBlank(f.ctCtHp3	, "핸드폰"	, true) ){ $(".btnwrap").show (); return; }
		if ( !FFString.checkNumber(f.ctCtHp1	, "핸드폰"	, true) ){ $(".btnwrap").show (); return; }
		if ( !FFString.checkNumber(f.ctCtHp2	, "핸드폰"	, true) ){ $(".btnwrap").show (); return; }
		if ( !FFString.checkNumber(f.ctCtHp3	, "핸드폰"	, true) ){ $(".btnwrap").show (); return; }
	}

	if(f.ctCtTel2.value == "" && f.ctCtHp2.value==""){
		$(".btnwrap").show ();
		alert("전화번호나 핸드폰번호를 반드시 입력해 주세요");
		f.ctCtTel1.focus();
		return;
	}
	if(f.ctCtTel1.value != ""){
		param["ctCtTel"]=f.ctCtTel1.value+f.ctCtTel2.value+f.ctCtTel3.value;
	}
	if(f.ctCtHp1.value != ""){
		param["ctCtHp"]=f.ctCtHp1.value+f.ctCtHp2.value+f.ctCtHp3.value;
	}
	

	if ( FFString.checkBlank(f.ctPostNo1	, "우편번호"		, false) ){ 
		$(".btnwrap").show ();
		alert("우편번호를 검색해 주세요");	
		f.ctPostNo1.focus();
		return; 
	}
	if ( f.ctAddr2.value == '' ){
		$(".btnwrap").show ();
		alert("상세주소를 입력해 주세요");
		f.ctAddr2.focus();
		return; 
	}

	param["ctPostNo"]=f.ctPostNo1.value+f.ctPostNo2.value;
	param["ctAddr1"]=f.ctAddr1.value;
	param["ctAddr2"]=f.ctAddr2.value;
	
	
	
	var topCheck = f.topCheck.checked;
	if(!topCheck){
		$(".btnwrap").show ();
		alert("개인정보 수집 이용에 동의해 주시기 바랍니다.");
		f.topCheck.focus();
		return;
	}
	
	
	var sService = f.sService.checked ? "1" : "0";
	var sHomes = f.sHomes.checked ? "1" : "0";
	var sNs = f.sNs.checked ? "1" : "0";
	var sCctv = f.sCctv.checked ? "1" : "0";
//	var sGini = f.sGini.checked ? "1" : "0";
	var sSafe = f.sSafe.checked ? "1" : "0";
	var sAed = f.sAed.checked ? "1" : "0";
	var sSafetalk = f.sSafetalk.checked ? "1" : "0";
	
	param["sService"]=sService;
	param["sHomes"]=sHomes;
	param["sNs"]=sNs;
	param["sCctv"]=sCctv;
//	param["sGini"]=sGini;
	param["sSafe"]=sSafe;
	param["sAed"]=sAed;
	param["sSafetalk"]=sSafetalk;
	
	param["ctMotive"]=f.ctMotive.value;
	$.post(
      "/customer/new/request.do",
      param, function(data) {
    	  if(data=="true"){
    		  alert("등록되었습니다.");
    		  document.topform.reset();
    		  if ($("#service-request").attr('class') == 'request-on') {
    			  $("#service-request").find('.request-form').slideUp(700,'easeInOutQuart',function() {
    				  $("#service-request").removeClass('request-on');
    				});
    			}  
    		  
    		//  location.reload();
    	  }else{
    		  alert("등록에 실패 하였습니다.");
    	  }
    	  $(".btnwrap").show ();
      });
}

function ajaxFaqView(searchCate, pagesize, pageIndex, url){
	var param = 'searchCate=' + searchCate;
	if(pagesize){
		param+="&pagesize="+pagesize;
	}
	if(pageIndex){
		param+="&pageIndex="+pageIndex;
	}
	
    $.ajax({
        type:'GET',
        data: param,
        url: url,
        dataType:'html',
        cache:false,
        error:function(data){
        //	alert("error : " + data.responseText);
        	
        },
        success:function ( html, status ){
        	$("#seviceFaq").html(html);
        		
        }
    }); 		
}

var isSmart = {
	value: navigator.userAgent.match("iPhone|iPad|Android") != null
	//value: navigator.userAgent.match("iPhone|iPad|Android|Mobile|Windows CE|Windows Phone|Opera Mini") != null
};

window.onload= function() {
	var ScrollLi = [];
	$('.article-section').each(function(index) {
		ScrollLi[index] = parseInt($(this).offset().top,10)-50;
	});
	if($('#container').size()>0){
		var ScrollAA = $('#container').offset().top;
		
		if ( $(window).scrollTop() > ScrollAA ) {
			$('#container').addClass('sticky');
		}
		if (!$('.contents-follow li a').is('.link')) {
			for ( var i=0; i<ScrollLi.length; i++ ) {
				if ( i == ScrollLi.length-1 ) {
					if ( ScrollLi[i] < $(window).scrollTop() ) {
						$('.contents-follow li a').eq(i).parent().addClass('on');
						break;
					}
				} else {
					if ( ( ScrollLi[i] < $(window).scrollTop() ) && ( ScrollLi[i+1] > $(window).scrollTop() ) ) {
						$('.contents-follow li a').eq(i).parent().addClass('on');
						break;
					}
				}
			}	
		}
	}
};

function checkNumberReplace(o){
	var taget="0123456789";
	var val=o.value;
	var val2="";
	for(var i=0; i<val.length;i++){
		var a = val.charAt(i);
		for(var j=0; j<taget.length;j++){
			var b= taget.charAt(j);
			if(a==b){
				val2+=a;
			}
		}
	}
	o.value=val2;
}

function checkNumberReplaceMsg(o,objname){
	var check = false;
	var val=o.value;
	var val2="";
	for(var i=0; i<val.length;i++){
		var temp = val.charAt(i);		
		if(temp < '0' || temp > '9' ){
			check = true;
		}else{
			val2+=temp;
		}
	}
	if(check){
		alert("숫자로 입력해 주십시오.");
	}
	o.value=val2;
}



function fileDown(fileName,fileName2,path){
	alert(fileName2);
	var f = $("#fileDownForm")[0];
	f.fileName.value=fileName;
	f.fileName2.value=escape(fileName2); 
	f.path.value=path;
	f.submit(); 
}

function phoneTel(href){
	if(isSmart.value){ 
		location.href=href;
	}
}

function fnNumberFormat(input){
    var input = String(input);
    var reg = /(\-?\d+)(\d{3})($|\.\d+)/;
    if(reg.test(input)){
        return input.replace(reg, function(str, p1, p2, p3){
            return fnNumberFormat(p1) + "," + p2 + "" + p3;
        });
    }else{
        return input;
    }
}

function checkChar(str){
	var tempChar = "";
	var count=0;
	var type="";
	for(var i=0; i<str.length; i++){
		temp = str.charCodeAt(i);
		if((temp >= 48 && temp <=57) || (temp >= 65 && temp <=90) || (temp >= 97 && temp <=122)){
		
			if(tempChar ==""){
				tempChar = temp;
				count++;
				continue;
			}
			if((tempChar + 1) == temp){
				if(type=="right" || type==""){
					type="right";
					count++;
				}else{
					count=0
				}
			}else if((tempChar - 1) == temp){
				if(type=="left" || type==""){
					type="left";
					count++;
				}else{
					count=0;
				}
			}else{
				count=0;
			}
			if(count == 3){
				return false;
			}
			
			tempChar = temp;
		}else{
			tempChar="";
			type="";
			count=0;
		}
	}
	return true;
  }

//첨부파일 확장자 추출
function getFileExt(_obj){
	
	var sFilePath = $("#" + _obj).val();
	if(sFilePath != ""){
	
		if(sFilePath.indexOf('.') >= 0) {
			   exp = sFilePath.substring(sFilePath.lastIndexOf('.')+1, sFilePath.length).toLowerCase();			   
			   return exp;
		}		
	}	  
	
	return "";
}


//첨부파일 허용 확장자 체크 
function checkFileExt(_obj, allowExts){	
	if(allowExts){
		  var exts = allowExts.toLowerCase().split(",");
		  var fext = getFileExt(_obj).toLowerCase();
		  var chk  = false;
		  
		  if(fext != "" && fext.length > 0){
			  	for(var i=0 ; i < exts.length ; i++){
			    	var ext = exts[i].toLowerCase();
			    	
			    	if(fext == ext){
			     		chk =  true;
			    	}
			   	}
		  }else{
			  chk =  true;
		  }
	}
	 
	 return chk;
}

//-->

function CheckAlert()
{
	alert ('현재 내부 시스템 점검 중입니다. \n 13년 7월 1일 오전 9시 이후에 정상적인 서비스 사용이 가능하십니다. \n 이용에 불편을 드려 죄송합니다.');
}



 
