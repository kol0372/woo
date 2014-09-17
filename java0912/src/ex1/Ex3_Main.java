
package ex1;

/**
 * @author kosta
 * Document    : Ex3_Main created on : 2014. 9. 12, 오전 10:51:20
 */
public class Ex3_Main {
    public static void main(String[] args) {
        //자식을 참조해서 객체를 생성하는 경우
        Ex3_Sub ref1 = new Ex3_Sub("25세", "김우리", 3000);
        ref1.subMethod();
        System.out.println(ref1.superMethod());
        ref1.Supercar();//자식의 supercar 호출이됨
        System.out.println("==============");
        //부모를 참조해서 객체를 생성하는 경우
        Ex3_Super ref2 = new Ex3_Sub("35세", "ㅇㅇ", 200);
        ref2.superMethod();
        System.out.println(ref2.superMethod());
        
        //기대했던것은 자식의 자동차.
    }
}
