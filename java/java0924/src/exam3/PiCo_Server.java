package exam3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : PiCo_Server created on : 2014. 9. 24, 오후 5:05:38
 */
public class PiCo_Server {

    private ServerSocket ss;

    public PiCo_Server() {
        try {
            ss = new ServerSocket(5555);
            String path = "C:\\kosta86\\javaStudy\\workspace\\java0924\\src\\exam3\\msg.properties";
            BufferedReader bread = new BufferedReader(new FileReader(path));
            Properties prop = new Properties();
            prop.load(bread);
            bread.close();

            ex:
            while (true) {
                Socket s = ss.accept();
                System.out.println("Connect IP " + s.getInetAddress().getHostAddress());
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter out = new PrintWriter(new BufferedOutputStream(s.getOutputStream()));
                while (true) {
                    try {
                        String msg = br.readLine();
                        System.out.println("MSG" + msg);
                        if (prop.get(msg) != null) { //키값이 널이 아닐때만 보내라.
                            out.println(prop.get(msg));
                        } else {
                            System.out.println("몰라요");
                        }
                    } catch (SocketException e) {
                        e.printStackTrace();
                        continue ex; //ex 라벨을 줘서 소켓 예외발생시 안끝나고 위에서 다시.
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new PiCo_Server();
    }
}
