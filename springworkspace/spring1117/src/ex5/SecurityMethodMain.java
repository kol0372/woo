package ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SecurityMethodMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5/ex5.xml");
		BizService bean = ctx.getBean("ddd", BizService.class);
		bean.SecurityMethod();
	}

}
