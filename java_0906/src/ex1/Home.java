
package ex1;

/**
 * @author kosta
 * Document    : Home created on : 2014. 9. 11, ���� 10:17:38
 */

//Ŭ���� �̸� : Home
//��ü : home 
//�Ӽ� : door color->�ڷ��� string
//����������: private 
//���� �ֱ����� setter, getter : setter�� ��ȯ�� �ʿ����.

public class Home {
    private String Doorcolor;//�빮�� ���� : ������ ����ȭ
    
    //setter�� getter�� ��� ĸ��ȭ
    public String getdoorcolor(){//�빮���� Ȯ���ϵ��� ����
        return Doorcolor;
    }
    public void setdoorcolor(String doorc){//�빮���� �����ϵ��� ����
        Doorcolor = doorc;
        
    }
}
