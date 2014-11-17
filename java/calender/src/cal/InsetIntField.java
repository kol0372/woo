
package cal;

import java.util.Calendar;

/**
 * @author kosta
 * Document    : InsetIntField created on : 2014. 9. 18, 오전 8:55:33
 */
public class InsetIntField {
    public static void main(String[] args) {
        
      
      Calendar cal = Calendar.getInstance();
      System.out.println("Current Day is " + cal.get(Calendar.DAY_OF_MONTH));
      boolean b = cal.isSet(Calendar.DAY_OF_MONTH);
      System.out.println("Day of month is set: " + b); //값이 있으니까 true
      //초기화
      cal.clear(Calendar.DAY_OF_MONTH);
      b = cal.isSet(Calendar.DAY_OF_MONTH);
      System.out.println("Day of month is set: " + b); //값이 없어서 false
   }
}


