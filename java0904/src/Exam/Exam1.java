
package Exam;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Exam1 created on : 2014. 9. 4, ���� 1:48:33
 */
public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //���� ������ ���� ���� : �޴� ����
        while(true){
            int cnum = (int) (Math.random() * 2 +1);
            System.out.print("�� �Է� :");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Cnum" + cnum);
            if(num == 1){
                System.out.print("1�� �ش�Ǵ� ��");
            }else if(num == 2){
                System.out.print("2�� �ش�Ǵ���");
            }else if(num == 3){
                System.out.print("3�� ����");
                break;
            }else{
                System.out.println("�߸��� ��!");
            }
        }
    }
                

}
