
package ex2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kosta
 * Document    : Ex3_Generic created on : 2014. 9. 16, ���� 3:31:30
 */
//���׸��� jdk5���� ��ü���� ĳ���ù����� �ذ��ϱ� ���ؼ�
//�����÷����� ����
public class Ex3_Generic {
    public static void main(String[] args) {
        //Vector�� ArrayList�� ����
        //Vector�� ����ȭ�� �����ϴ� ���! ������ �ٸ� �κ����� ��ü����!
        //Generic - String�� ���� �� �ִ� ArrayList
        //jdk7���� ����� ��� : new ArrayList<>()�� 6���ϴ� ����
        //�� �Ʒ��� ���� ǥ��
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        str.add("ok");
        str.add(String.valueOf(10));
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());
        for(String e : str){
            System.out.println(e);
        }
        System.out.println("iterator-----------");
        Iterator<String> it = str.iterator();//�ݺ���
        while(it.hasNext()){
            String string = it.next();
            System.out.println(string);
        }
        
        ArrayList<Integer> num = new ArrayList<Integer>();
    }
    //���� ArrayList�� ����ϴ� ���ϱ�
    //ȸ�������� �����ϰ� �ʹ�. �ٵ� ���׸����� ǥ���Ǹ�
    //��� ���� �ٸ� �ڷ������� �־ ȸ�������� ����� �� �ֳ�
    //�����ϸ�
    /* 1-ȸ����ȣ�Է� , 2-ȸ������Ʈ���,3-���� :1
    ȸ����ȣ(int) :
    ȸ���̸�(String) :
    ȸ���� ������(Float) :
    ȸ���� ���ǿ���(boolean) :
    ȸ���� �̸��� (String) :
    1-ȸ����ȣ�Է� , 2-ȸ������Ʈ���,3-���� :1
    --������ �ݺ��ؼ� 5���߰�-
    1-ȸ����ȣ�Է� , 2-ȸ������Ʈ���,3-���� :2
    ȸ����ȣ : 1
    ȸ���̸� : ��츮
    ȸ���� ������ : 60.5kg
    ȸ���� ���ǿ��� :false
    ȸ���� �̸���  :kol7456@naver.com
    ���� : 18
    [�̼�����] / ����
    --------------------------
    
    
    [����] - B�� ��츮 : ArrayList�� ������ ȸ������ 
    */
    
    
}


