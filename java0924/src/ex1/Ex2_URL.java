
package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author kosta
 * Document    : Ex2_URL created on : 2014. 9. 23, ���� 3:02:20
 */
//Uniform Resource Locator
//���ͳݿ��� ���� ������ �ڿ�(Resource)�� �ּҸ� ǥ���� �� �ִ� ���� ***

public class Ex2_URL {
    public static void main(String[] args) throws IOException {
        String path = "http://edu.kosta.or.kr/clazzregister/clazzRegister_findClazzWithContents?clazz.clazzId=1634&pageNum=1";
        String path2 = "http://www.kosta.or.kr/";
        URL url = new URL(path2);
       //URL connection ��ü�� �ݵ�� URLŬ������ ������ ��
       //��ȯ�޾Ƽ� ����Ѵ�. ****
        URLConnection urlcon = url.openConnection(); 
        //URLConnection�� �߻�޼���� new�� �ȵ� �׷��� url.connection���� �ҷ�
        //URLConnection�� �ϼ�
        urlcon.connect(); //��ü�� �ϼ��� ��
        
        //������ ������ Ÿ���� ������ �޶� Ŭ���̾�Ʈ�� ���� �ؾ��ϱ� ������ (���ϸ� �ѱ۱���)
        //contentType�� ���� �� �� ����.
        System.out.println("ContentType : "+ urlcon.getContentType());
        //��� �ʵ��� contentlength�� ���� value�� ��ȯ
        System.out.println("Length" + urlcon.getContentLength());
        System.out.println("ContentEncoding : " + urlcon.getContentEncoding());
        
        //URL 
        //URLconnection 
        
        System.out.println(url.getPath());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getContent());
        System.out.println(url.getRef()); //a
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8")); //(, ���ڵ�������)
                 //** �ȵ���̵� �Ҷ� ����.
                // InputStreamReader �긴����Ʈ��
        String res = null ;
        while ((res = br.readLine()) != null) {
            System.out.println(res);
           
        }br.close();
        //�ڿ� �ݱ� try catch finally
        //�������� : ����ڰ� �Է��� url�� �ҽ���
        //jTextArea�� ����ϰ� save��ư�� ������
        //����ڰ� ������ ��ο� ���� �̸����� �����ϴ� ����� �����Ͻÿ�.
        //printwrite
    }
}
