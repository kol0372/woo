/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import java.util.Calendar;

/**
 *
 * @author oem-s
 */
public class IsLenient {
    public static void main(String[] args) {
        
    
         // 달력생성
      Calendar cal = Calendar.getInstance();

      // 현재달력 출력
      System.out.println("현재날짜 " + cal.getTime());

      // 
      boolean b = cal.isLenient();
      System.out.println("lenient: " + b);
   }
}

