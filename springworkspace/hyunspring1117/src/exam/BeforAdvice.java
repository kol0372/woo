package exam;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
@Aspect
public class BeforAdvice{
	@Autowired
	private LoginTest login;
	@Before("execution(* exam.DaoImple.security*(..))")
	public void checkLogin() {
		if(!login.isRes()){
			System.out.println("������ �����Ǿ����ϴ�!");
			System.exit(0);
		}else{
			System.out.println("�����մϴ�.");
		}	
	}
}
