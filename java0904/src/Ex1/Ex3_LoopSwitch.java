1
package Ex1;

import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex3_LoopSwitch created on : 2014. 9. 4, ���� 10:35:57
 */
public class Ex3_LoopSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        aa: for(;;){
            System.out.println("������ �Է�:(R,G,B) ����� bye");
            String col = sc.nextLine();
            //String API�߿��� ���ڿ��� �ҹ��ڷ� ����
            col =col.toLowerCase();
            String res = "";
            switch(col){
                case "RED" :
                    System.out.println("�������Դϴ�.");
                    break;
                case "BLUE" :
                    System.out.println("�Ķ����Դϴ�.");
                    break;
                case "BYE" : 
                    System.out.println("�����ϰ��������.");
                    break;
            } 
            System.out.println("����� �Է��ѻ����� " + res + "�Դϴ�.");
             break aa;
        }
    }
}
