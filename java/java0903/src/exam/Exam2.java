package exam;

import java.util.Scanner;

/**
 * @author kosta Document : Exam2 created on : 2014. 9. 3, 오후 2:46:10
 */
// 연습문제
// for , if else , 홀짝응용
// 수를 입력하세요. 9
// 범위를 입력하세요. 3
// [result1]
// 0 1 2
// 3 4 5
// 6 7 8 
// 수를 입력하세요.9
// 범위를 입력하세요. 5
// [result]
// 0 1 2 3 4 
// 5 6 7 8 9
public class Exam2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("수를 입력하세요. ");
        int num1 = Integer.parseInt(sc.nextLine());
        //num1에 수받을 것을 설정
        System.out.print("범위를 입력하세요.");
        int num2 = Integer.parseInt(sc.nextLine());
        //num2에 범위받을 것을 설정
        System.out.println("[result]");
        for (int i = 0; i < num1; i++) {
            if (i % num2 == 0 && i != 0) //i가 0일때 줄바꿈되는것을 막기위해 &&사용
            {
                System.out.println(); //if의 조건이 맞을때 실행문, 안맞으면 줄바꿈x
            }
            System.out.print(i + "\t"); //for문의 실행문
            }
        System.out.println("");
    }

}
