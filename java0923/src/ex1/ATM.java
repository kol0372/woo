package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : ATM created on : 2014. 9. 23, ���� 10:41:42
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
            withDraw(1000); //0���� ũ�� �����
            if (getDespsiteMoney() <= 0) {
                break; //0���� ������ ��������
            }
        }
    }

    public long getDespsiteMoney() {
        return despsiteMoney;
    }
//�Ӱ迵�� �߻� ���� : ��������� �𿩼� �������� �۾��ϴ� ����.
//���⼭ ���ü������� �߻� �� �� �ִ�.
    //�̸� �ذ��ϱ� ���� ����ȭ�� �ɾ��ش�.
    //synshronized�� �ɾ �ۼ� Lock Pool�� �����尡 ����
    //�ش� ���� �� ���� �ٸ� �������� ������ ���� �ʴ´�.

    private synchronized void withDraw(int howMuch) {
        String tname = Thread.currentThread().getName();
        if (getDespsiteMoney() > 0) {
            //1000�� ���Ѵ�.
            despsiteMoney -= howMuch;
            System.out.print("ThreadName : " + tname + ",");
            System.out.println("�ܾ� : " + getDespsiteMoney() + "");
        } else {
            System.out.print("ThreadName : " + tname + ",");
            System.out.println("�ܾ׺����� " + getDespsiteMoney());
        }
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread mom = new Thread(atm, "Mother"); //Thread(���ʺ��Ұ�, ������ �̸�)
        Thread son = new Thread(atm, "son");
        mom.start();
        son.start();
    }
}
