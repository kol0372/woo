
package ex1;

/**
 * @author kosta
 * Document    : MainTest created on : 2014. 9. 11, 오전 10:33:57
 */
public class MainTest {
    //Home 먼저 생성한다.
    //일을 시키는 클래스 PaintA , B를 생성한다.
    //PaintA에서 매서드 호출해서 주황색을 전달
    //PaintB에서 메서드 호출해서 검은색을 전달
    //확인
    public static void main(String[] args) {
        Home home = new Home();
        PaintA aa = new PaintA();
        PaintB bb = new PaintB();
        //CallByReference는 인자 호출시  d객체의 주소값을 전달
        aa.painthome(home, "red"); //시공사 A
        bb.painthome(home, "black");//시공사 B 모두 같은 주소를 보고 있다.
        String res = home.getdoorcolor(); //마지막 시공한 색상 출력
        System.out.println("res" + res);
    }
    
    
}
