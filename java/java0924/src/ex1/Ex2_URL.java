
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
 * Document    : Ex2_URL created on : 2014. 9. 23, 오후 3:02:20
 */
//Uniform Resource Locator
//인터넷에서 접근 가능한 자원(Resource)의 주소를 표현할 수 있는 형식 ***

public class Ex2_URL {
    public static void main(String[] args) throws IOException {
        String path = "http://edu.kosta.or.kr/clazzregister/clazzRegister_findClazzWithContents?clazz.clazzId=1634&pageNum=1";
        String path2 = "http://www.kosta.or.kr/";
        URL url = new URL(path2);
       //URL connection 객체는 반드시 URL클래스를 생성한 후
       //반환받아서 사용한다. ****
        URLConnection urlcon = url.openConnection(); 
        //URLConnection은 추상메서드라서 new가 안되 그래서 url.connection으로 불러
        //URLConnection의 완성
        urlcon.connect(); //객체가 완성이 됨
        
        //서버에 들어오는 타입이 뭔지에 달라서 클라이언트도 같이 해야하기 때문에 (안하면 한글깨져)
        //contentType을 통해 알 수 있음.
        System.out.println("ContentType : "+ urlcon.getContentType());
        //헤더 필드의 contentlength에 대한 value를 반환
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
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8")); //(, 인코딩의형식)
                 //** 안드로이드 할때 보장.
                // InputStreamReader 브릿지스트림
        String res = null ;
        while ((res = br.readLine()) != null) {
            System.out.println(res);
           
        }br.close();
        //자원 닫기 try catch finally
        //연습문제 : 사용자가 입력한 url의 소스를
        //jTextArea에 출력하고 save버튼을 누르면
        //사용자가 지정한 경로에 파일 이름으로 저장하는 기능을 구현하시오.
        //printwrite
    }
}
