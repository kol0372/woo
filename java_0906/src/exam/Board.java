
package exam;

/**
 * @author kosta
 * Document    : Board created on : 2014. 9. 11, ���� 2:18:25
 */
public class Board {
    
    private BoardVO vo;
    
public void info(BoardVO vo){
    if(!vo.getGender().equalsIgnoreCase("m") && !vo.getGender().equalsIgnoreCase("f")){
        System.out.println("���޼���!");
    }
    // info �޼��� ȣ��� ���ڷ� ���޹��� 
    // vo��ü�� �ּҰ��� ����ʵ�� �����Ѵ�.
    this.vo = vo;
        
}

    public BoardVO getVo() {
        return vo;
    }

}
