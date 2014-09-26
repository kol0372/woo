package ex;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @author kosta Document : MultiSocketServer created on : 2014. 9. 25, ����
 * 9:37:10
 */
public class MultiSocketServer {
    //��������
    private ServerSocket ss;
    //���ӵ� Ŭ���̾�Ʈ�� ����
    private Socket s;
    //Ŭ���̾�Ʈ ������ ������ collection
    private ArrayList<ServerThread> clientList;
    //���� ���ӻ��ȭ���� ������ Arraylist
    private ArrayList<String> conClientList;
    //�������� ip
    private String reip;

    public MultiSocketServer() {
        try {
            ss = new ServerSocket(9898);
            System.out.println("server start");
            //Socket�� �ּҸ� ������, ������ ���� Thread�� �ּҸ� �����ϱ� ���� ArrayList ����
            clientList = new ArrayList<ServerThread>();
            conClientList = new ArrayList<>();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //����޼���
    public void execute() {
        //������ �׻� ������
        while (true) {
            try {
                s = ss.accept();
                reip = s.getInetAddress().getHostAddress();
                System.out.println("Cilent Connected : [ " + reip + "]");
                //Thread ��ü���� �� �� readLine�� ������ ���� **
                ServerThread ct = new ServerThread(s, this);
                //�����尡 �����ɶ����� ArrayList�� ���
                clientList.add(ct);
                System.out.println("cuurrent number of clients : " + clientList.size());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sendMsg(String str1, ServerThread aThis) { //����
        String type1 = str1;
        String str = "";   
        //ArrayList�� ��ϵ� ��� Client�� �о�ͼ� �ϳ��� ������ ���Ͽ� 
        //��Ʈ���� ���� str�޼����� �����Ѵ�.
        str = "[" + reip + "]" + type1;
        System.out.println("msg : " + str);
        //��� �������� �ϼ��� str�� ����
        for (ServerThread c : clientList) {
            c.getPw().println(str);
        }
    }

    public static void main(String[] args) {
        MultiSocketServer mss = new MultiSocketServer();
        mss.execute();
    }

}
