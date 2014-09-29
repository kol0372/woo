package suggest;
/**
 * @author kosta 
 * Document   : Suggest Created on : 2014. 9. 24, ���� 3:43:06
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class Suggest {

    private static Suggest suggest;
    private Document doc;
    private Element root;

    private Suggest() {
        SAXBuilder sb = new SAXBuilder();

        try {
            doc = sb.build(new URL("http://192.168.7.149:8084/week2/suggest.xml"));
            System.out.println("�ε� �Ϸ�");
            root = doc.getRootElement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized Suggest getInstance() {
        if (suggest == null) {
            suggest = new Suggest();
        }
        return suggest;
    }

    public String[] getSuggest(String key) {
       
        ArrayList<String> sugList = new ArrayList<String>();
        //root���� �ʿ��� ��Ҵ� keyword�� ���̹Ƿ� keyword�鸸 �����Ѵ�.
        List<Element> list = root.getChildren("keyword");
         System.out.println("Key : "+ key);
        //�ӵ��� ���̱� ���� �ݺ���(Iterator)�� �����Ѵ�.
        Iterator<Element> it = list.iterator();

        //����ڰ� ������ ���� �Ǵ� ���ڿ�(n)�� ��/�ҹ��� ������ ���� �ʰ�
        //�ϱ� ���� �ҹ��ڷ� ��ȯ
        key = key.toLowerCase();

        //�ݺ��ڸ� �̿��Ͽ� ����ڰ� �Է��� ������ �����ϴ� �ܾ���� �����Ͽ�
        //a_list�� �����Ѵ�.
        while (it.hasNext()) {//�ݺ��ڰ� ��ġ�� ������ ����ĭ�� ��Ұ� ������ true!
            String result = it.next().getText();//keyword����� ���ڿ� ����
            //����ڰ� ������ ���� �ҹ����̹Ƿ� �ٽ� �񱳰� ����
            //�ҹ��ڷ� ��ȯ�Ѵ�.
            String compare = result.toLowerCase();

            //����ڰ� �Է��� ������ �����ϴ� �������� �Ǵ��Ѵ�.
            if (compare.startsWith(key)) {
                sugList.add(result);
            }
        }


        //���� ����ڿ��� ������ �ܾ���� �����Ǿ���.(sugList - ArrayList)
        //�̰��� �ٽ� String[]�� ������ �Ѵ�.
        if (sugList.size() > 0) {
            String[] sugArr = new String[sugList.size()];

            return sugList.toArray(sugArr);
        }
        return null;
    }
}
