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
 * @author kosta Document : Ex1_Client created on : 2014. 9. 24, ���� 11:02:45
 */
//�����ϱ�
public class Ex1_Client {

    private Socket s;

    public Ex1_Client() {
        try {
            //Ŭ���̾�Ʈ�� socket�� �����ϸ�
            //�ش� IP�� port�� ������ �����ϱ� ���ؼ� ������ �õ��Ѵ�.
            s = new Socket("192.168.7.3", 8888); //�����ϰ� ���� ip�� ��Ʈ �Է�
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
            //Ŭ���̾�Ʈ�� ������ ��û�� ������ �۾�
            out.println(" �����������");
            //�������� �ޱ�.
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
