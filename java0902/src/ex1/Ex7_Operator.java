
package ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex7_Operator created on : 2014. 9. 2, 오후 3:11:44
 */
public class Ex7_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 1");
        int num1 = Integer.parseInt(sc.nextLine());
        //넥스트라인은 문자열을 반환하는데
        //문자열을 반환하기 위해서는 랩퍼클래스인 integer.parselnt를 사용
        System.out.print("수 2");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println(num1 + "+" + num2 + "=" +(num1+num2));
        
        //입력받은 수가 짝수 이면 true를 출력하시오.
        System.out.println("짝수를 입력 : ");
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.println("판별" + (num3 % 2 == 0));
        
        
    }

}
