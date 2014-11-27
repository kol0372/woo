/***************************************************************************
 * filename : FFLayer.js<br>
 * 레이어 제어 클래스<br>
 *
 * @version	: 1.0
 * @author	: Copyright (c) 2003 by free270. All Rights Reserved.
****************************************************************************/
if(FFLAYER_CLASS!=null) {
	//alert("[FFLayer.js]는 이미 include 되어있습니다!!");
}
var FFLAYER_CLASS = true;

	var isIE=(document.all)?true:false; 
	var isN4=(document.layers)?true:false; 
	var isN6=(!isIE&&document.getElementById)?true:false; 

function FFLayerClass(pram_obj){
	//[PROPERTY]------------------------------------
	this.obj			= pram_obj

	//[METHOD]--------------------------------------
	this.isShow			= FFLayer_isShow
	this.show			= FFLayer_show;
	this.writeHTML		= FFLayer_writeHTML
	this.writeText		= FFLayer_writeText
	this.getHTML		= FFLayer_getHTML
	this.getText		= FFLayer_getText
	this.getStyleObj	= FFLayer_getStyleObj;

	//[STATIC METHOD]------------------------------
	this.getObjByName	= FFLayer_getObjByName;

	//[INIT]---------------------------------------
	this.style			= this.getStyleObj()
}

var FFLayer = new FFLayerClass(null);










/*###########[아래 함수들은 클래스의 정의를       ]######################*/
/*###########[위해서만 사용됩니다.                ]######################*/
/*###########[직접 사용하시지 마시고 위에 정의된  ]######################*/
/*###########[클래스를 이용해 호출해 주세요       ]######################*/

function FFLayer_writeHTML(str){
	this.obj.innerHTML = str;
}
function FFLayer_writeText(str){
	this.obj.innerText = str;
}
function FFLayer_getHTML(){
	return this.obj.innerHTML;
}
function FFLayer_getText(){
	return this.obj.innerText;
}

function FFLayer_isShow(){
	if (isIE || isN6){
		if (this.obj.style.display == 'block') {
			return true;
		}else return false;
	}else{
		if (this.obj.visibility == 'visible') {
			return true;
		}else return false;	
	}
}
function FFLayer_show(status){
	if(this.obj==null) return;
	if (isIE || isN6){
		if (status) {			
			this.obj.style.display = 'block'
		}else {
			this.obj.style.display = 'none'
		}
	}else{
		if (status) {			
			this.obj.visibility = 'visible';
		}else {
			this.obj.visibility = 'hidden'
		}	
	}
}

function FFLayer_getStyleObj(){
	if(this.obj==null) return;
	if (isIE || isN6){
		return this.obj.style;
	}else{
		return this.obj;
	}
}

function FFLayer_getObjByName(name){
	var obj = null;

	if(isIE || isN6){
		obj = document.getElementById(name);
		return obj;
	}else{
		obj = eval("document." + name);
		return obj;
	}	
}


