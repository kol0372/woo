
package ex2;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex8_For created on : 2014. 9. 3, 오후 2:10:28
 */
public class Ex8_For {
    public static void main(String[] args) {
        loopFor();
    }

    private static void loopFor() {
     // 초기식, 초기화 등 => 일생동안 딱 한번의 의미
     // for (초기식; 조건식; 증감식){
     // 실행문
     // }
     // 초기식의 변수 i의 값이 0이 할당
     // for문안에 지역변수는 for문 안에서만 
     for(int i = 0; i<10; i++){
         System.out.println(i + "");   
     }
     //  System.out.println("i"); 
     //  for문밖에 i가 있어 출력 x 
    }
   

    

}
