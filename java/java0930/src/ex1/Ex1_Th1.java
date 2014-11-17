package ex1;
/**
 *
 * @author kosta
 * Document : Ex1_Th1 Created on : ±èÇöÃ¶ 2014. 9. 29, ¿ÀÈÄ 8:14:43
 */
public class Ex1_Th1 extends Thread{

    @Override
    public void run() {
        System.out.println("Thread!");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        Ex1_Th1 r = new Ex1_Th1();
        r.run();
        System.out.println("Main End");
    }
}
