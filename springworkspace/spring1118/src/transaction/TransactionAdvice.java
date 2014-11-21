package transaction;

import org.aopalliance.intercept.Invocation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
//AroundAdvice�� ������ ���� : ���� ó���� �̻��� ����� rollback�� ����ó�� �ϰ��
//commit�� �ϱ� ���ؼ� ����

public class TransactionAdvice implements MethodInterceptor {

	// Ʈ���輱�� �ٽ��� commit, rollback�� ������ �ִ� �Ŵ��� ��ü
	private PlatformTransactionManager trManager;

	// ���ͼ��Ͱ������� ��û������ ������ �޴µ�, proxyFactoryBean�� ���ؼ�
	// MethodInvocation �� �޼���(Ÿ�ٰ�ü) ȣ�� ������ �ھƼ� ���Թ޴´�.

	public void setTrManager(PlatformTransactionManager trManager) {
		this.trManager = trManager;
		System.out.println("Ʈ����� ���� �Ϸ�");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// transaction�� ���� �������� ������ ��ü�� ���� -
		// Ʈ������� �䱸 �Ǵ� ���°��̱� ������ �� �� �´�
		// ��ü�� ����
		DefaultTransactionDefinition td = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status = trManager.getTransaction(td);
		// commit or rollback ó��
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
