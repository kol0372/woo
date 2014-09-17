

package ex1;


public class Ex2_DataType {
    public static void main(String[] args){
        //자료형 변수명;
        //지역변수는 반드시 선언후 조기화를 해야 한다.
        //변수는 한번만 선언한다.
        boolean myb = false, num = true;
        System.out.println("boolean1 의 값 :" + myb);
        // 재사용
        //boolean myb = true;
        myb = true;
        System.out.println("boolean myb 2의 값 " + myb);
        System.out.println("boolean2 num 의 값 :" + num);
    }
}
