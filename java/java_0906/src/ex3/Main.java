
package ex3;

/**
 * @author kosta
 * Document    : Main created on : 2014. 9. 11, ���� 4:17:51
 */
public class Main {
    public static void main(String[] args) {
        ExamConst ref = new ExamConst("��浿");
        if(ref.insert()){
            System.out.println("���θ� ����.");
        }
        ExamConst ref1 = new ExamConst(20);
        if(!ref1.insert()){
            System.out.println("����� ���θ� ����.");
        }else{                      
            System.out.println("��÷");
        }
    }
}
