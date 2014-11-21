package ex2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// AOPAlliance���� �����޴� interceptor�� ���(org.aopalliance����)
// weaving�� ������ֱ� ���ؼ� dependency�� org.aspectj�������� weaver�� �߰�
// Around Advice - proceed ģ�� 
public class MessageAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("�ڡڡڡڡڡڡ�"); // ������� ���� ����
		Object rev = invocation.proceed(); // target Object Method

		if (rev != null)
			System.out.println(rev);
		System.out.println("�ޡޡޡޡޡޡ�"); // ������� ���� ����
		return rev;
	}

}
