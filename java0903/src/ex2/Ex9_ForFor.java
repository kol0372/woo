
package ex2;

/**
 * @author kosta
 * Document    : Ex9_ForFor created on : 2014. 9. 3, ���� 3:51:38
 */
public class Ex9_ForFor {
    public static void main(String[] args) {
        //���� for()��
        /*for(�ʱ��; ���ǽ�; ������){
            ���๮;
            for(�ʱ��;���ǽ�;������){
                ���๮;
            }
        }
        */
        //�ʱ���� �� �ѹ� ����, ������ �����ϴ��� ���๮
        //i= 0 �ѹ� �����ϰ� , ���ǿ� �մ��ϸ� ������,
        //j= 0 �ѹ� �����ϰ� , ���ǿ� �մ��Ҷ� ���� �����ϸ鼭 ����
        //i= 1�� �����ϰ�, ������ �մ��Ҷ� ���� ����(�׾ȿ� j�� ����)
        //ū for���� �ݺ��� ������ ����for�� �׾ȿ���
        //��� �ʱ�ĺ��� ���ǽı��� �ݺ��� �ֱ������� ����
    for(int i = 1; i <= 9; i++){
        for(int j = 2; j <= 9; j++){
            System.out.print(j + "x" + i + "=" + (i*j) + "\t");
        }
        System.out.println("");
    }
    }

}