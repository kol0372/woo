
package Exam;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Exam1 created on : 2014. 9. 4, 오후 1:48:33
 */
public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //앞의 내용의 복습 개념 : 메뉴 구현
        while(true){
            int cnum = (int) (Math.random() * 2 +1);
            System.out.print("수 입력 :");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Cnum" + cnum);
            if(num == 1){
                System.out.print("1에 해당되는 일");
            }else if(num == 2){
                System.out.print("2에 해당되는일");
            }else if(num == 3){
                System.out.print("3은 종료");
                break;
            }else{
                System.out.println("잘못된 수!");
            }
        }
    }
                

}
