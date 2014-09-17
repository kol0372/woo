package exam;

import java.util.Scanner;

/**
 * @author kosta Document : Exam3 created on : 2014. 9. 3, ���� 4:05:03
 */
public class Exam3 {

    // ��ȣ�ۿ��� ������ ������ �����
    // ���Է� : 7
    // �����Է� : 3 
    // --------------------
    // 6        7         8
    // --------------------
    // 6x1=6   7x1=7   8x1=8
    // 6X2=12  7X2=14  8X2=16
    // .......����..........
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���Է� :  ");
        int num1 = Integer.parseInt(sc.nextLine());
        //num1�� ������ ���� ����
        System.out.print("�����Է� : ");
        int num2 = Integer.parseInt(sc.nextLine());
        //num2�� ������ ���� ����
        for (int i = 0; i <= 9; i++) //i�� 0���� �����ؼ� *�� ���ٰ��� ����
        {
            for (int j = num1 - (num2 / 2); j <= num1 + (num2 / 2); j++) {
                if (i == 0) //i�� 0�϶�
                {
                    System.out.print(j + "��\t\t");
                } else //i�� 0�� �ƴҶ�
                    {
                    if (j >= 0) 
                    {
                        System.out.print(j + "x" + i + "=" + (i * j) + "\t\t");
                    } else//j�� 0�ܺ��� ������
                        {
                        System.out.print("**********\t");
                        }
                }
            }
            System.out.println("");
        }
    }

}
