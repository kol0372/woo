package ex1;

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
 * @author kosta Document : Ex2_Server created on : 2014. 9. 24, 오전 10:53:33
 */
//서버열기
//물리적으로 분리된 컴퓨터에서 서버소켓을 생성한 서버객체를 생성한다.
//서비스에 대기하고 있어야 한다. accept() 메서드가 그일을 수행함.
public class Ex2_Server {

    private ServerSocket ss;

    public Ex2_Server() {
        try {
            ss = new ServerSocket(8888);
            System.out.println("서버 시작!");
            while (true) { //while을 통해 서버는 계속 열려있고, 
                //한명씩 client를 받아
                
                //accept() 수행되면 클라이언트의 소켓과 연결이 됨.
                Socket s = ss.accept(); //accept() 블로킹메서드
                //접속한 클라이언트의 소켓의 아이피를 얻기
                String ip = s.getInetAddress().getHostAddress();
                System.out.println("server log1 : " + ip);

                //연결된 Socket을 사용해서 클라이언드의 요청을 받기.
                //위한 input스트림을 생성한 후 
                //다시 클라이언트에게 응답을 해주기 위한 output스트림을 
                //생성해서 response한다.
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                //printwriter의 특징
                //1차스트림/ 2차스트림(버퍼의 기능)
                //바이트스트림/문자스트림 모두사용이 가능.
                //오토플러시 : 자동으로 버퍼를 비워주는 역할을 생성자에서 인자로 지정.
                //문자열을 한줄단위로 바이트스트림으로 연결 하는는것이 장점.
                PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
                //--클라이언트의 소켓 **으로 연결된 스트림을 통해서
                //--클라이어트의 요청을 수리
                String msg = br.readLine();
                msg = "[" + ip + "]" + msg;
                System.out.println(msg);
                //--(요청에대한 응답)
                out.println("반갑습니다." + "[" + ip + "]" + msg + "!");
            }
        } catch (IOException ex) {
            System.out.println("port가 사용중입니다."); //예외가 뜨면 9999말고 다른거
        }
    }

    public static void main(String[] args) {
        new Ex2_Server();
    }
}
