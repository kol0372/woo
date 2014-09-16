package ex2;

import java.util.Vector;

/**
 * @author kosta Document : MyVector created on : 2014. 9. 16, 오후 12:13:59
 */
public class MyVector {

    public static void main(String[] args) {
        //컬렉션은 자료구조이고, 객체만 저장이 됨.
        //5부터 오토박싱을 지원해줌
        Vector v = new Vector();

        v.add(new String("test"));
        v.add(10); //integer
        v.add('A');
        v.add(true);
        v.add(3.14f); //Float
        v.add(100L); //Long
        System.out.println("백터의 크기" + v.size());

        //벡터에 저장된 각 객체의 자료형과 동일한 이름으로 출력하기.
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
