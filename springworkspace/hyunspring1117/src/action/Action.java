package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ActionFoward;
// �𵨵��� �ݵ�� �����ؾ� �� ���
// ��Ʈ�ѷ��� ���� �޴��� - ������ ���� �������̽��� ����ؼ� �߻�޼��带ȣ���� ��
// request, response�� ���ڰ����� �־ �����Ѵ�.
public interface Action {
	public ActionFoward execute(HttpServletRequest req, 
			HttpServletResponse resp) throws IOException;
}
