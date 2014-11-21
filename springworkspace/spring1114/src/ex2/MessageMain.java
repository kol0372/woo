package ex2;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {
	public static void main(String[] args) {
		// AOP를 관리하는 ProxyFactoryBean 생성
		ProxyFactoryBean pfbean = new ProxyFactoryBean();
		// Target
		MessageImple target = new MessageImple();
		pfbean.setTarget(target);

		// 메서드의 이름으로 찾아주는 pointcut
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		pointcut.setMappedName("pri*");

		// Advice
		MessageAdvice advice = new MessageAdvice();
		// pfbean.addAdvice(advice);
		pfbean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));

		// Advice적용
		Message prMessage = (Message) pfbean.getObject();
		prMessage.print();
		prMessage.message();
		System.out.println("==================");
		target.print();
	}
}
