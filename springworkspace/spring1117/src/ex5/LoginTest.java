package ex5;

import java.util.Scanner;

public class LoginTest {
	
	private boolean res;

	public LoginTest() {
		String[] msg = { "Ʋ�Ƚ��ϴ�.", "��������ȸ", "good bye" };

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < msg.length; i++) {
			System.out.println("��й�ȣ �Է�");
			String pwd = scan.nextLine();

			if (pwd.equals("1111")) {

				res = true;
				break;
			} else {
				System.out.println(msg[i]);
				res = false;
			}
		}

	}

	public boolean isRes() {
		return res;
	}

}
