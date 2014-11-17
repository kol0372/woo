
import java.util.LinkedList;


/**
 * @author kosta
 * Document    : Ex2_LinkedList created on : 2014. 9. 17, 오전 11:20:19
 */

//jdk5부터 추가된 인터페이스인 Queue 인터페이스 구현한 클래스
// Deque extends Queue이므로 결국 Queue를 구현한 클래스
// 큐구조(First-in-First-out)
//선입선출 - 선입(offer() : 전달된 요소를 마지막 요소로 추가한다.)
//        - 선출(poll() : 가장 첫번? 요소를 반환후 삭제한다.)
//add() : 마지막으로 전달된 요소를 추가한다.
//ArrayList는 순차적인 데이터를 읽어 낼 때 또는 순차적인 추가삭제
//일때는 빠르다.
//LinkedList : 읽기 시간이 느리다. 중간 데이터를 추가/삭제가 빠르다.
//데이터가 많을때는 접근성이 떨어짐.
public class Ex2_LinkedList {
    public static void main(String[] args) {
        String[] item = {"K7", "SM7", "뉴LF 소나타"};
        LinkedList<String> q = new LinkedList<>();
        for(String n : item){
            q.offer(n); //요소추가
        }
        System.out.println("q의 크기" + q.size());
        //향상된 for문으로 출력 - get(index) 출력
        for(String e : q){
            System.out.println(e);
        }
        System.out.println("q의 크기2" + q.size());
        System.out.println("--------------------------");
        String data="";
        //다 일고 지울때 까지
        while((data = q.poll()) !=null){
            System.out.println(data + "삭제");
        }
        System.out.println("q의 크기3 : " + q.size());
    }
}
