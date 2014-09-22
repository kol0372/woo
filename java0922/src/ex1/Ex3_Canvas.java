package ex1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 * @author Soo Document : Ex3_Canvas Created on : 2014. 9. 22, ?��?? 2:45:29
 */
public class Ex3_Canvas extends JFrame {

    private Canvas can;
    private int x, y;

    public Ex3_Canvas() {
        add(can = new Canvas() {
            // �׸��� �׸��� ���� �׷����� ��ҿ� �׷��ִ� ����
            
            
            @Override
            public void update(Graphics g) {
                paint(g);
            }

            @Override
            public void paint(Graphics g) {
                //���׷�����
                g.setColor(Color.pink);
                g.fillOval(x, y, 50, 50);
                g.setColor(Color.red);
                g.drawArc(200, 100, 100, 100, 0, 90); //������
            }
        });
        can.setBackground(Color.white);
        can.addMouseMotionListener(new MouseMotionAdapter() {
            // adapter ����ϸ� �߻�Ŭ�����̱� ������
            // empty�޼��� ���� �س��� �̰��� ���, �͸���Ŭ����
            // �� ������ �����Ϸ� ����ڰ� �ʿ��� �͸� ������ ����.
            @Override
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                System.out.println(x + ":" + y);
                //paint�� JVM�� ȣ�� - �׷��� ����� ����
                //repaint()�� ȣ��
                //����) repaint() -> JVM -> update() -> paint();
                //update(): ������ ĵ������ �����ִ� ����
                can.repaint();
            }

        });
        setBounds(100, 100, 400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex3_Canvas();
    }
}
// 
