
package ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex1_Oper created on : 2014. 9. 3, ���� 10:15:19
 */
public class Ex1_Oper {
    //�񱳿����� - ������ ������� �� �� �� ���̴� ������. ����� 
    //�׻� boolean (true/false)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("b = ");
        int b = Integer.parseInt(sc.nextLine());
        boolean c = a < b ;//���� a�� ���� b ���� �۴�.
                System.out.println("a < b ��" + c);
        c = a > b ;//���� a�� b���� ũ��.
        System.out.println("a > b �� " + c);
        c = a != b; //���� a, b �� ���� ���� �ʴ�.
        System.out.println("a != b ��" + c);
        c = a == b; //���� a�� b �� ����.
        System.out.println("a == b ��" + c);
        
      
        
        
        
      
    }

}
