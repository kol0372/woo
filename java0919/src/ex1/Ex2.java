
package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @author kosta
 * Document    : Ex2 created on : 2014. 9. 19, 오전 10:48:26
 */
public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        //file을 빠르게 불러오기 위해 buffer를 쓰는데
        //fileoutput은 1차, buffer는 2차라서 이를 연결 하기위해
        //inputstreamreader를 사용한다.
        BufferedReader bw = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\kosta86\\test.txt")));
        String rt = null;
        //
        while((rt = bw.readLine()) != null){
            System.out.println(rt);
            
        }bw.close();
      
    }

}
