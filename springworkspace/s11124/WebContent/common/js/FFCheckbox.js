/***************************************************************************
 * filename : FFCheckbox.js<br>
 * Radio 제어하는 클래스<br>
 *
 * @version	: 1.0
 * @author	: Copyright (c) 2003 by free270. All Rights Reserved.
****************************************************************************/
if(FFCHECKBOX_CLASS!=null) {
	//alert("[FFCheckbox.js]는 이미 include 되어있습니다!!");
}
var FFCHECKBOX_CLASS = true;

function FFCheckboxClass(){
	this.checkedCount	= FFCheckbox_checkedCount	
	this.checkedValue	= FFCheckbox_checkedValue	
	this.isArrayObject	= FFCheckbox_isArrayObject	
	this.checkByData	= FFCheckbox_checkByData
	this.changeStatus	= FFCheckbox_changeStatus
	this.reverseStatus	= FFCheckbox_reverseStatus
}

var FFCheckbox = new FFCheckboxClass();










/*###########[아래 함수들은 클래스의 정의를       ]######################*/
/*###########[위해서만 사용됩니다.                ]######################*/
/*###########[직접 사용하시지 마시고 위에 정의된  ]######################*/
/*###########[클래스를 이용해 호출해 주세요       ]######################*/


function FFCheckbox_checkedCount(obj){
	var cnt = 0;

	if(obj != null){
		if(FFCheckbox_isArrayObject(obj)){
			for(var i=0; i<obj.length;i++){
				if(obj[i].checked){
					cnt ++;
				}
			}
		}else{
			if(obj.checked){
				cnt = 1;
			}			
		}
	}

	return cnt;
}

function FFCheckbox_checkedValue(obj){
	var value = "";
	var cnt = 0;
	
	if(obj != null){
		if(FFCheckbox_isArrayObject(obj)){
			for(var i=0;i<obj.length;i++){
				if(obj[i].checked){
					if(cnt==0){
						value = obj[i].value;
					}else{
						value += "," + obj[i].value;
					}
					cnt ++;
				}
			}
		}else{
			if(obj.checked){
				value = obj.value;
				cnt = 1;
			}
		}
	}

	return value;
}

function FFCheckbox_isArrayObject(obj){
	if(obj.length == null){
		return false;
	}else{
		return true;
	}
}

function FFCheckbox_checkByData(obj, data, delim){
	var spStr, cnt;

	if(delim==null){
		delim = ",";
	}
	
	spStr = data.split(delim);		
	
	for(var i=0;i<spStr.length;i++){
		for(var j=0;j<obj.length;j++){
			if(obj[j].value == spStr[i]){
				obj[j].checked = true;				
				cnt ++;
			}
		}
	}	

	return cnt;
}

function FFCheckbox_changeStatus(obj, status){ 
	if(obj != null){
		if(FFCheckbox_isArrayObject(obj)){
			for(var i=0;i<obj.length;i++){
				obj[i].checked = status;
			}
		}else{
			obj.checked = status;
		}
	}
}

function FFCheckbox_reverseStatus(obj){
	if(obj != null){
		if(FFCheckbox_isArrayObject(obj)){
			for(var i=0;i<obj.length;i++){
				obj[i].checked = !obj[i].checked;
			}
		}else{
			obj.checked = !obj.checked;
		}
	}
}


/*
<script src="FFCheckbox.js"></script>
<script>
	function setData(){
		FFCheckbox.checkByData(document.form1.chk, "107,106", ",");
	}
</script>
<form name="form1">
<a href="javascript:FFCheckbox.changeStatus(document.form1.chk, true);">전선</a><br>
<a href="javascript:FFCheckbox.changeStatus(document.form1.chk, false);">전해</a><br>
<a href="javascript:FFCheckbox.reverseStatus(document.form1.chk);">반전</a><br>
<input type="checkbox" name="chk" value="108"><br>
<input type="checkbox" name="chk" value="107"><br>
<input type="checkbox" name="chk" value="106"><br>
<input type="checkbox" name="chk" value="105"><br>
<input type="checkbox" name="chk" value="104"><br>
<input type="checkbox" name="chk" value="103"><br>
<input type="checkbox" name="chk" value="102"><br>
<input type="checkbox" name="chk" value="100"><br>
<input type="button" value="선택갯수확인" onclick="alert(FFCheckbox.checkedCount(document.form1.chk))">
<input type="button" value="선택된 내용확인" onclick="alert(FFCheckbox.checkedValue(document.form1.chk))">
<input type="button" value="디폴트셋팅" onclick="setData();">
<input type="button" value="0번째꺼 확인(배열일때)" onclick="alert(document.form1.chk[0].checked);">
<input type="button" value="0번째꺼 확인(1개일때)" onclick="alert(document.form1.chk.checked);">
</form>
*/