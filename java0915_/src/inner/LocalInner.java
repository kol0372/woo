
package inner;

/**
 * @author kosta
 * Document    : LocalInner created on : 2014. 9. 15, 오후 2:44:46
 */
//로컬내부클래스 : 특정 메서드 안에서 정의되는 클래스.
//지역변수와 같은 개념이라서 메서드가 호출 될 ? 객체가 생성될 수 있고
//메서드의 수행이 끝나면 지역변수와 같이 자동으로 소멸됨!
public class LocalInner {
    private int a =100; //멤버변수
    public void myMethod(int n){
        int b = 200; //메서드 내의 지역변수
        final int c = 300;//상수
        //local내부클라스
        class Inner{
            public void getData(){
                //외부클래스의 자원 접근
                System.out.println("int a : " + a);
                //지역변수는 접근 못함(jdk8 부터 지원, jdk5, 6, 7은 안됨)
                //5~7까지는 반드시 지역변수를 상수로 변경해야함.
                System.out.println("local int b" + n);
            }
        }
        Inner i = new Inner();
        i.getData();
    }
    public static void main(String[] args) {
        LocalInner outer = new LocalInner();
         outer.myMethod(10);
    }
}
