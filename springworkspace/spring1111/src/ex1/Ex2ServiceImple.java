package ex1;

public class Ex2ServiceImple implements Service {

	private int num;
	private String name, str;

	public Ex2ServiceImple(int num) {

		this.num = num;
		System.out.println("int�� �����ڰ� ȣ��");
	}

	public Ex2ServiceImple(String str) {

		this.str = str;
		System.out.println("String�� �����ڰ� ȣ��");
	}

	@Override
	public String print() {
		int res=num*10;
		System.out.println("NUM" + (num + 10));
		return String.valueOf(res);

	}

	@Override
	public String call() {
		StringBuffer s = new StringBuffer();
		s.append(str).append("��");
		System.out.println("STR" + s);
		return s.toString();

	}

	@Override
	public String moniter() {
		StringBuffer s = new StringBuffer();
		s.append("num:" + (num + 10)).append("<br />");
		s.append(str).append("��");
		
		return s.toString();
	}

	public Ex2ServiceImple(int num, String str) {                                              
		super();
		this.num = num;
		this.str = str;
	}

}
