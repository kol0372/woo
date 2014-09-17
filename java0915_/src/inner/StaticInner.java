
package inner;

/**
 * @author kosta
 * Document    : StaticInner created on : 2014. 9. 15, 오후 3:05:43
 */
public class StaticInner {
    int a = 10;
    private int b = 100;
    static int c = 200;
    static class Inner{
        //어쩔수 없이 *내부클래스 안에서 static 자원*을 사용하게 된다면
        //이때 내부클래스는 static 내부클래스로 정의 되어야함.
        // static int d = 1000;
        public void printData(){
            //스태틱이 아닌애는 생성하고 써야해.
            // System.out.println("int a : " + a);
            //System.out.println("int b : " + b);
            System.out.println("int c: " + c);
        }
    }
     public static void main(String[] args) {
        //내부클래스를 생성후 printData()를 호출해보기
         StaticInner.Inner inner = new StaticInner.Inner();
         inner.printData();
         
    }
}
