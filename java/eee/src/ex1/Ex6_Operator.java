package ex1;

import java.util.Scanner;

/**
 * @author kosta 
 * Document   : Ex6_Operator Created on : 2014. 9. 2, ���� 2:02:44
 */
public class Ex6_Operator {
    public static void main(String[] args) {
        // Scanner Ŭ������ ����ؼ� ����ڷ� ���� �Է�ó��
        // �� �ʺ�) Ÿ���� �� 
        // Scanner sc ���� �ϸ鼭 ����
        // ���� - Ŭ������ ����ϱ� ���ؼ��� Ctrl + space�� �ҷ��� ���
        Scanner sc = new Scanner(System.in);
        
        // UI ���ڸ� �Է��ϼ���.
        System.out.print("�޼��� �Է�1 :");

        // ����ڷ� ���� ���ڿ��� �Է� ���� �� String msg�� �����ϱ�
        // sc.nextLine()�� �޼��尡 ȣ���� �Ǹ� String���� ��ȯ�Ǳ⶧����
        // �Ʒ��� ���� ���� Ÿ���� ������ �����ؼ� ���� �� �ִ�.
        // �޼��� �м�) �Է¹��� ���ڿ��� ���� ������ �о String���� ��ȯ�Ѵ�. 
        String msg = sc.nextLine(); //blocking �޼��� 
        
        System.out.print("�޼��� �Է�2 :");
        String msg2 = sc.nextLine();
        
        System.out.println("==============================");
        System.out.println("�Է°�1 :"+msg);
        System.out.println("�Է°�2:"+msg2);
        System.out.println("msg/msg2 �ּҰ��� �� : "+(msg ==  msg2)); // false
        // String Ŭ���� : ���ڿ����� ������ ��ü 
        System.out.println("msg/msg2 ����� :"+(msg.equals(msg2)));//true
        // ���� 
        String svc1 = new String("MyTest");
        String svc2 = new String("MyTest");
        System.out.println("svc1/svc2 ������ ��"+(svc1.equals(svc2)));//true
    }
}


