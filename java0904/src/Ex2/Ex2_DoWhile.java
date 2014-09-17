
package Ex2;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex2_DoWhile created on : 2014. 9. 4, ¿ÀÈÄ 12:04:56
 */
public class Ex2_DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selection;
        do {
            System.out.print("select number : ");
            selection = in.nextInt();
            
            System.out.println("your numbers is " + selection);
        }
        while(selection != 0);
    }

}
