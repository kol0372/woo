package single;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex2_MailApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex2.xml");

		Ex2_Singletone st = ctx.getBean("st", Ex2_Singletone.class);
		Ex2_Singletone st2 = ctx.getBean("st", Ex2_Singletone.class);

		if (st == st2) {
			System.out.println("°°");
		} else {
			System.out.println("Æ²");
		}
	}
}
