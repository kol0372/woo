
package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : MyThread created on : 2014. 9. 16, ���� 11:34:58
 */
public class MyThread {

    public MyThread() {
        for(int i=0; i <10 ; i++){
            try {
                //�Ϲ����� ���ܴ� �ݵ�� �����ϴܰ迡�� ������!
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }
    

}
