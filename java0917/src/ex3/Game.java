package ex3;

import java.util.Scanner;

/**
 * @author kosta Document : Game created on : 2014. 9. 17, ���� 4:50:40
 */
public class Game {

    public static String cpu() {
        int num = (int) (Math.random() * 2) + 1;
        if (num == 1) {
            return "Ȧ";
        } else {
            return "¦";
        }
    }
}
