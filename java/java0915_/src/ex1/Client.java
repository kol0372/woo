
package ex1;

/**
 * @author kosta
 * Document    : Client created on : 2014. 9. 15, 오전 9:25:24
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
        
//        배열을 사용한 다형성 처리
//        배열은 객체
//        일반자료형 배열, 참조자료형 배열
//        일차원 배열과 다차원 배열
        Animal[] ar = new Animal[3];
        ar[0]= new Bird();
        ar[1]= new Cat();
        ar[2]= new Dog();
        int size = ar.length;
        System.out.println("배열의 크기" + size);
        //효율적인 코드를 사용하는 방법
        //length를 size로 바꿔서 사용
        for(int i =0; i < size; i++){
            ar[i].cry();
        }
        System.out.println("------------");
        //jdk5부터 향상된 for 문을 제공
        //for
        //(배열/컬렉션의 객체 지역변수 : (in의 의미) 변수명){
        //실행
        //}
        for (Animal e : ar) {
            e.cry();
            
        }
    }
}
