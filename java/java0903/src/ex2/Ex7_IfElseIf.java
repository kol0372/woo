
package ex2;

import static java.awt.Color.red;
import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex7_IfElseIf created on : 2014. 9. 3, ���� 1:51:17
 */
public class Ex7_IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����ϴ� ���� �Է� (red, green, blue...);");
        String msg = sc.nextLine();
        //����ġ�鼭 �ּ��� ����鼭 ��ü����
        //����ڰ� ���࿡ red, RED ĥ�� �ִ��� ��ҹ��� ���о��� StringŬ������
        //���ڿ��� ���� �� ���ش�.
        //red
        if(msg.equalsIgnoreCase("red")){
            System.out.println("������ �̱���.");}
        else if(msg.equalsIgnoreCase("blue")){
            System.out.println("�Ķ��� �̱���.");}
        else if(msg.equalsIgnoreCase("green")){    
            System.out.println("�ʷϻ� �̱���.");}
        else{
            System.out.println("�𸣰ڽ��ϴ�."); 
        }

    }
}
