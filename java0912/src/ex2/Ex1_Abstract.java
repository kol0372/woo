
package ex2;

/**
 * @author kosta
 * Document    : Ex1_Abstract created on : 2014. 9. 12, 오후 12:00:43
 */
//추상메서드를 가진 클래스는 반드시 추상 클래스여야 함.
public abstract class Ex1_Abstract {
    private String money;
    
    public Ex1_Abstract(){
        money = " 1000억원 ";
    }
    //추상메서드 : 산을 옮겨라
    abstract public void movemoney();

    //일반메서드
    public String getMoney() {
        return money;
    }
    
}
