
package ex1;

/**
 * @author kosta
 * Document    : Ex3 created on : 2014. 9. 22, ���� 11:19:49
 */

//�������� : start�� �ٸ� Ŭ������ �����ؾߵ� �ڿ��̱� ������ static����
//�����ϰ� Thread�� ����� ���� Ex3_MyThread���� �����Ѽ�
//����غ���.
public class Ex3_ThreadSingle { 
    public static long start;
    public static void main(String[] args) {
        start = System.currentTimeMillis();
        
       
        
        // -------------------Thread�� ����
//        for(int i =0;  i < 300; i ++){
//            System.out.println("*");
//            
//        }System.out.println("**");
//        
//        System.out.println(System.currentTimeMillis() - start);
         Ex3_MyThread th = new Ex3_MyThread();
        th.start();
        
        //--------------------------------
        for(int i = 0; i < 300 ; i++){
            System.out.print("x");
        }
        System.out.println("");
        System.out.println(System.currentTimeMillis() - start);
    }
}
