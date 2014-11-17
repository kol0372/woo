
package ex2;

import ex2.vo.MemberVO;
import java.util.Scanner;

/**
 * @author kosta
 * Document    : Ex2_Main1 created on : 2014. 9. 11, 오후 1:50:59
 */
public class Ex2_Main1 {
    public static void main(String[] args) {
        //UI
        Scanner sc = new Scanner(System.in);
        System.out.print("번호입력");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("이름입력");
        String name = sc.nextLine();
        System.out.print("나이입력");
        String age = sc.nextLine();
        System.out.print("성별입력");
        String gender = sc.nextLine();
        System.out.print("전화번호입력");
        String tel = sc.nextLine();
        
        //VO객체를 생성한다.
        //사용자로부터 값을 저장한 후 Ex2_CallByReference1의 
        //info로 전달 할 것이기 때문에...
        MemberVO v = new MemberVO();
        v.setNum(num);
        v.setName(name);
        v.setAge(age);
        v.setGender(gender);
        v.setTel(tel);
        
        Ex2_CallByReFerence1 ref = new Ex2_CallByReFerence1();
        ref.info(v);
        //출력 
        System.out.println("이름 : " + ref.getVo().getName());
    }

}
