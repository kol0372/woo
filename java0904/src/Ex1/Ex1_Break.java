
package Ex1;

/**
 * @author kosta
 * Document    : Ex1_Break created on : 2014. 9. 4, ���� 10:10:49
 */
public class Ex1_Break {
    public static void main(String[] args) {
//        Ư�� ������ ���߸� �ݺ����� Ż���ϴ� ���
//        break label�� : jdk5���� ���� break�� ���� �ٿ���
//        ���� �ִ� ������ Ż��
        aa: for(int i=1; i<3; i++)
        {
            for(int j = 0; j <5; j ++)
            {
                if(j == 3) break aa;
                System.out.println(i + ":" + j);
            }
        }
    }

}
