package ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DaoMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex4/ex4.xml");
		
		Dao daov = ctx.getBean("dao", Dao.class);
		
		daov.second();
	}

}
