package ex1;

import vo.TestVO;

/**
 * @author kosta 
 * Document   : Ex4_DataType Created on : 2014. 9. 2, 오전 11:48:09
 */
public class Ex4_DataType {
    // psvm[TAB Key]
    public static void main(String[] args) {
       
        // sout[TAB Key]
        String str1 = "J"; // 암시적으로 객체가 생성된 String
        char ch1 = 'A'; // ' ' 한문자를 저장하기 위한 char
        System.out.println("문자열 : "+str1);
        System.out.println("문자 : "+ch1);
        
        char ch3 = '\u0042';
        
        System.out.println("ch3:유니코드 값 :"+ch3);
        
        char ch4 = '\ucafe';
        System.out.println("ch3:유니코드 값 :"+ch4);
    }
}
