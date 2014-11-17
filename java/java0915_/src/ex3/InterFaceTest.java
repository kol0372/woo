
package ex3;


public interface InterFaceTest {
    //interface 설계: 인터페이스는 메뉴판처럼 상수와 추상메서드
    //인터페이스의 구성은 상수와 추상메서드
    public static final int A = 100; //상수
    public int b =200;//변수가 아닌 상수 
    public abstract int getA(); //추상메서드
    public int getB(); //abstract 안써도 추상메서드로 인식
    
}
