
package ex1;

/**
 * @author kosta
 * Document    : UserException created on : 2014. 9. 16, 오전 10:49:42
 */
public class UserException extends Exception{
    //Exception을 상속받은 것은 
    private int port = 772;
    public UserException(String message){
        //메새지를 받아 Exception에 전달
        super(message);
    }
    public UserException(String message, int port){
        //메세지와 port를 초기화
        super(message);
        this.port=port;
    }
    public int getport(){
        return port;
    
}
}
