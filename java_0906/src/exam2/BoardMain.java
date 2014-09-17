package exam2;

import java.util.Scanner;

/**
 * @author kosta Document : BoardMain created on : 2014. 9. 11, 오후 3:10:39
 */
public class BoardMain {
    
    public static void main(String[] args) {
        
        BoardControl vc = new BoardControl();
        Scanner sc = new Scanner(System.in);

        board:
        while (true) {
            System.out.print("1. 입력, 2.출력 , 3.종료 : ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    BoardVO vo = new BoardVO();
                    System.out.println("제목: ");
                    vo.setTitle(sc.nextLine());
                    System.out.println("성별 : ");
                    vo.setGender(sc.nextLine());
                    System.out.println("작성자 : ");
                    vo.setUser(sc.nextLine());
                    System.out.println("내용 : ");
                    vo.setContent(sc.nextLine());
                    System.out.println("현재날짜 : ");
                    vo.setDate(sc.nextLine());
                    
                    boolean result = vc.info(vo);
                    if(result == false){
                        System.out.println("경고");
                    }
                        break;
                case 2:
                    System.out.println("제목 : " + vc.getVo().getTitle());
                    System.out.println("성별 : " + vc.getVo().getGender());
                    System.out.println("작성자 : "+ vc.getVo().getUser());
                    System.out.println("내용 : " + vc.getVo().getContent());
                    System.out.println("현재날짜 : " + vc.getVo().getDate());
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    break board;

            }
        }
    }

}
