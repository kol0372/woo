
package ex1;

import static ex1.Ex3_ThreadSingle.start;

/**
 * @author kosta
 * Document    : Ex3_MyThread created on : 2014. 9. 22, ���� 11:32:18
 */
public class Ex3_MyThread extends  Thread{

    
    
    @Override
    public void run() {
           for(int i =0;  i < 300; i ++){
            System.out.print("*");
            
        }System.out.println("");
        
        System.out.println(System.currentTimeMillis() - start);
    }

}
