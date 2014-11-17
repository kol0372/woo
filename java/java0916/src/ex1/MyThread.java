
package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : MyThread created on : 2014. 9. 16, 오전 11:34:58
 */
public class MyThread {

    public MyThread() {
        for(int i=0; i <10 ; i++){
            try {
                //일반적인 예외는 반드시 컴파일단계에서 점검함!
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }
    

}
