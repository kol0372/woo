package ex2Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex1Auto.AutoWiredService;

public class ResourceMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex2Resource/ex22.xml");
		Ex2_Resource aws = ctx.getBean("resource", Ex2_Resource.class);
		System.out.println(aws.printMsg());
	}
}
