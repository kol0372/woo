
package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author kosta
 * Document    : BufferedRWDeMo created on : 2014. 9. 18, 오후 3:03:57
 */
public class BufferedRWDeMo {
    public static void main(String[] args) {
        //작성 후 읽어 내는 형태로 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("입력내용");
        String content = sc.nextLine();
        //작성하기 위한 스트림 생성
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            //작성
            //new FileWriter("c:\\kosta86\\mytext.txt",true)
            //true면 append mode로 감.
            //append mode: 파일을 지속적으로 저장하겠다. 
            //첫번째 인자는 경로, 두번째 인자는 append mode
            String path = "c:\\kosta86\\mytext.txt";
            bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(content + "\r\n"); //\r\n 줄바꿈
            bw.flush();
            System.out.println("작성하기 완료");
            //읽기
            System.out.println("========================");
            br = new BufferedReader(new FileReader(path));
            String rv = null;
            //file의 마지막에 도달하면 null을 반환한다.
            while ((rv = br.readLine()) != null) {                
                System.out.println(rv);
            }
        } catch (Exception e) {
        } finally{
            
        }
    }
}
