package ex1;

import java.util.Scanner;

/**
 * @author kosta 
 * Document   : Ex7_Operator Created on : 2014. 9. 2, ���� 3:11:36
 */
public class Ex7_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� 1");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("�� 2");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println(num1 +"+"+ num2 +"="+(num1+num2));
        // �Է¹��� ���� ¦�� �̸� true�� ����Ͻÿ�. 
        System.out.print("¦���� �Է� :");
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.println("�Ǻ� :"+(num3 % 2 == 0));
                
    }
}
