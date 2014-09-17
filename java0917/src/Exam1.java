
import java.util.Iterator;
import java.util.TreeSet;



/**
 * @author kosta
 * Document    : Exam1 created on : 2014. 9. 17, 오전 10:35:17
 */
public class Exam1 {
    
    private String lotNum;
    
    //생성자로 초기화
    public Exam1(){
        lottoGame();
    }
    
    private void lottoGame(){
        //쓰고지속시킬거는 멤버필드, 쓰고버릴것은 스택
        TreeSet<Integer> it = new TreeSet<>();
        while(it.size() < 6){
            int num = (int)(Math.random()*45)+1;
            it.add(num);
        }
        Iterator<Integer> ii = it.iterator();
        //*에서 String클래스의 불변적 특징 때문에
        //메모리의 성능을 저하 시킬 수 있기때문에
        //문자열을 전용으로 저장하는 버퍼객체에 담아 두고 사용.
        StringBuffer sb = new StringBuffer();
        while(ii.hasNext()){//hasnext가 다음메서드 호출할수 있는지 판단.
            Integer lotNumber = ii.next();
            //lotNum += lotNumber + "\t";
            //StringBuffer에 담아두는 메서드
            sb.append(lotNumber).append("\t");
        }
        lotNum = sb.toString();//String으로 바꿔서 넣어라.
    }

    public String getLotNum() {
        return lotNum;
    }
    
}
