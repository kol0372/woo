package exam;

import java.util.Scanner;

/**
 * @author kosta 
 * Document   : ExamGame Created on : 2014. 9. 4, 오후 2:16:09
 */
public class Exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //지역변수 초기화
        int winCnt=0, totalCnt=0;
        //""-0번지, 홀: 1번지 String[]배열에 기억 시켜놓자.
        String[] m = {"","홀","짝"}; 
        while (true) {            
            System.out.print("홀-1,짝-2,종료-3:");
            int num = Integer.parseInt(sc.nextLine());
            int cNum = (int) (Math.random()*2)+1;
            String msg="";
            if(num == 3){
                System.out.println("TOTAL:"+totalCnt);
                System.out.println("WIN :"+winCnt);
                int winN= winn(winCnt, totalCnt);
                System.out.println("승률:"+winN+"%");
                System.out.println("상품 :"+gift(winN));
                System.out.println("종료");
                break;
            }else if(num == cNum){
                msg ="[승리 하셨습니다]";
                winCnt++;
            }else if(num != cNum){
                msg ="[당신은 졌습니다.]";
            }
            totalCnt++; //후치연산 , 3으로 종료될때는 사용 안되게끔 위치 중요
            System.out.println("TOTAL:"+totalCnt);
            //m[1] = "홀" [[""],["홀"],["짝"]]
            System.out.println("CPU :"+m[cNum]); //배열 순서 안에 들어 있는 값을 출력
            System.out.println("YOU :"+m[num]); //1, 2를 찍었을 때, 홀, 짝이 나오도록
         
            System.out.println("-------------");
            System.out.println("WIN :"+winCnt);
            System.out.println(msg);
        }
    }
    public static int winn(int win,int total){
        //스태틱 뒤에 반환될 값의 자료형을 적어줌
        //static 메서드 사용
        //오직 static공간에 하나만 생성되어서
        //사용할 때 생성없이 자원을 사용할 수 없다.
        //static을 남발하면 합의 메모리영역을 많이 차지하기 때문에 좋지 않음.
       int rate = (int) (((double)win/total) * 100);

        return rate;
    }
    public static String gift(int winNum){
        String gMsg="";
        if(winNum == 100){
            gMsg="축하합니다.  페라리 당첨입니다. ^^";
        }else if(winNum < 100 && winNum >= 90){
            gMsg="축하합니다. 그랜저 당첨입니다.";
        }else if(winNum < 90 && winNum >= 80){
            gMsg="축하합니다. 소나타 당첨입니다.";
        }else if(winNum < 90 && winNum >= 80){
            gMsg="축하합니다. 소나타 당첨입니다.";
        }else if(winNum < 80 && winNum >= 60){
            gMsg="축하합니다. 당나귀 당첨입니다.";
        }else{
            gMsg="축하합니다. 숨쉬기 운동 1000번 당첨입니다.";
        }
        return gMsg;
    }
}
