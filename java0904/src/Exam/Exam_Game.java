
package Exam;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Exam_Game created on : 2014. 9. 4, 오후 5:36:25
 */
public class Exam_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //지역변수 초기화
        int winCnt=0, totalCnt=0;
        //"" : 0번지 , 홀 : 1번지, String[]배열에 기억 시켜놓자.
        String[] m = {"", "홀","짝"};
        while(true){
            System.out.print("홀 - 1, 짝 - 2, 종료 -3 : ");
            int num =Integer.parseInt(sc.nextLine());
            int cNum = (int)(Math.random()*2)+1;
            String msg="";
            if(num == 3){
                System.out.println("TOTAL"+totalCnt);
                System.out.println("Win"+winCnt);
                int winN = winn(winCnt, totalCnt);
                System.out.println("승률"+winN+"%");
                System.out.println("상품"+gift(winN));
                System.out.println("종료");
                break;
            }else if(num ==cNum){
                msg = "승리";
                winCnt++;
            }else if(num != cNum){
                msg = "졌음"; 
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
        gMsg="페라리";            
    }else if(winNum <100 && winNum >=90){
        gMsg ="그랜져";
    }else if(winNum <90 && winNum>=80){
        gMsg="소나타";    
    }else if(winNum <80 && winNum>=70){
        gMsg="당나귀";
    }else{
        gMsg="숨쉬기";
    }
    return gMsg;
}
}
