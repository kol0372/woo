package ex1;

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
 * @author kosta Document : Ex4_Runnable created on : 2014. 9. 22, ���� 11:45:08
 */
public class Ex5_Runnable1 extends JFrame {


    private JPanel p1, p2;
    private JButton btn1;
    private JTextArea res;
    private JLabel lb;
    private static boolean inputCheck;
    
    public Ex5_Runnable1() {
        setTitle("���� ������ �׽�Ʈ");
        p1 = new JPanel();
        p1.add(btn1 = new JButton("Ŭ��"));
        p1.add(lb = new JLabel("10"));
        add(p1, "North");
        p2 = new JPanel();
        res = new JTextArea(20, 50);
        p2.add(res);
        add(p2);
        setBounds(200, 200, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //thread�� ����
                new Thread() {
                    @Override
                    public void run() {
                        String input = JOptionPane.showInputDialog("���� �Է�");
                        inputCheck = false;
                        res.append("�Է��Ͻ� ����" + input + "�Դϴ�.\n");
                        inputCheck= true;
                    }
                }.start();
                new Thread() {
                    @Override
                    public void run() {
                        for (int i = 10; i > 0; i--) {
                            try {
                                if(inputCheck){
                                    lb.setText("����");
                                    return;
                                }
                                lb.setText(String.valueOf(i));
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                        }
                        JOptionPane.showMessageDialog(Ex5_Runnable1.this, "10�� �Է��߾�� �ؿ�");
                        System.exit(0);
                    }
                }.start();
            }
        });
        
    }

    public static void main(String[] args) {
        new Ex5_Runnable1();
    }

}
