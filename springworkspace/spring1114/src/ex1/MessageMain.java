package ex1;

import org.springframework.aop.framework.ProxyFactoryBean;

public class MessageMain {
	public static void main(String[] args) {
		// AOP包府窍绰 proxyfactorybean 积己
		ProxyFactoryBean pfbeanF = new ProxyFactoryBean();
		// target
		MessageImple target = new MessageImple();

		pfbeanF.setTarget(target);

		// Advice
		MessageAdvice advice = new MessageAdvice();
		pfbeanF.addAdvice(advice);
		// advice利侩
		Message prMessage = (Message) pfbeanF.getObject();

		prMessage.print();
		System.out.println("---------------------------");

		target.print();

	}
}
