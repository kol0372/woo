/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author oem-s
 */
public class GetWeekYear {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
       
        System.out.println(calendar.getWeekYear());
    }

}
