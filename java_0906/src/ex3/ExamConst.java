
package ex3;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.chart.PieChart;

/**
 * @author kosta
 * Document    : ExamConst created on : 2014. 9. 11, ���� 3:59:01
 */
public class ExamConst {
    private String name;
    private int age;
    private String date; //���糯¥ ������

//    �����ڸ� ����ؼ� ���� �ʱ�ȭ �ϱ�
//    �پ��ϰ� ��ü�� ������ �� �ִµ� �̴� �����ε����� ����,
//    ������ �⺻�����ڴ� ����.
    
    public ExamConst(int age) {
        this.age = age;
        name="Guest";
    }

    public ExamConst(String name) {
        this.name = name;
        age = 19;
        //�͸����� ��ü�� �����ؼ� ����ϴ� ����� ��
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public ExamConst(String name, int age, String date) {
        this.name = name;
        this.age = age;
        this.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
    
    //������ �����ϵ��� ���� �غ���, ��� ���� �����ڸ� 
    //���ؼ� ���� �ʱ�ȭ ���� ����.
    public boolean insert(){
        if(age > 19 ){
            System.out.println(name+ "���");
            return true;
    }else{
            System.out.println(name + "���� ����");
            return false;
    }

    }
}
