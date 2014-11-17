package Exam;

import java.util.Scanner;

/**
 * @author kosta Document : Exam2 created on : 2014. 9. 4, ���� 2:01:45
 */
public class Exam2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int win = 0;
        while (true) {
            int cpu = (int) (Math.random() * 2 + 1);
            System.out.print("1-Ȧ, 2-¦, 3-���� : ");
            int num = Integer.parseInt(sc.nextLine());
            if (cpu == 1 && (num == 1 || num == 2)) {
                System.out.println("total : " + total);
                total++;
                System.out.println("cpu : Ȧ");
            } else if (cpu == 2 && (num == 1 || num == 2)) {
                System.out.println("total : " + total);
                total++;
                System.out.println("cpu : ¦");
            }
            if (num == 1) {
                win = gameTest(num, cpu, win);

            } else if (num == 2) {
                win = gameTest(num, cpu, win);

            } else if (num == 3) {
                int rate = (int) (((double) win / total) * 100);
                System.out.println("total : " + total);
                System.out.println("win : " + win);
                System.out.println("�·� : " + rate);
                String gMsg ="";
                if (rate == 100) {
                    gMsg = "�����մϴ�.  ��� ��÷�Դϴ�. ^^";
                } else if (rate < 100 && rate >= 90) {
                    gMsg = "�����մϴ�. �׷��� ��÷�Դϴ�.";
                } else if (rate < 90 && rate >= 80) {
                    gMsg = "�����մϴ�. �ҳ�Ÿ ��÷�Դϴ�.";
                } else if (rate < 90 && rate >= 80) {
                    gMsg = "�����մϴ�. �ҳ�Ÿ ��÷�Դϴ�.";
                } else if (rate < 80 && rate >= 60) {
                    gMsg = "�����մϴ�. �糪�� ��÷�Դϴ�.";
                } else {
                    gMsg = "�����մϴ�. ������ � 1000�� ��÷�Դϴ�.";
                }
                System.out.println("��ǰ : " + gMsg);
                break;
            }
            System.out.println("--------------");
            
        }
    }

    public static int gameTest(int num, int cpu, int win) {
        String m = "";
        if (num == 1) {
            m = "Ȧ";
        } else {
            m = "¦";
        }
        System.out.println("you : " + m);
        if (num == cpu) {
            win++;
            System.out.println("�¸��ϼ̽��ϴ�.");
        } else if (num != cpu) {
            System.out.println("�����ϴ�.");
        }

        System.out.println("--------------------");
        System.out.println("WIN :" + win);

        return win;
    }
}
