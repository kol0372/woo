package ex6;

import java.lang.reflect.Method;



import org.aspectj.lang.JoinPoint;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class BizAspect implements MethodBeforeAdvice {
	
	// auto�� ����
	@Autowired
	private LoginTest ref;

	

	@Override
	public void before(Method method, Object[] id, Object target)
			throws Throwable {
		
		if(!ref.isRes()){
			System.out.println("���ٱ���");
			System.exit(0);
		}else{
			System.out.println("ȯ��");
		}
		
	}

}
