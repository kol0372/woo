
package ex1;

/**
 * @author kosta
 * Document    : NewA created on : 2014. 9. 5, ���� 11:29:41
 */
public class NewA {
    public static void main(String[] args) {
        NewClass ref = new NewClass();
        ref.insertpay(1000, "dd");
        int pay = ref.getpay();
        int res = pay*1000;
        System.out.println("e����� �޿��� : " + res + "�Դϴ�.");
        //�ڹٸ� �����Ҷ� �Ӽ��� private�� �⺻���� �Ѵ�. Ŭ������ ��������ȭ
        //
    }

}
