
package ex3;

/**
 * @author kosta
 * Document    : Ex_Construtor created on : 2014. 9. 11, ���� 3:47:16
 */
public class Ex_Construtor {
//    �����ϴܰ� -> jvm����
//    �����ڰ� �����ڸ� ���� ���� �ص��� ������ �����Ϸ��� 
//    �⺻�����ڸ� �����صд�.
//    �����ڴ� Ŭ������� ���� ��ȯ���� ����.
//    ���� : ����Ŭ������ �ʱ�ȭ ��Ű�� ���� �����̴�.
    
    //�⺻������ �����.
//    public Ex_Construtor(){
//        
//    }
    
    private String msg;
//    ����� �ڿ��� �ʱ�ȭ �ϴ� ����
//    ���ڰ��� �ִ� ������
//    ****�����ڰ� ���ڰ� �ִ� �����ڸ� �ϳ��� ���Ǹ� �س�����, �����Ϸ��� �⺻�����ڸ�
//    ���� ��������� �ʴ´�.*****
//    �ڹٿ����� setter�� �����ڸ� ���� ���� ������ �� �ִ�.
    public Ex_Construtor(String msg){
        this.msg = msg;
    }
    
    public static void main(String[] args) {
        //Ŭ������ ��ü�� ����
        Ex_Construtor ref = new Ex_Construtor("����"); //����
        ref.test(); //�޼��带 ȣ��
    }
    private void test(){
        System.out.println("�׽�Ʈ!!");
    }
}

