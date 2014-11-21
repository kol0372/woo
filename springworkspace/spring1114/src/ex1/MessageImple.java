package ex1;

public class MessageImple implements Message{
	private String message;
	public MessageImple() {
		message= "ÁñÁ¡";
	}

	@Override
	public void print() {
		System.out.println("message1" + message);
		
	}

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void print2() {
		System.out.println("message2" + message);
		
	}

}
