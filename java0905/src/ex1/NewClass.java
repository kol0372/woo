
package ex1;

/**
 * @author kosta
 * Document    : NewClass created on : 2014. 9. 5, ���� 11:25:15
 */

//���� Ŭ������ ����, ����, ���� �� ����ȸ�翡�� ����ϴ�
//������ �ʿ��� �ڵ���..
//A���� B���� ���� �ڵ忡�� �����ؼ� �۾��� �� �� �ִµ�
//�ݾ��� ������ ���� A���� �����ϰ� �Ϸ���? 
public class NewClass {
   private int pay; //����ʵ�
   
   //insertpay(1000,"dd");ȣ��ɶ�
   public void insertpay(int p, String str){
       //dd���� �����ؼ� ������ϸ�
       if(!str.equals("dd")){
       System.out.println("����� ���ٱ����� �����ϴ�.");
       System.exit(0);//�ý�������    
       }   
       pay=p;//ȣ��� ���� 1000���� ����ʵ忡 ����.
   }
    public int getpay(){
        return pay;
    }
}
