
package ex2;

/**
 * @author kosta
 * Document    : Ex1_AbstractMain created on : 2014. 9. 12, 오후 12:04:44
 */
//추상클래스의 추상메서드가 있다면 반드시 재정의해서 
//사용해야 상속받아서 추상클래스가 가지고 있는 다른 자원(여기서는 1000ㅇ억)을 
//사용할 수 있다. 즉, 추상은 요구조건의 기준이 된다.
public class Ex1_AbstractMain extends Ex1_Abstract {

    @Override
    public void moveMoney() {
        System.out.println("산 옮겼음 " + getmoney() + "받았음");
        
      
    }

}
