package ex6;

import java.lang.reflect.Method;



import org.aspectj.lang.JoinPoint;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class BizAspect implements MethodBeforeAdvice {
	
	// auto로 구현
	@Autowired
	private LoginTest ref;

	

	@Override
	public void before(Method method, Object[] id, Object target)
			throws Throwable {
		
		if(!ref.isRes()){
			System.out.println("접근금지");
			System.exit(0);
		}else{
			System.out.println("환영");
		}
		
	}

}
