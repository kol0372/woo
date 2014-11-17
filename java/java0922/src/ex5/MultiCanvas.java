
package ex5;

/**
 * @author kosta
 * Document    : MultiCanvas created on : 2014. 9. 23, 오후 6:54:10
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiCanvas extends JFrame implements ActionListener{
    private JPanel p;
    private JButton btn;
    public Canvas can;
    private int arcNum;
    private int arcNum2;
    private Thread t1,t2;

    public Thread getT1() {//priate를 다른데서 쓰기위해 getter를 줌.
        return t1;
    }
    
    public Canvas getCan() {
        return can;
    }

    public void setCan(Canvas can) {
        this.can = can;
    }

    public int getArcNum() {
        return arcNum;
    }

    public void setArcNum(int arcNum) {
        this.arcNum = arcNum;
    }

    public int getArcNum2() {
        return arcNum2;
    }

    public void setArcNum2(int arcNum2) {
        this.arcNum2 = arcNum2;
    }

    public MultiCanvas() throws InterruptedException {
         t1 = new Thread(new MyThread1(this));
         t2 = new Thread(new MyThread2(this));
        can = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.drawArc(100, 100, 100, 100, 0, arcNum);
                g.drawArc(300, 100, 100, 100, 0, arcNum2);
            }

            @Override
            public void update(Graphics g) {
                paint(g);
            }
        };
        p=new JPanel();
        p.add(btn = new JButton("click"));
        add(can);
        setBounds(300, 100, 800, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(p,"South");
        btn.addActionListener(this);
       
        
        
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        t1.start();
      
        t2.start();
    } 
    
    public static void main(String[] args) throws InterruptedException {
        MultiCanvas ref = new MultiCanvas();
    }
}