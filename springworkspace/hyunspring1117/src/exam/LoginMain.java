package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LoginMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("exam/exam.xml");
		Dao dao = ctx.getBean("dao",Dao.class);
		dao.securityM();
	}
}
