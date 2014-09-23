package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : ATM created on : 2014. 9. 23, 오전 10:41:42
 */
public class ATM implements Runnable {

    private long despsiteMoney = 10500;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            withDraw(1000); //0보다 크면 계속해
            if (getDespsiteMoney() <= 0) {
                break; //0보다 작으면 빠져나와
            }
        }
    }

    public long getDespsiteMoney() {
        return despsiteMoney;
    }
//임계영역 발생 지점 : 스레드들이 모여서 공동으로 작업하는 공간.
//여기서 동시성문제가 발생 될 수 있다.
    //이를 해결하기 위해 동기화를 걸어준다.
    //synshronized를 걸어서 작성 Lock Pool에 스레드가 들어가서
    //해당 일을 할 동안 다른 스레드의 간섭을 받지 않는다.

    private synchronized void withDraw(int howMuch) {
        String tname = Thread.currentThread().getName();
        if (getDespsiteMoney() > 0) {
            //1000씩 감한다.
            despsiteMoney -= howMuch;
            System.out.print("ThreadName : " + tname + ",");
            System.out.println("잔액 : " + getDespsiteMoney() + "");
        } else {
            System.out.print("ThreadName : " + tname + ",");
            System.out.println("잔액부족해 " + getDespsiteMoney());
        }
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread mom = new Thread(atm, "Mother"); //Thread(러너블할것, 스레드 이름)
        Thread son = new Thread(atm, "son");
        mom.start();
        son.start();
    }
}
