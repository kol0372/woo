
import java.util.HashSet;
import java.util.Iterator;


/**
 * @author kosta
 * Document    : Ex1_HashSet created on : 2014. 9. 17, ���� 10:19:09
 */
//�ߺ��� ������� �ʴ� �����̴�.

public class Ex1_HashSet {
    public static void main(String[] args) {
        String[] str = {"Java", "Beans", "Java", "JSON"};
        
        HashSet<String> hs1 = new HashSet<>();
        System.out.println("ũ��" + hs1.size());
        //�迭�� �ε����� �ϳ��� �о hashset�� ������ ��
        //�ߺ��� java�� ������� �ʴ´�.
        for(String n :str){
            hs1.add(n);
        }
        System.out.println("ũ��" + hs1.size() + "    �迭�� ũ�� : " + str.length);
        for(String e :hs1){
            System.out.println(e);
        }
        hs1.removeAll(hs1);
        System.out.println("ũ�� : " + hs1.size());
        System.out.println("---------------------");
        HashSet<Integer> hs2 = new HashSet<>();
        int[] numr = {5,3,2,1,8,9,7,5};
        for(int e : numr){
            hs2.add(e);
        }
        System.out.println("ũ��" + hs2.size());
        //���ĵ� ��, �迭�� �ƴҶ� ������ �ȵ�
        //Treeset���� �����ϸ� ������������ ������ ���� ����.
        Iterator<Integer> it = hs2.iterator();
        while(it.hasNext()) {
            Integer integer = it.next();
            System.out.println(integer);
        }
    }
    
}
