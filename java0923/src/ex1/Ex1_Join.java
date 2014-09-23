
package ex1;

/**
 * @author kosta
 * Document    : Ex1_Join created on : 2014. 9. 23, 오전 9:06:31
 */
//현재 스레드가 무사히 종료될때 까지 다른 스레드가 대기 하도록 하는 메서드
public class Ex1_Join {
    private static long startTime;
    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread1 t1 = new Ex1_Thread1();
        startTime = System.currentTimeMillis();
        t1.start();
        t1.join(); 
        // t1의 작업이 끝날때 까지 다른 스레드는 대기.
        //runnable 인터페이스를 구현한 run만 가지고 있어서 start를 호출할 수 없다.
        
        //run 호출은 일을시키는게 아니고, 메인이 직접이라서 스레드가 아니라고 볼수 있다.
               
        //**스레드를 생성해서 생성자인자에 러너블을 구현한 클래스의 주소를 넣어줘야햄.**
        Ex1_Thread2 t2 = new Ex1_Thread2(); // t2가 스레드가 아니라 러너블
        Thread tt2 = new Thread(t2); //러너블(t2)을 스레드로 만듬.
        tt2.start(); //스레드로 했기때문에 start 가능.
        tt2.join(); //스레드간의 순서를 정해 줄 수 있따.
        System.out.println("걸린시간 : " + (System.currentTimeMillis()-startTime));
    }

}
