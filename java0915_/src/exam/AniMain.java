
package exam;

/**
 * @author kosta
 * Document    : AniMain created on : 2014. 9. 15, ���� 12:20:24
 */
public class AniMain {
    public static void main(String[] args) {
       
        AnimalInter[] ani = new AnimalInter[3];
        ani[0] = new Bird();
        ani[1] = new Cat();
        ani[2] = new Dog();
//        instanceof : ������ ��ü�� �����ʿ� ����� Ŭ�����κ���
//        ������ ��ü(�������Ը� ������ ��ü������)������ �����ִ� �����
        String[] msg = {"±±", "�߿�", "�۸�"};
        int i = 0;
        for(AnimalInter e : ani){
            e.cry(msg[i]);
            i++;
        }
        
        }
                
    }

