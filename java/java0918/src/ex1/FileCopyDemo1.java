
package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : FileCopyDemo1 created on : 2014. 9. 18, 오후 1:44:01
 */
public class FileCopyDemo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //대상 파일을 읽어와서 특정다른 디렉토리에 복사하는 작업
        //읽어오기 위한 스트림 - FileInfutStream
        //작성하기 위한 스트림 - FileoutputStream
        String path = "C:\\kosta86.zip";
        String path2 = "C:\\kosta86\\kosta.zip";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(path);
            fos = new FileOutputStream(path2);
            int rv = 0;
            while((rv = fis.read()) !=-1){
                //한바이트씩 읽을 때마다 한바이트씩 작성
                fos.write(rv);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("파일이 없네요.");
            ex.printStackTrace();
            
        } catch (IOException ex) {
            
            System.out.println("읽어오는 중 문제 발생");
            ex.printStackTrace();
        } finally{
            try {
                if(fis != null) fis.close();
                if(fos != null) fos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
                
            }
        long end = System.currentTimeMillis();
        System.out.println("시간" + (end-start));
        }
    }

