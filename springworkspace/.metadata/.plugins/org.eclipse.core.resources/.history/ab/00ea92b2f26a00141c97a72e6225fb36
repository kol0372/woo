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
		 * spring container의 작업순서
		 *  1. xml빈 설정
		 *   2. bean의 object를 생성 
		 *   3. property injection
		 *  4. init-method 
		 *  5. destroy
		 */

	}

}
