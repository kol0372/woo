
package ex1;

/**
 * @author kosta
 * Document    : Ex3_Sub created on : 2014. 9. 12, ���� 10:44:43
 */
public class Ex3_Sub extends Ex3_Super{
    private String age;
    
    public Ex3_Sub(String age, String msg, int num){
        super(num, msg);//super�� �׻� �������� ȣ��Ǿ�� ��.
        this.age=age;
    }
    public void subMethod(){
        System.out.println("����� �ڽ��� �޼��� �Դϴ�.");
    }

    //������̼� : ���� ������ �ּ�/ ���⼭�� JVM�� Override��� �ν��ϴ� Ű����
    @Override
    public void Supercar() {
        System.out.println("������ �ڵ���!");
    }
    //������(�θ�Ŭ������ �ִ� �޼��带 ���ļ� ���°�, �켱������ �ڽ����� �ִ�.)
    //��ӿ��� ��ü���� ����� �ڽ�����, �θ����� �ΰ��� �ִµ� 
    //
}
