package ex1;

/**
 * @author kosta Document : Ex1 created on : 2014. 9. 11, 오전 9:36:04
 */
public class Ex1 {

    public static void test(int n) {
        n = n + 10; // 사본
        System.out.println("n1" + n); // n1 20
    }

    public static void main(String[] args) {
        int n =  10; // 지역변수 - 일반자료형 변수 - 원본
        test(n); // 메서드 호출시에 인자로 전달시 값을 복사해서 준다.
        System.out.println("n2:"+n); // n2 10
    }

}
