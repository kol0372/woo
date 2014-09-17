
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
 * Document    : JFrame created on : 2014. 9. 17, 오후 1:44:32
 */
//1. Event결정
//2. Event에 따른 인터페이스 구현
//3. 구현된 추상매서드를 재정의해서 일을 정의하고
//4. Event가 적용될 대상객체에게 감지자(addXXListener(this))의 형태로 작성
//5. 이와 같은 방법을 내부클래스로 정의 가능하다.
public class Ex2_GUI extends JFrame implements ActionListener{
    private JPanel p1,p2;
    private JButton btn1,btn2,btn3;
    private JLabel lb; //글씨나오는곳
    public Ex2_GUI(){
        p1 = new JPanel();
        p2 = new JPanel();
        //p1은 상단메뉴, 버튼을 적재
        p1.add(btn1 = new JButton("A침입경고"));
        p1.add(btn2 = new JButton("B구역"));
        p1.add(btn3 = new JButton("Blue"));
        
        //EventListener를 등록
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
        //버튼의 색상을 지정
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);
       
        //JFrame 적재 - 위쪽
        add(p1,"North");
        //p2는 JLabel에 적재, 이벤트에 따른 text를 출력
        p2.add(lb = new JLabel("하트"));
        // JFrame에 적재 - 기본값(center)
        add(p2);
        //x,y,w,h
        setBounds(100, 100, 300, 400);
        //창종료(x)시 프로그램 종료(jdk5)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);//창을 활성화
    }
    public static void main(String[] args) {
        new Ex2_GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //이벤트가 발생한 컴포넌트의 주소를 받는 방법.
        Object v = e.getSource();
        JButton vv = (JButton) e.getSource();
        String msg = "";
        //핸들링
        if(v == btn1){
            msg = "A 구역";
           
        }else if(v == btn2){
            msg = "B 구역";
            
        }else if(v == btn3){
            msg = "C 구역";
        
    }
        lb.setText( msg + "에 공격 총들고 나가자.");
        p1.setBackground(vv.getBackground());
        p2.setBackground(vv.getBackground());
        
        
    }
}
/*  이것을 위에처럼 바꿈.
    public void actionPerformed(ActionEvent e) {
        //이벤트가 발생한 컴포넌트의 주소를 받는 방법.
        Object v = e.getSource();
        String msg = "";
        if(v == btn1){
            msg = "A 구역";
            p1.setBackground(Color.red);
            p2.setBackground(Color.red);
        }else if(v == btn2){
            msg = "B 구역";
            p1.setBackground(Color.green);
            p2.setBackground(Color.green);
        }else if(v == btn3){
            msg = "C 구역";
            p1.setBackground(Color.blue);
            p2.setBackground(Color.blue);
*/