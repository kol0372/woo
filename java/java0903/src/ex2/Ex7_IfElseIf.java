
package ex2;

import static java.awt.Color.red;
import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex7_IfElseIf created on : 2014. 9. 3, 오후 1:51:17
 */
public class Ex7_IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("좋아하는 색상 입력 (red, green, blue...);");
        String msg = sc.nextLine();
        //엔터치면서 주소지 생기면서 객체생성
        //사용자가 만약에 red, RED 칠수 있느이 대소문자 구분없이 String클래스의
        //문자열의 값을 비교 해준다.
        //red
        if(msg.equalsIgnoreCase("red")){
            System.out.println("빨간색 이군요.");}
        else if(msg.equalsIgnoreCase("blue")){
            System.out.println("파란색 이군요.");}
        else if(msg.equalsIgnoreCase("green")){    
            System.out.println("초록색 이군요.");}
        else{
            System.out.println("모르겠습니다."); 
        }

    }
}
