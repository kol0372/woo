
package inner;

/**
 * @author kosta
 * Document    : StaticInner created on : 2014. 9. 15, ���� 3:05:43
 */
public class StaticInner {
    int a = 10;
    private int b = 100;
    static int c = 200;
    static class Inner{
        //��¿�� ���� *����Ŭ���� �ȿ��� static �ڿ�*�� ����ϰ� �ȴٸ�
        //�̶� ����Ŭ������ static ����Ŭ������ ���� �Ǿ����.
        // static int d = 1000;
        public void printData(){
            //����ƽ�� �ƴѾִ� �����ϰ� �����.
            // System.out.println("int a : " + a);
            //System.out.println("int b : " + b);
            System.out.println("int c: " + c);
        }
    }
     public static void main(String[] args) {
        //����Ŭ������ ������ printData()�� ȣ���غ���
         StaticInner.Inner inner = new StaticInner.Inner();
         inner.printData();
         
    }
}
