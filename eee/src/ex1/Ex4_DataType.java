package ex1;

import vo.TestVO;

/**
 * @author kosta 
 * Document   : Ex4_DataType Created on : 2014. 9. 2, ���� 11:48:09
 */
public class Ex4_DataType {
    // psvm[TAB Key]
    public static void main(String[] args) {
       
        // sout[TAB Key]
        String str1 = "J"; // �Ͻ������� ��ü�� ������ String
        char ch1 = 'A'; // ' ' �ѹ��ڸ� �����ϱ� ���� char
        System.out.println("���ڿ� : "+str1);
        System.out.println("���� : "+ch1);
        
        char ch3 = '\u0042';
        
        System.out.println("ch3:�����ڵ� �� :"+ch3);
        
        char ch4 = '\ucafe';
        System.out.println("ch3:�����ڵ� �� :"+ch4);
    }
}
