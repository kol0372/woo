package ex2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// AOPAlliance에서 제공받는 interceptor를 사용(org.aopalliance폴더)
// weaving을 사용해주기 위해서 dependency의 org.aspectj폴더에서 weaver를 추가
// Around Advice - proceed 친구 
public class MessageAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("★★★★★★★"); // 선행공통 관심 사항
		Object rev = invocation.proceed(); // target Object Method

		if (rev != null)
			System.out.println(rev);
		System.out.println("◇◇◇◇◇◇◇"); // 후행공통 관심 사항
		return rev;
	}

}
