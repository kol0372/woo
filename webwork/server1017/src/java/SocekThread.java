
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : SocekThread created on : 2014. 10. 17, 오전 11:28:44
 */

//스레드를 상속 - 생성방법(상속, 인터페이스, 내부)
//왜 상속방법으로 했을까 .. 다른거 상속받을 필요 없으니까..
public class SocekThread extends Thread {

    private Socket socket;
    private ServerS server;
    private PrintWriter pw;

    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }
    private BufferedReader in;
    

    public SocekThread(Socket socket, ServerS server) {
        this.socket = socket;
        this.server = server;
        try {
            pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        //protocol : msg/msg/msg/msg ......
        //readLine 때문에
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String msg = in.readLine();
                System.out.println("Client Msg : " + msg);
                trMsg(msg);
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private void trMsg(String msg){
        StringTokenizer stn = new StringTokenizer(msg, "/");
        String str1 = stn.nextToken();
        String str2 = stn.nextToken();
        String str3 = stn.nextToken();
        String str4 = stn.nextToken();
        String str5 = stn.nextToken();
        String str6 = stn.nextToken();
        String str7 = stn.nextToken();
        String str8 = stn.nextToken();
        server.sendMsg(this,str1,str2,str3,str4,str5,str6,str7,str8);
        System.out.println("프로토콜 전송완료");
        
    }

}
