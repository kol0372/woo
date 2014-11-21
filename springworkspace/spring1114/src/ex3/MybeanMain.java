package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MybeanMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex3/mybean.xml");
		
		MyBean bean =  ctx.getBean("pfbean",MyBean.class);
		String v = bean.mygetMessage("나의 핵심로직");
		System.out.println(v);
	}

}
