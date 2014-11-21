package transaction;

import org.aopalliance.intercept.Invocation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
//AroundAdvice를 선택한 이유 : 단위 처리때 이상이 생기면 rollback을 정상처리 일경우
//commit을 하기 위해서 선택

public class TransactionAdvice implements MethodInterceptor {

	// 트랜잭선의 핵심인 commit, rollback을 가지고 있는 매니저 객체
	private PlatformTransactionManager trManager;

	// 인터셉터개념으로 요청에대한 정보를 받는데, proxyFactoryBean에 의해서
	// MethodInvocation 즉 메서드(타겟객체) 호출 정보를 박아서 주입받는다.

	public void setTrManager(PlatformTransactionManager trManager) {
		this.trManager = trManager;
		System.out.println("트랜잭션 주입 완료");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// transaction의 상태 설정갑을 가지는 객체를 생성 -
		// 트랜잿션이 요구 되는 상태값이기 때문에 그 에 맞는
		// 객체를 생성
		DefaultTransactionDefinition td = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status = trManager.getTransaction(td);
		// commit or rollback 처리
		try {
			Object ret = invocation.proceed();
			trManager.commit(status);
			System.out.println("Commit:" + invocation.getMethod().getName());
			System.out.println("status: " + status);
			return ret;

		} catch (Exception e) {
			trManager.rollback(status);
			System.out.println("Rollback : ");
			System.out.println("status: " + status);
			throw e;

		}


	}

}
