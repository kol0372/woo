package ex4;

import org.aspectj.lang.JoinPoint;

public class AfterAdvice {
	public void afterReturnMethod(JoinPoint jp, Object ret) {
		String name = jp.getSignature().getName();

		System.out.println("��ȯ�� : " + ret + "/name :" + name);
	}
}
