
package ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex6_Oper created on : 2014. 9. 2, ���� 1:55:58
 */
public class Ex6_Oper {

    public static void main(String[] args) {
    int a = 10;
    int b = 20;
        System.out.println("a�� b�� " + (a == b));
    // �Ϲ� �ڷ����� ����
    String str1 = new String("T");
    String str2 = new String("T");
        System.out.println("str1�� str2 �� "+ (str1 == str2));
    // new�� �ּҼ���    
    // ���� �ڷ����� �ּҰ� ��
    // ctrl + shift + c = �ּ�
        String str4 = "T";
        String str5 = "T";
         System.out.println("str4�� str5 �� "+ (str4 == str5));
         
        //scanner Ŭ������ ����ؼ� ����ڷ� ���� �Է�ó��
        //Scanner sc ���� �ϸ鼭 ����
        //���� - Ŭ������ ����ϱ� ���ؼ��� ctrl + space�� �ҷ��� ���
        Scanner sc = new Scanner(System.in);
        
        // UI ���ڸ� �Է��ϼ���
        System.out.print("�޼��� �Է�");
        
        //����ڷκ��� ���ڿ��� �Է� ���� �� String msg�� �����ϱ�
        // sc.nextline()�� �޼��尡 ȣ���� �Ǹ� String���� ��ȯ�Ǳ⶧����
        // �Ʒ��� ���� ���� Ÿ���� ������ �����ؼ� ���� �� �ִ�.
        // �޼��� �м�) �Է¹��� ���ڿ��� ���� ������ �о String���� ��ȯ�Ѵ�.
        String msg = sc.nextLine();
                //���ŷ �޼��� : ������ ���� ����ȵɶ� ��ٸ��°�
        System.out.print("�޼��� �Է�2");
         String msg2 = sc.nextLine();
         
         System.out.println("=============");
         System.out.println("�Է°�1 "+msg);
         System.out.println("�Է°�2 "+msg2);
         System.out.println("msg/msg2 �ּҰ��� �� : " +(msg == msg2)); //true
         //string Ŭ���� : ���ڿ����� ������ ��ü
         System.out.println("msg/msg2 ������ �� : "+(msg.equals(msg2))); //true
         //����
         String svc1 = new String("MyTest");
         String svc2 = new String("MyTest");
         System.out.println("svc1/svc2 ������ �� : " + (svc1.equals(svc2)));//true
}
}
