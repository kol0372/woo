
package ex1;

/**
 * @author kosta
 * Document    : Ex1_Exception created on : 2014. 9. 16, ���� 9:28:41
 */
/*
exception: ������ �����̸� ���α׷������� ó���Ѵ�.
            �Ϲ����� ����(�������� �� �߻��ϴ� ����)��, 
            ��) 1/0�� ������ �а��� �ϴµ� ��������� ���ٸ�.. 
            ����� ���ܰ� �ִ�. 
            ��) 0���� ������ ���α׷���, ����? ���ڿ� ���ڸ� �ִ´ٴ� ��
                �����Ͻÿ��� ���� �� �� ���� ����.
error: ġ������ �����̸� JVM�� �����Ͽ� ó���Ѵ�.
    ����ó����
    try{
        ���ܰ� �߻� ������ �����;
        ���๮; **���ܰ� �߻��ϸ� ������ �ȵ�**
}catch(���ܰ�ü ������){
    ���ܼ��๮���;
}
*/
public class Ex1_Exception {
    public static void main(String[] args) {
        //�迭�� ����, ����, �ʱ�ȭ�� �ѹ��� �� ����(���� ����)
        int[] var = {10, 200, 30};
        int size = var.length;
        for(int i=0; i<=size; i++){
           // ���ܹ߻����� �迭�� �ε����� 3�� ã���� 3�� ����.
           // ArrayIndexOutOfBoundsException
           // ����ó��
           
            try {
                System.out.println(var[i]); 
                //���� �߻��� **�� ��¾��ϰ� catch�� �Ѿ.
                System.out.println("**");
            } catch (Exception e) {
                System.out.println("�迭�� ������ �Ѿ����ϴ�.");
            }
        }
            System.out.println("���α׷��� ��");
    }
}
