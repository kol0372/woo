/***************************************************************************
 * filename : FFString.js<br>
 * String관련 클래스<br>
 *
 * @version	: 1.0
 * @author	: Copyright (c) 2003 by free270. All Rights Reserved.
****************************************************************************/
if(FFSTRING_CLASS!=null) {
	//alert("[FFString.js]는 이미 include 되어있습니다!!");
}
var FFSTRING_CLASS = true;

function FFStringClass(){
	this.TEXT_ALPHA		= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	this.TEXT_EMAIL		= this.TEXT_ALPHA + "@._-~";
	this.TEXT_NUMBER	= "1234567890";
	this.TEXT_TELNUMBER	= "-1234567890";

	this.checkFormat	= FFString_checkFormat;
	this.checkBlank		= FFString_checkBlank;
	this.checkNumber	= FFString_checkNumber;		// 숫자만 입력
	this.checkEmail		= FFString_checkEmail;		// 이메일 체크
	this.checkJumin		= FFString_checkJumin;		// 주민번호 체크
	this.checkSaupja	= FFString_checkSaupja;		// 사업자번호 check 2006.02.24 wjh
	this.isBlank		= FFString_isBlank;			// 공백
	this.isNumber		= FFString_isNumber;		// 숫자
	this.isValidFormat	= FFString_isValidFormat;
	this.isValidEmail	= FFString_isValidEmail;	// 이메일
	this.isValidJumin	= FFString_isValidJumin;	// 주민번호
	this.isValidSaupja	= FFString_isValidSaupja;	// 사업자번호 유효성 check 2006.2.27 wjh
	this.replace		= FFString_replace;
	this.addComma		= FFString_addComma;
	this.trimLeft		= FFSting_trimLeft;
	this.trimRight		= FFString_trimRight;
	this.trim			= FFString_trim;
	this.fillString		= FFString_fillString;
	this.fillRight		= FFString_fillRight;
	this.fillLeft		= FFString_fillLeft;
	this.getByteLength	= FFString_getByteLength;
	this.cutByteString	= FFString_cutByteString;
	this.cutByteStringToArray = FFString_cutByteStringToArray;
	this.checkTelephoneNumber = FFString_checkTelephoneNumber;
	this.checkHandphoneNumber = FFString_checkHandphoneNumber;
	this.checkDay			  = FFString_checkDay;
	this.checkDay2			  = FFString_checkDay2;
	this.checkDay3			  = FFString_checkDay3;
	
	this.checkYyyyMm		  = FFString_checkYyyyMm;
	this.checkYyyyMm2		  = FFString_checkYyyyMm2;
	
	// 비밀번호 체크 date. 2005.11.04
	this.chkPwd			= FFString_chkPwd;		// 패스워드 체크
	this.chkPwd2		= FFString_chkPwd2;		// 패스워드 체크

	//실수 체크
	this.chkFloatType			= FFString_chkFloatType;

	//문자열 길이 체크
	this.chkStringLength = FFString_chkStringLength;
	this.chkStringValueLength = FFString_chkStringValueLength;
	//한글 문자열 길이 체크하여 자동으로 자르기
	this.chkMaxLengthByte = FFString_chkMaxLengthByte;

	this.MakeYyyyMmString2 = FFString_MakeYyyyMmString2;
	this.MakeYyyyMmString3 = FFString_MakeYyyyMmString3;
}
var FFString = new FFStringClass();










/*###########[아래 함수들은 클래스의 정의를       ]######################*/
/*###########[위해서만 사용됩니다.                ]######################*/
/*###########[직접 사용하시지 마시고 위에 정의된  ]######################*/
/*###########[클래스를 이용해 호출해 주세요       ]######################*/

/**
 * check the valid of input field
 * @param obj     : input Object
 * @param objname : name of feild (ex) tilte
 * @param astr    : make a limit to input(use this FFSTRING_DEF_ALPHA,FFSTRING_DEF_NUMBER,FFSTRING_DEF_TELDIGIT)
 * @param lmin	  : minimal length to input  (number of byte)
 * @param lmax    : maximal length to input (number of byte)
 * @param showmsg : alert if value is true or none 
 *								return true/false if value is false, just check
 * 길이 제한을 주고 싶지 않을때는 lmin,lmax를 -1로 넘긴다
 */

function FFString_checkFormat( obj , objname, astr, lmin, lmax , showmsg ){
	var result = this.isValidFormat(obj.value, astr, lmin, lmax);
	var msg = "";

	switch(result){
	case 1: return true;
	case -1: msg = objname + "는(은) " + lmin + " 자 이어야 합니다";	break;
	case -2: msg = objname + "는(은) " + lmin + " ~ " + lmax + " 자로 입력하셔야 합니다";	break;
	case -3: msg = objname + "에 허용할 수 없는 문자가 입력되었습니다";	break;	
	}
	
	if(showmsg!=null && showmsg) {	
		alert(msg);
		obj.select();
		obj.focus();
	}

	return false;
}

function FFString_isValidFormat( t , astr, lmin, lmax ){
	var i
	var length = this.getByteLength(t);

	if(lmin>=0 && lmax >=0){
		if (length < lmin || length > lmax) {
			if (lmin == lmax)	return -1;	//alert(objname + '는(은) ' + lmin + ' 자 이어야 합니다');
			else				return -2;	//alert(objname + '는(은) ' + lmin + ' ~ ' + lmax + ' 자로 입력하셔야 합니다');
		}
	}
	if (astr.length > 1) {
		for (i=0; i < length; i++){
			if(astr.indexOf(t.substring(i,i+1))<0) {
				return -3;					//alert(objname + '에 허용할 수 없는 문자가 입력되었습니다');
			}
		}
	}

	return 1;
}

/**
 * check inputing only spaces
 * @param obj     : input Object
 * @param objname : name of field (ex) title
 * @param showmsg : alert if value is true or none 
 *								return true/false if value is false, just check
 */

function FFString_checkBlank( obj , objname , showmsg){
	if(this.isBlank(obj.value)){
		if(showmsg == null || showmsg) {
			alert(objname + "을 입력하세요.");
			obj.focus();
		}
		return true;
	}else{
		return false;
	}
}

function FFString_checkNumber( obj , objname , showmsg){
	if(!this.isNumber(obj.value)){
		if(showmsg == null || showmsg) {
			alert(objname + "에 숫자만 입력하세요.");
			obj.focus();
		}
		return false;
	}else{
		return true;
	}
}

function FFString_isBlank( value ){
	
	if(value.replace(/ /ig,"")==""){
		return true;
	}else{
		return false;
	}
}

function FFString_isNumber( value ){
	var nLen = value.length; 
	for( i = 0 ; i < nLen ; i++){
		temp = value.substring(i,i+1);
		if( (temp < '0' || temp > '9') && (temp != '-') ){
			return false;
		}     
		if(temp == '-' && i>0) return false;
	}
	return true;
}

function FFString_checkEmail(obj,objname,showmsg){
	if(!FFString_isValidEmail(obj.value)){
		if(showmsg){
			alert(objname + "이(가) 유효하지 않습니다");
		}
		obj.focus();
		return false;
	}else{
		return true;
	}
}
function FFString_checkTelephoneNumber( obj, objname, showmsg) {
	var tel = obj.value;
	fmt = /\d{2,4}-\d{3,4}-\d{4}/gi; 
	if (!fmt.test(tel)) {
		if(showmsg){
			alert(objname + "이(가) 유효하지 않습니다\n\n예)032-1234-5678");
		}
		//obj.focus();
		return false;
	}
	return true;
} 

function FFString_checkHandphoneNumber( obj, objname, showmsg) {
	var tel = obj.value;
	fmt = /0{1}1{1}\d{1}-\d{3,4}-\d{4}/gi; 
	if (!fmt.test(tel)) {
		if(showmsg){
			alert(objname + "이(가) 유효하지 않습니다\n\n예)010-1234-5678");
		}
		//obj.focus();
		return false;
	}
	return true;
} 

function FFString_checkDay( obj, objname, showmsg) {
	var tel = obj.value;
	fmt = /\d{4}-\d{2}-\d{2}/gi; 
	if (!fmt.test(tel)) {
		if(showmsg){
			alert(objname + "이 유효하지 않습니다\n\n예)2000-01-01");
		}
		obj.focus();
		return false;
	}
	return true;
} 

function FFString_checkDay3( obj , objname, showmsg) {
	var tel = FFString_replace(obj.value,"-","");
	tel = FFString_replace(tel,".","-");
	fmt = /\d{4}-\d{2}-\d{2}/gi; 
	if (!fmt.test(tel)) {
		if(showmsg){
			alert(objname + "이 유효하지 않습니다\n\n예)2000.01.01");
		}
		obj.focus();
		return false;
	}/**/
	return true;
} 

function FFString_checkYyyyMm (obj, objname, showmsg)
{
	var data = obj.value;
	data = FFString_replace (data, " ", "");
	
	fmt = /\d{6}/gi;
	if (!fmt.test(data) || data.length != 6) {
		if(showmsg){
			alert(objname + "이 유효하지 않습니다\n\n예)200010");
		}
		obj.focus();
		return false;
	}/**/
	return true;
}

function FFString_checkYyyyMm2 (obj, objname, showmsg)
{
	var data = obj.value;
	fmt = /\d{8}/gi;
	if (!fmt.test(data)) {
		if(showmsg){
			alert(objname + "이 유효하지 않습니다\n\n예)19991021");
		}
		obj.focus();
		return false;
	}/**/
	return true;
}
/*function FFString_checkDay2( obj, objname, showmsg) {
	var tel = obj.value;
	fmt = /\d{4}.\d{2}/gi; 
	if (!fmt.test(tel)) {
		if(showmsg){
			alert(objname + "이 유효하지 않습니다\n\n예)2000.01");
		}
		obj.focus();
		return false;
	}
	return true;
} */

/**
 * check the valid E-mail address
 * @param value   : value
 * @return value excluded spaces , if value is null or "" return ""
 */
function FFString_isValidEmail(mail){

	var t = mail;
	var ValidFlag = false;
	var atCount = 0;
	var SpecialFlag;
	var atLoop;
	var atChr;
	var BadFlag = false;
	var tAry1;
	var UserName;
	var DomainName;

	if ( t.length > 0 && t.indexOf("@") > 0 && t.indexOf(".") > 0 ) {
		atCount = 0
		SpecialFlag = false
		for( atLoop=1; atLoop<=t.length; atLoop++ ) {
			atChr = t.substring( atLoop, atLoop+1 )
			if ( atChr == "@" ) atCount = atCount + 1

			if ( (atChr >= 32) && (atChr <= 44) ) SpecialFlag = true 
			if ( (atChr == 47) || (atChr == 96) || (atChr >= 123) ) SpecialFlag = true 
			if ( (atChr >= 58) && (atChr <= 63) ) SpecialFlag = true 
			if ( (atChr >= 91) && (atChr <= 94) ) SpecialFlag = true 
			if ( atChr == "," ) SpecialFlag = true
		}

		if ( ( atCount == 1 ) && (SpecialFlag == false ) ) {
			BadFlag = false
			tAry1 = t.split("@")
			UserName = tAry1[0]
			DomainName = tAry1[1]
			if ( (UserName.length <= 0 ) || (DomainName.length <= 0 ) ) BadFlag = true
			if ( DomainName.substring( 1, 2 ) == "." ) BadFlag = true
			if ( DomainName.substring( DomainName.length-1, DomainName.length) == "." ) BadFlag = true
			ValidFlag = true
		}
	}else{
		BadFlag = true;
	}
	if ( BadFlag == true ) ValidFlag = false
	return ValidFlag
}

/*
	
	if (message1[1] == "hanmail.net") {
		alert ("다음의 '온라인 우표제' 실시에 따라 다음 메일계정(예:abc@hanmail.net 또는abc@daum.net)은 등록되지 않습니다. 다른 메일 계정을 등록해주세요.");
		document.MFform.email.focus();
		return false;
	}
	
	if (message1[1] == "daum.net") {
		alert ("다음의 '온라인 우표제' 실시에 따라 다음 메일계정(예:abc@hanmail.net 또는 abc@daum.net)은 등록되지 않습니다. 다른 메일 계정을 등록해주세요.");
		document.MFform.email.focus();
		return false;
	}

	var arrMatch = mail.match(/^ (\".*\"|[A-Za-z0-9_-]([A-Za-z0-9_-]|[\+\.])*) @ (\[\d{1,3}(\.\d{1,3}){3}]|[A-Za-z0-9][A-Za-z0-9_-]*(\.[A-Za-z0-9][A-Za-z0-9_-]*)+) $/);
	if (arrMatch == null) {
        return false;
    }else{
		return true;
	}	
}

*/

function FFString_replace(originalString,searchText,replaceText) { 
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
		newstr += FFString_replace(originalString.substring(i+txtLength,strLength),searchText,replaceText); 
	} 
	
	return newstr;
} 


/**
 * insert ',' 
 * @param value   : type of number
 * @return string with ',' ex) 123456 ===> 123,456
 */
function FFString_addComma( value ){
	var tmpValue  = "";
	var realValue = "";
	var length = value.length; 

	var count = 0;
	for(var i=length;i>=0;i--){
		tmpValue += value.substring(i,i+1);
		if((count-1)%3==2 && i>0) tmpValue +=",";
		count++;
	}
	length = tmpValue.length;

	for(var i=length;i>=0;i--){
		realValue += tmpValue.substring(i,i+1);
	}
	return realValue;
}

/**
 * cut the space left side String
 * @param value   : value
 * @return value cut left space, if value is null or " " return  " "
 */
function FFSting_trimLeft( value ){
	if(value==null || value=="") return "";

	var length = value.length;

	var i;
	for(i=0;i<length;i++){
		if(value.charAt(i) != " ") break;			
	}
	return value.substring(i);	
}


/**
 * cut the space right side of String
 * @param value   : value
 * @return value cut right space , if value is null or " " return " "
 */

function FFString_trimRight( value ){
	if(value==null || value=="") return "";

	var length = value.length;

	var i;
	for(i=length-1;i>=0;i--){
		if(value.charAt(i) != " ") break;			
	}
	return value.substring(0,i+1);	
}


/**
 * cut the spaces of right and left
 * @param value   : value
 * @return value cut the spaces ,if value is null or " " return " "
 */

function FFString_trim( value ){
	return FFString_trimRight(FFSting_trimLeft(value));	
}


/**
 * repeat and attatch string in nCount times 
 * @param  srValue : value to repeat
 * @param  nCount : times to repeat
 * @return srValue attatched 
 */

function FFString_fillString(srValue,nCount){
	var temp = "";
	
	for(var i=0;i<nCount;i++){
		temp += srValue;
	}

	return temp;		
}


/**
 * fill fillchar to right side of string nCount times
 * @param  srValue  : value to repeat
 * @param  nLength  : length to repeat
 * @return srValue attatched
 */

function FFString_fillRight(srValue, nCount, fillchar){	
	if(srValue==null) return "";		
	
	var temp = "";
	temp += srValue;
	temp += FFString_fillString(fillchar,nCount - srValue.length);
	
	return temp;
}


/**
 * fill fillchar to left side of string nCount times
 * @param  srValue  : value to repeat
 * @param  nCount   : number to repeat
 * @return srValue attatched
 */

function FFString_fillLeft(srValue, nCount, fillchar){	
	if(srValue==null) return "";		

	srValue += "";

	var len = srValue.length;

	temp = FFString_fillString(fillchar,nCount-len) + srValue;
	
	return temp;
}


/**
 * count the number of byte of String(length is 1 in Korean but byte is 2)
 * @param obj   : textfield ,textarea objec
 * @return number of byte
 */
function FFString_getByteLength( msg ){
	var str = new String(msg);
	var len = str.length;
	var count = 0;

	for (k=0 ; k<len ; k++){
		temp = str.charAt(k);

		if (escape(temp).length > 4) {
			count += 2;
		}
		else if (temp == '\r' && str.charAt(k+1) == '\n') { // in case \r\n
			count += 2;
		}
		else if (temp != '\n') {
			count++;
		}
	}
	return count;	
}

/**
 * cut string upto number of btye, alse cut propery in Korean(if Korean is broken, take the floor )
 * set as the result after cut the value of obj upto maxlength
 * @param obj       : textfield ,textarea objec
 * @param mexlength : maxlength
 */

function FFString_cutByteString( msg, maxlength) {
	var str,msg;
	var len=0;
	var temp;
	var count;
	count = 0;
	 
	str = new String(msg);
	len = str.length;

	for(k=0 ; k<len ; k++) {
		temp = str.charAt(k);
		
		if(escape(temp).length > 4) {
			count += 2;
		}
		else if (temp == '\r' && str.charAt(k+1) == '\n') { // in case \r\n
			count += 2;
		}		
		else if(temp != '\n') {
			count++;
		}
		if(count > maxlength) {
			str = str.substring(0,k);
			break;
		}
	}

	return str;
}

/**
 * set to string Arrary(arTemp) after cut the string upto number of byte
 * @param arTemp    : Object Array contain the result
 * @param msg       : value to process
 * @param maxlength : maxlength to cut
 * @return arTemp size of array
 */

function FFString_cutByteStringToArray(msg, maxlength) {
	var str;
	var len=0;
	var temp;
	var count;
	var srTemp = new String(msg);
	var arTemp = Array();

	len = srTemp.length;

	for(var i=0;srTemp.length>0;i++){
		count = 0;
		for(k=0 ; k<len ; k++) {
			str = srTemp;
			temp = srTemp.charAt(k);
			
			if(escape(temp).length > 4) {
				count += 2;
			}
			else if (temp == '\r' && srTemp.charAt(k+1) == '\n') { //in case \r\n
				count += 2;
			}		
			else if(temp != '\n') {
				count++;
			}
			if(count > maxlength) {
				str = srTemp.substring(0,k);
				break;
			}
		}
		arTemp[i] = new Array();
		arTemp[i] = str;
		srTemp = srTemp.substring(k);
	}
	return arTemp;
}

function FFString_checkJumin( obj, obj2, showmsg){
	//alert(obj);
	//alert(obj2);
	if(!this.isValidJumin(obj,obj2)){
//	if(!this.isValidJumin(obj.value,obj2.value)){
		if(showmsg == null || showmsg) {
			alert("주민번호가 유효하지 않습니다.");
//			obj.focus();
		}
		return false;
	}else{
		return true;
	}
}

function FFString_isValidJumin(c1, c2) {
	var yy = c1.substring(0,2);
	var mm = c1.substring(2,4);
	var dd = c1.substring(4,6);
	var gender = c2.substring(0,1);
	var ck=0;

	// 처음 7자 검사
	if (c1.length != 6 || c2.length != 1 || yy < 20 || mm < 1 || mm > 12 || dd < 0 || dd > 31 || gender > 2 || gender < 1) {
		return false;
	}

	//끝자리 검증번호 유효성 검사
	//홈페이지에서 주민번호를 받을 수 없으므로 
/*	var total = c1 + c2;
	for (i=0; i < 12; i++) {
		ck  += (i%8+2)*total.substring(i, i+1);
	}
	ck = (11-(ck%11))%10;	
	if (parseInt(ck) != parseInt(total.substring(12, 13))) {
		return false;
	}
*/
	return true;
} 

// 사업자 번호를 Check하는 Function.  2006.02.24. 정보전략팀 wjh
function FFString_checkSaupja(obj, showmsg){
	//alert(obj);
	//alert(showmsg);

	if(!this.isValidSaupja(obj)){
		if(showmsg == null || showmsg) {
			alert("사업자번호가 유효하지 않습니다.");
//		obj.focus();
		}
		return false;
	}else{
		return true;
	}
}

// 사업자 번호 유효성 검사 add. 2006.02.27 정보전략팀 wjh
function FFString_isValidSaupja(num) {
    var reg = /([0-9]{3})-?([0-9]{2})-?([0-9]{5})/;
    if (!reg.test(num)) return false;
    num = RegExp.$1 + RegExp.$2 + RegExp.$3;
    var cVal = 0;
    for (var i=0; i<8; i++) {
        var cKeyNum = parseInt(((_tmp = i % 3) == 0) ? 1 : ( _tmp  == 1 ) ? 3 : 7);
        cVal += (parseFloat(num.substring(i,i+1)) * cKeyNum) % 10;
    }
    var li_temp = parseFloat(num.substring(i,i+1)) * 5 + '0';
    cVal += parseFloat(li_temp.substring(0,1)) + parseFloat(li_temp.substring(1,2));
    return (parseInt(num.substring(9,10)) == 10-(cVal % 10)%10);
}

/*
function FFString_isValidSaupja(s1){
	alert(s1);

	var i = 0;
	var j = 1;
	iData  = new Array(9); // 사업자번호 자릿수
	iMul = new Array(2);   // Weight 값
	iNine = new Array(1);  // 9개 Digit 값
	var iAll = 0;      // 모든 결과값의 합
	var ck = 0;    // 사업자번호 유무 check

//	if(s1.value.length != 10){
//		alert("잘못된 사업자 번호입니다.");
//		return false;
//	}

	for(i=1 ; i<11 ; i++){
		if(isNumber(s1.substr(i, 1)) == true){
		   iData[i] = parseInt(s1.substr(i, 1));
		   j++;
		}else
		   return false;
		}
	}

	iMul[0] = 1;       // 계산하기 위해 Weight값 Setting
	iMul[1] = 3;
	iMul[2] = 7;

	j = 0;

	for(i=1 ; i<9 ; i++){
		j++;
		iData[i] = (iData[i] * iMul[j])%10;
		if(j = 3) j=0;
	}

	iData[8] = iData[8] * 5;
	iNine[0] = iData[8]/10;
	iNine[1] = (iData[8])%10;
	iData[8] = iNine[0] + iNine[1];

	for(i=1 ; i<10 ; i++) iAll = iAll + iData[i];

	i = iAll%10;
	j = (10 - i)%10;

	if(iData[9] != j){
		return false;
	}else{
	//	alert("잘못된 사업자번호입니다.");
		   return true;
	}
} 
*/
// 아이디포함하는 비밀번호 체크 date.2005.11.04
function FFString_chkPwd(id,password){
	i=1; 
	count=0;

	while(i<password.length){	//연속된 4개 이상의 숫자나 문자
		if(password.charAt(i)== password.charAt(i-1)){
			count++;
			if(count>=3) return false;
		}
		else count=0;
		i++;
	}

	if(password.indexOf(id) > -1) return false;	//아이디 포함 문자열

	return true;
}

// 연속4개 문자 체크 date.2005.11.04
function FFString_chkPwd2(password){
	i=1; 
	count=0;

	while(i<password.length){	//연속된 4개 이상의 숫자나 문자
		if(password.charAt(i)== password.charAt(i-1)){
			count++;
			if(count>=3) return false;
		}
		else count=0;

		i++;
	}
		
	return true;
}
function FFString_checkDay2( obj, objname, showmsg) {
	var tel = obj.value;

	if(tel.length!=7 || !FFString_chkFloatType(tel,4,2)){
		if(showmsg){
			alert(objname + "이 유효하지 않습니다\n\n예)2000.01");
		}
		obj.focus();
		return false;
	}
	return true;
} 


function FFString_chkFloatType( varNum, varLeft, varRight ) {

 var resultFlag = true ;

 if ( varNum.charAt(0) == "-" ){
  varNum = varNum.substring(1,varNum.length);
 }

if (isNaN(varNum)) return false;

 var PointIndex = varNum.indexOf(".");

 var leftstring = varNum.substring (0,PointIndex);
 var rightstring = varNum.substring (PointIndex+1, varNum.length);

 if ( PointIndex < 0 )
 {
  if ( varNum.length > varLeft )
  {
   	resultFlag = false ;
  }
 }
 else
 {
  var LeftLength = leftstring.length;
  var RightLength = rightstring.length;

  if ( (LeftLength > varLeft) || (RightLength > varRight) )
   resultFlag = false ;
   
   //2007.09.14 숫자에 대한 체크
   var nLeft = parseInt(leftstring);
   var nRight = parseInt(rightstring);
   
   if(isNaN(leftstring) || isNaN(rightstring))
   	resultFlag = false;
	
  if (nLeft < 0 || nRight <0)
		resultFlag = false;
 }

 return resultFlag ;

}

function FFString_chkStringLength(obj,obj_name, max_size){

	if(FFString_getByteLength(obj.value) > max_size ) {
			alert(obj_name+"에 입력한 문자열의 길이가 너무 큽니다.");
			obj.focus();
			return false;
	}
	return true;
}

function FFString_chkStringValueLength(strValue,obj_name, max_size){
	if(FFString_getByteLength(strValue) > max_size ) {
			alert(obj_name+"에 입력한 문자열의 길이가 너무 큽니다.");
			return false;
	}
	return true;
}

function FFString_MakeYyyyMmString2(obj) {
	 var varText = FFString_replace(obj.value,".","");
	 if ( varText.length != 6 ) {
		return ;
	 }

	 var varReturnText   = "" ;

	 varReturnText = varText.substring(0,4) + "." + varText.substring(4,6) ;

	obj.value = varReturnText;
	return ;
}

function FFString_MakeYyyyMmString3(obj) {
	if (null == obj) return;
	  var varText = FFString_replace(obj.value,".","");
	 if ( varText.length != 8 ) {
		return ;
	 }

	 var varReturnText   = "" ;

	 varReturnText = varText.substring(0,4) + "." + varText.substring(4,6)+ "." + varText.substring(6,8) ;

	 obj.value = varReturnText;
	 return ;
}

/*=============================================================================* 
 * 특수문자 값이 입력되었는지 체크(특수문자가 있으면 false 리턴)
 * param : sval (object)
 * return :
 *============================================================================*/ 
function chkValidChar(sval) { 
    var re = new RegExp("[%\']","ig");
    var retVal = re.test(sval.value);

    if (retVal == true)
    {
        alert("검색어에 다음 문자를 사용할 수 없습니다 : \n\n              %    \' ");
        return false;
    }
    else
        return true;
}

/*=============================================================================* 
 * 인젝션 전용 "\'" 값이 입력되었는지 체크(있으면 false 리턴)
 * param : sval (object)
 * return :
 *============================================================================*/ 
function chkSQLInjection(sval, str) { 
    var re = new RegExp("[\']","ig");
    var retVal = re.test(sval.value);

    if (retVal == true)
    {
        alert(str + "에 다음 문자를 사용할 수 없습니다 : \n\n              \' ");
        return false;
    }
    else
        return true;
}

/*=============================================================================* 
 * 태그 입력 금지하기(태그 삭제한 text 리턴함.
 * param : Word (object)
 * return :
 *============================================================================*/ 
function delTag(Word) {
	a = Word.indexOf("<");
	b = Word.indexOf(">");
	len = Word.length;
	c = Word.substring(0, a);
	if(b == -1){
		b = a;
	}
	d = Word.substring((b + 1), len);
	Word = c + d;
	tagCheck = Word.indexOf("<");
	if(tagCheck != -1){
		Word = delTag(Word);
	}
	
	return Word;
 }

/*=============================================================================* 
 * 특수키 방지
 * param : Word (object)
 * return :
 *============================================================================*/ 
var NN = (navigator.appName == "Netscape") ? 1: 0;

/*키코드 33 부터 47 까지*/
/* ! " # $ % & ' ( ) * + , - . / <br /> */
function CheckChar1() {
    if ( !NN ) {
        if ( event.keyCode > 32 && event.keyCode < 48 ) {
            //해당 이벤트가 일어난 키에 대한 코드 값을 확인 값을 반환 하지 않습니다.    
            event.returnValue = false;
        }
    } else {
        if ( event.which > 32 && event.which < 48)
            return false;
    }
}

/*키코드 58 부터 64 까지*/
/* : ; < = > ? @ <br /> */
function CheckChar2() {
    if ( !NN ) {
        if ( event.keyCode > 57 && event.keyCode < 65)
            event.returnValue = false;
    } else {
        if ( event.which > 57 && event.which < 65)
            return false;
    }
}

/*키코드 91 부터 96 까지*/
/* [ \ ] ^ _<br /> */
function CheckChar3() {
    if ( !NN ) {
        if ( event.keyCode > 90 && event.keyCode < 97)
        event.returnValue = false;
    } else {
        if ( event.which > 90 && event.which < 97)
            return false;
    }
}

/*키코드 123 부터 125 까지*/
/* { | }<br /> */
function CheckChar4() {
    if ( !NN ) {
        if ( event.keyCode > 122 && event.keyCode < 126)
            event.returnValue = false;
    } else {
        if ( event.which > 122 && event.which < 126)
            return false;
    }
}


/***********************************************
* name		: FFString_chkMaxLengthByte(obj,maxLen)
* parameter	: obj => 해당객체 
*			: maxLen => 최대글자수
* sample	: onkeyup="chk_MaxLength_byte(this,80);" 
* return	: 
* 설명		: 글자수를 체크하여 입력제한을 구현하는 함수
  				(한글, 영문 동일함)
***********************************************/
function FFString_chkMaxLengthByte(obj,maxLen,msgLen) {

	var ls_str     = obj.value; 		// 이벤트가 일어난 컨트롤의 value 값
	var li_str_len = ls_str.length;  // 전체길이

	// 변수초기화
	var li_max      = maxLen; // 제한할 글자수 크기
	var i           = 0;  // for문에 사용
	var li_byte     = 0;  // 한글일경우는 2 그밗에는 1을 더함
	var li_len      = 0;  // substring하기 위해서 사용
	var ls_one_char = ""; // 한글자씩 검사한다
	var ls_str2     = ""; // 글자수를 초과하면 제한할수 글자전까지만 보여준다.

	for(i=0; i< li_str_len; i++) {
		// 한글자추출
		ls_one_char = ls_str.charAt(i);

		// 한글이면 2를 더한다.
		if(escape(ls_one_char).length > 4) {
			li_byte += 2;
		}
		// 그밗의 경우는 1을 더한다.
		else {
			li_byte++;
		}

		// 전체 크기가 li_max를 넘지않으면
		if(li_byte <= li_max) {
			li_len = i + 1;
		}
	}
   
	// 전체길이를 초과하면
	if(li_byte > li_max) {
		alert( msgLen + " 글자를 초과 입력할수 없습니다. \n 초과된 내용은 자동으로 삭제 됩니다. ");
		ls_str2 = ls_str.substr(0, li_len);
		obj.value = ls_str2;
	}
	obj.focus();   	
}