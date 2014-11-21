package ex4;

import org.aspectj.lang.ProceedingJoinPoint;
//Proceedingjoinpoint�� Aroud Advice�� �� �� ���� ���ڰ��̴�.
//Ÿ�� ��ü�� �޼��� ȣ���� �˼� �־�� ��, �� ó���� ���� �� �ִ�.

public class TimeAdvice {

	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {

		long Start = System.currentTimeMillis();

		pjp.proceed();

		long end = System.currentTimeMillis();

		System.out.println((end - Start) + "�и���");

	}

}
