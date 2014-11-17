
package inner;

import ex4.Animal2;

/**
 * @author kosta
 * Document    : MemberInner created on : 2014. 9. 15, 오후 2:05:42
 */
//내부클래스 : 특정 클래스 안에 또 다른 클래스가 정의 되는 것을 의미한다.
//종류 : 멤버, 로컬(메서드내 매서드가 소멸할때까지), 
//       static,익명 
public class MemberInner {
    private int a = 10;
    private int b;
    private int c;
    public MemberInner(){
        b=100;
        c=200;
    }
   //멤버 내부클래스를 정의
    //내부클래스로 상속을 받아서 다중상속을 가능하게 한다.
    public class inner extends Animal2{
        public void printdata(){
            System.out.println("외부클래스의 private에 접근가능" + a);
            System.out.println("외부클래스의 private에 접근가능" + b);
            System.out.println("외부클래스의 private에 접근가능" + c);
        }

        @Override
        public String col() {
            return "내부 클래스가 상속한 자원을 재정의..";
        }
    }
    //내부클래스 생성 및 접근
    public static void main(String[] args) {
        //외부 클래스를 생성한다.
        MemberInner outer = new MemberInner();
        //외부클래스의 주소를 통해서 내부클래스를 생성및 접근
        MemberInner.inner inner = outer.new inner();
        inner.printdata();
        //연습문제..축약시켜보기 위에것을 두줄로 해보자.
        MemberInner.inner inner2 = new MemberInner().new inner();
        inner2.printdata();
    }
}
