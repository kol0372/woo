package ex5;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class BizAspect {

	@Autowired
	private LoginTest ref;

	@Before("execution(* ex5.BizService*.*(..))")
	public void before() {

		if (!ref.isRes()) {
			System.out.println("접근금지");
			System.exit(0);
		} else {
			System.out.println("환영");
		}

	}

}
