
package ex2;

/**
 * @author kosta
 * Document    : Ex1_Abstract created on : 2014. 9. 12, ���� 12:00:43
 */
//�߻�޼��带 ���� Ŭ������ �ݵ�� �߻� Ŭ�������� ��.
public abstract class Ex1_Abstract {
    private String money;
    
    public Ex1_Abstract(){
        money = " 1000��� ";
    }
    //�߻�޼��� : ���� �Űܶ�
    abstract public void movemoney();

    //�Ϲݸ޼���
    public String getMoney() {
        return money;
    }
    
}
