package ex3;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeanAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] id, Object target)
			throws Throwable {
		System.out.println("log:=============================================");
		System.out.println("�ż����̸� :" + method.getName());
		System.out.println("Target obj : " + target.getClass().getName());
		String idv = (String) id[0];

		System.out.println("id : " + idv);
		System.out
				.println("log : =============================================");
	}

}
