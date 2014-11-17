
import java.util.HashSet;
import java.util.Iterator;


/**
 * @author kosta
 * Document    : Ex1_HashSet created on : 2014. 9. 17, 오전 10:19:09
 */
//중복을 허용하지 않는 구조이다.

public class Ex1_HashSet {
    public static void main(String[] args) {
        String[] str = {"Java", "Beans", "Java", "JSON"};
        
        HashSet<String> hs1 = new HashSet<>();
        System.out.println("크기" + hs1.size());
        //배열의 인덱스를 하나씩 읽어서 hashset에 저장할 때
        //중복된 java는 저장되지 않는다.
        for(String n :str){
            hs1.add(n);
        }
        System.out.println("크기" + hs1.size() + "    배열의 크기 : " + str.length);
        for(String e :hs1){
            System.out.println(e);
        }
        hs1.removeAll(hs1);
        System.out.println("크기 : " + hs1.size());
        System.out.println("---------------------");
        HashSet<Integer> hs2 = new HashSet<>();
        int[] numr = {5,3,2,1,8,9,7,5};
        for(int e : numr){
            hs2.add(e);
        }
        System.out.println("크기" + hs2.size());
        //정렬도 됨, 배열이 아닐땐 정렬이 안됨
        //Treeset으로 변경하면 오름차순으로 정렬을 보장 받음.
        Iterator<Integer> it = hs2.iterator();
        while(it.hasNext()) {
            Integer integer = it.next();
            System.out.println(integer);
        }
    }
    
}
