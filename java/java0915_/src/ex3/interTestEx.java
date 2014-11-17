
package ex3;

/**
 * @author kosta
 * Document    : interTestEx created on : 2014. 9. 15, 오전 11:32:03
 */
//인터페이스를 사용하는 클래스는 implements라는 키워드로 인터페이스를
//구현해서 추상메서드를 재정의해야 될 목적이 있다.
public class interTestEx implements InterFaceTest{

    @Override
    public int getA() {
        return A;
    }

    @Override
    public int getB() {
       return b; 
    }
    public static void main(String[] args) {
        interTestEx it1 = new interTestEx();
        System.out.println("A의 값 " + it1.getA());//100
        System.out.println("b의 값 " + it1.getB());//200
    }
}
