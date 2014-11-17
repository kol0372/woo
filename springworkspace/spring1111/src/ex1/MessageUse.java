package ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MessageUse {
	public static void main(String[] args) {
		// xml�� �о� �;� �ϴµ�...
		Resource resource = new ClassPathResource("ex1/ex1_msg.xml");
		System.out.println("RESource" + resource);
		//�����̳ʿ� ex1_msg.xml�� ���ǵ� ���� ����� ����
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("Fctory:"+factory);
		
		//�����̳ʿ� ������ ���� ����
		Ex1_MessageApp bean = factory.getBean("sdf",Ex1_MessageApp.class);
		System.out.println("Result:" +bean.printMsg());
	}
}