
package exam;

/**
 * @author kosta
 * Document    : Bird created on : 2014. 9. 15, 오후 12:18:01
 */
//하나의 클래스는 상속을 받을 수 있으며, 여러개의 인터페이스를 구현!
public class Bird implements AnimalInter{

    @Override
    public void cry(String msg) {
        System.out.println(msg);
    }



}
