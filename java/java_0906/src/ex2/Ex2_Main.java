
package ex2;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex2_Main created on : 2014. 9. 11, ���� 11:29:06
 */
public class Ex2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��ȣ�Է�");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("�̸��Է�");
        String name = sc.nextLine();
        System.out.print("�����Է�");
        String age = sc.nextLine();
        System.out.print("�����Է�");
        String gender = sc.nextLine();
        System.out.print("��ȭ��ȣ�Է�");
        String tel = sc.nextLine();
        //--��� Ŭ���� ����
        Ex2_CallByReFerence ref = new Ex2_CallByReFerence();
        ref.info(num, name, age, gender, tel);
        System.out.println("�Է��Ͻ� ���� : ");
        System.out.println("��ȣ" + ref.getNum());
        System.out.println("�̸�" + ref.getName());
        System.out.println("����" + ref.getAge());
        System.out.println("����" + ref.getGender());
        System.out.println("��ȭ��ȣ" + ref.getTel());
    }
}
