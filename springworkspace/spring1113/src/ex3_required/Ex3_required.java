package ex3_required;

import org.springframework.beans.factory.annotation.Required;

public class Ex3_required {

	private String name, msg;

	public void print() {
		System.out.println("Name: " + name);
		System.out.println("msg: " + msg);
	}
//필수 property를 검사해주는 어노테이션
//	@Required
	public void setName(String name) {
		this.name = name;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
