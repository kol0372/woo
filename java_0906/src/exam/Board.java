
package exam;

/**
 * @author kosta
 * Document    : Board created on : 2014. 9. 11, 오후 2:18:25
 */
public class Board {
    
    private BoardVO vo;
    
public void info(BoardVO vo){
    if(!vo.getGender().equalsIgnoreCase("m") && !vo.getGender().equalsIgnoreCase("f")){
        System.out.println("경고메세지!");
    }
    // info 메서드 호출시 인자로 전달받은 
    // vo객체의 주소값을 멤버필드로 저장한다.
    this.vo = vo;
        
}

    public BoardVO getVo() {
        return vo;
    }

}
