
package ex1;

/**
 * @author kosta
 * Document    : OperTest created on : 2014. 9. 3, ���� 10:44:52
 */
public class Ex2_Oper {
    
    // && : �������� true�϶� �� �������� �����ϸ�
    // �������� false�̸� �������� �������� �ʴ´�.
    // || : �������� true�̸� �������� �������� ������
    // �������� false�� ���� �������� �����Ѵ�.
    public static void main(String[] args) {
        int f = 10;
        int g = 12;
        
        boolean h = ((f += 12) > g) || (f == (g += 2));
        System.out.println(h);
        System.out.println(f);
        System.out.println(g);
    
    }

}
