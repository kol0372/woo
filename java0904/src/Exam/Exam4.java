package exam;

import java.util.Scanner;

/**
 * @author kosta 
 * Document   : ExamGame Created on : 2014. 9. 4, ���� 2:16:09
 */
public class Exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //�������� �ʱ�ȭ
        int winCnt=0, totalCnt=0;
        //""-0����, Ȧ: 1���� String[]�迭�� ��� ���ѳ���.
        String[] m = {"","Ȧ","¦"}; 
        while (true) {            
            System.out.print("Ȧ-1,¦-2,����-3:");
            int num = Integer.parseInt(sc.nextLine());
            int cNum = (int) (Math.random()*2)+1;
            String msg="";
            if(num == 3){
                System.out.println("TOTAL:"+totalCnt);
                System.out.println("WIN :"+winCnt);
                int winN= winn(winCnt, totalCnt);
                System.out.println("�·�:"+winN+"%");
                System.out.println("��ǰ :"+gift(winN));
                System.out.println("����");
                break;
            }else if(num == cNum){
                msg ="[�¸� �ϼ̽��ϴ�]";
                winCnt++;
            }else if(num != cNum){
                msg ="[����� �����ϴ�.]";
            }
            totalCnt++; //��ġ���� , 3���� ����ɶ��� ��� �ȵǰԲ� ��ġ �߿�
            System.out.println("TOTAL:"+totalCnt);
            //m[1] = "Ȧ" [[""],["Ȧ"],["¦"]]
            System.out.println("CPU :"+m[cNum]); //�迭 ���� �ȿ� ��� �ִ� ���� ���
            System.out.println("YOU :"+m[num]); //1, 2�� ����� ��, Ȧ, ¦�� ��������
         
            System.out.println("-------------");
            System.out.println("WIN :"+winCnt);
            System.out.println(msg);
        }
    }
    public static int winn(int win,int total){
        //����ƽ �ڿ� ��ȯ�� ���� �ڷ����� ������
        //static �޼��� ���
        //���� static������ �ϳ��� �����Ǿ
        //����� �� �������� �ڿ��� ����� �� ����.
        //static�� �����ϸ� ���� �޸𸮿����� ���� �����ϱ� ������ ���� ����.
       int rate = (int) (((double)win/total) * 100);

        return rate;
    }
    public static String gift(int winNum){
        String gMsg="";
        if(winNum == 100){
            gMsg="�����մϴ�.  ��� ��÷�Դϴ�. ^^";
        }else if(winNum < 100 && winNum >= 90){
            gMsg="�����մϴ�. �׷��� ��÷�Դϴ�.";
        }else if(winNum < 90 && winNum >= 80){
            gMsg="�����մϴ�. �ҳ�Ÿ ��÷�Դϴ�.";
        }else if(winNum < 90 && winNum >= 80){
            gMsg="�����մϴ�. �ҳ�Ÿ ��÷�Դϴ�.";
        }else if(winNum < 80 && winNum >= 60){
            gMsg="�����մϴ�. �糪�� ��÷�Դϴ�.";
        }else{
            gMsg="�����մϴ�. ������ � 1000�� ��÷�Դϴ�.";
        }
        return gMsg;
    }
}
