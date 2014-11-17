
package ex3;

/**
 * @author kosta
 * Document    : Ex_Construtor created on : 2014. 9. 11, 오후 3:47:16
 */
public class Ex_Construtor {
//    컴파일단계 -> jvm실행
//    개발자가 생성자를 따로 정의 해두지 않으면 컴파일러가 
//    기본생성자를 정의해둔다.
//    생성자는 클래스명과 같고 반환형이 없다.
//    목적 : 현재클래스를 초기화 시키는 것이 목적이다.
    
    //기본생성자 만들기.
//    public Ex_Construtor(){
//        
//    }
    
    private String msg;
//    멤버의 자원을 초기화 하는 목적
//    인자값이 있는 생성자
//    ****개발자가 인자가 있는 생성자를 하나라도 정의를 해놓으면, 컴파일러는 기본생성자를
//    따로 만들어지지 않는다.*****
//    자바에서는 setter랑 생성자를 통해 값을 주입할 수 있다.
    public Ex_Construtor(String msg){
        this.msg = msg;
    }
    
    public static void main(String[] args) {
        //클래스를 객체로 생성
        Ex_Construtor ref = new Ex_Construtor("하이"); //생성
        ref.test(); //메서드를 호출
    }
    private void test(){
        System.out.println("테스트!!");
    }
}

