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
 * @author kosta Document : Ex2_Server created on : 2014. 9. 24, ���� 10:53:33
 */
//��������
//���������� �и��� ��ǻ�Ϳ��� ���������� ������ ������ü�� �����Ѵ�.
//���񽺿� ����ϰ� �־�� �Ѵ�. accept() �޼��尡 ������ ������.
public class Ex2_Server {

    private ServerSocket ss;

    public Ex2_Server() {
        try {
            ss = new ServerSocket(8888);
            System.out.println("���� ����!");
            while (true) { //while�� ���� ������ ��� �����ְ�, 
                //�Ѹ� client�� �޾�
                
                //accept() ����Ǹ� Ŭ���̾�Ʈ�� ���ϰ� ������ ��.
                Socket s = ss.accept(); //accept() ���ŷ�޼���
                //������ Ŭ���̾�Ʈ�� ������ �����Ǹ� ���
                String ip = s.getInetAddress().getHostAddress();
                System.out.println("server log1 : " + ip);

                //����� Socket�� ����ؼ� Ŭ���̾���� ��û�� �ޱ�.
                //���� input��Ʈ���� ������ �� 
                //�ٽ� Ŭ���̾�Ʈ���� ������ ���ֱ� ���� output��Ʈ���� 
                //�����ؼ� response�Ѵ�.
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                //printwriter�� Ư¡
                //1����Ʈ��/ 2����Ʈ��(������ ���)
                //����Ʈ��Ʈ��/���ڽ�Ʈ�� ��λ���� ����.
                //�����÷��� : �ڵ����� ���۸� ����ִ� ������ �����ڿ��� ���ڷ� ����.
                //���ڿ��� ���ٴ����� ����Ʈ��Ʈ������ ���� �ϴ´°��� ����.
                PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
                //--Ŭ���̾�Ʈ�� ���� **���� ����� ��Ʈ���� ���ؼ�
                //--Ŭ���̾�Ʈ�� ��û�� ����
                String msg = br.readLine();
                msg = "[" + ip + "]" + msg;
                System.out.println(msg);
                //--(��û������ ����)
                out.println("�ݰ����ϴ�." + "[" + ip + "]" + msg + "!");
            }
        } catch (IOException ex) {
            System.out.println("port�� ������Դϴ�."); //���ܰ� �߸� 9999���� �ٸ���
        }
    }

    public static void main(String[] args) {
        new Ex2_Server();
    }
}
