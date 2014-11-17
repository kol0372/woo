
package ex1;

/**
 * @author kosta
 * Document    : Ex3_Oper created on : 2014. 9. 3, 오전 11:02:03
 */
public class Ex3_Oper {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++); //후치 10출력, 10에서 1더해 11로
        System.out.println(++a); //전치 11에 1더해 12출력
        // 1씩 증가, 감소 하는 연산자, ++, --가 
        // 변수 앞에 있는지, 뒤에 있는지가 중요.
        int b = 20;
        System.out.println(b--);
        System.out.println(--b);
    }
}
