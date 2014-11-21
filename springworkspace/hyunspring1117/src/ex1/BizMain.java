package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BizMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex2.xml");
		BizService bs = ctx.getBean("target",BizService.class);
		bs.bizMethod1();
		bs.testbizMethod2();
		bs.securityMethod();
	}
}
