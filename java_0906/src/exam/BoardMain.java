package exam;

import java.util.Scanner;

/**
 * @author kosta Document : BoardMain created on : 2014. 9. 11, ���� 2:06:32
 */
public class BoardMain {

    // 1. �Է� ,  2. ����Ʈ,  3. ���� : 1
    // ���� : 
    // ���� : ('M' , 'F', 'M' , 'f) ��������!
    // �ۼ��� : 
    // ���� : 
    // ���糯¥ : 
    // 1. �Է� ,  2. ����Ʈ,  3. ���� : 2
    // ����~ ���糯¥�� ���
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board ref = new Board();
        while (true) {
            System.out.print("1. �Է� , 2. ����Ʈ 3. ���� :");
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1) {
                System.out.println("���� : ");
                String sub = sc.nextLine();
                System.out.println("���� : ");
                String gender = sc.nextLine();
                System.out.println("�ۼ��� : ");
                String name = sc.nextLine();
                System.out.println("���� : ");
                String note = sc.nextLine();
                System.out.println("���糯¥ :");
                String date = sc.nextLine();
                BoardVO v = new BoardVO();

                v.setSub(sub);
                v.setGender(gender);
                v.setName(name);
                v.setNote(note);
                v.setDate(date);
                
                ref.info(v);
            } else if (num == 2) {

                System.out.println("���� : " + ref.getVo().getSub());
                System.out.println("���� : " + ref.getVo().getGender());
                System.out.println("�ۼ��� : "+ ref.getVo().getName());
                System.out.println("���� : " + ref.getVo().getNote());
                System.out.println("���糯¥ : "+ ref.getVo().getDate());
            } else{
                System.out.println("�����մϴ�.");
            }

        }
    }
    }
