package ex4;

import org.aspectj.lang.ProceedingJoinPoint;
//Proceedingjoinpoint는 Aroud Advice에 필 수 적인 인자값이다.
//타겟 객체의 메서드 호출을 알소 있어야 전, 후 처리로 감쌀 수 있다.

public class TimeAdvice {

	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {

		long Start = System.currentTimeMillis();

		pjp.proceed();

		long end = System.currentTimeMillis();

		System.out.println((end - Start) + "밀리초");

	}

}
