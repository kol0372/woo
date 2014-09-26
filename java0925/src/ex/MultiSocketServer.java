package ex;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @author kosta Document : MultiSocketServer created on : 2014. 9. 25, 오전
 * 9:37:10
 */
public class MultiSocketServer {
    //서버소켓
    private ServerSocket ss;
    //접속된 클라이언트의 소켓
    private Socket s;
    //클라이언트 소켓을 저장할 collection
    private ArrayList<ServerThread> clientList;
    //현재 접속사대화명을 저장할 Arraylist
    private ArrayList<String> conClientList;
    //접속자의 ip
    private String reip;

    public MultiSocketServer() {
        try {
            ss = new ServerSocket(9898);
            System.out.println("server start");
            //Socket의 주소를 가지고, 응답을 위한 Thread의 주소를 저장하기 위한 ArrayList 생성
            clientList = new ArrayList<ServerThread>();
            conClientList = new ArrayList<>();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //실행메서드
    public void execute() {
        //서버는 항상 대기상태
        while (true) {
            try {
                s = ss.accept();
                reip = s.getInetAddress().getHostAddress();
                System.out.println("Cilent Connected : [ " + reip + "]");
                //Thread 객체생성 한 후 readLine을 위임한 상태 **
                ServerThread ct = new ServerThread(s, this);
                //스레드가 생성될때마다 ArrayList에 기억
                clientList.add(ct);
                System.out.println("cuurrent number of clients : " + clientList.size());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sendMsg(String str1, ServerThread aThis) { //응답
        String type1 = str1;
        String str = "";   
        //ArrayList에 등록된 모든 Client를 읽어와서 하나씩 각각의 소켓에 
        //스트림을 통해 str메세지를 전달한다.
        str = "[" + reip + "]" + type1;
        System.out.println("msg : " + str);
        //모든 유저에게 완성된 str을 송출
        for (ServerThread c : clientList) {
            c.getPw().println(str);
        }
    }

    public static void main(String[] args) {
        MultiSocketServer mss = new MultiSocketServer();
        mss.execute();
    }

}
