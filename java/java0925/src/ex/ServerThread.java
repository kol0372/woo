package ex;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author kosta Document : ServerThread created on : 2014. 9. 25, ���� 9:50:30
 */
class ServerThread {

    //�����κ��� ���ӹ��� ����
    private Socket socket;
    //�����κ��� ���� ������ �ּ�
    private MultiSocketServer server;
    //�������κ��� ����� �� ��Ʈ��
    private PrintWriter pw;
    private BufferedReader in;
    //�г���
    private String nickName;

    public PrintWriter getPw() {
        return pw;
    }

    public String getNickName() {
        return nickName;
    }

    public ServerThread(Socket socket, MultiSocketServer server) {
        this.socket = socket;
        this.server = server;

        try {
            pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()), true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //Thread�� ����Ŭ������ ����
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() { //readLine �����ϱ� ���� �����常��.          
                try {
                    //�����ϳ��� ��Ʈ�� ����
                    in = new BufferedReader(new InputStreamReader(ServerThread.this.socket.getInputStream()));
                    while (true) {
                        //�������κ��� �Է��� �ޱ� ���� ����ϴ� �޼���
                        String msg = in.readLine();
                        transMsg(msg);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            //�޼��� ��ū �� ������ sendMsg ȣ�� ���
            private void transMsg(String msg) {
                //������ sendMsg()�� ȣ���Ҷ� �޼����� ����
                ServerThread.this.server.sendMsg(msg, ServerThread.this);
            }
        });
        //Thread�� Start�ؼ� �����ٷ����� ���� ��û�Ѵ�.
        t.start();
    }
    //������ ����ؾߵ� �ڿ���    
}
