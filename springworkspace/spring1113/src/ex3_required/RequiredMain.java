package ex3_required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex2Resource.Ex2_Resource;

public class RequiredMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex3_required/ex3.xml");
		Ex3_required aws = ctx.getBean("req", Ex3_required.class);
		aws.print();
		// xml에서 name값을 지우면 오류
		// required 와 xml에서 name값을 지우면 name은 null로 나옴
	}
}
