package design1119;

public class Singleton1 {
	private static Singleton1 singleton = null;

	private Singleton1() {
		System.out.println(" �ν��Ͻ� ���� ");
	}

	public static Singleton1 getInstance() {
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}
}
