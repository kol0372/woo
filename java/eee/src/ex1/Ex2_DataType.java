package ex1;

public class Ex2_DataType {
    public static void main(String[] args) {
        // 자료형 변수명; => 변수 선언
        // 지역변수는 반드시 선언후 초기화를 해야 한다.
        boolean myb = false, num = true; 
        System.out.println("Boolean 1의 값 :"+myb);
        // 재사용 
        //boolean myb = true;
        myb=true;
        System.out.println("Boolean myb 2의 값 :"+myb);
        System.out.println("Boolean num 의 값 :"+num);
    }
}
