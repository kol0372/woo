
package Ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex2_Switch created on : 2014. 9. 4, ���� 10:20:55
 */
public class Ex2_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� �Է� : ");
        int m = Integer.parseInt(sc.nextLine());
        String res="";
        switch(m){
        case 2: 
        case 12:
        case 1:
            res = "�ܿ�"; break;
        case 5: 
        case 3:
        case 4:    
            res = "��"; break;
        case 8:
        case 6: 
        case 7:
            res = "����"; break;
        case 10:
        case 9:
        case 11:
            res = "����"; break;
        default :
            res = "����";
    }
        System.out.println("������ ���� " + res + "�Դϴ�.");
    }

    private static void Switch(int m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
