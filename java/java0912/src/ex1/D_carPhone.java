
package ex1;

/**
 * @author kosta
 * Document    : D_carPhone created on : 2014. 9. 12, ���� 9:45:35
 */

//����� ������ �ܰ迡�� �θ�Ŭ������ Ex1_Super�� ���յȴ�.
//�ڹٿ��� ����� ���� ����̴�.
public class D_carPhone extends Ex1_Super{
    private String pixel;//ȭ�Ҽ�
    public D_carPhone(String model, String number, int chord, String pixel){
        this.pixel=pixel;
        //�θ��� �ڿ��� �����ϱ� ���ؼ� super�� Ű���� ���.
        super.model=model;
       //�θ��� �ڿ��̶��ص� private�� ���� �Ұ�
        //�θ�Ŭ������ ���ǵ� �޼��嵵 �ڽ��� �ڿ�ó�� ȣ�Ⱑ��
        setNumber(number);
        // this.chord=chord; ���� �ڽĿ� private int chord;�� ������ 
        // �ڽĲ��� �ޱ⶧���� �θ𲨹������� super �����.
        super.chord=chord;
        
        //�������� MP3Phone Ŭ������ ����  Ex1_Super�� ��ӹް�
        //����ʵ忡�� int size //����뷮
        //�ϳ� �ΰ� ���Ͱ��� �ʱ�ȭ ��Ű�ÿ�.
        //�� , Ex1_Super�� �ڽ� Ŭ������ ����Ǵ� �θ� Ŭ������ ���� �Ǿ���. 
        
    }

    public String getPixel() {
        return pixel;
    }
}
