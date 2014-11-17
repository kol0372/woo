
package Ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex2_Switch created on : 2014. 9. 4, 오전 10:20:55
 */
public class Ex2_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int m = Integer.parseInt(sc.nextLine());
        String res="";
        switch(m){
        case 2: 
        case 12:
        case 1:
            res = "겨울"; break;
        case 5: 
        case 3:
        case 4:    
            res = "봄"; break;
        case 8:
        case 6: 
        case 7:
            res = "여름"; break;
        case 10:
        case 9:
        case 11:
            res = "가을"; break;
        default :
            res = "몰라";
    }
        System.out.println("선택한 월은 " + res + "입니다.");
    }

    private static void Switch(int m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
