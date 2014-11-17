/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

/**
 *
 * @author oem-s
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GetTimeInMilis {
    //1000분의 1초를 나타낸다

    public static void main(String[] args) {

        // 두 날짜 간 차이 계산
        //GregorianCalendar은 가장정확한 날짜, 시간을 계산 할 수 있음
        Calendar calendar = new GregorianCalendar();

        //기준날짜 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.print("기준년도: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("기준달: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.print("기준일: ");
        int day = Integer.parseInt(sc.nextLine());
        //입력받은 날짜로 캔린더 set
        calendar.set(year, month, day);
        System.out.println("기준 연도내주의수 " + calendar.getWeeksInWeekYear());
        // 시간 정보를 밀리세컨드로 변환하여 oriday에 저장 
        long oriday = calendar.getTimeInMillis();

        // 비교날짜 입력받음
        System.out.print("비교년도: ");
        int year1 = Integer.parseInt(sc.nextLine());
        System.out.print("비교달: ");
        int month1 = Integer.parseInt(sc.nextLine());
        System.out.print("비교일: ");
        int day1 = Integer.parseInt(sc.nextLine());
        //입력받은 날짜로 캔린더 set
        calendar.set(year1, month1, day1);

        // 시간 정보를 밀리세컨드로 변환하여 comday에 저장 
        long comday = calendar.getTimeInMillis();

        // 두 날짜 차이 계산 
        // 현재 값이 밀리세컨드이므로 이를 하루로 변경하기 위해서 
        // 24 * 60 * 60 * 1000을 곱해줌 (하루의 시간 * 분 * 초 * 밀리초) 
        long d = (oriday - comday) / (24 * 60 * 60 * 1000);
        
        System.out.println("비교 연도내주의수 " + calendar.getWeeksInWeekYear());
        System.out.println("두 날짜의 차이 날짜 : " + d);
    }
}
