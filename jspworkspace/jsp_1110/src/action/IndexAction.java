package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ActionForward;

//���� �����Ͻ� ������ �����ؾ� �ϰ�, �ݵ�� ��Ʈ������ ����
//��û�� ���� �� ����Ǿ�� �ϱ� ������ ��Ʈ�ѷ����� �޴��� ������
//�������̽���
//�����ؾ��Ѵ�.
public class IndexAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("INdexModel�� ����Ǿ���");
		System.out.println("�������� �۾��� ���⼭ ��.");
		return new ActionForward("index.jsp", false);
	}

}