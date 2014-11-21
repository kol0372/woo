package ex5;

import java.util.Scanner;

public class LoginTest {
	
	private boolean res;

	public LoginTest() {
		String[] msg = { "틀렸습니다.", "마지막기회", "good bye" };

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < msg.length; i++) {
			System.out.println("비밀번호 입력");
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
