package ex4;

import ex5.MultiCanvas;
import java.awt.Canvas;

/**
 * @author kosta Document : Circle1 created on : 2014. 9. 23, ¿ÀÈÄ 4:59:55
 */
public class Circle1 extends Thread {
    

    
@Override
    public void run() {
        for (ExamCanArc1.angle = 0; ExamCanArc1.angle <= 360; ExamCanArc1.angle += 10) {
            try {
                Thread.sleep(100);
                ExamCanArc1.can.repaint();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
