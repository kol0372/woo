
package ex1;

/**
 * @author kosta
 * Document    : Main created on : 2014. 9. 12, ���� 10:17:06
 */
public class Main {
    public static void main(String[] args) {
        //�ڽ�Ŭ������ �������� ��ü ����
        D_carPhone ref = new D_carPhone("����Ʈ3" , "500000", 1000, "20px");
        System.out.println("�𵨸� : " + ref.model);//�θ�
        System.out.println("���� : " + ref.getNumber());//�θ�
        System.out.println("ȭ�� : " + ref.getChord());//�θ� ���
        System.out.println("�ȼ� : " + ref.getPixel());//�ڽ�
        MP3Phone red = new MP3Phone("�ƾ�", "333", 123, 124);
        System.out.println("�𵨸� : " + red.model);
        System.out.println("���� : " + red.getNumber());
        System.out.println("ȭ�� : " + red.getChord());
        System.out.println("������ : "+red.getSize());
    }

}
