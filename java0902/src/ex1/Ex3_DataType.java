
package ex1;

public class Ex3_DataType {
     public static void main(String[] args){
         byte a = 10;
         byte b = 100;
//         demetion:ū �ڷ������� ���� �ڷ������� �����Ͱ� �̵��� ��
//         �ڷ��� �ս��� ���� �� ����(ĳ����)
//         promotion: ���� �ڷ������� ū �ڷ������� �����Ͱ� �̵��� ��
//         �ڿ������� ����
//         JVM �� int 4����Ʈ ������ ������ ���� �� �� int������ �°� ��Ŵ
//         �׷��� a + b�� ������ �̷�� �� �� int������ ���� ����� ������ �Ǳ� ������
//         �̰��� byte c�� �����ϱ� ���ؼ��� demotion�� �Ͼ.
         byte c = (byte) (a + b);
 
         System.out.println("c ="+c);
         
         int d = a + b;
         System.out.println("d =" +d);
         // JDK 7���� �����ϴ� �ڸ��� ǥ��, _�� �����Ѵ�.
         int e = 123_123;
         System.out.println("e =" +e);
         //long
         long myL = a + b;
         int f = (int) myL;
         //���� 
         
     }
}
