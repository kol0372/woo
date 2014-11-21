package mvc;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

@Aspect
public class AfterAdvice {
	@After("execution(* *.CopyOfCopyOfSimpleDate*.hello*(..))")
	public void afterReturnMethod(JoinPoint jp) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes()).getRequest();

		String time = jp.getSignature().getName();

		request.setAttribute("xx", "ok2");

		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes()).getResponse();

		if (response == null) {
			System.out.println("null");
		} else {
			System.out.println("not null");
		}
		try {
			PrintWriter out = response.getWriter();
			out.print("ÇÏÆ®");
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
