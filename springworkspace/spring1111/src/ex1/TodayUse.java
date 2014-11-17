package ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TodayUse {
	public static void main(String[] args) {
		// xml�� �о� �;� �ϴµ�...
		String configuration = "ex1/ex1_msg.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(
				configuration);

		// �����̳ʿ� ������ ���� ����
		TodayApps bean = context.getBean("msg3", TodayApps.class);
		System.out.println("Result:" + bean.printToDate());

	}
}
