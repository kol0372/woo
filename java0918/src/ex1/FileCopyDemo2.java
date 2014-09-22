package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : FileCopyDemo1 created on : 2014. 9. 18, 오후 1:44:01
 */
public class FileCopyDemo2 {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //대상 파일을 읽어와서 특정다른 디렉토리에 복사하는 작업
        //읽어오기 위한 스트림 - FileInfutStream
        //작성하기 위한 스트림 - FileoutputStream
        String path = "C:\\kosta86.zip";
        String path2 = "C:\\kosta86\\kosta82.zip";
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
        //2차 스트림을 사용(버퍼기능이 내장된.. ) 
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
//            fis = new FileInputStream(path);
//            fos = new FileOutputStream(path2);
            //1차 스트림의 주소로 연결해서 생성
            //버퍼의 용량을 지정하지 않으면 8192byte 크기로 생성됨!
            bis = new BufferedInputStream(new FileInputStream(path));
            bos = new BufferedOutputStream(new FileOutputStream(path2));
            int rv = 0;
            while ((rv = bis.read()) != -1) {
                //한바이트씩 읽을 때마다 한바이트씩 작성
                bos.write(rv);

            }
            bos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("파일이 없네요.");
            ex.printStackTrace();

        } catch (IOException ex) {

            System.out.println("읽어오는 중 문제 발생");
            ex.printStackTrace();
        } finally {
            try {
//                if (fis != null) {
//                    fis.close();
//                }
//                if (fos != null) {
//                    fos.close();
//                }
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("시간" + (end - start));

    }
}
