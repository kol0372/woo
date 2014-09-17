package ex1;

import java.util.Scanner;

/**
 * @author kosta 
 * Document   : Ex6_Operator Created on : 2014. 9. 2, 오후 2:02:44
 */
public class Ex6_Operator {
    public static void main(String[] args) {
        // Scanner 클래스를 사용해서 사용자로 부터 입력처리
        // 나 초보) 타이핑 신 
        // Scanner sc 선언 하면서 생성
        // 정정 - 클래스를 사용하기 위해서는 Ctrl + space로 불러서 사용
        Scanner sc = new Scanner(System.in);
        
        // UI 글자를 입력하세요.
        System.out.print("메세지 입력1 :");

        // 사용자로 부터 문자열을 입력 받은 후 String msg에 저장하기
        // sc.nextLine()란 메서드가 호출이 되면 String으로 반환되기때문에
        // 아래와 같이 같은 타입의 변수에 저장해서 사용될 수 있다.
        // 메서드 분석) 입력받은 문자열을 한줄 단위로 읽어서 String으로 반환한다. 
        String msg = sc.nextLine(); //blocking 메서드 
        
        System.out.print("메세지 입력2 :");
        String msg2 = sc.nextLine();
        
        System.out.println("==============================");
        System.out.println("입력값1 :"+msg);
        System.out.println("입력값2:"+msg2);
        System.out.println("msg/msg2 주소값을 비교 : "+(msg ==  msg2)); // false
        // String 클래스 : 문자열값을 가지는 객체 
        System.out.println("msg/msg2 내용비교 :"+(msg.equals(msg2)));//true
        // 증명 
        String svc1 = new String("MyTest");
        String svc2 = new String("MyTest");
        System.out.println("svc1/svc2 내용을 비교"+(svc1.equals(svc2)));//true
    }
}


