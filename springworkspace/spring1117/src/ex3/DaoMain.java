package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DaoMain {

	public static void main(String[] args){
		
		ApplicationContext stx = new GenericXmlApplicationContext("ex3/ex3.xml");
		Dao daov = stx.getBean("dao",Dao.class);
		daov.securityM();
	}
}
