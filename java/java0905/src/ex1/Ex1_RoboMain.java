
package ex1;



/**
 * @author kosta
 * Document    : Ex1_RoboMain created on : 2014. 9. 5, 오전 10:36:25
 */
public class Ex1_RoboMain {
    //Ex1_Robo.class 받아서 개발하기 위한 작업.
    public static void main(String[] args) {
    //참조자료형 Ex1_Robo ref; 선언
    //new 연산자를 통해 Ex1_Robo() Heap영역에 생성
        Ex1_Robo ref = new Ex1_Robo();
        //속성에 값을 할당
        ref.power=true; // 힙영역에 있는 Ex1_Robo객체의 자원인 power에 
                        //true 값을 저장한 상태
        //그후, ref.ispower() 메서드를 호출하면 당연히 true값을 가지고 있는
        //power값인것을 확인할 수 있다.
        //생성되는 속성의 접근제한자가 default 이므로, 다른 패키지에 있음 안되
        // 
        if(ref.power == true){
            System.out.println("로보의 전원이 켜졌습니다.");
        }else{
            System.out.println("로보의 전원이 꺼졌습니다.");
        }
        
        //연습문제 : Ex1_Robo객체의 move()를 호출해서
        //로보가 움직이게 적절하게 프로그래밍 하시오.
        
        boolean rv = ref.move(10);
        if(!rv){
            System.out.println("로봇  동작에 문제가 있습니다.");
        }
        
        
    
    }
}
