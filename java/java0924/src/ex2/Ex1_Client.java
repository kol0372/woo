
package ex2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : Ex1_Client created on : 2014. 9. 24, 오후 1:08:52
 */
public class Ex1_Client {
    
    private Socket s;

    public Ex1_Client() {
        
        try {
            s = new Socket("192.168.7.3",7777);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
            
            out.println("오빠");
            
            String msg = br.readLine();
            System.out.println(msg);
        } catch (IOException ex) {
           
        }
    }
    
    public static void main(String[] args) {
        new Ex1_Client();
    }

}
