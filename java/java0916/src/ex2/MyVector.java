package ex2;

import java.util.Vector;

/**
 * @author kosta Document : MyVector created on : 2014. 9. 16, ���� 12:13:59
 */
public class MyVector {

    public static void main(String[] args) {
        //�÷����� �ڷᱸ���̰�, ��ü�� ������ ��.
        //5���� ����ڽ��� ��������
        Vector v = new Vector();

        v.add(new String("test"));
        v.add(10); //integer
        v.add('A');
        v.add(true);
        v.add(3.14f); //Float
        v.add(100L); //Long
        System.out.println("������ ũ��" + v.size());

        //���Ϳ� ����� �� ��ü�� �ڷ����� ������ �̸����� ����ϱ�.
        for (Object e : v) {
            if (e instanceof String) {
                System.out.println("string : " + e);
            } else if (e instanceof Character) {
                System.out.println("Character" + e);
            } else if (e instanceof Integer) {
                System.out.println("Integer" + e);
            } else if (e instanceof Float) {
                System.out.println("float : " + e);
            }else if(e instanceof Long){
                System.out.println("Long : " + e);
            }
                
        }

    }

}
