package ex1;

/**
 * @author kosta Document : Test created on : 2014. 9. 11, ���� 9:47:15
 */
public class Ex1_CallByValue {
    //static ��������
    public void test(int n) {
        n = n+10;
        System.out.println("n1 : " + n);
        //ȣ��Ǿ� ����ó�� �� �� ���ÿ��� ������
    } 
    public static void main(String[] args) {
       
        int n = 10;
        Ex1_CallByValue ref = new Ex1_CallByValue();
        //test�޼��尡 static������ ������ �ȵǾ� �����Ƿ�
        //test�޼��尡 ���� Ŭ���� Ex1_CallByValue ��ü�� �����ؼ� ����Ѵ�.
        ref.test(n);
        System.out.println("n2 : " + n);

    }
}
