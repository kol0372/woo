
package exam;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : Server created on : 2014. 9. 24, 오후 1:57:34
 */
public class Server {
private ServerSocket ss;

    public Server() {
        
    try {
        ss= new ServerSocket(7777);
        System.out.println("서버시작");
        while(true){
            Socket s =ss.accept();
            
            String ip = s.getInetAddress().getHostAddress();
            System.out.println("client ip" + ip);
            
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
            
            String msg = br.readLine();
            
            
        }
    } catch (IOException ex) {
        
    }
        
    }


}
