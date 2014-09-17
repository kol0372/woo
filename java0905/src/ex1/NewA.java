
package ex1;

/**
 * @author kosta
 * Document    : NewA created on : 2014. 9. 5, 오전 11:29:41
 */
public class NewA {
    public static void main(String[] args) {
        NewClass ref = new NewClass();
        ref.insertpay(1000, "dd");
        int pay = ref.getpay();
        int res = pay*1000;
        System.out.println("e당신의 급여는 : " + res + "입니다.");
        //자바를 설계할때 속성은 private을 기본으로 한다. 클래스의 정보은닉화
        //
    }

}
