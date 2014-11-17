
package Ex2;

/**
 * @author kosta
 * Document    : Ex4_While created on : 2014. 9. 4, ¿ÀÈÄ 12:11:02
 */
public class Ex4_While {
    public static void main(String[] args) {
        int total =0;
        
        int number = 1;
        while( number <= 10)
        {
            total += number;
            number++;
        }
        System.out.println("total : " + total);
        
    }
}
