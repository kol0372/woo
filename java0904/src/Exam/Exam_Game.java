
package Exam;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Exam_Game created on : 2014. 9. 4, ���� 5:36:25
 */
public class Exam_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //�������� �ʱ�ȭ
        int winCnt=0, totalCnt=0;
        //"" : 0���� , Ȧ : 1����, String[]�迭�� ��� ���ѳ���.
        String[] m = {"", "Ȧ","¦"};
        while(true){
            System.out.print("Ȧ - 1, ¦ - 2, ���� -3 : ");
            int num =Integer.parseInt(sc.nextLine());
            int cNum = (int)(Math.random()*2)+1;
            String msg="";
            if(num == 3){
                System.out.println("TOTAL"+totalCnt);
                System.out.println("Win"+winCnt);
                int winN = winn(winCnt, totalCnt);
                System.out.println("�·�"+winN+"%");
                System.out.println("��ǰ"+gift(winN));
                System.out.println("����");
                break;
            }else if(num ==cNum){
                msg = "�¸�";
                winCnt++;
            }else if(num != cNum){
                msg = "����"; 
            }
            totalCnt++;
            System.out.println("total"+totalCnt);
            System.out.println("CPU"+m[cNum]);
            System.out.println("YOU"+m[cNum]);
            System.out.println("-----------");
            System.out.println("WIN"+winCnt);
            System.out.println(msg);
        }
    }
public static int winn(int win, int total){
    int rate = (int)(((double)win/total) * 100);
    return rate;
}
public static String gift(int winNum){
    String gMsg="";
    if(winNum == 100){
        gMsg="���";            
    }else if(winNum <100 && winNum >=90){
        gMsg ="�׷���";
    }else if(winNum <90 && winNum>=80){
        gMsg="�ҳ�Ÿ";    
    }else if(winNum <80 && winNum>=70){
        gMsg="�糪��";
    }else{
        gMsg="������";
    }
    return gMsg;
}
}
