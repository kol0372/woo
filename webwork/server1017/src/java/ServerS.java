
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : ServerS created on : 2014. 10. 17, ���� 11:26:22
 */
public class ServerS {

    private ServerSocket ss; //��������
    private Socket s; //Ŭ���̾�Ʈ ����
    private String reip; //ip
    private ArrayList<SocekThread> client; //Ŭ���̾�Ʈ�� ������ ������ ������

    public ServerS(int port) {
        try {
            ss = new ServerSocket(port);
            System.out.println("���� ����");
            //ArratList�� ����
            client = new ArrayList<>();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    public void execute(){
        while(true){
            try {
                Socket s = ss.accept();
                System.out.println("Ŭ���̾�Ʈ ����");
                System.out.println(s.getInetAddress().getHostAddress());
                System.out.println("--------------------------------");
                SocekThread st = new SocekThread(s, this);
                //ArrayList�� ����
                client.add(st);
                st.start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    

    void sendMsg(SocekThread s,String ... str) { //String ... str �迭�� ���� ���� ���� �� ����. �� �����ִ���.
        //String type1 = str[0];
       StringBuffer strs = new StringBuffer();
       //Client�� ������ ���� ���������� ����
       int i=0;
       for(String e : str){
           if(str.length -1> i){
               strs.append(e).append("/");
           }else{
               strs.append(e);
           }
           i++;
       }
        System.out.println("Tokentest: " + strs);
        //��� �����ڿ��� �޼����� �����Ѵ�.
        for(SocekThread e : client){
            e.getPw().println(strs.toString());
        }
    }
    public static void main(String[] args) {
        ServerS s= new ServerS(9999);
        s.execute();
        
    }
    

}
