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
public class HashCode {
     public static void main(String[] args) {

      
      Calendar cal = Calendar.getInstance();

      
      System.out.println("현재 달력 출력: " + cal.getTime());

      
      int i = cal.hashCode();
      System.out.println("이달력의 hash code는: " + i);
   }
}
   

