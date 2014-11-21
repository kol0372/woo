package ex1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
// ������ɻ���!
@Aspect
public class BizAdvice {
	@Autowired
	private SimpleDateFormat f;
	
	@Autowired
	private Scanner src;
	
	@Resource(name="date")
	private Date d;
	
	@Before("execution(* ex1.BizService*.*(..))")
	public void beforMethod(){
		System.out.print("����� �̸���?");
		String n = src.nextLine();
		System.out.println(n);
		System.out.println(f.format(d));
	}
}
