package ex4_lifecycle;

public class ServiceImple implements Service {
	private String msg;

	public ServiceImple() {
		System.out.println("생성자 호출");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		System.out.println("DI호출 : msg : "+ msg);
		this.msg = msg;
	}

	@Override
	public void init() {
		System.out.println("init");

	}

	@Override
	public void destroy() {
		System.out.println("destroy");

	}

}
