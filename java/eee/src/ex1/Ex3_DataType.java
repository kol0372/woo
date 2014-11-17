package ex1;
/**
 * @author kosta 
 * Document   : Ex3_DataType Created on : 2014. 9. 2, 오전 11:28:19
 */
public class Ex3_DataType {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // demotion : 큰 자료형에서 작은 자료형으로 데이터가 이동될 때 
        // 자료의 손실이 있을 수 있음( 캐스팅 )
        // promotion : 작은 자료형에서 큰 자료형으로 데이터가 이동될 때 
        // 자연스러운 현상 
        // JVM은 int 4바이트 이하의 연산을 수행 할 때 int형으로 승격 시킴
        // 그래서 a + b가 연산이 이루어 질 때 int공간에 연산 결과가 저장이 되기 때문에
        // 이것을 byte c에 저장하기 위해서는 demotion이 일어남. 
        byte c = (byte) (a + b);
        System.out.println("C :"+c);
        int d = a + b;
        System.out.println("D :"+d);
        // JDK 7부터 제공하는 자리수 표기, _를 무시한다.
        int e = 123_123;
        System.out.println(e);
        // long 
        long myL = a+b;
        int f = (int) myL;
    }
}
