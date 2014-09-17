
package ex1;

/**
 * @author kosta
 * Document    : OperTest created on : 2014. 9. 3, 오전 10:44:52
 */
public class Ex2_Oper {
    
    // && : 선조건이 true일때 만 후조건을 실행하며
    // 선조건이 false이면 후조건은 실행하지 않는다.
    // || : 선조건이 true이면 후조건을 실행하지 않으며
    // 선조건이 false일 때만 후조건을 실행한다.
    public static void main(String[] args) {
        int f = 10;
        int g = 12;
        
        boolean h = ((f += 12) > g) || (f == (g += 2));
        System.out.println(h);
        System.out.println(f);
        System.out.println(g);
    
    }

}
