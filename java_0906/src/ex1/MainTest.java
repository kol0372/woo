
package ex1;

/**
 * @author kosta
 * Document    : MainTest created on : 2014. 9. 11, ���� 10:33:57
 */
public class MainTest {
    //Home ���� �����Ѵ�.
    //���� ��Ű�� Ŭ���� PaintA , B�� �����Ѵ�.
    //PaintA���� �ż��� ȣ���ؼ� ��Ȳ���� ����
    //PaintB���� �޼��� ȣ���ؼ� �������� ����
    //Ȯ��
    public static void main(String[] args) {
        Home home = new Home();
        PaintA aa = new PaintA();
        PaintB bb = new PaintB();
        //CallByReference�� ���� ȣ���  d��ü�� �ּҰ��� ����
        aa.painthome(home, "red"); //�ð��� A
        bb.painthome(home, "black");//�ð��� B ��� ���� �ּҸ� ���� �ִ�.
        String res = home.getdoorcolor(); //������ �ð��� ���� ���
        System.out.println("res" + res);
    }
    
    
}
