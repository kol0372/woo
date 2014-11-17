package ex1Auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AutoWiredMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex1Auto/ex1.xml");
		AutoWiredService aws = ctx.getBean("auto", AutoWiredService.class);
		System.out.println(aws.printName());
	}
}
