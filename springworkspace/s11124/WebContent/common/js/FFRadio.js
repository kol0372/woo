/***************************************************************************
 * filename : FFRadio.js<br>
 * Radio 제어하는 클래스<br>
 *
 * @version	: 1.0
 * @author	: Copyright (c) 2003 by free270. All Rights Reserved.
****************************************************************************/
if(FFRADIO_CLASS!=null) {
	//alert("[FFRadio.js]는 이미 include 되어있습니다!!");
}
var FFRADIO_CLASS = true;

function FFRadioClass(){
	this.selectedValue	= FFRadio_selectedValue;
	this.selectedIndex	= FFRadio_selectedIndex;
	this.selectByValue	= FFRadio_selectByValue;
	this.selectByIndex	= FFRadio_selectByIndex;
	this.disabled		= FFRadio_disabled;
}

var FFRadio = new FFRadioClass();










/*###########[아래 함수들은 클래스의 정의를       ]######################*/
/*###########[위해서만 사용됩니다.                ]######################*/
/*###########[직접 사용하시지 마시고 위에 정의된  ]######################*/
/*###########[클래스를 이용해 호출해 주세요       ]######################*/

/**
 * Radio button에서 현재 선택된 값을 구한다
 * 
 * @param obj : Radio button object를 넘긴다	
 * @return 선택된 값, 선택이 되지 않았으면 null 을 return
 */

function FFRadio_selectedValue(obj){
	if(obj==null) return null;
	if(!obj[0] && obj.checked){
		return obj.value;
	}
	for(var i=0;i<obj.length;i++){
		if(obj[i].checked == true){
			return obj[i].value;
		}		
	}
	return null;
}
function FFRadio_selectedIndex(obj){
	if(obj==null) return -1;
	if(!obj[0] && obj.checked){
		return obj.value;
	}
	for(var i=0;i<obj.length;i++){
		if(obj[i].checked == true){
			return i;
		}		
	}
	return -1;
}

function FFRadio_selectByValue(obj, value){
	for(var i=0;i<obj.length;i++){
		if(obj[i].value == value){
			obj[i].checked = true;
		}else{
			obj[i].checked = false;		
		}		
	}
	return false;
}
function FFRadio_selectByIndex(obj, index){
	if(index<0 || index>=obj.length){
		for(var i=0;i<obj.length;i++){
			obj[i].checked = false;
		}

		return;
	}
	if(0<=index && index < obj.length){
		obj[index].checked = true;
		return true;
	}
	return false;
}


function FFRadio_disabled(obj, status){
	for(var i=0; i<obj.length; i++){
		obj[i].disabled = status;
	}
}