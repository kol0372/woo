package ex2;
// 제어문중에 if, else if, for, while, break등을
//학습한 후 간단한 게임을 만들 수 있도록 기본 문법을 
//적용하는 방법을 습득한다.

/**
 * @author kosta Document : Ex2_if created on : 2014. 9. 3, 오전 11:16:27
 */
public class Ex2_if {

    public static void main(String[] args) {
        //if(조건) : 조건이 ture일때만 실행
        int su = 3;
        String msg;
        //if (su > 5) {
        //    System.out.println("실행" + msg );
        //}
        System.out.println("나도 if문의 가족이 되고 싶어요");
        
        //조건과 나머지를 실행하겠다.
        if(su>5){
            msg = " 크다 ";
                    }
        else{
            msg = " 작다 ";
        }
        System.out.println("결과 : " + msg);
        }
    //else가 초기화 시킴
    }


