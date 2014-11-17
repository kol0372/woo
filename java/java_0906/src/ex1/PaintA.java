
package ex1;

/**
 * @author kosta
 * Document    : PaintA created on : 2014. 9. 11, 오전 10:28:46
 */
public class PaintA {
    //사용자가 호출시에 home의 주소값과 생성값을 호출할 수 있도록 정의한다.
    //전달받은 home의 주소에서 setDoorcolor란 자원을 꺼내어서 가공한다.
    //사용자가 호출시 Home을 반드시 생성한 후 그 주소를 전달.
    public void painthome(Home home, String col){
        System.out.println("A회사");
        home.setdoorcolor(col);
    }
}
