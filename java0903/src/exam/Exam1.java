
package exam;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Exam1 created on : 2014. 9. 3, ���� 11:36:30
 */
public class Exam1 {
    public static void main(String[] args) {
        //Scanner�� ���� ���� �Է¹��� �� 
        //�׼��� Ȧ������ ¦������ ����ϼ���.
        // ex) �� �Է� :1 <enter>
        // �Է��Ѽ� [ 1 ]�� Ȧ�� �Դϴ�.
        //[����] : Scanner , if else, ����
        Scanner sc = new Scanner(System.in);
        // ����ڷκ��� ���� �ޱ� ���� ���� ����� �ż��� ȣ��
        System.out.print(" �� �Է� : ");
        int num1 = Integer.parseInt(sc.nextLine());
        //Ȧ������ ¦������ �����ϱ� ���� ����� ��¹��� ������ ������ ����
        String msg="";
        if(num1%2 == 0){
            msg = "¦��";
        }
        else{
            msg = "Ȧ��";        }  
        System.out.println("�Է��� �� " + num1 + "�� " + msg + "�Դϴ�.");
    }
    //�����丵:�ߺ��� ������ ���Ŀ� ������ ������ �����ؾ��ϱ� ������ �ϳ��� ������.
    //�ʹ� ���� ����ϴ°��� �޼���(�Լ�)�� ����
}
