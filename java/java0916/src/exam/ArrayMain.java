
package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kosta
 * Document    : ArrayMain created on : 2014. 9. 16, ���� 5:31:53
 */
public class ArrayMain {
    public static void main(String[] args) {
        ArrayList<ArrayVo> str = new ArrayList<ArrayVo>();
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("1-ȸ�������Է� ,2-ȸ������Ʈ���, 3-���� : ");
        int num = Integer.parseInt(sc.nextLine());
        ArrayControl dd = new ArrayControl();
        
        if(num == 1){
           
            ArrayVo ref = new ArrayVo();
            System.out.print("ȸ������ : ");
            ref.setNumber(Integer.parseInt(sc.nextLine()));
            System.out.print("ȸ���̸� : ");
            ref.setName(sc.nextLine());
            System.out.print("ȸ���� ������ : ");
            aa: try {
                ref.setWeight(Float.parseFloat(sc.nextLine()));
            }catch(NumberFormatException e){
                System.out.println("���ڸ� �ּ���.");
                break aa;
            }
            
            System.out.print("���ǿ��� : ");
            ref.setAssent(Boolean.parseBoolean(sc.nextLine()));
            System.out.print("�̸��� : ");
            ref.setEmail(sc.nextLine());
            System.out.print("���� : ");
            ref.setAge(Integer.parseInt(sc.nextLine()));
            str.add(ref);
            
        }else if(num ==2){
            for(ArrayVo e: str){
            System.out.println("ȸ������ : " + e.getNumber());
            System.out.println("ȸ���̸� : " + e.getName());
            System.out.println("ȸ�������� : "+e.getWeight());
            System.out.println("���ǿ��� : " +e.isAssent());
            System.out.println("�̸��� : " + e.getEmail());
            System.out.println("���� : " + e.getAge());
            dd.info(e);
            }
        }else
        {
            System.out.println("����");
        }
        }
       
    }

}
