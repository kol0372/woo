
package ex1;

/**
 * @author kosta
 * Document    : Ex2_ThreadStack created on : 2014. 9. 22, ���� 10:48:32
 */

//���ο��� ��ŸƮ ������ ������ ���ÿ��� ���� �����.
public class Ex2_ThreadStack extends Thread{

    @Override
    public void run() {
         showStack();
    }

    private void showStack() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex2_ThreadStack().start();
    }
}
