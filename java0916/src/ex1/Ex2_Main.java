
package ex1;

/**
 * @author kosta
 * Document    : Ex2_Main created on : 2014. 9. 16, ���� 10:37:18
 */
public class Ex2_Main {
    Ex2_Throws et;
    public Ex2_Main(String m){
        et = new Ex2_Throws();
        try {
            et.setData(m);
        } catch (NumberFormatException e) {
            System.out.println("����� ���ڸ� �Է��߽��ϴ�. ���ڸ� ��");
            e.printStackTrace(); //�����޼��� Ȯ��
        }
        }
    public static void main(String[] args) {
        Ex2_Main ref = new Ex2_Main("3");
    }
    }

