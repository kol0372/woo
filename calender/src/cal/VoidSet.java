
package cal;

import java.util.Calendar;

/**
 * @author kosta
 * Document    : VoidSet created on : 2014. 9. 18, 오후 5:53:04
 */
public class VoidSet {
  public static void main(String[] args) {
      
      Calendar cal = Calendar.getInstance();

      
      System.out.println("현재 년 :" + cal.getTime());

      //년, 월, 날짜, 시간, 분, 초 입력
      cal.set(1995, 5, 25, 04, 15, 20);

     
      System.out.println("바꿔준 년 :" + cal.getTime());
}
}
