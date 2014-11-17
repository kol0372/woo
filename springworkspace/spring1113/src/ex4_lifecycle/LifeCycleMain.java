package ex4_lifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class LifeCycleMain {

	public static void main(String[] args) {

		Resource resource = new FileSystemResource("src/ex4_lifecycle/ex4.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		ServiceImple life = factory.getBean("msg", ServiceImple.class);

		factory.destroyBean("msg", life);

		/*
		 * spring container�� �۾�����
		 *  1. xml�� ����
		 *   2. bean�� object�� ���� 
		 *   3. property injection
		 *  4. init-method 
		 *  5. destroy
		 */

	}

}
