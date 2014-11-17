
package ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex1 created on : 2014. 9. 2, 오후 3:33:42
 */
public class Ex1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 = ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("숫자 2 = ");
        int num2 = Integer.parseInt(sc.nextLine());
        
        System.out.println(num1>num2);
        System.out.println(num1<=num2);
        System.out.println(num1!=num2);
    
    }

}
