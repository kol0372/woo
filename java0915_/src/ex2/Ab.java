
package ex2;

/**
 * @author kosta
 * Document    : Ab created on : 2014. 9. 15, ���� 10:17:46
 */
public class Ab {
    public static void main(String[] args) {
        //�߻� Ŭ������ new�� ������ �� ����.
        //������ �ƴϰ� ���ó���Ŭ���� 
        SuperA su = new SuperA() {

            @Override
            public void draw(String msg) {
                System.out.println("��;" + msg);
            }
        };
        
        
        
        SuperA[] ar = new SuperA[2];
        ar[0] = new A();
        ar[1] = new B();
        String[] msg = {"�簢", "����"};
        int i = 0;
        for(SuperA e : ar){
            e.draw(msg[i]);
            su.draw(msg[i]);
            i++;
        }
        
        
    }
}
