package ex1;
/**
 * @author kosta 
 * Document   : Ex3_DataType Created on : 2014. 9. 2, ���� 11:28:19
 */
public class Ex3_DataType {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // demotion : ū �ڷ������� ���� �ڷ������� �����Ͱ� �̵��� �� 
        // �ڷ��� �ս��� ���� �� ����( ĳ���� )
        // promotion : ���� �ڷ������� ū �ڷ������� �����Ͱ� �̵��� �� 
        // �ڿ������� ���� 
        // JVM�� int 4����Ʈ ������ ������ ���� �� �� int������ �°� ��Ŵ
        // �׷��� a + b�� ������ �̷�� �� �� int������ ���� ����� ������ �Ǳ� ������
        // �̰��� byte c�� �����ϱ� ���ؼ��� demotion�� �Ͼ. 
        byte c = (byte) (a + b);
        System.out.println("C :"+c);
        int d = a + b;
        System.out.println("D :"+d);
        // JDK 7���� �����ϴ� �ڸ��� ǥ��, _�� �����Ѵ�.
        int e = 123_123;
        System.out.println(e);
        // long 
        long myL = a+b;
        int f = (int) myL;
    }
}
