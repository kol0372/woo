package ex1Auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWiredService {
	// ������̼� : ���డ���� �ּ�, ������ 3.0���� ����
	// ���� ������ ����ȭ �� �� �ִ�.
	// �ڵ����� ���� �����ִ� ������̼��̴�.
	// �̸�(byname)���� ���� ã�� ���� ��� Ÿ��(bytype)���� ã�� �ش�.
	// Ÿ���� ���� ��� ���� �˻��ϱ� ������ �ӵ��� ���� �� �� �ִ�.
	// �� �̸��̵� Ÿ���̵� �����ؾ� �ǰ�, Ÿ���� ��� Qualifier������̼����� �����ؾ� �Ѵ�. �����ص� �˻��� ����
	// autowired�� aop����

	@Autowired
	@Qualifier("hold")
	private String name;

	public String printName() {
		StringBuffer s = new StringBuffer();
		return s.append("����� �̸���").append(name).append("�Դϴ�.").toString();
	}
}