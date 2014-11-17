1
package Ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex3_LoopSwitch created on : 2014. 9. 4, 오전 10:35:57
 */
public class Ex3_LoopSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        aa: for(;;){
            System.out.println("색상을 입력:(R,G,B) 종료는 bye");
            String col = sc.nextLine();
            //String API중에서 문자열을 소문자로 변경
            col =col.toLowerCase();
            String res = "";
            switch(col){
                case "RED" :
                    System.out.println("빨간색입니다.");
                    break;
                case "BLUE" :
                    System.out.println("파란색입니다.");
                    break;
                case "BYE" : 
                    System.out.println("종료하고싶은데요.");
                    break;
            } 
            System.out.println("당신이 입력한색상은 " + res + "입니다.");
             break aa;
        }
    }
}
