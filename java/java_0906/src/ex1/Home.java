
package ex1;

/**
 * @author kosta
 * Document    : Home created on : 2014. 9. 11, 오전 10:17:38
 */

//클래스 이름 : Home
//개체 : home 
//속성 : door color->자료형 string
//접근제한자: private 
//값을 넣기위한 setter, getter : setter는 반환값 필요없다.

public class Home {
    private String Doorcolor;//대문의 색상 : 정보를 은닉화
    
    //setter와 getter를 사용 캡슐화
    public String getdoorcolor(){//대문색을 확인하도록 제공
        return Doorcolor;
    }
    public void setdoorcolor(String doorc){//대문색을 지정하도록 제공
        Doorcolor = doorc;
        
    }
}
