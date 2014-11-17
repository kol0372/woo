
package ex1;

/**
 * @author kosta
 * Document    : Ex2_ThreadStack created on : 2014. 9. 22, 오전 10:48:32
 */

//메인에서 스타트 생성후 별도의 스택에서 런이 실행됨.
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
