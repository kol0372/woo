
package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author kosta
 * Document    : BufferedRWDeMo created on : 2014. 9. 18, ���� 3:03:57
 */
public class BufferedRWDeMo {
    public static void main(String[] args) {
        //�ۼ� �� �о� ���� ���·� ���
        Scanner sc = new Scanner(System.in);
        System.out.print("�Է³���");
        String content = sc.nextLine();
        //�ۼ��ϱ� ���� ��Ʈ�� ����
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            //�ۼ�
            //new FileWriter("c:\\kosta86\\mytext.txt",true)
            //true�� append mode�� ��.
            //append mode: ������ ���������� �����ϰڴ�. 
            //ù��° ���ڴ� ���, �ι�° ���ڴ� append mode
            String path = "c:\\kosta86\\mytext.txt";
            bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(content + "\r\n"); //\r\n �ٹٲ�
            bw.flush();
            System.out.println("�ۼ��ϱ� �Ϸ�");
            //�б�
            System.out.println("========================");
            br = new BufferedReader(new FileReader(path));
            String rv = null;
            //file�� �������� �����ϸ� null�� ��ȯ�Ѵ�.
            while ((rv = br.readLine()) != null) {                
                System.out.println(rv);
            }
        } catch (Exception e) {
        } finally{
            
        }
    }
}
