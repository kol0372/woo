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
 * @author kosta Document : FileCopyDemo1 created on : 2014. 9. 18, ���� 1:44:01
 */
public class FileCopyDemo2 {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //��� ������ �о�ͼ� Ư���ٸ� ���丮�� �����ϴ� �۾�
        //�о���� ���� ��Ʈ�� - FileInfutStream
        //�ۼ��ϱ� ���� ��Ʈ�� - FileoutputStream
        String path = "C:\\kosta86.zip";
        String path2 = "C:\\kosta86\\kosta82.zip";
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
        //2�� ��Ʈ���� ���(���۱���� �����.. ) 
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
//            fis = new FileInputStream(path);
//            fos = new FileOutputStream(path2);
            //1�� ��Ʈ���� �ּҷ� �����ؼ� ����
            //������ �뷮�� �������� ������ 8192byte ũ��� ������!
            bis = new BufferedInputStream(new FileInputStream(path));
            bos = new BufferedOutputStream(new FileOutputStream(path2));
            int rv = 0;
            while ((rv = bis.read()) != -1) {
                //�ѹ���Ʈ�� ���� ������ �ѹ���Ʈ�� �ۼ�
                bos.write(rv);

            }
            bos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("������ ���׿�.");
            ex.printStackTrace();

        } catch (IOException ex) {

            System.out.println("�о���� �� ���� �߻�");
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
        System.out.println("�ð�" + (end - start));

    }
}
