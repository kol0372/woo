
package inner;

import ex4.Animal2;

/**
 * @author kosta
 * Document    : MemberInner created on : 2014. 9. 15, ���� 2:05:42
 */
//����Ŭ���� : Ư�� Ŭ���� �ȿ� �� �ٸ� Ŭ������ ���� �Ǵ� ���� �ǹ��Ѵ�.
//���� : ���, ����(�޼��峻 �ż��尡 �Ҹ��Ҷ�����), 
//       static,�͸� 
public class MemberInner {
    private int a = 10;
    private int b;
    private int c;
    public MemberInner(){
        b=100;
        c=200;
    }
   //��� ����Ŭ������ ����
    //����Ŭ������ ����� �޾Ƽ� ���߻���� �����ϰ� �Ѵ�.
    public class inner extends Animal2{
        public void printdata(){
            System.out.println("�ܺ�Ŭ������ private�� ���ٰ���" + a);
            System.out.println("�ܺ�Ŭ������ private�� ���ٰ���" + b);
            System.out.println("�ܺ�Ŭ������ private�� ���ٰ���" + c);
        }

        @Override
        public String col() {
            return "���� Ŭ������ ����� �ڿ��� ������..";
        }
    }
    //����Ŭ���� ���� �� ����
    public static void main(String[] args) {
        //�ܺ� Ŭ������ �����Ѵ�.
        MemberInner outer = new MemberInner();
        //�ܺ�Ŭ������ �ּҸ� ���ؼ� ����Ŭ������ ������ ����
        MemberInner.inner inner = outer.new inner();
        inner.printdata();
        //��������..�����Ѻ��� �������� ���ٷ� �غ���.
        MemberInner.inner inner2 = new MemberInner().new inner();
        inner2.printdata();
    }
}
