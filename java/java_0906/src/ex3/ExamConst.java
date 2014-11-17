
package ex3;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.chart.PieChart;

/**
 * @author kosta
 * Document    : ExamConst created on : 2014. 9. 11, 오후 3:59:01
 */
public class ExamConst {
    private String name;
    private int age;
    private String date; //현재날짜 얻어오기

//    생성자를 사용해서 값을 초기화 하기
//    다양하게 객체를 생성할 수 있는데 이는 오버로딩으로 제공,
//    하지만 기본생성자는 없다.
    
    public ExamConst(int age) {
        this.age = age;
        name="Guest";
    }

    public ExamConst(String name) {
        this.name = name;
        age = 19;
        //익명으로 객체를 생성해서 사용하는 방법의 예
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public ExamConst(String name, int age, String date) {
        this.name = name;
        this.age = age;
        this.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
    
    //재사용이 가능하도록 설계 해보고, 모든 값은 생성자를 
    //통해서 값을 초기화 시켜 보자.
    public boolean insert(){
        if(age > 19 ){
            System.out.println(name+ "통과");
            return true;
    }else{
            System.out.println(name + "접근 금지");
            return false;
    }

    }
}
