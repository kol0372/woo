
package ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : ExamException created on : 2014. 9. 16, ���� 9:46:26
 */
public class ExamException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�� �Է�"); 
        try {
            int num = Integer.parseInt(sc.nextLine());//���� �ƴ϶� �����Է��Ҷ� ����(NumberFomatException)
             int com = (int)(Math.random()*3); //math.random�� 0<= �� <1�� ��random���� �������� 
                                              //�׷��� 0<��<2�� ����
             int res = num/com; //ArithmeticException(0���� �������� �Ҷ�)
               System.out.println("��µ� ��� : " + res);
               System.out.println("�ڿ��ݳ�!");
        } catch (NumberFormatException e) {
            System.out.println("���ڸ� ��");
            return;//try�� ������.
        }catch (ArithmeticException e){
            System.out.println("0���� ���� �� ����.");
        }catch (Exception e){
            //���� ���ܰ�ü�� �׻� �Ʒ��� �;��Ѵ� **
            //������ �������ܸ� ����ó�� �ϸ� �������ܴ� �ǹ̸� �Ҿ
            System.out.println("������ ������ ���⼭.");
        }finally{
        System.out.println("������ ����Ǹ� �ڿ��� �ݳ�."); //������ ����Ǵ� ����.
    }
        System.out.println("���α׷��� �ֿ����");
    }

}
