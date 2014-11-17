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
 * @author kosta Document : PiCo_Server created on : 2014. 9. 24, ���� 5:05:38
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
                        if (prop.get(msg) != null) { //Ű���� ���� �ƴҶ��� ������.
                            out.println(prop.get(msg));
                        } else {
                            System.out.println("�����");
                        }
                    } catch (SocketException e) {
                        e.printStackTrace();
                        continue ex; //ex ���� �༭ ���� ���ܹ߻��� �ȳ����� ������ �ٽ�.
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
