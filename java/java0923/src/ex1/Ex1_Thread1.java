
package ex1;

/**
 * @author kosta
 * Document    : Ex1_Thread1 created on : 2014. 9. 23, ¿ÀÀü 9:07:12
 */
public class Ex1_Thread1 extends Thread{

    @Override
    public void run() {
        for(int i =0; i < 360; i ++){
            System.out.print("-");
            
        }
        System.out.println("");
    }
    

}
