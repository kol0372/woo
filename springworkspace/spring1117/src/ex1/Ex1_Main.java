package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class Ex1_Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex.xml");
		Dao bean = ctx.getBean("dao", Dao.class);
		bean.fifth();
	}
}
