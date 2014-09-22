
package ex1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author kosta
 * Document    : Ex1BufferedWtiterDemo created on : 2014. 9. 19, 오전 10:38:50
 */
public class Ex1BufferedWtiterDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        //문자스트림을 바이트 스트림으로 연결 하기 위해서
        //브릿지 스트림을 연결해서 사용한다.
        //OutputStreamwriter(byteStream,encoding);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:\\kosta86\\test.txt"),"euc-kr"));
        
        bw.write("이것은 테스트입니다.");
        bw.flush();
        //저장 후 확인
    }

}
