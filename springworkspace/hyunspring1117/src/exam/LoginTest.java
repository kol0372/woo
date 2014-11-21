package exam;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginTest {
	@Autowired
	private Scanner sc;
	private String pwd;
	private boolean res;
	
	public LoginTest() {
		String[] msg = {"틀렸습니다.","아쉽군요. 마지막 한번만 더!","Good-Bye ^^"};
		for(int i=0; i<msg.length; i++){
			System.out.print("비밀번호 입력:");
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
