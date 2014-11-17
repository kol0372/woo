
package exam;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Exam1 created on : 2014. 9. 3, 오전 11:36:30
 */
public class Exam1 {
    public static void main(String[] args) {
        //Scanner로 부터 수를 입력받은 후 
        //그수가 홀수인지 짝수인지 출력하세요.
        // ex) 수 입력 :1 <enter>
        // 입력한수 [ 1 ]은 홀수 입니다.
        //[도구] : Scanner , if else, 연산
        Scanner sc = new Scanner(System.in);
        // 사용자로부터 수를 받기 위한 변수 선언과 매서드 호출
        System.out.print(" 수 입력 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        //홀수인지 짝수인지 구별하기 위한 제어문과 출력문을 저장할 변수를 선언
        String msg="";
        if(num1%2 == 0){
            msg = "짝수";
        }
        else{
            msg = "홀수";        }  
        System.out.println("입력한 수 " + num1 + "는 " + msg + "입니다.");
    }
    //리펙토링:중복이 있으면 추후에 수정시 모든것을 수정해야하기 때문에 하나로 합쳐줌.
    //너무 자주 사용하는것은 메서드(함수)로 해줌
}
