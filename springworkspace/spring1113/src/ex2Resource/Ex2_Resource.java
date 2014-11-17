package ex2Resource;

import javax.annotation.Resource;

public class Ex2_Resource {
	@Resource(name = "msg2")
	private String msg;

	public String printMsg() {
		return "¡Ú" + msg + "¡Ú";
	}
}
