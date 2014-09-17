
package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author kosta
 * Document    : JFrame created on : 2014. 9. 17, ���� 1:44:32
 */
//1. Event����
//2. Event�� ���� �������̽� ����
//3. ������ �߻�ż��带 �������ؼ� ���� �����ϰ�
//4. Event�� ����� ���ü���� ������(addXXListener(this))�� ���·� �ۼ�
//5. �̿� ���� ����� ����Ŭ������ ���� �����ϴ�.
public class Ex2_GUI extends JFrame implements ActionListener{
    private JPanel p1,p2;
    private JButton btn1,btn2,btn3;
    private JLabel lb; //�۾������°�
    public Ex2_GUI(){
        p1 = new JPanel();
        p2 = new JPanel();
        //p1�� ��ܸ޴�, ��ư�� ����
        p1.add(btn1 = new JButton("Aħ�԰��"));
        p1.add(btn2 = new JButton("B����"));
        p1.add(btn3 = new JButton("Blue"));
        
        //EventListener�� ���
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
        //��ư�� ������ ����
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);
       
        //JFrame ���� - ����
        add(p1,"North");
        //p2�� JLabel�� ����, �̺�Ʈ�� ���� text�� ���
        p2.add(lb = new JLabel("��Ʈ"));
        // JFrame�� ���� - �⺻��(center)
        add(p2);
        //x,y,w,h
        setBounds(100, 100, 300, 400);
        //â����(x)�� ���α׷� ����(jdk5)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);//â�� Ȱ��ȭ
    }
    public static void main(String[] args) {
        new Ex2_GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //�̺�Ʈ�� �߻��� ������Ʈ�� �ּҸ� �޴� ���.
        Object v = e.getSource();
        JButton vv = (JButton) e.getSource();
        String msg = "";
        //�ڵ鸵
        if(v == btn1){
            msg = "A ����";
           
        }else if(v == btn2){
            msg = "B ����";
            
        }else if(v == btn3){
            msg = "C ����";
        
    }
        lb.setText( msg + "�� ���� �ѵ�� ������.");
        p1.setBackground(vv.getBackground());
        p2.setBackground(vv.getBackground());
        
        
    }
}
/*  �̰��� ����ó�� �ٲ�.
    public void actionPerformed(ActionEvent e) {
        //�̺�Ʈ�� �߻��� ������Ʈ�� �ּҸ� �޴� ���.
        Object v = e.getSource();
        String msg = "";
        if(v == btn1){
            msg = "A ����";
            p1.setBackground(Color.red);
            p2.setBackground(Color.red);
        }else if(v == btn2){
            msg = "B ����";
            p1.setBackground(Color.green);
            p2.setBackground(Color.green);
        }else if(v == btn3){
            msg = "C ����";
            p1.setBackground(Color.blue);
            p2.setBackground(Color.blue);
*/