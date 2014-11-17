package Exam;

import java.util.Scanner;

/**
 * @author kosta Document : Exam2 created on : 2014. 9. 4, 오후 2:01:45
 */
public class Exam2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int win = 0;
        while (true) {
            int cpu = (int) (Math.random() * 2 + 1);
            System.out.print("1-홀, 2-짝, 3-종료 : ");
            int num = Integer.parseInt(sc.nextLine());
            if (cpu == 1 && (num == 1 || num == 2)) {
                System.out.println("total : " + total);
                total++;
                System.out.println("cpu : 홀");
            } else if (cpu == 2 && (num == 1 || num == 2)) {
                System.out.println("total : " + total);
                total++;
                System.out.println("cpu : 짝");
            }
            if (num == 1) {
                win = gameTest(num, cpu, win);

            } else if (num == 2) {
                win = gameTest(num, cpu, win);

            } else if (num == 3) {
                int rate = (int) (((double) win / total) * 100);
                System.out.println("total : " + total);
                System.out.println("win : " + win);
                System.out.println("승률 : " + rate);
                String gMsg ="";
                if (rate == 100) {
                    gMsg = "축하합니다.  페라리 당첨입니다. ^^";
                } else if (rate < 100 && rate >= 90) {
                    gMsg = "축하합니다. 그랜저 당첨입니다.";
                } else if (rate < 90 && rate >= 80) {
                    gMsg = "축하합니다. 소나타 당첨입니다.";
                } else if (rate < 90 && rate >= 80) {
                    gMsg = "축하합니다. 소나타 당첨입니다.";
                } else if (rate < 80 && rate >= 60) {
                    gMsg = "축하합니다. 당나귀 당첨입니다.";
                } else {
                    gMsg = "축하합니다. 숨쉬기 운동 1000번 당첨입니다.";
                }
                System.out.println("상품 : " + gMsg);
                break;
            }
            System.out.println("--------------");
            
        }
    }

    public static int gameTest(int num, int cpu, int win) {
        String m = "";
        if (num == 1) {
            m = "홀";
        } else {
            m = "짝";
        }
        System.out.println("you : " + m);
        if (num == cpu) {
            win++;
            System.out.println("승리하셨습니다.");
        } else if (num != cpu) {
            System.out.println("졌습니다.");
        }

        System.out.println("--------------------");
        System.out.println("WIN :" + win);

        return win;
    }
}
