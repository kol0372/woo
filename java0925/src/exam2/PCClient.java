/*
 * 그림??+�???�?
 *
 * <?��??��?>
 * 1. �???�? - 콤보�??��???? ?��??? ?????? �? ?��????�?�? �???�?
 * 2. ???��?? ?��?? ???�창
 * 3. ???? ?��?? ???? ????�? ??면�?? ????
 * 4. 그림???? ?????? �???방�?? ?????? ????
 *
 * ?��?��?��?��?? ?��???? - ?��??�????? ????
 */

package newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class PCClient {

    private Socket socket;
    private PCServer server;
    private PrintWriter pw;
    private String nickName;

    public PCClient(Socket sk, PCServer sv) {
        // Client ?? socket �? ??�? �?�? 주�?? �?�?
        socket = sk;
        server = sv;
        try {
            pw = new PrintWriter(sk.getOutputStream(), true);
        } catch (IOException ex) {
        }

        // ?��?��?? ?�기�? ???? Thread
        Thread t = new Thread(new Runnable() {

            private BufferedReader bfr;

            public void run() {
                try {
                    bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    // �???�?�? ?��?�면 �???�? �???�?????(transMsg()) ?��?
                    while (true) {
                        String msg = bfr.readLine();
                        transMsg(msg); // �???�????? ?��?(transMsg(msg))
                    }
                } catch (IOException ex) {
                } finally {
                    if (bfr != null) {
                        try {
                            bfr.close();
                        } catch (IOException ex) {
                        }
                    }
                }
            }

            // �???�? ???? ?? ??�??? sendMsg �????? ?��?
            private void transMsg(String msg) {
                StringTokenizer stn = new StringTokenizer(msg, "/");
                String t1 = stn.nextToken();
                String t2 = stn.nextToken();
                String t3 = stn.nextToken();
                String t4 = stn.nextToken();
                nickName = t3; // ????�? ?��??

                // ??�??? sendMsg ?��? - ???��?? �???�?�? ???��????
                server.sendMsg(t1, t2, t3, t4, PCClient.this); // ?????? 주�???? �??? ????
            }
        });

        t.start(); // Thread ?��??
    }

    public PrintWriter getPw() { // �??��?��?�림 주�?? �?�?
        return pw;
    }

    public String getNickName() { // ???��?? �?�?
        return nickName;
    }

}