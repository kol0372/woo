
package exam;

/**
 * @author kosta
 * Document    : ArrayControl created on : 2014. 9. 16, ���� 5:26:58
 */
public class ArrayControl {
    private ArrayVo vo;

public void info(ArrayVo vo){
    if(vo.getAge()<19){
        System.out.println("�̼�����");
    }else{
        System.out.println("����");
    }
    
}

    public ArrayVo getVo() {
        return vo;
    }

}
