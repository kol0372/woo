
package exam2;

/**
 * @author kosta
 * Document    : BoardControl created on : 2014. 9. 11, ���� 2:58:33
 */
//���� ���� ��ü�� has a ���踦 ���� �����ϱ� ����
public class BoardControl {
    //has a ���� 
    private BoardVO vo;
    
 // �Է¹��� ������ ���� "m","M","f","F" �� �ƴҰ��
 // ������ �� �ֵ��� boolean �������� �޼��带 ��ȯ�Ѵ�.
 // ������ �Է����� ��� �Է¹��� ���� ���� Ŭ������ vo�� �����Ѵ�.
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
