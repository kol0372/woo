
package ex1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author kosta
 * Document    : Ex1BufferedWtiterDemo created on : 2014. 9. 19, ���� 10:38:50
 */
public class Ex1BufferedWtiterDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        //���ڽ�Ʈ���� ����Ʈ ��Ʈ������ ���� �ϱ� ���ؼ�
        //�긴�� ��Ʈ���� �����ؼ� ����Ѵ�.
        //OutputStreamwriter(byteStream,encoding);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:\\kosta86\\test.txt"),"euc-kr"));
        
        bw.write("�̰��� �׽�Ʈ�Դϴ�.");
        bw.flush();
        //���� �� Ȯ��
    }

}
