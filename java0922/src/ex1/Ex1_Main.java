
package ex1;

/**
 * @author kosta
 * Document    : Ex1_Main created on : 2014. 9. 22, ���� 10:34:43
 */

//�������� �����ֱⰡ �־ ������� �ٽ� ���� �� ����.
//�ϳ��� �����忡 �ϳ��� start()�� ȣ��
public class Ex1_Main {
    public static void main(String[] args) {
        System.out.println("���� �޼��� ���� ����!");
        Ex1_MyThread t1 = new Ex1_MyThread(); // 1��, 1��
       
       //Ex1_MyThread�� �ִ� run()�޼��带 
        //�ϳ��� ���ÿ��� ȣ���Ѱͻ�.
        // t1.run(); 2��
        //----------------
        //�ü���� �����췯�� ���� ��û�ϱ� ������ 
        //���� ��� ������� ��.
        t1.start(); //����
        t1 = new Ex1_MyThread();
        t1.start(); //������ ���� ���� : �������� �����ֱⰡ �־ ������� �ٽ� ���� �� ����.
        System.out.println("���� �޼��� ���� ��!"); //��� , 2
    }
}
