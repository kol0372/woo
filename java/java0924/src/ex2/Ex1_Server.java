package ex2;

import ex1.Ex2_Server;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : Ex1_Server created on : 2014. 9. 24, 오후 1:09:05
 */
public class Ex1_Server {

    private ServerSocket ss;

    public Ex1_Server() {
        try {
            ss = new ServerSocket(7777);
            System.out.println("서버시작");
            while (true) {
                Socket s = ss.accept();
                String ip = s.getInetAddress().getHostAddress();
                System.out.println(ip);

                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);

                String msg = br.readLine();
                msg = "[" + ip + "]" + msg;
                System.out.println(msg);
                out.println("반갑습니다." + ip + msg);
            }

        } catch (IOException ex) {

        }

    }

    public static void main(String[] args) {
        new Ex2_Server();
    }

}
