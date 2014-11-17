package exam;

import java.util.Scanner;

/**
 * @author kosta Document : BoardMain created on : 2014. 9. 11, 오후 2:06:32
 */
public class BoardMain {

    // 1. 입력 ,  2. 리스트,  3. 종료 : 1
    // 제목 : 
    // 성별 : ('M' , 'F', 'M' , 'f) 경고메제지!
    // 작성자 : 
    // 내용 : 
    // 현재날짜 : 
    // 1. 입력 ,  2. 리스트,  3. 종료 : 2
    // 제목~ 현재날짜가 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board ref = new Board();
        while (true) {
            System.out.print("1. 입력 , 2. 리스트 3. 종료 :");
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1) {
                System.out.println("제목 : ");
                String sub = sc.nextLine();
                System.out.println("성별 : ");
                String gender = sc.nextLine();
                System.out.println("작성자 : ");
                String name = sc.nextLine();
                System.out.println("내용 : ");
                String note = sc.nextLine();
                System.out.println("현재날짜 :");
                String date = sc.nextLine();
                BoardVO v = new BoardVO();

                v.setSub(sub);
                v.setGender(gender);
                v.setName(name);
                v.setNote(note);
                v.setDate(date);
                
                ref.info(v);
            } else if (num == 2) {

                System.out.println("제목 : " + ref.getVo().getSub());
                System.out.println("성별 : " + ref.getVo().getGender());
                System.out.println("작성자 : "+ ref.getVo().getName());
                System.out.println("내용 : " + ref.getVo().getNote());
                System.out.println("현재날짜 : "+ ref.getVo().getDate());
            } else{
                System.out.println("종료합니다.");
            }

        }
    }
    }
