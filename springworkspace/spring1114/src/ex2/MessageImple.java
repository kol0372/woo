package ex2;

public class MessageImple implements Message {
	private String message;
	public MessageImple() {
		message = "��ſ� ���ɽð�!";
	}
	@Override
	public void print() {
		// ���� ����
		System.out.println("[Message]" + message);
		// �Ŀ� ����
	}
	@Override
	public String message() {

		return message;
	}
	@Override
	public void print2() {
		System.out.println("[Message2]" + message);
	}
}
