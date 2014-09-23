package ex4;

import ex2.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author 오세현 Document : ExamCanvasArc Created on : 2014. 9. 22, 오후 3:41:03
 */
//버튼을 클릭햇을 때 원하나 그리고, 다음 원하나 그려보자
//join응용
public class ExamCanArc1 extends JFrame {

    public static int angle, angle2;
    private JPanel p1;
    private JButton btn1;
    public static Canvas can;


    

    public ExamCanArc1() {
        setTitle("쓰레드와 캔버스");
        p1 = new JPanel();
        p1.add(btn1 = new JButton("Click"));
        add(p1, "North");
        setBounds(200, 200, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(can = new Canvas() {

            @Override
            public void update(Graphics g) {
                paint(g);
            }

            @Override
            public void paint(Graphics g) {
                g.setColor(Color.red);
                g.drawArc(100, 100, 100, 100, 0, angle);
                g.setColor(Color.blue);
                g.drawArc(300, 100, 100, 100, 0, angle2);
            }

        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circle1 cc = new Circle1();
                cc.start();               
                Circle2 ccc = new Circle2();
                Thread th = new Thread(ccc);
                th.start();
            }
        });
    }

    public static void main(String[] args) {
        new ExamCanArc1();
    }
}
