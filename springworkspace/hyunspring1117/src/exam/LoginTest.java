package exam;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginTest {
	@Autowired
	private Scanner sc;
	private String pwd;
	private boolean res;
	
	public LoginTest() {
		String[] msg = {"Ʋ�Ƚ��ϴ�.","�ƽ�����. ������ �ѹ��� ��!","Good-Bye ^^"};
		for(int i=0; i<msg.length; i++){
			System.out.print("��й�ȣ �Է�:");
			String pwd = sc.nextLine();
			if(!pwd.equals("1111")){
				System.out.println(msg[i]);
				res=false;
			}else{
				res=true;
				break;
			}
		}
	}

	public boolean isRes() {
		return res;
	}

}
