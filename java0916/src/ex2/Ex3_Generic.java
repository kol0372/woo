
package ex2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kosta
 * Document    : Ex3_Generic created on : 2014. 9. 16, 오후 3:31:30
 */
//제네릭은 jdk5부터 객체간의 캐스팅문제를 해결하기 위해서
//전용컬렉션을 도입
public class Ex3_Generic {
    public static void main(String[] args) {
        //Vector와 ArrayList의 차이
        //Vector가 동기화를 지원하는 기능! 있지만 다른 부분으로 대체가능!
        //Generic - String만 담을 수 있는 ArrayList
        //jdk7부터 변경된 요소 : new ArrayList<>()가 6이하는 오류
        //라서 아래와 같이 표현
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
        Iterator<String> it = str.iterator();//반복자
        while(it.hasNext()){
            String string = it.next();
            System.out.println(string);
        }
        
        ArrayList<Integer> num = new ArrayList<Integer>();
    }
    //과제 ArrayList를 사용하다 보니까
    //회원정보를 저장하고 싶다. 근데 제네릭으로 표현되면
    //어떨게 각기 다른 자료형들을 넣어서 회원정보에 저장랑 수 있나
    //실행하면
    /* 1-회원번호입력 , 2-회원리스트출력,3-종료 :1
    회원번호(int) :
    회원이름(String) :
    회원의 몸무게(Float) :
    회원의 동의여부(boolean) :
    회원의 이메일 (String) :
    1-회원번호입력 , 2-회원리스트출력,3-종료 :1
    --여러번 반복해서 5명추가-
    1-회원번호입력 , 2-회원리스트출력,3-종료 :2
    회원번호 : 1
    회원이름 : 김우리
    회원의 몸무게 : 60.5kg
    회원의 동의여부 :false
    회원의 이메일  :kol7456@naver.com
    나이 : 18
    [미성년자] / 성년
    --------------------------
    
    
    [과제] - B조 김우리 : ArrayList를 응용한 회원관리 
    */
    
    
}


