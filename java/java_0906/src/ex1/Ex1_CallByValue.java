package ex1;

/**
 * @author kosta Document : Test created on : 2014. 9. 11, 오전 9:47:15
 */
public class Ex1_CallByValue {
    //static 지워보기
    public void test(int n) {
        n = n+10;
        System.out.println("n1 : " + n);
        //호출되어 연산처리 한 후 스택에서 지워짐
    } 
    public static void main(String[] args) {
       
        int n = 10;
        Ex1_CallByValue ref = new Ex1_CallByValue();
        //test메서드가 static영역에 생성이 안되어 있으므로
        //test메서드가 속한 클래스 Ex1_CallByValue 객체를 생성해서 사용한다.
        ref.test(n);
        System.out.println("n2 : " + n);

    }
}
