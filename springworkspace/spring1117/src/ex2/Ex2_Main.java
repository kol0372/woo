package ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex2_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/ex2.xml");
		BizService cc = ctx.getBean("target", BizService.class);

		cc.bizMethod1();
		System.out.println("0----------------------------------0");
		cc.testbizMethod2();

	}
}
