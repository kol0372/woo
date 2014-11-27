/***************************************************************************
 * filename : FFImage.js<br>
 * 이미지관련 자바스크립트 모음<br>
 * 
 * @version	: 1.0
 * @author	: Copyright (c) 2001 by free270. All Rights Reserved.
****************************************************************************/


var ORIGINAL_SIZE	= 1;	// 실제 크기로 저장
var GIVEN_SIZE		= 2;	// 주어진 크기에 맞게
var GIVEN_WIDTH		= 3;	// 주어진 width에 맞게(height는 비율에 맞게 확대/축소)	
var GIVEN_HEIGHT	= 4;	// 주어진 height에 맞게(width는 비율에 맞게 확대/축소)
var AUTORESIZE		= 5;


/**
 * 이미지 사이즈를  비례 조정 한다
 * @param target_img : 이미지 객체
 * @param width      : 이미지 width
 * @param height     : 이미지 height
 *
 * ORIGINAL_SIZE : 실제크기로( width,height 둘다 0이하일때)
 * AUTORESIZE    : width,heigh 로 생기는 사각영역 안에 자동 배치(width,height 둘다 1이상일때)
 * GIVEN_HEIGHT  : heigh에 맞춰서 width가 변함( heigh 1이상 width 0이하일때)
 * GIVEN_WIDTH   : width에 맞춰서 height가 변함( width 1이상 height 0이하일때)
 * 
 */
function FFAdjustImageSize(target_img , width , height)
{

  var newX;
  var newY;
  var newHeight;
  var newWidth;
  var newImg = new Image();

  newImg.src = target_img.src;
  imgwidth = newImg.width;
  imgheight = newImg.height;

	if((width<1 && height<1)){
		type = ORIGINAL_SIZE;	
	}else{
		if(width>0 && height>0){
			type = AUTORESIZE;
		}else{
			if(width<1){
				type = GIVEN_HEIGHT;	
			}else{
				type = GIVEN_WIDTH;	
			}			
		}
	}
		
	var persent = 0.0;
		
		switch(type){
		case ORIGINAL_SIZE:	//실제 크기로 저장
			newWidth	= imgw;
			newHeight	= imgh;
		break;
		case GIVEN_SIZE:  //주어진 크기에 맞게
			newWidth	= width;
			newHeight	= height;
		break;	
		case GIVEN_WIDTH:  //주어진 width에 맞게(height는 비율에 맞게 확대/축소)
			persent = (width/imgwidth) *100.;			
			height  = Math.round((imgheight/100.) * persent);			
			newWidth	= width;
			newHeight	= height;
		break;		
		case GIVEN_HEIGHT:  //주어진 height에 맞게(widtht는 비율에 맞게 확대/축소)
			persent = (height/imgheight) *100.;			
			width = Math.round((imgwidth/100.) * persent);			
			newWidth	= width;
			newHeight	= height;		
		break;
		case AUTORESIZE:
			persent = (width/imgwidth) *100.;			
			newHeight  = Math.round((imgheight/100.) * persent);			
			if( newHeight <= height){
				newWidth	= width;
			}else{
				persent = (height/imgheight) *100.;			
				width = Math.round((imgwidth/100.) * persent);			
				newWidth	= width;
				newHeight	= height;
			}

		break;		
	    }		

		target_img.onload = null;
		target_img.src = newImg.src;
		target_img.width = newWidth;
		target_img.height = newHeight;
}


function FFViewImage( src ){
	if(src==""){
		alert("파일 이름이 없습니다.");
		return;
	}

	var oBody=document.body;

	var imgObj = new Image();
	imgObj.src = src;
	var wbody = "<head><title>사진보기</title>\n";
	wbody += "<script language='javascript'>\n";

	wbody += "function init(){\n";
	wbody += "		var oImg=document.img1;\n";
	wbody += "		var width = oImg.width;\n";
	wbody += "		var height= oImg.height;\n";
	wbody += "		resizeTo_image(width+50, height+30);\n"; 
	wbody += "	}";
	wbody += "function resizeTo_image(width,height){\n";
	wbody += "	if(width>screen.availWidth-30) width = screen.availWidth-30;";
	wbody += "	if(height>screen.availHeight-50) height = screen.availHeight-50;";
	wbody += "	window.resizeTo(width, height); \n";
	wbody += "	width = width - (document.body.clientWidth -  width); \n";
	wbody += "	height = height - (document.body.clientHeight -  height);\n ";
	wbody += "	window.resizeTo(width, height);\n ";
	wbody += "}";
	wbody += "</"+"script>\n";
	wbody += "</head>\n";
	wbody += "<body onLoad='init()' style='margin:0'>\n";
	wbody += "<table cellspacing=0 cellpadding=0 border=0 width=100%>";
	wbody += "<tr><td align='center'><img name=img1 src='" + URLEncode(src) + "' border='1' bordercolor='675670' hspace='20' vspace='20'></td></tr>";
	wbody += "</table>";
	wbody += "</body>";
	winResult = window.open("about:blank","", "scrollbars=yes,status=no,resizable=no,top=1,left=1,width=100,height=100" );
	winResult.document.open("text/html", "replace");
	winResult.document.write(wbody);
	winResult.document.close();
	return;
}	

function URLEncode( src ){
	var str = replace_image_url(escape(src),"%3A",":");//escape(src);
	return str;
}

function replace_image_url(originalString,searchText,replaceText) { 
	var strLength = originalString.length; 
	var txtLength = searchText.length; 

	if ((strLength == 0) || (txtLength == 0)) { 
		return originalString; 
	} 
	
	var i = originalString.indexOf(searchText); 
	if ((!i) && (searchText != originalString.substring(0,txtLength))){ 
		return originalString; 
	} 
	if (i == -1) { 
		return originalString; 
	} 

	var newstr = originalString.substring(0,i) + replaceText; 
	if (i+txtLength < strLength){ 
		newstr += replace_image_url(originalString.substring(i+txtLength,strLength),searchText,replaceText); 
	} 
	
	return newstr;
} 

function resizeTo_image(width,height){
	window.resizeTo(width, height); 
	width = width - (document.body.clientWidth -  width); 
	height = height - (document.body.clientHeight -  height); 
	window.resizeTo(width, height); 
}
