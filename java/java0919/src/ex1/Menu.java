
package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author kosta
 * Document    : Menu created on : 2014. 9. 19, ���� 9:09:56
 */
public class Menu extends JFrame implements ActionListener{
    private JButton btn1,btn2,btn3;
    private JPanel p1;
    private Body body;
    
    public Menu(Body body){
        //���� �޼��忡�� �����ϱ� ���ؼ� body�� �ּҸ�
        //����ʵ忡 ����Ų��.
        this.body = body;
        p1 = new JPanel();
        p1.add(btn1 = new JButton("RED"));
        p1.add(btn2 = new JButton("BLUE"));
        p1.add(btn3 = new JButton("GREEN"));
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.blue);
        btn3.setBackground(Color.green);
        add(p1);
        setBounds(300,10, 300, 200);
        
        btn1.addActionListener(this) ;
        btn2.addActionListener(this);
        btn3.addActionListener(this);

            }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        Color col = btn.getBackground();
        
        //�޴���ü�� ������ ���޹��� body�� �ּҷ� �����ؼ�
        // body�� jpanel�� ������ �������� �����Ѵ�.
        body.getJp1().setBackground(col);
        body.getJp2().setBackground(col);
    }
   
      
    }




