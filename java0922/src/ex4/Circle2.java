
package ex4;

/**
 * @author kosta
 * Document    : Circle2 created on : 2014. 9. 23, ¿ÀÈÄ 5:00:03
 */
public class Circle2 implements Runnable{

    @Override
    public void run() {
           for (ExamCanArc1.angle2 = 0; ExamCanArc1.angle2 <= 360; ExamCanArc1.angle2 += 10) {
            try {
                Thread.sleep(100);
                ExamCanArc1.can.repaint();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
