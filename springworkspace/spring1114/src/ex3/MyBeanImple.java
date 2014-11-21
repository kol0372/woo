package ex3;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanImple implements MyBean {
	@Autowired
	private String msg;

	@Override
	public String mygetMessage(String name) {
		String res = name + ":" + msg;
		return res;
	}

}
