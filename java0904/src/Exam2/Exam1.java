
package Exam2;

/**
 * @author kosta
 * Document    : Exam1 created on : 2014. 9. 4, 오후 3:28:39
 */
public class Exam1 {
    public static void main(String[] args) {}
        public void test(){
            System.out.println("gggg");
        }
        //메서드의 반환형- 반환될 자료형으로 명시
        //return 자료형에 맞는 값
        //int xx = winn(50,100);
    
    public static int winn(int win, int total){
        int rate = (int) (((double)win/total)*100);
        
        return rate;
        
    }

}
