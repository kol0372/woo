
package ex1;

/**
 * @author kosta
 * Document    : UserException created on : 2014. 9. 16, ���� 10:49:42
 */
public class UserException extends Exception{
    //Exception�� ��ӹ��� ���� 
    private int port = 772;
    public UserException(String message){
        //�޻����� �޾� Exception�� ����
        super(message);
    }
    public UserException(String message, int port){
        //�޼����� port�� �ʱ�ȭ
        super(message);
        this.port=port;
    }
    public int getport(){
        return port;
    
}
}
