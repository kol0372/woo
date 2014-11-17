package exam;

import java.util.Scanner;

/**
 * @author kosta Document : Exam3 created on : 2014. 9. 3, 오후 4:05:03
 */
public class Exam3 {

    // 상호작용이 가능한 구구단 만들기
    // 단입력 : 7
    // 범위입력 : 3 
    // --------------------
    // 6        7         8
    // --------------------
    // 6x1=6   7x1=7   8x1=8
    // 6X2=12  7X2=14  8X2=16
    // .......생략..........
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단입력 :  ");
        int num1 = Integer.parseInt(sc.nextLine());
        //num1에 수받을 것을 설정
        System.out.print("범위입력 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        //num2에 수받을 것을 설정
        for (int i = 0; i <= 9; i++) //i를 0부터 설정해서 *단 써줄것을 설정
        {
            for (int j = num1 - (num2 / 2); j <= num1 + (num2 / 2); j++) {
                if (i == 0) //i가 0일때
                {
                    System.out.print(j + "단\t\t");
                } else //i가 0이 아닐때
                    {
                    if (j >= 0) 
                    {
                        System.out.print(j + "x" + i + "=" + (i * j) + "\t\t");
                    } else//j가 0단보다 작을때
                        {
                        System.out.print("**********\t");
                        }
                }
            }
            System.out.println("");
        }
    }

}
