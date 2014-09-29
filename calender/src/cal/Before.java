
package cal;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author kosta
 * Document    : Before created on : 2014. 9. 19, 오전 8:53:06
 */
public class Before {
    
    public static void main(String[] args) {
        
CalendarDemo cal = new CalendarDemo();

// 현재Date 출력

System.out.println("The current date is : " + cal.getTime());

// 초기화

cal.clear();

// 새로운 연도를 설정하고 연도필드값을 현재 시간으로 지정

cal.set(GregorianCalendar.YEAR, 1998);

cal.computeFields();

System.out.println("New date is : " + cal.getTime());
}
}
