
package cal;

import java.util.Calendar;

/**
 * @author kosta
 * Document    : AbstractVoidRoll created on : 2014. 9. 18, 오후 5:21:28
 */
public class AbstractVoidRoll {
    public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      // 현재 달 출력
      System.out.println("Month is " + cal.get(Calendar.MONTH));
      // roll메서드에 true를 줘서 값을 올림.
      cal.roll(Calendar.MONTH, true);
      // 올린값이 출력
      System.out.println("Month is " + cal.get(Calendar.MONTH));
      // false를 줘서 내림.
      cal.roll(Calendar.MONTH, false);
      // 내린 값 출력
      System.out.println("Month is " + cal.get(Calendar.MONTH));
    }
}
