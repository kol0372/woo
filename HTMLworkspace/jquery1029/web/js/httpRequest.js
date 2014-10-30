/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var xhr = null;

function getRequest() {
    if (window.ActiveXObject)
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    else
        xhr = new XMLHttpRequest();

}

function sendRequest(url, param, callback, method, async) {
    getRequest();//접속
    method = (method.toLowerCase() == "get") ? "GET" : "POST";//?는 if else 같음 get이면 get
    param = (param == null || param == "") ? null : param;
    
    if (method == "GET" && param != null) {
        url = url + "?" + param; //?=쿼리시작 , param = 쿼리
    }
    
    xhr.onreadystatechange = callback; // 서버의 응답이 도착하는 함수지정(res)
    xhr.open(method, url, async); // 요청정보 지정
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    // 서버 요청 보내기
    xhr.send((method == "POST") ? param : null);
}


