package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

//공통관심사항 advice
//간달프가 호빗에게
//AOP의 핵심인 proxyFactory Bean으로 타겟으로 설정한다. 
@Aspect
public class BizAdvice {
	@Autowired
	private SimpleDateFormat f;

	@Autowired
	private Scanner src;

	@Resource(name = "date")
	private Date d;

	// (..)인자가 하나 이상인 애덜
	@Before("execution(* ex2.BizService*.*(..))")
	public void beforeMethod() {
		System.out.println("당신의 이름은>?");
		String n = src.nextLine();
		System.out.println(n);
		System.out.println(f.format(d));

	}

}
