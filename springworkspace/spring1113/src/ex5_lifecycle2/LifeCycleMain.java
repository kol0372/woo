package ex5_lifecycle2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import ex1Auto.AutoWiredService;

public class LifeCycleMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex5_lifecycle2/ex5.xml");
		ServiceImple2 aws = ctx.getBean("msg2", ServiceImple2.class);
		String gg = aws.getMsg();
		

//		System.out.println(gg);

		// Resource resource = new
		// FileSystemResource("src/ex5_lifecycle2/ex5.xml");
		// XmlBeanFactory factory = new XmlBeanFactory(resource);
		// ServiceImple2 life = factory.getBean("msg2", ServiceImple2.class);
		//
		// factory.destroyBean("msg2", life);

		/*
		 * spring container�� �۾����� 1. xml�� ���� 2. bean�� object�� ���� 3. property
		 * injection 4. init-method 5. destroy
		 */

	}

}