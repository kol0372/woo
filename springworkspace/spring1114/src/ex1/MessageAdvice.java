package ex1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//AOPAlliance���� �������� intercepter

public class MessageAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("�������Ʒ����Ʒ�����"); // ������� ���ɻ���
		Object rev = invocation.proceed();// target object method
		System.out.println("������������������"); // ������� ���� ����
		if (rev != null) {
			System.out.println(rev);
		}
		return rev;
	}

}
