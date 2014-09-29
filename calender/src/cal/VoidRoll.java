
package cal;

import java.util.Calendar;

/**
 * @author kosta
 * Document    : VoidRoll created on : 2014. 9. 18, 오후 5:30:48
 */
public class VoidRoll {
    private static Calendar cal;
    public static void main(String[] args) {
        
    
      Calendar cal = Calendar.getInstance();
      
      // 현재 달 출력
      System.out.println("Month is " + cal.get(Calendar.MONTH));

      // 달을 2개 올려줌.
      cal.roll(Calendar.MONTH, 2);

      // 올려준 달 출력
      System.out.println("Month is " + cal.get(Calendar.MONTH));
      
      // 달은 4개 내려줌
      cal.roll(Calendar.MONTH, -4);
      
      // 내려준 달 출력
      System.out.println("Month is " + cal.get(Calendar.MONTH));

}
}
