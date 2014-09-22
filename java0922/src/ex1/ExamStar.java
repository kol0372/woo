package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : ExamStar created on : 2014. 9. 22, ¿ÀÀü 11:07:58
 */
public class ExamStar extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if (i % 2 == 0) {
                System.out.println("*");
            } else {
                System.out.println("¤±");
            }
        }
    }
    public static void main(String[] args) {
        new ExamStar().start();
    }
}
