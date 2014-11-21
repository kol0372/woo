package ex2;

public class MessageImple implements Message {
	private String message;
	public MessageImple() {
		message = "즐거운 점심시간!";
	}
	@Override
	public void print() {
		// 전에 적용
		System.out.println("[Message]" + message);
		// 후에 적용
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
