
package exam2;

/**
 * @author kosta
 * Document    : BoardControl created on : 2014. 9. 11, 오후 2:58:33
 */
//값을 가진 객체를 has a 관계를 통해 가공하기 위함
public class BoardControl {
    //has a 관계 
    private BoardVO vo;
    
 // 입력받은 성별의 값이 "m","M","f","F" 가 아닐경우
 // 제어할 수 있도록 boolean 형식으로 메서드를 반환한다.
 // 적절히 입력했을 경우 입력받은 값을 현재 클래스의 vo에 대입한다.
    public boolean info(BoardVO vo){
        if(!vo.getGender().equalsIgnoreCase("m") &&!vo.getGender().equalsIgnoreCase("f")){
            return false;
        }else {
            this.vo = vo;
            return true;
        }
    }

    public BoardVO getVo() {
        return vo;
    }

}
