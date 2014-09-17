
package ex1;

/**
 * @author kosta
 * Document    : Client created on : 2014. 9. 15, ���� 9:25:24
 */
public class Client {
    public static void main(String[] args) {
        Animal animal;
        animal = new Bird();
        animal.cry();
        
        animal = new Cat();
        animal.cry();
        
        animal = new Dog();
        animal.cry();
        
//        �迭�� ����� ������ ó��
//        �迭�� ��ü
//        �Ϲ��ڷ��� �迭, �����ڷ��� �迭
//        ������ �迭�� ������ �迭
        Animal[] ar = new Animal[3];
        ar[0]= new Bird();
        ar[1]= new Cat();
        ar[2]= new Dog();
        int size = ar.length;
        System.out.println("�迭�� ũ��" + size);
        //ȿ������ �ڵ带 ����ϴ� ���
        //length�� size�� �ٲ㼭 ���
        for(int i =0; i < size; i++){
            ar[i].cry();
        }
        System.out.println("------------");
        //jdk5���� ���� for ���� ����
        //for
        //(�迭/�÷����� ��ü �������� : (in�� �ǹ�) ������){
        //����
        //}
        for (Animal e : ar) {
            e.cry();
            
        }
    }
}
