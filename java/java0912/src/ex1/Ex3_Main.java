
package ex1;

/**
 * @author kosta
 * Document    : Ex3_Main created on : 2014. 9. 12, ���� 10:51:20
 */
public class Ex3_Main {
    public static void main(String[] args) {
        //�ڽ��� �����ؼ� ��ü�� �����ϴ� ���
        Ex3_Sub ref1 = new Ex3_Sub("25��", "��츮", 3000);
        ref1.subMethod();
        System.out.println(ref1.superMethod());
        ref1.Supercar();//�ڽ��� supercar ȣ���̵�
        System.out.println("==============");
        //�θ� �����ؼ� ��ü�� �����ϴ� ���
        Ex3_Super ref2 = new Ex3_Sub("35��", "����", 200);
        ref2.superMethod();
        System.out.println(ref2.superMethod());
        
        //����ߴ����� �ڽ��� �ڵ���.
    }
}
