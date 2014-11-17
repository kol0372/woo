
package ex1;

/**
 * @author kosta
 * Document    : Ex1_Join created on : 2014. 9. 23, ���� 9:06:31
 */
//���� �����尡 ������ ����ɶ� ���� �ٸ� �����尡 ��� �ϵ��� �ϴ� �޼���
public class Ex1_Join {
    private static long startTime;
    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread1 t1 = new Ex1_Thread1();
        startTime = System.currentTimeMillis();
        t1.start();
        t1.join(); 
        // t1�� �۾��� ������ ���� �ٸ� ������� ���.
        //runnable �������̽��� ������ run�� ������ �־ start�� ȣ���� �� ����.
        
        //run ȣ���� ������Ű�°� �ƴϰ�, ������ �����̶� �����尡 �ƴ϶�� ���� �ִ�.
               
        //**�����带 �����ؼ� ���������ڿ� ���ʺ��� ������ Ŭ������ �ּҸ� �־������.**
        Ex1_Thread2 t2 = new Ex1_Thread2(); // t2�� �����尡 �ƴ϶� ���ʺ�
        Thread tt2 = new Thread(t2); //���ʺ�(t2)�� ������� ����.
        tt2.start(); //������� �߱⶧���� start ����.
        tt2.join(); //�����尣�� ������ ���� �� �� �ֵ�.
        System.out.println("�ɸ��ð� : " + (System.currentTimeMillis()-startTime));
    }

}
