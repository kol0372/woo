
package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kosta
 * Document    : ArrayMain created on : 2014. 9. 16, 오후 5:31:53
 */
public class ArrayMain {
    public static void main(String[] args) {
        ArrayList<ArrayVo> str = new ArrayList<ArrayVo>();
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("1-회원정보입력 ,2-회원리스트출력, 3-종료 : ");
        int num = Integer.parseInt(sc.nextLine());
        ArrayControl dd = new ArrayControl();
        
        if(num == 1){
           
            ArrayVo ref = new ArrayVo();
            System.out.print("회원정보 : ");
            ref.setNumber(Integer.parseInt(sc.nextLine()));
            System.out.print("회원이름 : ");
            ref.setName(sc.nextLine());
            System.out.print("회원의 몸무게 : ");
            aa: try {
                ref.setWeight(Float.parseFloat(sc.nextLine()));
            }catch(NumberFormatException e){
                System.out.println("숫자만 주세요.");
                break aa;
            }
            
            System.out.print("동의여부 : ");
            ref.setAssent(Boolean.parseBoolean(sc.nextLine()));
            System.out.print("이메일 : ");
            ref.setEmail(sc.nextLine());
            System.out.print("나이 : ");
            ref.setAge(Integer.parseInt(sc.nextLine()));
            str.add(ref);
            
        }else if(num ==2){
            for(ArrayVo e: str){
            System.out.println("회원정보 : " + e.getNumber());
            System.out.println("회원이름 : " + e.getName());
            System.out.println("회원몸무게 : "+e.getWeight());
            System.out.println("동의여부 : " +e.isAssent());
            System.out.println("이메일 : " + e.getEmail());
            System.out.println("나이 : " + e.getAge());
            dd.info(e);
            }
        }else
        {
            System.out.println("종료");
        }
        }
       
    }

}
