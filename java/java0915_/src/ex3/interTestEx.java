
package ex3;

/**
 * @author kosta
 * Document    : interTestEx created on : 2014. 9. 15, ���� 11:32:03
 */
//�������̽��� ����ϴ� Ŭ������ implements��� Ű����� �������̽���
//�����ؼ� �߻�޼��带 �������ؾ� �� ������ �ִ�.
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
        System.out.println("A�� �� " + it1.getA());//100
        System.out.println("b�� �� " + it1.getB());//200
    }
}
