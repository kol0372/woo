
package ex1;



/**
 * @author kosta
 * Document    : Ex1_RoboMain created on : 2014. 9. 5, ���� 10:36:25
 */
public class Ex1_RoboMain {
    //Ex1_Robo.class �޾Ƽ� �����ϱ� ���� �۾�.
    public static void main(String[] args) {
    //�����ڷ��� Ex1_Robo ref; ����
    //new �����ڸ� ���� Ex1_Robo() Heap������ ����
        Ex1_Robo ref = new Ex1_Robo();
        //�Ӽ��� ���� �Ҵ�
        ref.power=true; // �������� �ִ� Ex1_Robo��ü�� �ڿ��� power�� 
                        //true ���� ������ ����
        //����, ref.ispower() �޼��带 ȣ���ϸ� �翬�� true���� ������ �ִ�
        //power���ΰ��� Ȯ���� �� �ִ�.
        //�����Ǵ� �Ӽ��� ���������ڰ� default �̹Ƿ�, �ٸ� ��Ű���� ���� �ȵ�
        // 
        if(ref.power == true){
            System.out.println("�κ��� ������ �������ϴ�.");
        }else{
            System.out.println("�κ��� ������ �������ϴ�.");
        }
        
        //�������� : Ex1_Robo��ü�� move()�� ȣ���ؼ�
        //�κ��� �����̰� �����ϰ� ���α׷��� �Ͻÿ�.
        
        boolean rv = ref.move(10);
        if(!rv){
            System.out.println("�κ�  ���ۿ� ������ �ֽ��ϴ�.");
        }
        
        
    
    }
}
