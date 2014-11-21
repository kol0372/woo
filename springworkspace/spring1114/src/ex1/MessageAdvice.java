package ex1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//AOPAlliance에서 제공받은 intercepter

public class MessageAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("별별벼렵려벼렵려별ㄹ"); // 선행공통 관심사항
		Object rev = invocation.proceed();// target object method
		System.out.println("ㅇㅇㅇㅇㅇㅇㅇㅇㅇ"); // 후행공통 관심 사항
		if (rev != null) {
			System.out.println(rev);
		}
		return rev;
	}

}
