package ex1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//AOPAlliance拭辞 薦因閤精 intercepter

public class MessageAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("紺紺梱憩形梱憩形紺ぉ"); // 識楳因搭 淫宿紫牌
		Object rev = invocation.proceed();// target object method
		System.out.println("ししししししししし"); // 板楳因搭 淫宿 紫牌
		if (rev != null) {
			System.out.println(rev);
		}
		return rev;
	}

}
