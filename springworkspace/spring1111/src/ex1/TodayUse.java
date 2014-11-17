package ex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TodayUse {
	public static void main(String[] args) {
		// xml을 읽어 와야 하는데...
		String configuration = "ex1/ex1_msg.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(
				configuration);

		// 컨테이너에 생성된 빈을 참조
		TodayApps bean = context.getBean("msg3", TodayApps.class);
		System.out.println("Result:" + bean.printToDate());

	}
}
