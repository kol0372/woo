
package ex1;

/**
 * @author kosta
 * Document    : Ex3_Sub created on : 2014. 9. 12, 오전 10:44:43
 */
public class Ex3_Sub extends Ex3_Super{
    private String age;
    
    public Ex3_Sub(String age, String msg, int num){
        super(num, msg);//super는 항상 상위에서 호출되어야 함.
        this.age=age;
    }
    public void subMethod(){
        System.out.println("여기는 자식의 메서드 입니다.");
    }

    //어노테이션 : 실행 가능한 주석/ 여기서는 JVM이 Override라고 인식하는 키워드
    @Override
    public void Supercar() {
        System.out.println("나만의 자동차!");
    }
    //재정의(부모클래스에 있는 메서드를 고쳐서 쓰는것, 우선순위가 자식한테 있다.)
    //상속에서 객체생성 방법이 자식참조, 부모참조 두가지 있는데 
    //
}
