
package ex2;

/**
 * @author kosta
 * Document    : TestOffset created on : 2014. 9. 16, ���� 3:11:59
 */
public class TestOffset {
    public static void main(String[] args) {
        String str = "abcdefghijk";
        
        System.out.println("String =" + str);
        
        int retvel = str.offsetByCodePoints(1, 3);
        
        System.out.println(retvel);
        
        System.out.println(str.charAt(retvel));
    }
}
