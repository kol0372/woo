package exam;

import java.util.Scanner;

/**
 * @author kosta Document : Exam2 created on : 2014. 9. 3, ���� 2:46:10
 */
// ��������
// for , if else , Ȧ¦����
// ���� �Է��ϼ���. 9
// ������ �Է��ϼ���. 3
// [result1]
// 0 1 2
// 3 4 5
// 6 7 8 
// ���� �Է��ϼ���.9
// ������ �Է��ϼ���. 5
// [result]
// 0 1 2 3 4 
// 5 6 7 8 9
public class Exam2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���� �Է��ϼ���. ");
        int num1 = Integer.parseInt(sc.nextLine());
        //num1�� ������ ���� ����
        System.out.print("������ �Է��ϼ���.");
        int num2 = Integer.parseInt(sc.nextLine());
        //num2�� �������� ���� ����
        System.out.println("[result]");
        for (int i = 0; i < num1; i++) {
            if (i % num2 == 0 && i != 0) //i�� 0�϶� �ٹٲ޵Ǵ°��� �������� &&���
            {
                System.out.println(); //if�� ������ ������ ���๮, �ȸ����� �ٹٲ�x
            }
            System.out.print(i + "\t"); //for���� ���๮
            }
        System.out.println("");
    }

}
