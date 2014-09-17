
package Ex1;

/**
 * @author kosta
 * Document    : Ex1_Break created on : 2014. 9. 4, 오전 10:10:49
 */
public class Ex1_Break {
    public static void main(String[] args) {
//        특정 조건을 갖추면 반복문을 탈출하는 제어문
//        break label문 : jdk5부터 지원 break에 라벨을 붙여서
//        라벨이 있는 곳으로 탈출
        aa: for(int i=1; i<3; i++)
        {
            for(int j = 0; j <5; j ++)
            {
                if(j == 3) break aa;
                System.out.println(i + ":" + j);
            }
        }
    }

}
