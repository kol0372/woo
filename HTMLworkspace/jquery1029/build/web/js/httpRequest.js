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
    getRequest();//����
    method = (method.toLowerCase() == "get") ? "GET" : "POST";//?�� if else ���� get�̸� get
    param = (param == null || param == "") ? null : param;
    
    if (method == "GET" && param != null) {
        url = url + "?" + param; //?=�������� , param = ����
    }
    
    xhr.onreadystatechange = callback; // ������ ������ �����ϴ� �Լ�����(res)
    xhr.open(method, url, async); // ��û���� ����
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    // ���� ��û ������
    xhr.send((method == "POST") ? param : null);
}


