
package exam;

/**
 * @author kosta
 * Document    : AniMain created on : 2014. 9. 15, 오후 12:20:24
 */
public class AniMain {
    public static void main(String[] args) {
       
        AnimalInter[] ani = new AnimalInter[3];
        ani[0] = new Bird();
        ani[1] = new Cat();
        ani[2] = new Dog();
//        instanceof : 왼쪽의 객체가 오른쪽에 명시한 클래스로부터
//        생성된 객체(가족관게를 가지는 객체인지를)인지를 비교해주는 예약어
        String[] msg = {"짹짹", "야옹", "멍멍"};
        int i = 0;
        for(AnimalInter e : ani){
            e.cry(msg[i]);
            i++;
        }
        
        }
                
    }

