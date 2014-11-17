package ex5_lifecycle2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ServiceImple2 {
	private String msg;

	public ServiceImple2() {
		System.out.println("������ ȣ��");
	}
	
	

	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		System.out.println("DIȣ�� : msg : " + msg);
		this.msg = msg;
	}

	//�ʱ�ȭ ��� (@PostConstruct)
	//@PreDestroy
	
	@PostConstruct
	public void init() {
		System.out.println("init");

	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");

	}

}