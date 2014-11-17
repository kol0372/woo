/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author oem-s
 */
public class GetTimeZone {

    public static void main(String[] args) {
        //원하는 나라의 시간을 출력해보자.
        //캘린더 생성
        Calendar calendar = new GregorianCalendar();
        //나라 받기
        System.out.print("나라써 <ex) America/New_York , Asia/Hong_Kong , Europe/Paris>  : ");
        Scanner sc = new Scanner(System.in);
        String cn = new String(sc.nextLine());
        //캘린더에 시간을 다시조정해 주기위해 해당나라의 timezone을 intimezone에 설정
        TimeZone intimeZone = TimeZone.getTimeZone(cn);
        //시간 셋팅
        calendar.setTimeZone(intimeZone);
        printTime(cn, (GregorianCalendar) Calendar.getInstance(intimeZone));

    }

    static void printTime(String country, GregorianCalendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);// 월이 한달전으로 됨...프린트에서 +1
        //  System.out.println(month); 8
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int min = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);

        System.out.println(country + "의 시간은");
        System.out.println(year + "년" + (month + 1) + "월" + date + "일");
        System.out.print(hour + "시" + min + "분" + sec + "초");

    }

}
