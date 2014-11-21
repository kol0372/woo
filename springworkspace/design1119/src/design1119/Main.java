package design1119;

public class Main {

	public static void main(String[] args)

	{
		Singleton1 sl = Singleton1.getInstance();
		Singleton1 sl2 = Singleton1.getInstance();

		if (sl == sl2) {
			System.out.println("sl=sl2");
		}

	}

}
