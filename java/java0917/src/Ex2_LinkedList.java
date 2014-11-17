
import java.util.LinkedList;


/**
 * @author kosta
 * Document    : Ex2_LinkedList created on : 2014. 9. 17, ���� 11:20:19
 */

//jdk5���� �߰��� �������̽��� Queue �������̽� ������ Ŭ����
// Deque extends Queue�̹Ƿ� �ᱹ Queue�� ������ Ŭ����
// ť����(First-in-First-out)
//���Լ��� - ����(offer() : ���޵� ��Ҹ� ������ ��ҷ� �߰��Ѵ�.)
//        - ����(poll() : ���� ù��? ��Ҹ� ��ȯ�� �����Ѵ�.)
//add() : ���������� ���޵� ��Ҹ� �߰��Ѵ�.
//ArrayList�� �������� �����͸� �о� �� �� �Ǵ� �������� �߰�����
//�϶��� ������.
//LinkedList : �б� �ð��� ������. �߰� �����͸� �߰�/������ ������.
//�����Ͱ� �������� ���ټ��� ������.
public class Ex2_LinkedList {
    public static void main(String[] args) {
        String[] item = {"K7", "SM7", "��LF �ҳ�Ÿ"};
        LinkedList<String> q = new LinkedList<>();
        for(String n : item){
            q.offer(n); //����߰�
        }
        System.out.println("q�� ũ��" + q.size());
        //���� for������ ��� - get(index) ���
        for(String e : q){
            System.out.println(e);
        }
        System.out.println("q�� ũ��2" + q.size());
        System.out.println("--------------------------");
        String data="";
        //�� �ϰ� ���ﶧ ����
        while((data = q.poll()) !=null){
            System.out.println(data + "����");
        }
        System.out.println("q�� ũ��3 : " + q.size());
    }
}
