
import java.util.Iterator;
import java.util.TreeSet;



/**
 * @author kosta
 * Document    : Exam1 created on : 2014. 9. 17, ���� 10:35:17
 */
public class Exam1 {
    
    private String lotNum;
    
    //�����ڷ� �ʱ�ȭ
    public Exam1(){
        lottoGame();
    }
    
    private void lottoGame(){
        //�������ӽ�ų�Ŵ� ����ʵ�, ����������� ����
        TreeSet<Integer> it = new TreeSet<>();
        while(it.size() < 6){
            int num = (int)(Math.random()*45)+1;
            it.add(num);
        }
        Iterator<Integer> ii = it.iterator();
        //*���� StringŬ������ �Һ��� Ư¡ ������
        //�޸��� ������ ���� ��ų �� �ֱ⶧����
        //���ڿ��� �������� �����ϴ� ���۰�ü�� ��� �ΰ� ���.
        StringBuffer sb = new StringBuffer();
        while(ii.hasNext()){//hasnext�� �����޼��� ȣ���Ҽ� �ִ��� �Ǵ�.
            Integer lotNumber = ii.next();
            //lotNum += lotNumber + "\t";
            //StringBuffer�� ��Ƶδ� �޼���
            sb.append(lotNumber).append("\t");
        }
        lotNum = sb.toString();//String���� �ٲ㼭 �־��.
    }

    public String getLotNum() {
        return lotNum;
    }
    
}
