
package ex1;

/**
 * @author kosta
 * Document    : D_carPhone created on : 2014. 9. 12, 오전 9:45:35
 */

//상속은 컴파일 단계에서 부모클래스인 Ex1_Super와 결합된다.
//자바에서 상속은 단일 상속이다.
public class D_carPhone extends Ex1_Super{
    private String pixel;//화소수
    public D_carPhone(String model, String number, int chord, String pixel){
        this.pixel=pixel;
        //부모의 자원을 참조하기 위해서 super란 키워드 사용.
        super.model=model;
       //부모의 자원이라해도 private은 접근 불가
        //부모클래스에 정의된 메서드도 자신의 자원처럼 호출가능
        setNumber(number);
        // this.chord=chord; 만약 자식에 private int chord;가 있으면 
        // 자식꺼를 받기때문에 부모꺼받을려면 super 써야함.
        super.chord=chord;
        
        //연습문제 MP3Phone 클래스를 만들어서  Ex1_Super를 상속받고
        //멤버필드에는 int size //저장용량
        //하나 두고 위와같이 초기화 시키시오.
        //즉 , Ex1_Super는 자식 클래스에 재사용되는 부모 클래스로 설계 되었다. 
        
    }

    public String getPixel() {
        return pixel;
    }
}
