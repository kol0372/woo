
package ex2;

/**
 * @author kosta
 * Document    : Ab created on : 2014. 9. 15, 오전 10:17:46
 */
public class Ab {
    public static void main(String[] args) {
        //추상 클래스는 new로 생성될 수 없다.
        //생성이 아니고 로컬내부클래스 
        SuperA su = new SuperA() {

            @Override
            public void draw(String msg) {
                System.out.println("헛;" + msg);
            }
        };
        
        
        
        SuperA[] ar = new SuperA[2];
        ar[0] = new A();
        ar[1] = new B();
        String[] msg = {"사각", "육각"};
        int i = 0;
        for(SuperA e : ar){
            e.draw(msg[i]);
            su.draw(msg[i]);
            i++;
        }
        
        
    }
}
