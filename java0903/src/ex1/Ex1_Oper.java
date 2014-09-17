
package ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex1_Oper created on : 2014. 9. 3, 오전 10:15:19
 */
public class Ex1_Oper {
    //비교연산자 - 변수나 상수값을 비교 할 때 쓰이는 연산자. 결과는 
    //항상 boolean (true/false)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("b = ");
        int b = Integer.parseInt(sc.nextLine());
        boolean c = a < b ;//변수 a가 변수 b 보다 작다.
                System.out.println("a < b 는" + c);
        c = a > b ;//변수 a가 b보다 크다.
        System.out.println("a > b 는 " + c);
        c = a != b; //변수 a, b 가 서로 같지 않다.
        System.out.println("a != b 는" + c);
        c = a == b; //변수 a와 b 가 같다.
        System.out.println("a == b 는" + c);
        
      
        
        
        
      
    }

}
