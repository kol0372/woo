package ex1;

/**
 * @author kosta Document : Ex1 created on : 2014. 9. 11, ���� 9:36:04
 */
public class Ex1 {

    public static void test(int n) {
        n = n + 10; // �纻
        System.out.println("n1" + n); // n1 20
    }

    public static void main(String[] args) {
        int n =  10; // �������� - �Ϲ��ڷ��� ���� - ����
        test(n); // �޼��� ȣ��ÿ� ���ڷ� ���޽� ���� �����ؼ� �ش�.
        System.out.println("n2:"+n); // n2 10
    }

}
