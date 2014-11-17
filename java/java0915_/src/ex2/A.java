
package ex2;

/**
 * @author kosta
 * Document    : A created on : 2014. 9. 15, 오전 10:11:32
 */

//추상클래스를 상속받으면 그 추상클래스가 가지고 있는
//추상 메서드를 구현해야될 목적이 있다.
public class A extends SuperA{

    @Override
    public void draw(String msg) {
        System.out.println(msg + " 를 그립니다.");
    }

}
