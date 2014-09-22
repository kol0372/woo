
package ex1;

/**
 * @author kosta
 * Document    : Ex3 created on : 2014. 9. 22, 오전 11:19:49
 */

//연습문제 : start는 다른 클래스와 공유해야될 자원이기 때문에 static으로
//변경하고 Thread가 수행될 일을 Ex3_MyThread에게 담당시켜서
//사용해보자.
public class Ex3_ThreadSingle { 
    public static long start;
    public static void main(String[] args) {
        start = System.currentTimeMillis();
        
       
        
        // -------------------Thread가 수행
//        for(int i =0;  i < 300; i ++){
//            System.out.println("*");
//            
//        }System.out.println("**");
//        
//        System.out.println(System.currentTimeMillis() - start);
         Ex3_MyThread th = new Ex3_MyThread();
        th.start();
        
        //--------------------------------
        for(int i = 0; i < 300 ; i++){
            System.out.print("x");
        }
        System.out.println("");
        System.out.println(System.currentTimeMillis() - start);
    }
}
