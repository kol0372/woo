
package ex1;

/**
 * @author kosta
 * Document    : Ex1_Robo created on : 2014. 9. 5, ���� 10:30:48
 */
//Ŭ������ �����ϰ� �����ϴ� ��
//���������� : public, default
//calss���� ��ù���ڸ� �׻� �빮�ڷ� �ۼ�, �ĺ��� ����Ģ
//main�޼���� �и��Ѵ�.
public class Ex1_Robo {
    /**
    * @serialField power�� ������ ���� ����ϴ� �Ӽ�,
    *  true�� ��������, false�� ���� ����
    */
    boolean power;
    /**
     * @serialField col�� �����̸�, ����, ��� ������ �����Ҷ� ����ϼ���.
     * 
     */
    String col;
    
    /**
     * 
     * @param num : �κ��� ���°����� 0���� ū���� ���۵ǵ��� �Ǿ�����
     * @return boolean ������ ����� �޾Ƽ� �˾Ƽ� ���� �Ͻÿ�.
     */
    public boolean move(int num){
        boolean res = false;
        if(num <= 0){
            System.out.println("�κ��� ����ϴ�.");
            
        }else{
            System.out.println("�κ��� " + num + "�� �ӵ��� �����Դϴ�.");
            res = true;
        }
        return res;
    }
    
    // ����ʵ��� power�� ���� �����ִ� �޼���
    public boolean ispower(){
        return power;
    }
}
