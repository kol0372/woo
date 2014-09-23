
package ex5;

import java.awt.Canvas;

public class MyThread1 extends Thread{

    private MultiCanvas myCan;

    public MyThread1(MultiCanvas myCan) {
        this.myCan = myCan;
    }

    @Override
    public void run() {
        
        while (myCan.getArcNum() <= 380) {
            System.out.println("첫번째 스레드 동작중" + myCan.getArcNum() + " " + Thread.currentThread().getName());
            System.out.println("arcNum2" + myCan.getArcNum2());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                System.out.println("발생");
            }
            int tmpN = myCan.getArcNum();
            tmpN += tmpN + 10;
            myCan.setArcNum(tmpN);
            myCan.getCan().repaint();
        }
    }
}