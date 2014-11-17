
package ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : ExamException created on : 2014. 9. 16, 오전 9:46:26
 */
public class ExamException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수 입력"); 
        try {
            int num = Integer.parseInt(sc.nextLine());//수가 아니라 문자입력할때 오류(NumberFomatException)
             int com = (int)(Math.random()*3); //math.random이 0<= 값 <1의 값random으로 나오게함 
                                              //그래서 0<값<2만 나와
             int res = num/com; //ArithmeticException(0으로 나눌려고 할때)
               System.out.println("출력된 결과 : " + res);
               System.out.println("자연반납!");
        } catch (NumberFormatException e) {
            System.out.println("숫자만 줘");
            return;//try문 끝내라.
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없다.");
        }catch (Exception e){
            //상위 예외객체가 항상 아래에 와야한다 **
            //이유는 상위예외를 먼저처리 하면 하위예외는 의미를 잃어서
            System.out.println("나머지 에러는 여기서.");
        }finally{
        System.out.println("무조건 실행되며 자원을 반납."); //무조건 실행되는 개념.
    }
        System.out.println("프로그램의 주요로직");
    }

}
