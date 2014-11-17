
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : ServerS created on : 2014. 10. 17, 오전 11:26:22
 */
public class ServerS {

    private ServerSocket ss; //서버소켓
    private Socket s; //클라이언트 소켓
    private String reip; //ip
    private ArrayList<SocekThread> client; //클라이언트의 소켓을 관리할 스레드

    public ServerS(int port) {
        try {
            ss = new ServerSocket(port);
            System.out.println("서버 시작");
            //ArratList를 생성
            client = new ArrayList<>();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    public void execute(){
        while(true){
            try {
                Socket s = ss.accept();
                System.out.println("클라이언트 접속");
                System.out.println(s.getInetAddress().getHostAddress());
                System.out.println("--------------------------------");
                SocekThread st = new SocekThread(s, this);
                //ArrayList에 저장
                client.add(st);
                st.start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    

    void sendMsg(SocekThread s,String ... str) { //String ... str 배열로 여러 인자 받을 수 있음. 단 같은애덜만.
        //String type1 = str[0];
       StringBuffer strs = new StringBuffer();
       //Client로 보내기 위한 프로토콜을 제작
       int i=0;
       for(String e : str){
           if(str.length -1> i){
               strs.append(e).append("/");
           }else{
               strs.append(e);
           }
           i++;
       }
        System.out.println("Tokentest: " + strs);
        //모든 접속자에게 메세지를 전달한다.
        for(SocekThread e : client){
            e.getPw().println(strs.toString());
        }
    }
    public static void main(String[] args) {
        ServerS s= new ServerS(9999);
        s.execute();
        
    }
    

}
