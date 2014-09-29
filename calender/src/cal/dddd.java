
package cal;

import java.util.GregorianCalendar;

/**
 * @author kosta
 * Document    : dddd created on : 2014. 9. 19, 오전 9:04:35
 */


public class dddd extends GregorianCalendar {

   public static void main(String[] args) {

      // create a new calendar
      CalendarDemo cal = new CalendarDemo();

      // print the current date
      System.out.println("The current date is : " + cal.getTime());

      // clear the calendar
      cal.clear();

      // set a new year and call computeFields()
      cal.set(GregorianCalendar.YEAR, 1998);
      cal.computeFields();

      // print the current date
      System.out.println("New date is : " + cal.getTime());

   }
}
