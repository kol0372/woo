
package ex2;

/**
 * @author kosta
 * Document    : Ex9_ForFor created on : 2014. 9. 3, 오후 3:51:38
 */
public class Ex9_ForFor {
    public static void main(String[] args) {
        //다중 for()문
        /*for(초기식; 조건식; 증감식){
            실행문;
            for(초기식;조건식;증감식){
                실행문;
            }
        }
        */
        //초기식은 딱 한번 수행, 조건을 만족하는한 실행문
        //i= 0 한번 수행하고 , 조건에 합당하면 실행해,
        //j= 0 한번 수행하고 , 조건에 합당할때 까지 증감하면서 실행
        //i= 1로 수행하고, 조건이 합당할때 까지 실행(그안에 j도 실행)
        //큰 for문이 반복될 때마다 작은for는 그안에서
        //계속 초기식부터 조건식까지 반복을 주기적으로 수행
    for(int i = 1; i <= 9; i++){
        for(int j = 2; j <= 9; j++){
            System.out.print(j + "x" + i + "=" + (i*j) + "\t");
        }
        System.out.println("");
    }
    }

}
