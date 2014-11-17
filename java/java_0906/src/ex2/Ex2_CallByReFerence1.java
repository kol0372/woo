package ex2;

import ex2.vo.MemberVO;

/**
 * @author kosta Document : Ex2_CallByReFerence created on : 2014. 9. 11, 오전
 * 11:23:59
 */
public class Ex2_CallByReFerence1 {
    //연습문제 : 현재 클래스는 변화에 유연하지 못한 클래스로 설계가 되어있다.
    //info한 메서드에게 자원을 추가해서 사용하기 위해서 
    //매서드의 인자값도 늘여야하고, 멤버필드 및 setter/getter도 늘려야 한다.
    //private boolean agree를 추가해서 사용해보면 알것임.
    //pojo, callbyreference를 적절히 사용하면 해결됨.

    //한사람의 정보를 출력 - 나이, 성별, 번호, 이름, 전번
    private MemberVO vo;

    public void info(MemberVO vo) {
        //만약 가공이 필요하다면 
        if (vo.getTel().contains("02")) {
            System.out.println("서울사람이다.");
        }
        this.vo = vo;
    }

    public MemberVO getVo() {
        return vo;
    }

}
