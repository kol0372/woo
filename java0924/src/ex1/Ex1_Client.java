package ex1;

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
 * @author kosta Document : Ex1_Client created on : 2014. 9. 24, 오전 11:02:45
 */
//접속하기
public class Ex1_Client {

    private Socket s;

    public Ex1_Client() {
        try {
            //클라이언트는 socket을 생성하면
            //해당 IP와 port도 소켓을 연결하기 위해서 접속을 시도한다.
            s = new Socket("192.168.7.3", 8888); //접속하고 싶은 ip와 포트 입력
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
            //클라이언트는 서버로 요청을 보내는 작업
            out.println(" 밥먹으러가장");
            //서버응답 받기.
            String msg = br.readLine();
            System.out.println(msg);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Ex1_Client();
    }
}
